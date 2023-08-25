package shujia25.day07.paixu;

import java.util.Arrays;

/*
        快速排序
 */
public class KuaiSu {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        fun(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void fun(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int temp = arr[low]; // 基准位
        int i = low, j = high;

        while (i < j) {
            while (arr[j] >= temp && j > i) {
                j--;
            }
            while (arr[i] <= temp && j > i) {
                i++;
            }

            if (i < j) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;

        // 递归排序基准位左右两边的子数组
        fun(arr, low, i - 1);
        fun(arr, i + 1, high);

    }
}
