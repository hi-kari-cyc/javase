package shujia25.day15.test;

import java.io.File;

/*
        递归删除带内容的目录

 */

public class DiGuiTest2 {
    public static void main(String[] args) {
        // 创建D盘File文件
        File filed = new File("D:\\DiGui\\");

        diGui(filed);
    }

    public static void diGui(File file) {
        if (file != null) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    if (file1.isFile()) {
                        file1.delete();
                    } else {
                        diGui(file1);
                    }
                }
            }
            file.delete();
        }
    }
}
