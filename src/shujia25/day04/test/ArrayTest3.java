package shujia25.day04.test;

import java.util.Arrays;

/*
        数组元素逆序 (就是把元素对调)

 */

public class ArrayTest3 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr = {11, 22, 33, 44, 55, 66};

        // 方法一 在原数组上元素对调（引入中间量）
        int tem = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            tem = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tem;
        }
        System.out.println("第一次逆序：" + Arrays.toString(arr));


        // 方法二 将原数组反向复制在另一个数组上
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        System.out.println("再次逆序：" + Arrays.toString(arr1));

        // 定义两个指针（思想和第一种方法类似，这里定义方法做）
        niXu(arr);
    }


    public static void niXu(int[] arr) {
        int tem = 0;
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
        }
        System.out.println("使用指针逆序：" + Arrays.toString(arr));
    }
}
