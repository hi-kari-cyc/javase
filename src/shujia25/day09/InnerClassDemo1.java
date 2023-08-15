package shujia25.day09;

/*
    内部类：顾名思义就是在类中创建一个类
    根据定义的位置不同，分为两种：
        1、成员内部类：将一个类定义在成员位置上
            创建成员内部类的语句定义格式：
                外部类名.内部类名 对象名 = new 外部类名().new 内部类名();

            成员内部类可以被static修饰，内部的方法既可以是静态的，也可以是非静态的

            如果成员内部类是静态的话，又如何创建内部类的对象：
                外部类名.内部类名 对象名 = new 外部类名.内部类名();

            成员内部类也可以被private修饰

        2、局部内部类：将一个类定义在方法内部中
 */

class Demo1{
    int a = 10;  // a的作用域在大括号里
    private int b = 20;
    static int c = 30;

    // 成员内部类
    class Inner{
//        public static void fun2(){       // 静态方法是属于类的，不依赖于对象的实例.
//                                         // 而非静态内部类需要依赖于外部类的实例才能创建和访问，无法独立存在。
//        }                                // 因此，非静态内部类不能定义静态方法。


        public void fun1(){
            System.out.println(a);    // 非静态方法可以访问非静态的a和b
            System.out.println(b);
            System.out.println(c);    // 非静态的方法可以访问静态的c
        }
    }

    // 静态内部类
    static class Inner1{            // 成员内部类可以被static所修饰，且只能访问静态成员
        public static void fun1(){
//            System.out.println(a);
            System.out.println(c);
        }

        public void fun2(){                 // 静态内部类是与外部类解耦的独立实体，与外部类的实例无关  静态内部类中可以创建非静态方法
            System.out.println(Demo1.c);
            System.out.println(c);          // 非静态方法可以访问静态内部类的成员
            System.out.println(new Demo1().a);
//            System.out.println(b);
//            System.out.println(a);
        }
    }

    // 被private修饰的成员内部类
    private static class Inner2{
        public void fun1(){
            System.out.println(c);
        }
    }

    public void show(){
        // 创建内部类的对象
        new Inner2().fun1();
    }
}


public class InnerClassDemo1 {
    public static void main(String[] args) {
        Demo1.Inner di1 = new Demo1().new Inner();
        di1.fun1();

        Demo1.Inner1 di2 = new Demo1.Inner1();
        di2.fun2();

        Demo1.Inner1.fun1();

        Demo1 demo1 = new Demo1();
        demo1.show();
    }
}
