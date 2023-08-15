package shujia25.day03.test;

import java.util.Scanner;

/*
        用switch语句实现键盘录入月份，输出对应的季节
        春季  3 4 5
        夏季  6 7 8
        秋季  9 10 11
        冬季  12 1 2

 */
public class SwitchTest3 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份:");
        int month = sc.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("该月份所对应的季节是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("该月份所对应的季节是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("该月份所对应的季节是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("该月份所对应的季节是冬季");
                break;
            default:
                System.out.println("请输入正确月份！");
        }
    }
}
