package shujia25.day15;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
    字符流：
        字符输入流：Reader
        字符输出流：Writer -- OutputStreamWriter

    OutputStreamWriter 字符输出流：
        public OutputStreamWriter(OutputStream out)
        public OutputStreamWriter(OutputStream out,String charsetName)

    字符输出流OutputStreamWriter的方法：字符流无论是否是缓冲流，在写数据的时候都要进行刷新
        public void write(int c)
        public void write(char[] cbuf)
        public void write(char[] cbuf,int off,int len)
        public void write(String str)
        public void write(String str,int off,int len)

 */

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception{
        // 创建一个字符输出流对象
        // //public OutputStreamWriter(OutputStream out) 以默认的编码创建字符输出流对象，其中封装了字节流对象
        // 加上BufferedOutputStream(字符缓冲)读取和写入更快一点
//        OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("src/shujia25/day15/file/OutputStreamWriter.txt")));

        // public OutputStreamWriter(OutputStream out,String charsetName)
        OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("src/shujia25/day15/file/OutputStreamWriter.txt",true)),"GBK");

        // public void write(int c)     一次写一个字符
        osw.write(98);

        // public void write(char[] cbuf)      一次写一个字符数组
        osw.write("你好，世界".toCharArray());
        osw.write("\r\n".toCharArray());

        // public void write(char[] cbuf,int off,int len) 一次写一个字符数组的一部分
        osw.write("你好，世界".toCharArray(),0,2);
        osw.write("\r\n".toCharArray());

        // public void write(String str) 一次写一个字符串
        osw.write("今天是个好日子");
        osw.write("\r\n");

        // public void write(String str,int off,int len) 一次写一个字符串的一部分
        osw.write("今天是个好日子",4,3);
        osw.write("\r\n");

        // 释放资源
        osw.close();
    }
}
