package shujia25.day03.test;

import java.util.Scanner;

/*
    键盘录入x的值，计算出y的并输出。
    x>=3	y = 2x + 1;
	-1<=x<3	y = 2x;
	x<-1	y = 2x – 1;

 */
public class IfTest2 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入x的值：");
        int x = sc.nextInt();
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (-1 <= x) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println("y的值为：" + y);
    }
}

