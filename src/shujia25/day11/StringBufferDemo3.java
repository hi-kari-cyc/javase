package shujia25.day11;

/*
    看程序写结果：
    String作为参数传递
    StringBuffer作为参数传递

 */

public class StringBufferDemo3 {
    public static void main(String[] args) {
        //String作为参数传递
        String s1 = "hello";
        String s2 = "world";

        System.out.println("s1: " + s1 + ", s2: " + s2); //
        change(s1, s2);
        System.out.println("s1: " + s1 + ", s2: " + s2); //
    }

    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
        System.out.println("s1: " + s1 + ", s2: " + s2); //
    }
}
