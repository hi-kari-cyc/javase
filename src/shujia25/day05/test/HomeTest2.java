package shujia25.day05.test;
import java.util.Arrays;
/*
        2.数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
 */
public class HomeTest2 {
    public static void main(String[] args) {
        int[] arr = new int[]{11,22,33,44,55,66,77,88,99};

        // 定义两个指针

        for (int start = 0,end = arr.length-1;start<end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
