package shujia25.day15;

/*
    File的基本获取功能：
        public String getAbsolutePath()
        public String getPath()
        public String getName()
        public long length()
        public long lastModified()

 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("src/shujia25/day15/file/FileGet.txt");

        // public String getAbsolutePath()  以字符串的形式获取绝对路径
        System.out.println(file.getAbsolutePath());

        // public String getPath()  以字符串的形式获取相对路径
        System.out.println(file.getPath());

        // public String getName()   获取文件、文件夹的名字
        System.out.println(file.getName());

        // public long length() 获取文件中的字节数
        System.out.println(file.length());

        // public long lastModified()   获取最后一次修改的时间，返回的是时间戳
        System.out.println(file.lastModified());
        // 封装成Date类型
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String time = sdf.format(date);
        System.out.println(time);
    }
}
