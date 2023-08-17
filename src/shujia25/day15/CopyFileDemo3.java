package shujia25.day15;

/*
    需求：复制视频，比较4种读写的速度
    目标文件：D:\IDEA\JavaProject\java25\src\shujia25\day15\file\Test.mp4

 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
        1、普通的字节流一次读写一个字节 D:\IDEA\JavaProject\java25\src\shujia25\day15\file\CopyMp41.mp4
            时长： > 25201毫秒

        2、字节缓冲流一次读写一个字节  D:\IDEA\JavaProject\java25\src\shujia25\day15\file\CopyMp42.mp4
            时长：3454毫秒

        3、普通的字节流一次读写一个字节数组  D:\IDEA\JavaProject\java25\src\shujia25\day15\file\CopyMp43.mp4
            时长：471毫秒

        4、字节缓冲流一次读写一个字节数组   D:\IDEA\JavaProject\java25\src\shujia25\day15\file\CopyMp44.mp4
            时长：共耗时147毫秒

 */
public class CopyFileDemo3 {
    public static void main(String[] args) throws Exception {
//        copy1();
        copy2();
//        copy3();
//        copy4();
    }


    // 一次读写一个字节
    public static void copy1() throws Exception {
        // 创建字节输入流
        FileInputStream fis = new FileInputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\Test.mp4");
        // 创建字节输出流
        FileOutputStream fos = new FileOutputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\CopyMp41.mp4");

        long start = System.currentTimeMillis();
        int i = 0;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("普通的字节流一次读写一个字节一共耗时：" + (start - end));

        fos.close();
        fis.close();
    }

    // 一次读写一个字节
    public static void copy2() throws Exception {
        // 创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\Test.mp4"));
        // 创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\CopyMp42.mp4"));

        long start = System.currentTimeMillis();
        int i = 0;
        while ((i = bis.read()) != -1) {
            bos.write(i);
            bos.flush();
        }
        long end = System.currentTimeMillis();
        System.out.println("字节缓冲流一次读写一个字节一共耗时：" + (start - end));

        bos.close();
        bis.close();
    }

    // 一次读写一个字节数组
    public static void copy3() throws Exception {
        // 创建字节输入流
        FileInputStream fis = new FileInputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\Test.mp4");
        // 创建字节输出流
        FileOutputStream fos = new FileOutputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\CopyMp43.mp4");

        long start = System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, length);
        }
        long end = System.currentTimeMillis();
        System.out.println("普通的字节流一次读写一个字节数组一共耗时：" + (start - end));

        fos.close();
        fis.close();
    }

    // 一次读写一个字节数组
    public static void copy4() throws Exception {
        // 创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\Test.mp4"));
        // 创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day15\\file\\CopyMp44.mp4"));

        long start = System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, length);
        }
        long end = System.currentTimeMillis();
        System.out.println("字节缓冲流一次读写一个字节数组一共耗时：" + (start - end));

        bos.close();
        bis.close();
    }
}
