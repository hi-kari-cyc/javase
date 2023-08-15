package shujia25.day16;

/*
    后台线程（守护线程）：
        在java中的线程分为两类：1、用户线程  2、守护线程
        当用户线程没有的时候，守护线程也就没有了。
 */

public class DaemonThreadDemo {
    public static void main(String[] args) {
        MyDaemonThread t1 = new MyDaemonThread();
        MyDaemonThread t2 = new MyDaemonThread();
        MyDaemonThread t3 = new MyDaemonThread();

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        // 线程二，线程三设置为守护线程
        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}