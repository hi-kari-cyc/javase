package shujia25.test;


/*
        试编写一个程序，输入一个字符串，统计其中有多少各单词？单词之间用空格分开
 */
import java.util.Scanner;


public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        String[] list = s.split(" ");

        System.out.println("共有"+list.length+"个单词");
    }
}
