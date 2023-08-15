package shujia25.day15;

import java.util.Arrays;

/*
    字符流：其实就是字节流+编码表
    Java语言默认的编码是Unicode编码，一个中午字符占两个字节
    注意：要想读取的数据能够看得懂，就要保证与写入的编码一致

    字符流：
        字符输入流：Reader
        字符输出流：Writer

 */
public class ZiFuLiuDemo {
    public static void main(String[] args) throws Exception{
        String s = "今天下课去打篮球";

        // 加密
        byte[] bytes = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));

        // 解码
        String s1 = new String(bytes, "GBK");
        System.out.println(s1);
    }
}
