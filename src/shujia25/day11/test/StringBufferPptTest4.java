package shujia25.day11.test;

import java.util.Scanner;

/*
            判断一个字符串是否是对称字符串
                例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 */
public class StringBufferPptTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        // 先将字符串转为StringBuffer类型
        StringBuffer sb = new StringBuffer(s);

        // 调用反转
        sb.reverse();

        String s1 = sb.toString();
        if (s == s1) {
            System.out.println("该字符串为对称字符串");
        } else {
            System.out.println("该字符串不是对称字符串");
        }
    }
}
