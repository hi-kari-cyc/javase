package shujia25.day17.sellticket4;

import java.util.concurrent.locks.ReentrantLock;

public class SellTicketDemo4 {
    public static void main(String[] args) {

        Windows4 windows4 = new Windows4();

        Thread t1 = new Thread(windows4);
        t1.setName("窗口1");
        Thread t2 = new Thread(windows4);
        t2.setName("窗口2");
        Thread t3 = new Thread(windows4);
        t3.setName("窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}

class Windows4 implements Runnable {
    // 加上static变量成为共享
    static int tickets = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (tickets > 0) {
                //为了模拟真实的售票情况，我加入了休眠线程
                try {
                    //t1
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("窗口" + Thread.currentThread().getName() + "正在出售第 " + (tickets--) + " 张票");
                lock.unlock();
            }
        }
    }
}
