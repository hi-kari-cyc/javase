package shujia25.day15;

/*
    字符缓冲输入流：BufferedReader(Reader in) 创建使用默认大小的输入缓冲区的缓冲字符输入流。
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception{
        // 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src/shujia25/day15/file/BufferedWriter.txt"));

        // 读取完整一行，不会读取换行符
        String s1 = br.readLine();
        System.out.println(s1);
        String s2 = br.readLine();
        System.out.println(s2);

        // 因为不知道一个文件中有多少行，所以采用while循环
        String s;
        while ((s = br.readLine())!=null){
            System.out.println(s);
        }

        // 释放资源
        br.close();
    }
}
