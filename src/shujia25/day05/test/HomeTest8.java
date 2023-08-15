package shujia25.day05.test;

import java.util.Arrays;

/*
数组A：1，7，9，11，13，15，17，19；数组b：2，4，6，8，10
两个数组合并为数组c，按升序排列。

 */
public class HomeTest8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr[arr1.length + j] = arr2[j];
        }
        System.out.println("排列前：" + Arrays.toString(arr));

        int len = arr.length;
        int k = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.println("排列后：" + Arrays.toString(arr));

    }
}
