package shujia25.day10.test;
import java.util.Scanner;
/*
    将任意一个输入进来的字符串，转换成首字母大写，其余字母小写的格式（前提：都是英文字母）

 */
public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        // 将首字母和其余字母截取出来
        String shouZiMu = s.substring(0,1);
        String qiYuZiMu = s.substring(1);
        String s2 = shouZiMu.toUpperCase().concat((qiYuZiMu).toLowerCase());
        System.out.println(s2);
    }
}
