package shujia25.day10.test;


/*
        字符串比较之看程序写结果

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("hello");
        String s4 = "hello";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        String s5 = "hello";
        String s6 = "hello";
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

 */
public class StringPptTest1 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1==s2);   // F
        System.out.println(s1.equals(s2));  // T

        String s3 = new String("hello");
        String s4 = "hello";
        System.out.println(s3==s4);  // F
        System.out.println(s3.equals(s4)); // T

        String s5 = "hello";
        String s6 = "hello";
        System.out.println(s5==s6);  // T
        System.out.println(s5.equals(s6));  // T
    }
}
