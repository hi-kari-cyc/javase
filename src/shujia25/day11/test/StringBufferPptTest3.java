package shujia25.day11.test;

/*
        把字符串反转

 */
public class StringBufferPptTest3 {
    public static void main(String[] args) {
        // 创建一个String类型的字符
        String s1 = "hello";
        // 将String类型的字符转换成StringBuffer类型的字符
        StringBuffer sb1 = new StringBuffer(s1);
        // 利用StringBuffer的反转方法
        // 再将StringBuffer类型的字符转回String类型
        String s = sb1.reverse().toString();
        System.out.println(s);
    }
}
