package shujia25.day03.test;

/*
    使用三目运算符
    获取两个整数中的最大值
    获取三个整数中的最大值
    比较两个整数是否相同

 */
public class SanMuTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // 获取两个整数中的最大值
        int res1 = (a > b) ? a : b;
        System.out.println("两个整数中的最大值为：" + res1);

        // 获取三个整数中的最大值
        int res2 = (res1 > c) ? res1 : c;
        System.out.println("三个数中最大值为：" + res2);

        // 比较两个整数是否相同
        boolean res3 = (a == b) ? true : false;
        System.out.println("两个数是否相同：" + res3);

    }
}
