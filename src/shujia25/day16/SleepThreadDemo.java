package shujia25.day16;

public class SleepThreadDemo {
    public static void main(String[] args) {

        MySleepThread t1 = new MySleepThread();
        t1.start();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}

class MySleepThread extends Thread{
    @Override
    /*
        当一个类继承自Thread类并重写了其中的run方法后，创建该类的对象并调用其start方法时，Java虚拟机会创建一个新的线程，并在该线程上调用该对象的run方法。
        线程的启动和执行是由Java虚拟机负责管理和调度的，而不是由对象自身调用run方法。
        因此，在继承Thread类时，需要重写run方法，并通过启动线程来执行run方法的内容。
     */
    public void run() {
        System.out.println("程序休眠三秒！");

        // public static void sleep(long millis)
        try {
            // sleep方法有编译时期异常
            Thread.sleep(3000);  // 当线程运行到该方法的时候，从运行状态变成了休眠阻塞状态
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("程序休眠结束！");
    }
}