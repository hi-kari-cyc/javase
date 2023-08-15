package shujia25.day05.test;

import java.util.Scanner;

/*
        数据加密问题
            某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
        在传递过程中需要加密，加密规则如下：
            首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
            最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
            然后，把加密后的结果在控制台打印出来。

        上一段代码复盘：
            由于输入数据的位数不确定，所以在获取数据时不能直接按位除余获取数值，如 输入七位数则会出现错误

        方法改进：
            创建一个方法用于获得输入数据的位数
            使用for循环获得输入数据每一个位的数值，并放入数组中

 */
public class Array2Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小于8为的整数：");
        int num = sc.nextInt();

        // 获得输入数据的位数
        int wei = weiShu(num);
        System.out.println("输入的数据为" + wei + "位数");

        // 利用得到的数据位数创建数组
        int[] arr = new int[wei];

        // 获得输入数据的每一位值，并将数值放到数组中
        for (int i = wei - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }

        // 倒叙处理,变化处理
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - i - 1];
            arr1[i] = (arr1[i] + 5) % 10;
        }

        // 将第一位和最后一位数字交换
        int temp = arr1[0];
        arr1[0] = arr1[arr.length - 1];
        arr1[arr1.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i]);
        }
    }


    // 获取num的位数
    public static int weiShu(int a) {
        int count = 1;
        while (a < 1 || a > 9) {
            a /= 10;
            count++;
        }
        return count;
    }
}
