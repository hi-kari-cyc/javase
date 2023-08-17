package shujia25.day17;

/*
    定时器：在Java中，可以通过Timer和TimerTask类来实现定义调度的功能

    public Timer()  构造函数
    public void schedule(TimerTask task, long delay)  延迟多久执行一次任务
    public void schedule(TimerTask task,long delay,long period)  延迟多久执行一次任务，并且间隔多久再次执行

 */

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        // 创建一个定时器
        Timer timer = new Timer();

        // public void schedule(TimerTask task, long delay)  延迟多久执行一次任务
        timer.schedule(new MyTask(timer),3000);

        // public void schedule(TimerTask task,long delay,long period)  延迟多久执行一次任务，并且间隔多久再次执行
        timer.schedule(new MyTask(timer),3000,1000);
    }
}

// 创建一个定时任务类
class MyTask extends TimerTask{
    private Timer timer;

    public MyTask(Timer timer) {
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("定时器结束！");

        timer.cancel(); // 终止此计时器，丢弃任何当前计划的任务
    }
}