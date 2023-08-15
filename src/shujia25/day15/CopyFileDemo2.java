package shujia25.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileDemo2 {
    public static void main(String[] args) throws Exception {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("src/shujia25/day15/file/懒哥.jpg");
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("src/shujia25/day15/file/Copy2.jpg");

        // 方式一：一次读写一个字节
        int j = 0;
        while ((j = fis.read()) != -1) {
            fos.write(j);
        }

        // 方式二：一次读写一个字节数组
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, length);
        }


        // 释放资源
        fos.close();
        fis.close();
    }
}
