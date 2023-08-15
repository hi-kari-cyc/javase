package shujia25.day07.paixu;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {

        int[] arr = new int[]{55, 9, 78, 12, 24, 74, 58, 34, 15};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
// 依次选择两个临近的数据进行对比把小的移动到左边 每次遍历循环上述步骤，每次循环能把最大的拍到最右边