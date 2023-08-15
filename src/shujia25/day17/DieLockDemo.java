package shujia25.day17;

/*
    死锁：多个线程出现了相互等待的现象
    举例：
        中国人和外国人吃饭的问题（中国人吃饭必须要有两支筷子，外国人吃饭必须是一把刀和一把叉子）
        现在的情况：
            中国人：一支筷子，一把刀
            外国人：一支筷子，一把叉子

 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DieLockDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("中国人", true);
        MyThread t2 = new MyThread("外国人", false);

        t1.start();
        t2.start();

    }
}

class MyThread extends Thread{
    boolean flag = true;

    public MyThread(String name, boolean flag) {
        super(name);
        this.flag = flag;
    }

    @Override
    public void run() {
     if (flag){
         synchronized (Locks.lock1){
             System.out.println("if lock1");
             synchronized (Locks.lock2){
                 System.out.println("if lock2");
             }
         }
     }else {
         synchronized (Locks.lock2){
             System.out.println("else lock2");
             synchronized (Locks.lock1){
                 System.out.println("else lock1");
             }
         }
     }
    }
}

// 定义一个工具类
class Locks{
    private Locks(){}

    // 定义两把锁
    public static final Lock lock1 = new ReentrantLock();
    public static final Lock lock2 = new ReentrantLock();

}
