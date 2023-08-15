package shujia25.day04.test;

import java.util.Scanner;

/*
        数组查表法(根据键盘录入索引,查找对应星期)

 */
public class ArrayTest4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入索引：");
            int i = sc.nextInt();
            if (i >= 0 & i <= 6) {
                System.out.println(arr[i]);
                break;
            } else {
                System.out.println("您的输入有误！");
            }
        }
    }
}
