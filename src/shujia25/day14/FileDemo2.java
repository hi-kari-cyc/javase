package shujia25.day14;

/*
    File类的成员方法：
        创建功能
            public boolean createNewFile()
            public boolean mkdir()      创建文件夹
            public boolean mkdirs()     创建多级文件夹
        删除功能
            public boolean delete()
        重命名功能
            public boolean renameTo(File dest)

 */

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        // 需求：想要在newFile目录下创建a.txt
        File file = new File("src/shujia25/day14/newFile/a.txt");

        //public boolean createNewFile()  创建一个文件
        boolean b = false;
        try {
            b = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b);
//
//        // public boolean mkdir()
//        boolean mkdir = file.mkdir();
//        System.out.println(mkdir);

        // public boolean mkdirs()
//        boolean mkdirs = file.mkdirs();
//        System.out.println(mkdirs);

        // public boolean delete()      删除一个文件夹或者文件 不能删除非空的文件夹
//        boolean delete = file.delete();
//        System.out.println(delete);

        //public boolean renameTo(File dest)
//        File file = new File("src/shujia25/day14/newFile/a.txt");
        File file0 = new File("src/shujia25/day14/newFile/b.txt");
        System.out.println(file.renameTo(file0));
    }
}
