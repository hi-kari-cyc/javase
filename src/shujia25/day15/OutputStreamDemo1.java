package shujia25.day15;

/*
    IO流：
        根据流向划分：（将java程序作为参照物来说的）
            输入流：外部数据-->java
            输出流：java-->外部文件中

        根据数据的类型划分：（如果使用计算机自带的记事本打开一个文件能够看懂就用字符流，若看不到就用字节流）
            字节流：（通用流、万能流）
                字节输出流：OutputStream(抽象类)--FileOutputStream(具体实现子类)
                字节输入流：InputStream
            字符流：
                字符输入流：
                字符输出流：

        注意：所有对文件操作的对象，在程序的最后都要释放或者关闭连接

        FileOutputStream的构造方法：
            FileOutputStream(File file)
            FileOutputStream(String name)
            FileOutputStream(String name, boolean append) 追加写入

        字节输出流FileOutputStream的写数据方法：
            public void write(int b)
            public void write(byte[] b)
            public void write(byte[] b,int off,int len)


 */

import java.io.File;
import java.io.FileOutputStream;


public class OutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        // 创建字节输出流对象
        // FileOutputStream(File file)  传入目标文件的File对象形式
        File file = new File("src/shujia25/day15/file/OutputStream1.txt");    // 通过提供文件路径来创建一个File对象，表示要操作的文件

        // 如果目标文件不存在，将会自动创建
        FileOutputStream fos1 = new FileOutputStream(file);    // 创建一个FileOutputStream对象，将其与指定的文件关联起来,用于向文件写入字节数据
        System.out.println(fos1);

        // FileOutputStream(String name)      传入的是目标文件的路径
        FileOutputStream fos2 = new FileOutputStream("src/shujia25/day15/file/OutputStream2.txt");
        System.out.println(fos2);

        // public void write(int b)  一次向文件中写一个字节
        fos1.write(97);
        fos1.write("\r\n".getBytes());

        // public void write(byte[] b)  一次写一个字节数组
        fos1.write("hello".getBytes());
        fos1.write("\r\n".getBytes());

        // public void write(byte[] b,int off,int len)  一次写一个字节数组的一部分
        byte[] bytes = {97,98,99,100,101};
        fos1.write(bytes,0,3);
        fos1.write("\r\n".getBytes());

        // 实现换行,写入换行符
        fos1.write(100);
        fos1.write("\r\n".getBytes());

        // FileOutputStream默认是覆盖写（清空，再写）
        // FileOutputStream(String name, boolean append) 追加写入
        FileOutputStream fos3 = new FileOutputStream("src/shujia25/day15/file/OutputStream3.txt",true);

        fos3.close();
        fos2.close();
        fos1.close();
    }
}
