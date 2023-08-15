package shujia25.day05.test;

import java.util.Scanner;

/*

        使用二分法查找有序数组中元素。找到返回索引，不存在输出-1。使用递归实现

 */
public class HomeTest7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要查的数：");
        int num = sc.nextInt();

        int front = 0;
        int end = arr.length - 1;
        int mid;

        while (front <= end) {
            mid = (front + end) / 2;

            if (num == arr[mid]) {
                System.out.println(num + "的索引为" + mid);
                return;
            } else if (num > arr[mid]) {
                front = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println(-1);
    }
}
