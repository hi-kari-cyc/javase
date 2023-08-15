package shujia25.day05.test;

import java.util.Scanner;

/*
        打印杨辉三角形(行数可以键盘录入)
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1

 */
public class Array2Test2 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入想要打印的行数：");
        int x = sc.nextInt();

        // 创建一个二维数组
        int[][] arr = new int[x][x];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    arr[i][j] = 1;
                } else if (i == j) {
                    arr[i][j] = 1;
                } else if (i > 1) {        // 注意索引是从0开始
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
