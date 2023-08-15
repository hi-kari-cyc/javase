package shujia25.day06.test;

import java.util.Scanner;

/*
        定义一个类Demo,其中定义一个求两个数据和的方法，定义一个测试了Test，进行测试。

 */

//public class Demo {
//    //方式1
////    public void sum(){
////        int a = 3;
////        int b = 4;
////        System.out.println(a+b);
////    }
//
//    //方式2
//    public void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//}

//方式3
class DemoTest1{
    private int a;
    private int b;

    public DemoTest1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum(){
        System.out.println(a+b);
    }
}

class Sum {
    public static void main(String[] args) {
//        Demo demo = new Demo();
//        demo.sum(12,24);

        DemoTest1 demo = new DemoTest1(10, 20);
        demo.sum();
    }
}


