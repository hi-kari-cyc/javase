package shujia25.day02;

/*
    byte b1=3,b2=4,b;
    b=b1+b2;
    b=3+4;
    哪句是编译失败的呢？为什么呢？

    常量参与运算和变量参与运算的区别
    结论:
        1. 变量参与运算时，会根据操作数的类型进行类型提升，以保持一致的数据类型进行计算，但在特定情况下（例如浮点数运算float，double），不会发生类型提升。
        2. 常量参与运算,先计算出结果,然后再看看结果是否在目标数据类型范围内,如果在,直接赋值,反之不行
 */
public class DataTypeDemo3 {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        byte b,c;

        b = (byte)(b1+b2);
        System.out.println(b);

        c = 3 + 4;
        System.out.println(c);


    }
}
