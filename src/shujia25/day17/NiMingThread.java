package shujia25.day17;

/*
    匿名内部类的方式实现多线程
 */

public class NiMingThread {
    public static void main(String[] args) {
        // 相当于内部定义一个类继承Thread
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(getName() + "---" + i);
                }
            }
        };
        t1.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(getName() + "---" + i);
                }
            }
        }.start();


//        MyRunnable myRunnable = new MyRunnable();
//        Thread tt1 = new Thread(myRunnable);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    // 匿名内部类是一个独立的类，没有继承Thread类，所以无法直接调用getName()方法。
                }
            }
        }).start();


        // 第一第二中实现多线程的方式相结合
        new Thread(new Runnable() {
            @Override
            public void run() {     // 不生效
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }) {
            @Override
            public void run() {  // 生效
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "----" + i);
                }
            }
        }.start();
    }
}
