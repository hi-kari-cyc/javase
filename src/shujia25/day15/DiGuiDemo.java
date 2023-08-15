package shujia25.day15;

/*
    递归：方法定义本身内部调用自身的现象，叫做递归

    举例：
        案例1：从前有座山，山里有座庙，庙里有一个老和尚，老和尚在给小和尚讲故事，讲的故事内容是：       1
                从前有座山，山里有座庙，庙里有一个老和尚，老和尚在给小和尚讲故事，讲的故事内容是：     2
                    从前有座山，山里有座庙，庙里有一个老和尚，老和尚在给小和尚讲故事，讲的故事内容是： 3
                        ....
               直到老和尚圆寂了，或者小和尚不想听了，或者山倒了，或者庙塌了

    得到递归的结论：
        1、递归要有方法内部调用自身的现象
        2、递归要有出口（结束条件），否则就是一个死递归（容易造成栈内存溢出）

    优先确定结束条件

    需求：求5的阶乘
    5! = 5*4*3*2*1

 */

public class DiGuiDemo {
    public static void main(String[] args) {
        // 方法一
        int x = 5;
        int res = 1;
        while (x > 0) {
            res *= x;
            x--;
        }
        System.out.println(res);


        // 方法二
        System.out.println(diGui(5));
    }

    public static int diGui(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * diGui(--a);
        }
    }
}
