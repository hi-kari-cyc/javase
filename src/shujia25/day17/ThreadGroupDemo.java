package shujia25.day17;

/*
    ThreadGroup：线程组，java为了我们方便管理一批线程，提供了ThreadGroup类让我们使用

 */

public class ThreadGroupDemo {
    public static void main(String[] args) {
        //ThreadGroup(String name)      构造一个新的线程组
        // 创建一个线程组对象
        ThreadGroup tg1 = new ThreadGroup("帅哥组");

        MyThread2 t1 = new MyThread2(tg1, "张三");
        MyThread2 t2 = new MyThread2(tg1, "李四");
        MyThread2 t3 = new MyThread2(tg1, "王五");

        //如何获取线程所在的线程组名字？
        //ThreadGroup getThreadGroup() 返回此线程所属的线程组。
        //public final String getName() 返回此线程组的名称。
        System.out.println(t1.getThreadGroup().getName());

        ThreadGroup tg2 = new ThreadGroup("美女组");

        MyThread2 t4 = new MyThread2(tg2, "赵六");

        //将帅哥组的线程设置为守护线程
        tg1.setDaemon(true);
    }
}


class MyThread2 extends Thread {
    public MyThread2(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 300; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}