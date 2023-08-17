package shujia25.day16;

public class StopThreadDemo {
    public static void main(String[] args) {
        MyStopThread t1 = new MyStopThread();
        t1.start();

        try {
            Thread.sleep(1000);
//            t1.stop();            // stop停止run方法，后面不执行了
            t1.interrupt();         // interrupt打断执行，会把run方法中的其他逻辑都执行完
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
