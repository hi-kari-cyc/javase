package shujia25.test;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 1, 2, 3, 4, 7};
        System.out.println("未排序："+Arrays.toString(arr));
        maoPao(arr);
        System.out.println("-----------------------------");

        arr = new int[]{8, 5, 6, 1, 2, 3, 4, 7};
        System.out.println("未排序："+Arrays.toString(arr));
        xuanZe(arr);
    }

    // 冒泡排序
    public static void maoPao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序：" + Arrays.toString(arr));
    }

    // 选择排序
    public static void xuanZe(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("选择排序：" + Arrays.toString(arr));
    }
}
