package shujia25.day17.sellticket3;

/*
    探究同步方法和同步静态方法的锁对象
    探究同步方法的锁对象是谁

 */
public class SellTicketDemo3 {
    public static void main(String[] args) {
        Windows3 windows3 = new Windows3();

        Thread t1 = new Thread(windows3);
        t1.setName("窗口1");
        Thread t2 = new Thread(windows3);
        t2.setName("窗口2");
        Thread t3 = new Thread(windows3);
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Windows3 implements Runnable {
    // 这里的tickets不用加static，因为Windows只被创建一次，剩下的由Thread创建线程
    static int tickets = 100;

    final Object obj = new Object();
    int i = 0;

    @Override
    public void run() {
        while (true) {

            if (i % 2 == 0) {
//                this代表当前Windows3对象
                synchronized (Windows3.class) {
                    // fun1方法的锁对象是windows3，要想线程安全，就要保证同步代码块和同步方法的锁对象一致
                    // 使用this关键字作为锁对象，确保在同一时刻只有一个线程能够执行同步代码块或同步方法中的代码。
                    if (tickets > 0) {
                        // 为了模拟真实是售票情况，加入休眠线程
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第---" + tickets-- + "---张票");
                    }
                }
            } else {
                fun1();
            }
            i++;
        }
    }

    // 同步方法
    // 被synchronized的方法是线程安全的，一个对象在用的时候另一个对象不能去用
    public synchronized static void fun1() {
        if (tickets > 0) {
            // 为了模拟真实是售票情况，加入休眠线程
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第---" + tickets-- + "---张票");
        }
    }
}
