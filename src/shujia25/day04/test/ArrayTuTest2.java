package shujia25.day04.test;

/*
        图解2：
            定义两个数组，分别输出数组名及元素。然后分别给数组中的元素赋值，分别再次输出数组名及元素。

 */
public class ArrayTuTest2 {
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

        //再定义一个可以存储3个int类型元素的一位数组
        int[] arr2 = new int[3];
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // 将44,55,66分别赋值
        arr2[0] = 44;
        arr2[1] = 55;
        arr2[2] = 66;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
