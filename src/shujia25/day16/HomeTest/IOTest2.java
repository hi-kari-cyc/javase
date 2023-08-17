package shujia25.day16.HomeTest;

/*
    假设从入学开始所有书写的Java类代码都在d:/java文件夹下，包括多级子文件夹。使用 IO流获取从入学开始，到目前为止已经写了多少行Java代码。
            提示：其实就是获取d:/java文件夹及其子文件夹下的所有.java文件，使用readLine()读 取其中每一行，每读取一行，行数加1.
            所有的文件读取完毕，得到总共已经写的Java 代码行数。需要结合递归实现。
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOTest2 {
    public static void main(String[] args) throws Exception {
        // 先获取所有.java文件
        File file = new File("D:\\IDEA\\JavaProject\\java25");
        int fun = fun(file);
        System.out.println(fun);

    }

    public static int fun(File file) throws Exception {
        int rows = 0;

        File[] list = file.listFiles();
        if (list != null) {
            for (File f : list) {
                if (f.isDirectory()) {
                    rows += fun(f);
                } else {
                    if (f.getName().endsWith(".java")) {
                        System.out.println(f);
                        BufferedReader br = new BufferedReader(new FileReader(f));
                        while ((br.readLine()) != null) {
                            rows++;
                        }
                    }
                }
            }
        }
        return rows;
    }
}

