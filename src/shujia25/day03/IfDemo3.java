package shujia25.day03;

import java.util.Scanner;
/*
    if语句第二种实现格式：
        if(关系表达式){
            语句体1;
        }else{
            语句体2;
        }
        当关系表达式为true的时候执行语句体1，反正执行语句体2，语句体1和语句体2只能执行一个

 */
public class IfDemo3 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入班长的性别：");
        String gender = sc.next();

        if ("男".equals(gender)){
            System.out.println("去男厕所");
        }else {
            System.out.println("去女厕所");
        }

    }
}
