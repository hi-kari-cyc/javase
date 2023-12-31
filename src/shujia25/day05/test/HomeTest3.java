package shujia25.day05.test;

import java.util.Arrays;

/*
        3.合并数组操作：
            现有如下一个数组：int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
            要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}
            思路：确定出不为0的个数，这样可以开辟新数组；从旧的数组之中，取出内容，并将其赋给新开辟的数组。如果判断到0,就使用continue关键字。

 */
public class HomeTest3 {
    public static void main(String[] args) {
        int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int count = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] == 0) {
                count++;
            }
        }

        int[] arr = new int[oldArr.length - count];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                arr[j] = oldArr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
