package shujia25.day17;

/*
    newCachedThreadPool(ThreadFactory threadFactory)
    创建一个根据需要创建新线程的线程池，但在可用时将重新使用以前构造的线程，并在需要时使用提供的ThreadFactory创建新线程。

    newScheduledThreadPool(int corePoolSize)
    创建一个线程池，可以调度命令在给定的延迟之后运行，或定期执行。

    newSingleThreadExecutor()
    创建一个使用从无界队列运行的单个工作线程的执行程序。

    public static ExecutorService newFixedThreadPool(int nThreads)
    获取一个固定大小空间的线程池
 */

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 创建一个newFixedThreadPool的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 就相当于线程池提供了一个线程，线程的执行逻辑就是打印1-10，submit的作用就好似启动该线程
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());    // 多的也会执行，多一个线程强执行权
        System.out.println("=============================");

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