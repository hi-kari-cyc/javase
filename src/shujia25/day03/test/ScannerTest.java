package shujia25.day03.test;

import java.util.Scanner;

/*
    键盘录入两个数据，并对这两个数据求和，输出其结果
    键盘录入两个数据，获取这两个数据中的最大值
    键盘录入三个数据，获取这三个数据中的最大值
    键盘录入两个数据，比较这两个数据是否相等

 */
public class ScannerTest {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = sc.nextInt();

        int res1 = num1 + num2;
        System.out.println(res1);
        int res2 = (num1 > num2) ? num1 : num2;
        System.out.println(res2);
        int res3 = (res2 > num3) ? res2 : num3;
        System.out.println(res3);
        boolean res4 = (num1 == num2) ? true : false;
        System.out.println(res4);
    }
}
