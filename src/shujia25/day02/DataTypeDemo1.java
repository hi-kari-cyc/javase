package shujia25.day02;

/*

    java是强类型语言，对于每一种数据都定义了明确的具体数据类型，在内存总分配了不同大小的内存空间
    数据类型:
        基本数据类型:
            整数类型:      所占空间大小        范围
                byte         1个字节      -128~127
                short        2个字节      -2^15~2^15-1
                int          4个字节      -2^31~2^31-1
                long         8个字节      -2^63~2^63-1
            小数类型:
                float         4个字节
                double        8个字节
            字符类型:
                char
            布尔类型:
                boolean

        引用数据类型:(放到数组的时候讲解)
            数组([])
            接口(interface)
            类(class)


     注意事项:
     1.在同一作用域（大括号）下，变量不能重名，Java严格区分大小写
     2.Java中所有的整数默认是int类型，小数默认是double类型
     3.在定义一个long类型数据的时候，数据末尾要加上L或者l，推荐L
     4.在定义一个float类型数据的时候，数据末尾要加上F或者f，推荐F
     5.一个变量若没有初始化值，不能直接使用，推荐在定义的时候给上一个初始化值
     6.定义变量的时候，推荐一个变量定义一行

 */
public class DataTypeDemo1 {
    public static void main(String[] args) {
        // 如何去定义一个变量         数据类型 变量名 = 初始化值;
        //尝试定义一个byte类型的变量
        byte b1 = 100;
        System.out.println(b1); // 打印或者直接使用变量的时候，使用的是变量对应的值

//        byte b1 = 120;

        short s1 = 128;
        System.out.println(s1);

        int i1 = 10000;
        System.out.println(i1);

        long i2 = 1000000000000L;
        System.out.println(i2);

        float f1 = 12.34F;
        System.out.println(f1);

        double d1 = 12.34;
        System.out.println(d1);

        char c1 = 'A';
//        char c2 = "hello";
        System.out.println(c1);

        boolean b2 = true;
        boolean b3 = false;
        System.out.println("b2:" + b2);
        System.out.println("b3:" + b3);


        //定义一个int类型的变量
        int i3;
        i3 = 100;
        System.out.println(i3);

        int i4,i5,i6;
//        int i7,i8 = 10,20;
    }
}
