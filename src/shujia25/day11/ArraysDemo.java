package shujia25.day11;

import java.util.Arrays;
import java.util.Comparator;

/*
        Arrays:是java提供给我们专门针对数组做操作的工具类，其中封装了很多的对数组操作的方法
        这个类中都是一些静态的成员方法，该类包含用于操作数组的各种方法（如排序和搜索）。

        静态成员方法：
            public static String toString(int[] a)
            public static void sort(int[] a)
            public static int binarySearch(int[] a,int key)

 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {30,50,25,83,94,15,66,17,58,49};

//        String s = Arrays.toString(arr);      格式化输出数组
        System.out.println(Arrays.toString(arr));

        // public static void sort(int[] a)  排序(默认升序) 底层是快速排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 降序排序
        Integer[] arr0 = {94,15,66,17,58,49};
        Arrays.sort(arr0,new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
        System.out.println(Arrays.toString(arr0));


        // public static int binarySearch(int[] a,int key) 二分查找  序列必须是有序（升序）的
        // 返回找到的元素索引
        System.out.println(Arrays.binarySearch(arr,16));
        // 如果找不到返回查找数字所在数组大小范围的索引加一去负数

        /*
            public static int binarySearch(int[] a, int key) {
                return binarySearch0(a, 0, a.length, key);
            }

            private static int binarySearch0(int[] a, int fromIndex, int toIndex,int key) {
                int low = fromIndex;
                int high = toIndex - 1;

                while (low <= high) {
                    int mid = (low + high) >>> 1;
                    int midVal = a[mid];

                    if (midVal < key)
                        low = mid + 1;
                    else if (midVal > key)
                        high = mid - 1;
                    else
                        return mid; // key found
                }
                return -(low + 1);  // key not found.
            }

         */
    }
}
