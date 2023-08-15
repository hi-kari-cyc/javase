package shujia25.day16;

public class StopThreadDemo {
    public static void main(String[] args) {
        MyStopThread t1 = new MyStopThread();
        t1.start();

        try {
            Thread.sleep(1000);
//            t1.stop();
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyStopThread extends Thread{
    @Override
    public void run() {
        System.out.println("线程休眠十秒");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程结束！");
    }
}
