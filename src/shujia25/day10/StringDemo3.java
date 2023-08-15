package shujia25.day10;

/*
        面试题
            String s = new String("hello")和String s = "hello";的区别?
            字符串比较之看程序写结果
            字符串拼接之看程序写结果

        字符串对象可以在常量池中或堆内存中创建，具体取决于字符串的创建方式和上下文
            1、字符串常量池（String Constant Pool）：字符串字面值：通过字符串字面值创建的字符串对象会被放入字符串常量池。
            2、堆内存：使用new关键字

 */
public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("hello");        // new了地址在堆里面

        String s2 = "hello";                            // 地址指向常量池
        String s3 = s1.toString();
        // public String toString() {
        //        return this;

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);

    }
}
