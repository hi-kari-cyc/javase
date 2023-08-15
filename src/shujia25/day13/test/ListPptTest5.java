package shujia25.day13.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/*
    键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值

 */
public class ListPptTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        while (true) {
            System.out.println("请输入数字：");
            int i = sc.nextInt();

            if (i != 0) {
                integers.add(i);
            } else {
                break;
            }
        }
        Object[] arr = integers.toArray();
        Arrays.sort(arr);
        System.out.println("输入的数字最大的是：" + arr[arr.length - 1]);
    }
}
