package shujia25.day03;

import java.util.Scanner;

/*
    实现键盘录入的步骤：
        1、导包（在package下面导包）
        2、创建键盘录入对象
        3、调运方法实现功能（读取用户输入）

 */
public class ScannerDemo {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 调用方法实现功能
        System.out.println("请输入一个数字:");
        int num = sc.nextInt(); //  读取用户输入,并赋给变量num
        System.out.println(num);

        System.out.println("请输入一个字符串:");
        // String 就是字符串类型的意思
        String s = sc.next();
        System.out.println(s);

    }
}