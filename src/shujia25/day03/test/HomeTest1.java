package shujia25.day03.test;

import java.util.Scanner;

/*
           输入自己的名字，年龄和性别，分别用不同的变量接收，并将输入的信息做输出。


 */
public class HomeTest1 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的名字：");
        String name = sc.next();

        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入你的性别：");
        String sex = sc.next();

        System.out.println("你叫" + name + "," + age + "岁" + "," + sex);
    }
}
