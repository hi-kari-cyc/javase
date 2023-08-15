package shujia25.day06;

import java.util.Scanner;

/*
    猜数字游戏，不设置次数，直到猜对
 */
public class MathDemo2 {
    public static void main(String[] args) {
        //创建一个键盘录入对象
        Scanner sc = new Scanner(System.in);

//        System.out.println(Math.random()); // [0.0,1.0)
        //需求：随机生成1-100之间的数据
        int number = (int) (Math.random() * 100 + 1);

        while (true){
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
        }
    }
}
