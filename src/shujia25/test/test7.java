package shujia25.test;

/*
    7：第一三维不平衡数组如下：Int a[][] []= {{{1,2},{4,5}},{{6,7},{8,9,10,11}}};
   编程实现输出数组a各个元素，并求各元素之和。

 */
public class test7 {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2}, {4, 5}}, {{6, 7}, {8, 9, 10, 11}}};
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    res += arr[i][j][k];
                }
            }
        }
        System.out.println(res);
    }
}
