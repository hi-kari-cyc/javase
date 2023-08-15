package shujia25.day05;

/*
    二维数组：元素是一维数组的数组
    语句定义格式一：
        数据类型[][] 数组名 = new 数据类型[m][n];
        举例：创建一个存储了3个一维数组的数组，且每个一维数组的长度是4，且存储的元素数据类型是int类型
        m: 代表存储了几个一维数组
        n: 代表的是每个一维数组的长度
        int[][] arr = new int[3][4];
 */
public class Array2Demo1 {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
        int[][] arr = new int[3][4];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //查看第二个一维数组的第3个元素值
        System.out.println(arr[1][2]);

    }
}