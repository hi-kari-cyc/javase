package shujia25.day17.sellticket2;

/*
    第二种创建线程的方式：
        创建类实现Runnable接口，实现run方法，借助Thread类创建线程

    出现了问题：
        我们加入死循环和延迟之后，运行发现，出现了售卖重复的票，还出现了第0张票或者第-1张票的现象
        1、线程的执行具有随机性  出现了重复的票
        2、小小的CPU时间片，可以执行很多次，导致出现了第0张票或者第-1张票
        3、线程的执行具有原子性
    发生上面的问题，有另一种专业的说法，线程不安全的现象。
    如何判断多线程程序存在线程安全的问题：如果同时满足以下3种需求，就会出现线程不安全的情况：
        1、是否存在多线程环境
        2、是否存在共享数据
        3、是否有多条语句操作着共享数据

    怎么解决呢：
        1、同步代码块
            java提供了一个关键字给我们解决多线程安全的问题：synchronized(同步)
                语法：
                    锁对象要让多个线程共享
                    synchronized(对象){
                        操作共享数据的代码
                    }
            同步方法的锁对象是：this
            同步静态方法的锁对象是 当前线程类的Class文件对象

        2、Lock锁

    什么是锁对象：
        锁对象可以是任何Java对象，通常选择一个能够代表共享资源的对象作为锁对象。
        锁对象要被所有线程共享

    在synchronized关键字后的括号中，放置的是用作锁的对象。
    这个对象可以是任意的Java对象，通常是用来保护共享资源的对象或者是多个线程之间需要同步的对象。

 */
public class SellTicketDemo2 {
    public static void main(String[] args) {
        Windows2 windows2 = new Windows2();

        Thread t1 = new Thread(windows2);
        t1.setName("窗口1");
        Thread t2 = new Thread(windows2);
        t2.setName("窗口2");
        Thread t3 = new Thread(windows2);
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Windows2 implements Runnable{
    // 这里的tickets不用加static，因为Windows只被创建一次，剩下的由Thread创建线程
    int tickets = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj){
                if (tickets > 0) {
                    // 为了模拟真实是售票情况，加入休眠线程
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在出售第---" + tickets-- + "---张票");
                }
            }
            /*
                两种问题出现的情况：
                        窗口1正在出售第100张票
                        窗口2正在出售第100张票
                        窗口3正在出售第100张票
                        ..
                        窗口1正在出售第1张票
                        窗口2正在出售第0张票
                        窗口3正在出售第-1张票

              */
        }
    }
}
