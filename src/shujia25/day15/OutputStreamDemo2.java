package shujia25.day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    加入异常处理的IO流操作

 */
public class OutputStreamDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;      // 作用域问题，如果在try中定义，在finally中无法使用
        try {
            // 创建字节输出流对象
            fos = new FileOutputStream("src/shujia25/day15/file/OutputStream3.txt", true);

            // 向文件中写数据
//            fos.write("df".getBytes());
//            fos.write("\r\n".getBytes());
            for (int i = 0; i < 10; i++) {
                fos.write("world".getBytes());
                fos.write("\r\n".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
