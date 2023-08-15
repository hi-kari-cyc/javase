package shujia25.day03.test;

import java.util.Scanner;
/*
        键盘录入月份的值，输出对应的季节。
 */
public class IfTest3 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份：");
        int month = sc.nextInt();
        if (month<=5 & month>=3){
            System.out.println("对应的季节是春季");
        } else if (month<=8 & month>=6) {
            System.out.println("对应的季节是夏季");
        } else if (month<=11 & month>=9) {
            System.out.println("对应的季节是秋季");
        } else {
            System.out.println("对应的季节是冬季");
        }
    }
}
