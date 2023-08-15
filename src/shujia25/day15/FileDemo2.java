package shujia25.day15;

/*
    File高级获取功能
        public String[] list()  获取目录下所有的文件或者文件夹的名字组成的数组
        public File[] listFiles() 获取目录下所有的文件或者文件夹对应的File对象组成的数组

 */

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("src/shujia25/day15/file");

        // public String[] list()
        String[] list = file.list();

        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        }

        // public File[] listFiles()
        File[] files = file.listFiles();

        if (files != null) {
            for (File file0 : files) {
                System.out.println(file0);
            }
        }

    }
}
