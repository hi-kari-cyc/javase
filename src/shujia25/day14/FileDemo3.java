package shujia25.day14;

/*
    File的判断功能：

        public boolean isDirectory()
        public boolean isFile()
        public boolean exists()
        public boolean canRead()
        public boolean canWrite()
        public boolean isHidden()

 */

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("src/shujia25/day14/newFile/b.txt");

        //public boolean isDirectory()  判断是否是文件夹
        System.out.println(file.isDirectory());

        //public boolean isFile() 是否是文件
        System.out.println(file.isFile());

        // public boolean exists() 是否存在
        System.out.println(file.exists());

        //public boolean canRead() 判断是否可读
        System.out.println(file.canRead());

        //public boolean canWrite() 判断是否可写
        System.out.println(file.canWrite());

        //public boolean isHidden() 判断是否隐藏
        System.out.println(file.isHidden());
    }
}
