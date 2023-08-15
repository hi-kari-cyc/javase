package shujia25.day16;

/*
    线程的实现方式2：实现Runnable接口，实现run方法  (最常用的实现方式)
    官方说法：
        另一种方法来创建一个线程是声明实现类Runnable接口。
        那个类然后实现了run方法。
        然后可以分配类的实例，在创建Thread时作为参数传递，并启动。
 */

public class RunnableDemo {
    public static void main(String[] args) {
        // 理解：多个线程对象公用一个run方法
        MyRunnable myRunnable = new MyRunnable();
        // 创建线程对象
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 300; i++) {
            //public static Thread currentThread() 返回对当前正在执行的线程对象的引用。
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}