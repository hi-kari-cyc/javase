package shujia25.day17;

/*
    因为学生对象是生产者和消费者共享的数据，所以应该定义在外面

    我们为了看到更加明显的效果，我们加入了循环，让其赋值不同的数据，取不同的数据
    但是根据结果发现，出现了姓名和年龄对不上的情况。
    其实就是出现了线程安全的问题：
        1、是否存在多线程环境？存在
        2、是否存在共享数据？存在
        3、是否存在多条语句操作共享数据？存在

    等待唤醒机制是建立在线程安全的基础之上

    Java是抢占式调度

 */

public class ProConDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // 创建一个生产者线程
        ProductThread pt1 = new ProductThread(student);
        // 创建一个消费者线程
        ConsumerThread ct1 = new ConsumerThread(student);

        pt1.start();
        ct1.start();
    }
}

class Student {
    String name;
    int age;
    boolean flag = false; // 当这个值是false的时候，我们就认为是还没有赋值，或者消费完了
}

class ProductThread extends Thread {
    Student student;
    int i = 0;

    public ProductThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                //作为生产者而言，应该先看一看学生对象有没有赋值，如果赋值过了还没有消费，就应该等待，等待消费者消费数据
                //当消费者消费完之后再生产
                if (student.flag) {
                    // 锁对象等待
                    try {
                        student.wait();  // 当生产者走到这一步的时候，就等待，等待消费者消费数据
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (i % 2 == 0) {
                    student.name = "张三";
                    student.age = 19;
                } else {
                    student.name = "李四";
                    student.age = 20;
                }
                i++;
                // 生产完数据后，将标准改为true，等待消费者消费
                student.flag = true;
                // 通知消费者消费数据
                student.notify();
            }
        }
    }
}


class ConsumerThread extends Thread {
    Student student;

    public ConsumerThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                // 对于消费者而言，应该先看一看学生对象有没有赋值，如果没有赋值，就等待，等待生产者生产数据
                if (!student.flag) {
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(student.name + "---" + student.age);

                student.flag = false;
                student.notify();
            }
        }
    }
}
