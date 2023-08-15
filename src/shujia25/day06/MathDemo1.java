package shujia25.day06;

import java.util.Scanner;

/*
    使用帮助文档学习Math类
    1、因为Math类在java.lang包下，所以我们在使用的时候不需要进行导包
    2、通过观察发现，Math没有构造方法
    3、又观察发现，类中的方法和变量都是被static修饰的，就意味着将来可以直接通过类名的方式进行调用
    4、学习其中的一个方法
    public static double random()
 */

public class MathDemo1 {
    public static void main(String[] args) {
        //创建一个键盘录入对象
        Scanner sc = new Scanner(System.in);

//        System.out.println(Math.random()); // [0.0,1.0)
        //需求：随机生成1-100之间的数据
        int number = (int) (Math.random() * 100 + 1);
//        System.out.println(number);
        //数字炸弹游戏
        //只有三次机会猜数字、
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入您猜的数字：");
            int num = sc.nextInt();
            if(num>number){
                System.out.println("您猜大了，请往小的猜");
            }else if(num<number){
                System.out.println("您猜小了，请往大的猜");
            }else {
                System.out.println("恭喜您，猜对了！！！");
                break;
            }
            System.out.println("您还剩下 "+(3-i)+" 次机会");
        }
    }
}
