package shujia25.day03.test;

import java.util.Scanner;
/*
        获取三个数据中的最大值

 */
public class IfTest4 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第1个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第2个数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第3个数：");
        int num3 = sc.nextInt();

        if (num1>num2){
            if (num1>num3){
                System.out.println("三个数中最大的是："+num1);
            }else {
                System.out.println("三个数中最大的是："+num3);
            }
        }else {
            if (num2>num3){
                System.out.println("三个数中最大的是："+num2);
            }else {
                System.out.println("三个数中最大的是："+num3);
            }
        }
    }
}
