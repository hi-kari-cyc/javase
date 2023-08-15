package shujia25.day04.test;

/*
        图解3：
            定义两个数组，先定义一个数组，赋值，输出。然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
            然后给第二个数组赋值，再次输出两个数组的名及元素。
 */
public class ArrayTuTest3 {
    public static void main(String[] args) {
        // 定义一个可以存储3个int类型元素的一位数组
        int[] arr1 = new int[3];
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        // 将11，22，33分别赋值
        arr1[0] = 11;
        arr1[1] = 22;
        arr1[2] = 33;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        // 定义第二个数组
        // 把第一个数组的地址赋给第二个数组
        int[] arr2 = arr1;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


    }
}
