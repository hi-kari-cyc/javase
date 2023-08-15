package shujia25.day04.test;

/*
            数组遍历(依次输出数组中的每一个元素)


 */
public class ArrayTest1 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr = {11, 22, 33, 44, 55, 66};

        //java中的数组提供了一个属性，我们可以获取数组中的这个属性来获取数组的长度。
        //这个属性叫做：length
        //数组名.length 是一个整数类型的值
//        System.out.println(arr.length);



        // 方法一
//        for (int i = 0;i<arr.length;i++){
//            if (i==0){
//                System.out.print("["+arr[i]+",");
//            } else if (i == arr.length - 1) {
//                System.out.println(arr[i]+"]");
//            } else
//                System.out.print(arr[i]+",");
//        }

        printArray(arr);
    }

    // 方法二
    /**
     * 返回值类型：void
     * 参数列表：int[] arr
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else
                System.out.print(arr[i] + ",");
        }
    }
}
