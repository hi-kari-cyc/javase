package shujia25.day15;

/*
    字节输入流：InputStream(抽象类)--FileInputStream(具体的实现子类)

    FileInputStream的构造方法：
        FileInputStream(File file)
        FileInputStream(String name)

    字节输入流FileInputStream读取的数据方式：
        public int read()
        public int read(byte[] b)

 */

import java.io.File;
import java.io.FileInputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
        //FileInputStream(File file)  传入的是将要读取数据的文件封装成File对象  读取文件的时候，文件必须要存在
        File file = new File("src/shujia25/day15/file/OutputStream1.txt");
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis);

        // public int read()  一次(调用一次方法)读取一个字节
//        System.out.println((char) fis.read());
//
//        System.out.println((char) fis.read());  // \r
//        System.out.println((char) fis.read());  // \n
//
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
        //因为不确定文件字节数，就不确定调用多少次read方法，所以采用while循环来读取
        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }

        // public int read(byte[] b)   一次读取一个字节数组,读取到的字节存储在数组中
        // 创建一个新的数组，用于存储读取到的字节
        byte[] bytes = new byte[1024];
//        int length = fis.read(bytes);       // 返回的是真正读取到的字节数
        // 将字节数组转成字符串，因为读取到的字节存储在数组中
//        String s = new String(bytes, 0, length);
//        System.out.print(s);

        int length = 0;
        while ((length = fis.read(bytes)) != -1) {
            String s = new String(bytes, 0, length);
            System.out.println(s);
        }

        //一个字节输入流对象对于一个要读取的文件只有一个光标，当光标移动到最后的时候，该字节输入流对象就无法继续往后读取

        // 释放资源
        fis.close();
    }
}
