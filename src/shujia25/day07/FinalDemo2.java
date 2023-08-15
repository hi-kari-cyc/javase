package shujia25.day07;

/*
    final修饰变量的初始化时机(什么时候给final修饰的变量赋值)
    在构造方法完毕之前给值，建议，在创建的时候就给值。


    final 可以修饰
            类：修饰类，类不能被继承
            成员变量、局部变量：变量变成常量而不能重新赋值
            成员方法：方法可以被继承但不能被重写

    如果final修饰的是变量，变量就被称为自定义常量


 */
class Fu8 {
    final int A;

    {
        A = 100;
    }

    Fu8() {
        int a = 200;
    }

}

class Zi8 extends Fu8 {
    public void fun1() {
        int a = 300;
        System.out.println(a);
        System.out.println(A);
    }
}

public class FinalDemo2 {
    public static void main(String[] args) {
        Zi8 zi8 = new Zi8();
        zi8.fun1();
    }
}
