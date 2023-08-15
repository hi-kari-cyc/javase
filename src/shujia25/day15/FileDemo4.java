package shujia25.day15;

/*
    文件名称过滤器的实现思想及代码,在获取数组的时候，就进行过滤
        public String[] list(FilenameFilter filter)
        public File[] listFiles(FilenameFilter filter)

    需求：判断D盘目录下是否有后缀名为.jpg的文件

    Interface FilenameFilter
        boolean accept(File dir, String name)
        测试指定文件是否应包含在文件列表中。

 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo4 {
    public static void main(String[] args) {
        // 创建文件对象
        File file = new File("D:\\");

        // public String[] list(FilenameFilter filter)
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // dir相当于根目录，name代表根目录下的子文件，他们俩组合可以代表所有文件
                File file0 = new File(dir, name);
//                return (file0.isFile() && file0.getName().endsWith(".jpg"));
                return (file0.isFile() && name.endsWith("jpg"));
            }
        });

        System.out.println(Arrays.toString(list));

        // public File[] listFiles(FilenameFilter filter)
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("jpg");
            }
        });
        System.out.println(Arrays.toString(files));

    }
}
