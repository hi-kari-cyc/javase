package shujia25.day15;

/*
    为了提高字符流的读写速度，java也对应提供了缓冲流
    字符缓冲输出流：BufferedWriter
        BufferedWriter(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
    字符缓冲输入流：BufferedReader

 */

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) throws Exception{
        //创建一个字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/shujia25/day15/file/BufferedWriter.txt"));
        bw.write("你好");

//        bw.write("\r\n");
        bw.newLine(); //自动写入一个适配系统的换行符

        bw.write("世界");
        bw.flush();

        // 释放资源
        bw.close();
    }
}
