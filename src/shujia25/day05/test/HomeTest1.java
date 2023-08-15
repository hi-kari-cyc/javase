package shujia25.day05.test;

import java.util.Scanner;

/*
        1.数组查找操作：定义一个长度为10的一维字符串数组，在每一个元素存放一个单词；
          然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。

 */
public class HomeTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个单词：");
        String s = sc.next();

        String[] arr = new String[10];
        arr[0] = "hello";
        arr[1] = "class";
        arr[2] = "object";
        arr[3] = "method";
        arr[4] = "variable";
        arr[5] = "array";
        arr[6] = "loop";
        arr[7] = "condition";
        arr[8] = "java";
        arr[9] = "study";

//        for (int i = 0; i < arr.length; i++) {
//            if (s.equals(arr[i])) {
//                System.out.println("Yes");
//                break;
//            } else if (i == 9 && !arr[i].equals(s)) {
//                System.out.println("No");
//            }
//        }

        // 方法二: 建立一个标志值
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (s.equals(arr[i])) {
                System.out.println("yes");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("no");
        }
    }
}
