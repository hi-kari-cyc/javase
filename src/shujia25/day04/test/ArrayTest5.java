package shujia25.day04.test;

import java.util.Scanner;

/*
    数组元素查找(查找指定元素第一次在数组中出现的索引)

 */
public class ArrayTest5 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 创建一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("请输入你要查的数据：");
        int number = sc.nextInt();

        // 方法一
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println("数字" + number + "第一次在数组中的索引为" + i);
                break;
            }

            if (i == arr.length - 1 && arr[i] != number) {
                System.out.println("您所查的数据不在数组中！");
            }
        }

        // 方法二
        int[] arr1 = new int[]{11, 22, 33, 44,55, 66, 77, 88, 99};
        System.out.println("请输入你要查的数据：");
        int number1 = sc.nextInt();

        int index = -1; // 创建目标索引
        for (int i = 0; i < arr1.length; i++) {
            if (number1 == arr1[i]) {
                index = i;// 找到目标元素，更新索引
                break;
            }
        }
        if (index == -1) {
            System.out.println("您所查的数据不在数组中！");
        } else {
            System.out.println("数字" + number1 + "第一次在数组中的索引为" + index);
        }

    }
}
