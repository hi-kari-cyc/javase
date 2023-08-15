package shujia25.day07.paixu;

import java.util.Scanner;

/*
        二分查找：对有序数组进行查找

 */
public class ErFenFa {
    public static void main(String[] args) {
        int[] arr = {9, 12, 15, 24, 34, 55, 58, 74, 78};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您要查找的数字：");
        int num = sc.nextInt();

        //定义一个开始位置
        int frond = 0;
        //定义一个最后位置
        int end = arr.length - 1;
        //定义一个中间值
        int mid;

        //定义个标志位
        boolean flag = true;

        while (frond <= end) {
            // 找中间位置
            mid = (frond + end) / 2;
            if (num > arr[mid]) {
                frond = mid + 1;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                System.out.println("您输入数据的索引为：" + mid);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("您所查的数据不在数组中！");
        }
    }
}
