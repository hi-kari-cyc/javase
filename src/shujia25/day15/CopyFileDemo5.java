package shujia25.day15;

/*
    使用字符缓冲流复制一个文本文件：

 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileDemo5 {
    public static void main(String[] args) throws Exception {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src/shujia25/day15/file/BufferedWriter.txt"));
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/shujia25/day15/file/BufferedWriterCopy.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();     // readLine不会读换行符，写的时候要写换行符
        }

        bw.close();
        br.close();
    }
}
