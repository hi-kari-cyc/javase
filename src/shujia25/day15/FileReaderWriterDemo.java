package shujia25.day15;

/*
    java针对字符流的对象创建提供了简化写法
    字符输入流：Reader -- InputStreamReader -- FileReader
    字符输出流：Writer -- OutputStreamWriter -- FileWriter

 */

import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws Exception {
        // 创建字符输出流对象
//        OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("src/shujia25/day15/file/c.txt")));
        // 使用简化写法创建字符输出流对象
        FileWriter fw = new FileWriter("src/shujia25/day15/file/FileWriter.txt");

        fw.write("你好，世界");
        fw.flush();

        // 使用简化写法创建字符输入流对象
        FileReader fr = new FileReader("src/shujia25/day15/file/FileWriter.txt");

        int i = 0;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }


        char[] chars = new char[1024];
        int length = 0;
        while ((length = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, length));
        }

        fw.close();
    }
}
