package shujia25.test;

import java.util.Scanner;

/*
         试编写程序，从一个给定的字符串中删去某一个给定的字符。

 */
public class test6 {
    public static void main(String[] args) {
        String s = "HelloWorld";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想删除的字符：");
        String aChar = sc.next();

        String replace = s.replace(aChar, "");
        System.out.println("删除" + aChar + "之后的字符串为：" +replace);
    }
}
