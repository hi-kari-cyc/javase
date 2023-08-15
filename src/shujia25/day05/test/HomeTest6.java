package shujia25.day05.test;

import java.util.Scanner;

/*
        1.题目：输入某年某月某日，判断这一天是这一年的第几天？
            分析：以3月5日为例，先把前两个月的加起来，然后再加上5天即本年第几天，特殊情况，闰年且输入月份大于3需考虑多加一天。
            可定义数组存储1-12月各月天数。
        定义两个数组：
            数组1存放平年的日期
            数组2存放闰年的日期

 */
public class HomeTest6 {
    public static void main(String[] args) {
        int[] years = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] runYears = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入日期：");
        int day = sc.nextInt();

        int days = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            for (int i = 0; i < month - 1; i++) {
                days += runYears[i];
            }
            days += day;
        } else {
            for (int i = 0; i < month - 1; i++) {
                days += years[i];
            }
            days += day;
        }

        System.out.println("这一天是今年第 " + days + "天");
    }
}

