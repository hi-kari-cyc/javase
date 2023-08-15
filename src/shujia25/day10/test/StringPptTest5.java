package shujia25.day10.test;

import java.util.Arrays;
import java.util.Scanner;

/*
        字符串反转
    举例：键盘录入”abc”		输出结果：”cba”

        1、将字符串转成一个字符数组  toCharArray()
        2、数组逆序
        3、将字符数组转成字符串输出  static String valueOf(char[] chs)

 */
public class StringPptTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        char[] arr = s.toCharArray();
        char[] arr0 = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr0[arr.length - i - 1] = arr[i];
        }
        String s1 = String.valueOf(arr0);
        System.out.println(s1);
    }
}
