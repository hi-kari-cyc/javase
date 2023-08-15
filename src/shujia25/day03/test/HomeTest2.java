package shujia25.day03.test;

import java.util.Scanner;

/*
        输入圆形半径，求圆形的周长和圆形的面积,并将结果输出。


 */
public class HomeTest2 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入圆的半径：");
        double r = sc.nextDouble();
        double c = 2 * 3.14 * r;
        double s = 3.14 * r * r;
        System.out.println("该园的周长为：" + c + ",面积为：" + s);
    }
}
