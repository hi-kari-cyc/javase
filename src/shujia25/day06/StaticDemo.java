package shujia25.day06;

/*
    静态static修饰成员的特点：
        1、随着类的加载而被加载到方法区中静态区，优先于对象存在，被类的所有对象共享（这也是我们判断是否使用静态关键字的条件）
        2、将来可以直接通过   类名.静态成员  类名.静态方法   静态的成员既可以使用类名直接调用，也可以使用类的对象进行调用，推荐直接使用类名调用
        3、静态的成员方法只能访问静态的成员(成员变量或者成员方法)
        4、非静态的成员方法既可以访问静态的成员也可以访问非静态的成员
        5、在静态方法中是没有this关键字的

 */

class Demo2{
    static int a;
    int b;

    public void fun1(){
        System.out.println("这是非静态的方法");
    }

    public static void fun2(){
        System.out.println("这是静态的方法");
    }
}


public class StaticDemo {
    static int a = 200;

    public static void show1(){
        // 在静态方法中是没有this关键字的
//        System.out.println(this.a);
        System.out.println("这是被static修饰的成员方法show1");
    }


    public static void main(String[] args) {
//        Demo2.fun1();
        Demo2.fun2(); // 通过类名直接调用方法

        Demo2.a = 100; // 通过类名直接调用属性
//        Demo2.b = 200;

        Demo2 demo1 = new Demo2();
        demo1.fun2();
        demo1.a = 100;
        System.out.println(demo1.a);
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.a);
        System.out.println("=========================");

        show1();   // 静态方法可以调用静态方法
        System.out.println(a);

        // 静态不能调用非静态
//        show2();

    }

    public void show2(){
        System.out.println("这是非静态的成员方法show2");
        show1();   // 非静态可以调用静态
        show3();   // 非静态可以调用非静态
    }


    public void show3(){
        System.out.println("这是非静态的成员方法show3");
    }

}
