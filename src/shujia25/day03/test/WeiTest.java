package shujia25.day03.test;

/*
    请用最有效率的方式写出计算2乘以8的结果

    请自己实现两个整数变量的交换


 */
public class WeiTest {
    public static void main(String[] args) {
        // 请用最有效率的方式写出计算2乘以8的结果
        System.out.println(2 << 3);

        // 请自己实现两个整数变量的交换
//        a: 第三方变量
        int x = 3;
        int y = 4;
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("x:" + x + " y:" + y);

//        b: 加法方式
        int a = 5;
        int b = 6;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + " b:" + b);

//        c: ^异或位运算符
        int m = 10;
        int n = 20;
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("m:" + m + " n:" + n);

//        d: 一句话搞定
        int p = 12;
        int q = 34;
        p = (p + q) - (q - p);
        System.out.println("p:" + p + " q:" + q);


    }
}
