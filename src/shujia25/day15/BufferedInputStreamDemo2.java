package shujia25.day15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
        字节流读汉字不能一个字节一个字节读
        由于字节流操作中文不是特别方便，所以，java就提供了转换流(处理流)
 */
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
