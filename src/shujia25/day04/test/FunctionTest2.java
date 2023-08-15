package shujia25.day04.test;

import java.util.Scanner;

/*
        键盘录入行数和列数，输出对应的星形
        键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表

 */
public class FunctionTest2 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入星形的行列数：");
        int n = sc.nextInt();
        printStar(n);

        System.out.println("请输入乘法表的数据：");
        int m = sc.nextInt();
        printCheng(m);

    }


    public static void printStar(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void printCheng(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println(" ");
        }
    }
}
