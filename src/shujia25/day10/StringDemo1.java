package shujia25.day10;

/*
    字符串：用一个签子将若干个字符串起来的串儿叫做字符串
    1、字符串可以被看作是一个字符数组，只是被看作是字符数组，但是本身是一个String类型
    2、（重点）字符串一旦被创建，就不能被修改
    3、java中所有的字符串都可以被看作是String类对象

    API：String类代表字符串。 Java程序中的所有字符串文字都被实现为此类的实例。
            字符串不变; 它们的值在创建后不能被更改。
            字符串缓冲区(StringBuffer或StringBuilder)支持可变字符串。因为String对象是不可变的，它们可以被共享。

    构造方法
        public String()
        public String(byte[] bytes)
        public String(byte[] bytes,int offset,int length)
        public String(char[] value)
        public String(char[] value,int offset,int count)
        public String(String original)

    String s = "hello"，字符串字面量创建字符串对象和其他方法的区别：
        在Java中，使用字符串字面量创建字符串对象时，会首先在常量池中查找是否已经存在相同内容的字符串。
        如果存在，将返回常量池中的字符串对象的引用；
        如果不存在，将在常量池中创建一个新的字符串对象，然后返回该对象的引用。

 */


public class StringDemo1 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);

        // public String() 使用无参构造方法创建String类型对象
        String s1 = new String();    // 创建了一个空字符串
        System.out.println("s1：" + s1);
        // 打印发现没有地址值，说明toString()已经被重写了

        // public String(byte[] bytes)   将一个字节数组转换成字符串
        // 会根据字节数组中的每个字节的值，使用对应的字符编码将其转换为字符串的字符
        byte[] bytes = {97, 98, 99, 100, 101, 102, 103};
        String s2 = new String(bytes);
        System.out.println("s2：" + s2);

        // public String(byte[] bytes,int offset,int length) offset(偏移量，也就是索引)
        // 将字节数组的一部分转换成字符串
        String s3 = new String(bytes, 1, 5);
        System.out.println("s3：" + s3);

        // public String(char[] value)   将一个字符数值转换成一个字符串
        char[] chars = {'我', '想', '吃', '饭'};
        String s4 = new String(chars);
        System.out.println("s4：" + s4);

        // public String(char[] value,int offset,int count)    将字符数组的一部分转换成字符串
        String s5 = new String(chars, 2, 2);
        System.out.println("s5：" + s5);

        // public String(String original) 将字符串封装成字符串对象
        String s6 = new String("Hello");
        System.out.println("s6：" + s6);
    }
}
