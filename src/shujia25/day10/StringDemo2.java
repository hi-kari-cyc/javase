package shujia25.day10;

/*
        字符串是常量,它的值在创建之后不能更改
        String s = "hello";
         s += "world";
         问s的结果是多少?


        在Java中使用 + 运算符来拼接字符串时，实际上会创建一个新的字符串对象
        当执行 s += "world"; 时，实际上会创建一个新的字符串对象 "helloworld"，并将其赋值给变量 s。
        这个过程涉及到了字符串的拼接操作，即将原始字符串 "hello" 和新字符串 "world" 连接在一起，形成一个新的字符串对象。


        字符串一旦被创建就不能被改变，指的是方法区中的常量池中的字符串本身不能被改变

 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.hashCode());
        s += "world";
        System.out.println(s);
        System.out.println(s.hashCode());
    }
}
