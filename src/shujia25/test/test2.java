package shujia25.test;

public class test2 {
    public static void main(String[] args) {
        Windows windows = new Windows();
        Thread t1 = new Thread(windows);
        t1.setName("窗口1");
        Thread t2 = new Thread(windows);
        t2.setName("窗口2");
        Thread t3 = new Thread(windows);
        t3.setName("窗口3");
        Thread t4 = new Thread(windows);
        t4.setName("窗口4");
        Thread t5 = new Thread(windows);
        t5.setName("窗口5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

class Windows implements Runnable {
    static int ticket = 1000;
    int i = 0;

    @Override
    public void run() {
        while (true) {
            if (i % 2 == 0) {
                synchronized (new Object()) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + "正着售卖第" + ticket-- + "张票");
                    }
                }
            }else {
                fun();
            }
            i++;
        }
    }
    public synchronized void fun(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正着售卖第" + ticket-- + "张票");
        }
    }
}