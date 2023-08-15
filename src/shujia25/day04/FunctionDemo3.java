package shujia25.day04;

/*
        方法重载概述
            在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
        方法重载特点
            方法的功能一样，仅仅是参与运算的未知内容不同时，
            可以定义多函数，却使用统一方法名称，这样方便阅读。
            在调用时，虚拟机通过参数列表的不同来区分同名方法。

 */
public class FunctionDemo3 {
    public static void main(String[] args) {
        // 需求：求两个int类型的数据之和
        int a = 3;
        int b = 4;
        sum(a,b);

        // 需求：求两个double类型的数据之和
        sum(12.34,56.78);


    }

    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void sum(double a,double b){
        System.out.println(a+b);
    }

//    public static int sum(int a,int b){
//        return a+b;
//    }

}
