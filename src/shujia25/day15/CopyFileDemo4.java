package shujia25.day15;

/*
    使用字符流复制文本文件：
        把当前项目目录下的a1.txt内容复制到当前项目目录下的b1.txt中

     输入流：字符输入流 Reader--InputStreamReader
     输出流：字符输出流 Writer--OutputStreamWriter
 */

import java.io.*;

public class CopyFileDemo4 {
    public static void main(String[] args) throws Exception {
        // 创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new BufferedInputStream(new FileInputStream("src/shujia25/day15/file/a.txt")));

        // 创建字符输出流对象
        OutputStreamWriter osw1 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("src/shujia25/day15/file/b1.txt", true)));
        OutputStreamWriter osw2 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("src/shujia25/day15/file/b2.txt", true)));
        //字符流复制的两种方式
        // 1、一次读写一个字符
        int i = 0;
        while ((i=isr.read())!=-1){
            osw1.write(i);
            osw1.flush();
        }

        // 2、一次读写一个字符数组
        char[] chars = new char[1024];
        int length = 0;
        while ((length = (isr.read(chars))) != -1) {
            osw2.write(chars, 0, length);
            osw2.flush();
        }


        // 释放资源
        osw2.close();
        osw1.close();
        isr.close();
    }
}
