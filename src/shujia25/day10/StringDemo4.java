package shujia25.day10;

/*
        String类的判断功能

        boolean equals(Object obj)
        boolean equalsIgnoreCase(String str)
        boolean contains(String str)
        boolean startsWith(String str)
        boolean endsWith(String str)
        boolean isEmpty()

 */
public class StringDemo4 {
    public static void main(String[] args) {
        String s = "HelloWorld";
        String s1 = "helloWORLD";
        String s2 = "HelloWorld";

        // boolean equals(Object obj)  区分大小写比较内容
        System.out.println(s.equals(s1));

        // boolean equalsIgnoreCase(String str)   忽略大小写比较内容
        System.out.println(s.equals(s1));

        // boolean contains(String str)     判断大字符串中是否包含小字符串
        String s3 = "oWo";
        System.out.println(s.contains(s3));

        // boolean startsWith(String str)   判断字符串是否以什么开头
        System.out.println(s.startsWith("Hello"));

        // boolean endsWith(String str)     判断字符串是否以什么结尾
        System.out.println(s.endsWith("world"));

        // boolean isEmpty()   判断是否为空（空字符）
        // 和null的区别：isEmpty()空瓶子，null空瓶子都没有
        System.out.println(s.isEmpty());
        s2 = "";
        System.out.println(s2.isEmpty());
        s2 = null;
//        System.out.println(s2.isEmpty());               // 报错NullPointerException

    }
}
