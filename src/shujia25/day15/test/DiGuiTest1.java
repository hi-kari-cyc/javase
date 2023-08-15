package shujia25.day15.test;

import java.io.File;

/*
    递归遍历目录下指定后缀名结尾的文件名称

 */
public class DiGuiTest1 {
    public static void main(String[] args) {
        // 将D盘封装成File对象
        File file = new File("D:\\");

        diGui(file);
    }

    public static void diGui(File file) {
        if (file != null) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    if (file1.isFile() && file1.getName().endsWith(".java")) {
                        System.out.println(file1.getName());
                    } else {
                        diGui(file1);
                    }
                }
            }
        }
    }
}
