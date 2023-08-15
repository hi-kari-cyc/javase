package shujia25.day11.test;

/*
        String和StringBuffer的相互转换

 */

public class StringBufferPptTest1 {
    public static void main(String[] args) {
        String s1 = "hello";

        // String --> StringBuffer
        StringBuffer sb1 = new StringBuffer(s1);
        System.out.println(sb1);

        System.out.println("==============================");
        // StringBuffer --> String
        String s2 = sb1.toString();
        System.out.println(s2);

        // String的构造方法   public String(StringBuffer buffer)
        String s3 = new String(sb1);
        System.out.println(s3);

    }
}
