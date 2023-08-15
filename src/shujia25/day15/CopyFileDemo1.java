package shujia25.day15;

/*
    把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
    输入流：
        a.txt--InputStream--FileInputStream
    输出流：
        b.txt--OutputStream--FileOutputStream

 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("src/shujia25/day15/file/FileGet.txt");
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("src/shujia25/day15/file/Copy1.txt");

        // 方式一：一次读写一个字节
        int i = 0;
        while ((i = fis.read()) != -1) {
            fos.write(i);
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
