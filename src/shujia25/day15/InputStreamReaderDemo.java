package shujia25.day15;

/*
        字符流：
            字符输出流：Writer--OutputStreamWriter
            字符输入流：Reader--InputStreamReader

        字符输入流InputStreamReader的构造方法：
            InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader
            InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。

        字符输入流读取数据的方法：
            public int read()
            public int read(char[] cbuf)

 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception {
        // 创建字符输入流对象
        // InputStreamReader(InputStream in)默认编码创建字符输入流对象
//        InputStreamReader isr = new InputStreamReader(new BufferedInputStream(new FileInputStream("src/shujia25/day15/file/OutputStreamWriter.txt")));

        // InputStreamReader(InputStream in, String charsetName) 指定编码创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new BufferedInputStream(new FileInputStream("src/shujia25/day15/file/OutputStreamWriter.txt")), "GBK");

        // public int read() 一次读取一个字符
//        int read1 = isr.read();
//        System.out.println((char) read1);
//        int read2 = isr.read();
//        System.out.println((char) read2);
        //一次读取一个字符最终写法
        int i = 0;
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);
        }


        // public int read(char[] cbuf) 一次读取一个字符数组
//        char[] chars = new char[3];
//        int length = isr.read(chars);  // 获取的是读取到的字符个数
//        String s = new String(chars, 0, length);
//        System.out.println(s);
        //一次读取一个字符数组最终写法
        char[] chars = new char[1024];
        int length = 0;
        while ((length = isr.read(chars))!=-1){
            String s = new String(chars, 0, length);
            System.out.println(s);
        }

        // 释放资源
        isr.close();
    }
}
