package shujia25.day04.test;

/*
        图解1：
            定义一个数组，输出数组名及元素。然后给数组中的元素赋值，再次输出数组名及元素。

 */
public class ArrayTuTest1 {
    public static void main(String[] args) {
        // 定义一个可以存储3个int类型元素的一位数组
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 将11，22，33分别赋值
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
