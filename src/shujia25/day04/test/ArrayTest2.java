package shujia25.day04.test;

/*
        数组获取最值(获取数组中的最大值最小值)
            1、定义一个数组，并对数组进行静态初始化
            2、从数组中任意取出一个数据与其他数据进行比较大小（一般情况下取第一个，默认它就是最大值）
            3、拿着第一个元素与其余的元素作比较，如果找到了更大的元素，就把他取代掉，如果说比较多结果是比它小的话，继续向后比较
            4、直到比较到最后一个数，留下的最大值就是数组中的最大值

 */
public class ArrayTest2 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr = {11, 22, 33, 44, 55, 66};

        // 方法一 直接循环找最值
//        int maxNumber = arr[0];
//        int minNumber = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>maxNumber){
//                maxNumber = arr[i];
//            }
//            if (arr[i]<minNumber){
//                minNumber = arr[i];
//            }
//        }
//        System.out.println("数组中最大值为："+maxNumber);
//        System.out.println("数组中最小值为："+minNumber);

        maxMinNumber(arr);

    }


    // 方法二 创建一个方法调用
    public static void maxMinNumber(int[] arr) {
        int maxNumber = arr[0];
        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        System.out.println("数组中最大值为：" + maxNumber);
        System.out.println("数组中最小值为：" + minNumber);
    }
}
