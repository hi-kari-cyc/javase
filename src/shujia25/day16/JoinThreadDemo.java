package shujia25.day16;

/*
    加入线程：其他线程等待该线程执行结束后，才开始执行
        线程加入
            public final void join()

 */

public class JoinThreadDemo {
    public static void main(String[] args) {
        // 创建多个线程对象
        MyJoinThread t1 = new MyJoinThread("线程一");  // 第二种起名方法
        MyJoinThread t2 = new MyJoinThread("线程二");
        MyJoinThread t3 = new MyJoinThread("线程三");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    // start之前调用
        t2.start();
        t3.start();

    }
}

class MyJoinThread extends Thread {
    public MyJoinThread() {
    }

    public MyJoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 300; i++) {
            System.out.println(getName() + "---" + i);
        }
    }
}