package shujia25.day03.test;

import java.util.Scanner;

/*
        通过把学生考试成绩分等级来引出if语句的第三种格式
            90-100	优秀
            80-90	好
            70-80	良
            60-70	及格
            60一下	不及格

 */
public class IfTest1 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生成绩:");
        int score = sc.nextInt();

        // java语言中不允许连续比较，请使用逻辑运算符进行连接
        if (score >= 90 & score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("好");
        } else if (score >= 70) {
            System.out.println("良");
        } else if (score >= 60) {
            System.out.println("及格");
        } else if (score > 0) {
            System.out.println("不及格");
        } else {
            System.out.println("输入的成绩有误！");
        }
    }
}
