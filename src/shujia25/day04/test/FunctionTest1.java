package shujia25.day04.test;

import java.util.Scanner;

/*
        键盘录入两个数据，返回两个数中的较大值
        键盘录入两个数据，比较两个数是否相等
        键盘录入三个数据，返回三个数中的最大值

 */
public class FunctionTest1 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();

        System.out.println("请输入第三个数：");
        int num3 = sc.nextInt();

        // 调用方法1
        int res1 = maxNumber(num1,num2);
        System.out.println(res1);

        // 调用方法2
        boolean res2 = isEquals(num1,num2);
        System.out.println(res2);

        //调用方法3
        int res3 = maxNumbers(num1,num2,num3);
        System.out.println(res3);

    }

    /*
        定义方法明确两件事：
            1、返回值类型   int
            2、参数列表     int a,int b
     */

    public static int maxNumber(int a,int b){
        return Math.max(a,b);
    }

    /*
        定义方法明确两件事：
            1、返回值类型   boolean
            2、参数列表     int a,int b
     */
    public static boolean isEquals(int a,int b){
        return a == b;
    }

    /*
        定义方法明确两件事：
            1、返回值类型   int
            2、参数列表     int a,int b,int c
     */
    public static int maxNumbers(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }

}
