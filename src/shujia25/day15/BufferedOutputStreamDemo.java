package shujia25.day15;

/*
    java针对字节输入流和输出都对应提供了缓冲流来提高读写速度
    字节输入流：InputStream
                -- FileInputStream
                -- BufferedInputStream 字节缓冲输入流
                        构造方法：
                            BufferedOutputStream(OutputStream out)
                            创建一个新的缓冲输出流，以将数据写入指定的底层输出流
    字节输出流：OutputStream
                -- FileOutputStream
                -- BufferedOutputStream 字节缓冲输出流
                        构造方法：
                            BufferedInputStream(InputStream in)
                            创建一个 BufferedInputStream并保存其参数，输入流 in ，供以后使用

 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws Exception{
        // 创建一个字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/shujia25/day15/file/BufferedOutputStream.txt"));
        bos.write("hello".getBytes());
        // 缓冲输出流写数据的时候需要刷新缓冲区，将缓冲区的数据刷到目标文件中
        bos.flush(); // 建议每写一次数据刷新一下缓冲区


        // 释放资源
        bos.close();
        /*
                flush方法用于将缓冲区中的数据立即写入到底层流，确保数据被及时输出。
                调用flush方法后，流可以继续使用。而close方法在刷新缓冲区的同时，还会关闭流，释放相关的资源。
                关闭流后，不能再对流进行读写操作

         */
    }
}
