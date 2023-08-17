package shujia25.day16.HomeTest;

import java.io.*;
import java.util.Arrays;

/*
    已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
    请编写程序读取数据内容，把数据排序后写入ss.txt中。

 */
public class IOTest3 {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter bos = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("src/shujia25/day16/File/ss.txt")));
        InputStreamReader bis = new InputStreamReader(new BufferedInputStream(new FileInputStream("src/shujia25/day16/File/s.txt")));

        char[] chars = new char[1024];
        int length = 0;
        while ((length = bis.read(chars)) != -1) {
            String s = new String(chars, 0, length);
            char[] chars0 = s.toCharArray();
            Arrays.sort(chars0);
            bos.write(chars0);
            bos.flush();
        }
        bos.close();
        bis.close();
    }
}
