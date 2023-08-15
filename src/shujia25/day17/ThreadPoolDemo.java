package shujia25.day17;

/*
    public static ExecutorService newFixedThreadPool(int nThreads)
    获取一个固定大小空间的线程池
 */

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 创建一个newFixedThreadPool的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 就相当于线程池提供了一个线程，线程的执行逻辑就是打印1-10，submit的作用就好似启动该线程
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());

        // 第三种实现多线程的方式
        // <T> Future<T> submit(Callable<T> task);

        pool.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
                return new Object();
            }
        });

        // 关闭线程池
        pool.shutdown();
    }
}


class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}