package shujia25.day17.sellticket1;

/*
    需求：
        某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。

    第一种创建线程的方式实现：
        定义一个类，继承Thread类，重写run方法
 */
public class SellTicketDemo1 {
    public static void main(String[] args) {
        // 创建第一个线程对象
        Windows1 windows1 = new Windows1();
        windows1.setName("窗口1");
        Windows1 windows2 = new Windows1();
        windows2.setName("窗口2");
        Windows1 windows3 = new Windows1();
        windows3.setName("窗口3");

        windows1.start();
        windows2.start();
        windows3.start();
    }
}

class Windows1 extends Thread {
    // 加上static变量成为共享
    static int tickets = 100;
    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(getName() + "正在出售第---" + tickets-- + "---张票");
            }
        }
    }
}