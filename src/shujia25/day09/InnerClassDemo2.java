package shujia25.day09;

/*
    局部内部类：将一个类定义在方法的内部
    如果一个方法内部有局部内部类，方法内部定义的变量默认会加上final关键字

 */

class Outer {

    public void fun1() {

        int a = 10;   // int前默认有个final

        // 局部内部类
        class Inner {
            int b = 100;

            public void fun2() {
                int c = 300;
//                a = 20;  // 从JDK1.8开始，若方法的内部存在局部内部类，外部类方法中定义的变量默认在编译的时候加上final关键字
                System.out.println(a);
                b = 200;
                System.out.println(b);
                c = 400;
                System.out.println(c);
            }
        }
        Inner inner = new Inner();
        inner.fun2();
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun1();
    }
}
