package shujia25.day05;

/*

    二维数组的语句定义格式二：
        数据类型[][] 数组名 = new 数据类型[m][];
 */

public class Array2Demo2 {
    public static void main(String[] args) {
        int[][] shujia = new int[3][];
        System.out.println(shujia);
        System.out.println(shujia[0]);
        System.out.println(shujia[1]);
        System.out.println(shujia[2]);
        System.out.println("==========================");
        //创建一个一维数组赋值给二维数组中第一个元素
        shujia[0] = new int[2];
        shujia[1] = new int[4];
        shujia[2] = new int[8];
        System.out.println(shujia);
        System.out.println(shujia[0]);
        System.out.println(shujia[1]);
        System.out.println(shujia[2]);
    }
}