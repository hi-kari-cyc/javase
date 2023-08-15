package shujia25.day03;

import java.util.Scanner;

/*
    比较两个数中的最大值

    if语句编写的注意事项：
        1、大括号不要随意省略，如果省略了，if语句只作用在第一条语句体上。建议，永远不要省略大括号
        2、小括号后面如果加上了分号，相当于存在一个空语句体
        3、小括号中的结果必须要是boolean类型的


 */
public class IfDemo2 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();

        int res = num2;
        if (num1>num2){
            res = num1;
        }
        System.out.println("较大值为:"+res);
    }
}
