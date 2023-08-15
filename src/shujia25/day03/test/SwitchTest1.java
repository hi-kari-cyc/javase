package shujia25.day03.test;
import java.util.Scanner;

/*
        模拟做单项选择题，根据你的选择，给出对应的答案。(表达式是字符的情况)

 */
public class SwitchTest1 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("以下哪个不是数据库？");
        System.out.println("A、mysql  B、hive  C、Hbase  D、ClickHouse");
        System.out.println("请输入正确答案:");

        String choice = sc.next();
        switch (choice){
            case "A":
                System.out.println("选择错误");
                break;
            case "B":
                System.out.println("选择正确！");
                break;
            case "C":
                System.out.println("选择错误");
                break;
            case "D":
                System.out.println("选择错误");
                break;
            default:
                System.out.println("请输入A、B、C、D");
                break;
        }
    }
}
