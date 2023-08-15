package shujia25.day15;


import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/shujia25/day15/file/BufferedOutputStream.txt"));

        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = bis.read(bytes)) != -1) {
            String s = new String(bytes, 0, length);
            System.out.println(s);
        }


        // 释放资源
        bis.close();
    }
}
