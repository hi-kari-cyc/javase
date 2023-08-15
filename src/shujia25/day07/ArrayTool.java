package shujia25.day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 这个类是数加学院25期java课程中编写的专门对数组做操作的工具类
 *
 * @author shujia
 * @version v1.0.0
 */
public class ArrayTool {
    /**
     * 构造方法私有化
     */
    private ArrayTool() {

    }

    /**
     * 该方法是获取数组中的最大值
     *
     * @param arr 传入的是一个int类型的数组
     * @return 该方法有一个返回值，是int类型的
     */
    public static int getMaxNumber(int[] arr) {
        int maxNumer = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumer) {
                maxNumer = arr[i];
            }
        }
        return maxNumer;
    }

    /**
     * 该方法是格式化遍历输出一个数组
     * 举例：输出的格式是 [元素1,元素,....]
     *
     * @param arr 传入的是一个int类型的数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    /**
     * 该方法是用来对数组进行选择排序
     * 举例：输出的数组是排序后的新数组
     *
     * @param arr 传入的是一个int类型的数组
     */
    public static void xuanZhe(int[] arr) {
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

    /**
     * 该方法是用来对数组进行冒泡排序
     * 输出的是一个排序后的数组
     *
     * @param arr 传入的是一个int类型的数组
     */
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
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 该方法是用来对有序数组进行二分法查找
     * 查找时需要输入一个int类型的整数
     *
     * @param arr 传入的是一个int类型的数组
     */
    public static void erFenFa(int[] arr) {

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