package shujia25.day07.paixu;

import java.util.Arrays;

public class XuanZhe {
    public static void main(String[] args) {

        int[] arr = new int[]{55, 9, 78, 12, 24};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
// 每次循环找出最小的数放在前面（分为有序序列和无序序列）