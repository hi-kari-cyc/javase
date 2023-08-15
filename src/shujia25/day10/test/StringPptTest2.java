package shujia25.day10.test;


/*
        字符串拼接之看程序写结果

 */
public class StringPptTest2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1 + s2);  //
        System.out.println(s3 == "hello" + "world");    //
        System.out.println(s3.equals(s1 + s2)); //
//        还可以通过Xjad查看class文件。

    }
}

/*
    s1 + s2 运算得到的结果是 "helloworld"。由于这是一个动态创建的字符串对象，它在堆内存中而不是字符串常量池中
    "hello" + "world" 拼接结果在字符串常量池中
 */