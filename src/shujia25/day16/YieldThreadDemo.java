package shujia25.day16;

/*
    礼让线程：目的是为了让多个线程之间的执行显得更加和谐
    public static void yield()
    CPU小小的时间片可以执行很多次
 */

public class YieldThreadDemo {
    public static void main(String[] args) {
        MyYieldThread t1 = new MyYieldThread();
        t1.setName("线程一");

        MyYieldThread t2 = new MyYieldThread();
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}

class MyYieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 300; i++) {
            System.out.println(getName() + " : " + i);
            Thread.yield();
        }
    }
}