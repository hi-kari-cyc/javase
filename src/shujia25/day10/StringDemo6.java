package shujia25.day10;
import java.util.Arrays;
/*
        String类的转换功能

            byte[] getBytes()
            char[] toCharArray()
            static String valueOf(char[] chs)
            static String valueOf(int i)
            String toLowerCase()
            String toUpperCase()
            String concat(String str)


 */
public class StringDemo6 {
    public static void main(String[] args) {
        String s = "helloWORLD";

        // byte[] getBytes()        将一个字符串转换成一个字节数组
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        // char[] toCharArray()     将一个字符串转换成一个字符数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        // static String valueOf(char[] chs)        将一个字符数组转换成一个字符串
        String s1 = String.valueOf(chars);
        System.out.println(s1);

        // static String valueOf(int i)     将一个整数类型的值转换成一个字符串类型的值   100-->'100'
        System.out.println(String.valueOf(100));

        // String toLowerCase()     将字符串全部字符转小写
        System.out.println(s.toLowerCase());

        // String toUpperCase()     将字符串全部字符转大写
        System.out.println(s.toUpperCase());

        // String concat(String str)  字符串拼接
        String s2 = "java";
        String s3 = "真简单";
        System.out.println(s2.concat(s3));
        System.out.println(s3.concat(s2));
        System.out.println(s2.concat(s3).concat(s3).concat(s3).concat(s3));
    }
}
