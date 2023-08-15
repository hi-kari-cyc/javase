package shujia25.day16;

/*
    java实现多线程的方式：
        1、继承Thread类，重写run方法
        2、实现Runnable接口，实现run方法，借助Thread类创建线程
        3、实现Callable接口，实现call方法，借助线程池来实现

   方式1：继承Thread类，重写run方法
   java提供了一个类，来描述线程，这个类就叫做Thread
   Thread类官方描述:
            Thread是程序中执行的线程。
            Java虚拟机允许应用程序同时执行多个执行线程。
            每个线程都有优先权, 具有较高优先级的线程优先于优先级较低的线程执行

   官方说明第一种方式实现线程：创建一个新的执行线程有两种方法。 一个是将一个类声明为Thread的子类。 这个子类应该重写run类的方法Thread 。
 */

public class ThreadDemo {
    public static void main(String[] args) {
        // 创建一个线程对象
        MyThread t1 = new MyThread();
        // 为了模拟多线程环境，多创建集合线程对象
        MyThread t2 = new MyThread();

        // 给线程设置名字
        t1.setName("线程一");
        t2.setName("线程二");

        // 获取线程的执行优先级
        // public final int getPriority()返回此线程的优先级
        // 线程创建出来之后，默认的优先级是5
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // 设置优先级  [1-10]
        // 如果优先级设置很高，也不是一定先执行，只不过先执行的可能性会大一些。
        t1.setPriority(10);
        t2.setPriority(1);



        // 官方告诉我们说，要通过调用start()方法来启动一个线程
        // 一个线程对象，调用完start()方法之后，并非立刻执行，而是去和别的线程对象去抢夺CPU执行权
        // 只有当抢到了CPU执行权，才会执行run方法中的逻辑，如果run方法中的逻辑执行结束后，该线程就变成死亡垃圾，等待被回收
        // 多个线程之间的执行具有随机性
        /*
            start方法是Thread类的一个成员方法，它用于启动线程并执行线程的run方法。
            在Java中，线程对象通过调用start方法来启动线程，而不是直接调用run方法。
            当调用start方法时，Java虚拟机会在新的线程上执行run方法的内容
         */
        t1.start();
        t2.start();

        //这里如果调用的是run方法，其实就是普通的对象调用非私有的方法，和多线程没关系
//        t1.run();
//        t2.run();
    }
}


//自己自定义的一个类继承自Thread，那么这个类就称之为线程类

class MyThread extends Thread{
    @Override
    public void run() {
        // 将来线程对象启动之后，运行时会调用这里run方法，来执行线程做的事情
        // 获取线程的名字，Thread类中有一个方法 public final String getName() 返回此线程的名称
        for (int i = 1; i < 300; i++) {
            System.out.println(getName() + " -- " + i);
        }
    }
}