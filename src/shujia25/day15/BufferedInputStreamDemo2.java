package shujia25.day15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节缓冲出入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\FileGet.txt"));

//        System.out.println((char) bis.read());
//        System.out.println((char) bis.read());
//        System.out.println((char) bis.read());
//        System.out.println((char) bis.read());
//        System.out.println((char) bis.read());
        byte[] bytes = new byte[3];
        int length = 0;
        while ((length = bis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, length));
        }
    }
}
