package shujia25.day15;

/*
    判断D盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称

 */

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        // 将D盘封装成File对象
        File file = new File("D:\\");

        // 获取目录下所有文件名组成的数组
        String[] list = file.list();
        if (list!=null){
            for (String s : list) {
                if (s.endsWith(".jpg")){
                    System.out.println(s);
                }
            }
        }
    }
}
