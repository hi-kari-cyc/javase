package shujia25.day14;

/*
    File类：
        是目录或者文件的抽象表现形式(将文件或者文件夹路径指定一下，封装成file对象，file对象就代表这个文件，将来我们操作file对象就相当于操作这个文件)
    构造方法：
        public File(String pathname)  传入文件路径
        public File(String parent,String child)  父路径 子文件
        public File(File parent,String child)   父文件对象，子文件
 */

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        // public File(String pathname)
        // 路径：
        //   绝对路径（完整路径）：带有盘符的路径 D:\IDEA\JavaProject\java25\src\shujia25\day14\FileDemo1.java
        //   相对路径：将项目作为根目录继续找路径 src/shujia25/day14/FileDemo1.java

        File file1 = new File("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day14\\FileDemo1.java");
        System.out.println(file1);

        File file2 = new File("src/shujia25/day14/FileDemo1.java");
        System.out.println(file2);

        //public File(String parent,String child)
        File file3 = new File("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day14\\", "FileDemo1.java");
        System.out.println(file3);

        //public File(File parent,String child)
        File file4 = new File("D:\\IDEA\\JavaProject\\java25\\src\\shujia25\\day14\\");
        File file5 = new File(file4, "FileDemo1.java");
        System.out.println(file5);
    }
}
