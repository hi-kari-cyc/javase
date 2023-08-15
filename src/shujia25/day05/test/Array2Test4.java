package shujia25.day05.test;

import java.util.Scanner;

/*
        数据加密问题
            某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
        在传递过程中需要加密，加密规则如下：
            首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
            最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
            然后，把加密后的结果在控制台打印出来。


 */
public class Array2Test4 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个小于8位的整数：");
        int num = sc.nextInt();

        // 获取整数的每一位数据
        int number1 = num % 10;
        int number2 = num / 10 % 10;
        int number3 = num / 10 % 10 % 10;
        int number4 = num / 10 % 10 % 10 % 10;
        int number5 = num / 10000 % 10;
        int number6 = num / 100000 % 10;
        int number7 = num / 1000000 % 10;
        int number8 = num / 10000000;

        // 把获取到的数据放进数组
        int[] arr = new int[]{number8, number7, number6, number5, number4, number3, number2, number1};
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - i - 1];
            arr1[i] = (arr1[i] + 5) % 10;
        }


        int temp = arr1[0];
        arr1[0] = arr1[arr.length - 1];
        arr1[arr1.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i]);
        }
    }
}
