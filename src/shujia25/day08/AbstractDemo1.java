package shujia25.day08;

/*
    我们在此之前写的所有继承相关的案例中，父类其实是一个概念的集合，现实生活中我们写的父类其实是一个抽象的概念
    比如动物其实是一个概念的集合，不应该可以去new(实例化)，而子类狗，猪，猫等才可以被new，而且动物中吃方法也不应该有实现（连大括号都不能有）
    像这样的方法我们应该叫做抽象的方法，而一个概念集合组成的类，应该叫做抽象类。
    java提供了一个关键字给我们去描述抽象：abstract 抽象的
    abstract可以修饰类，方法
    类：修饰类，类称之为抽象类
    方法；修饰方法，方法称之为抽象方法

    注意事项：
        1、当一个类中存在抽象方法的时候，这个类也必须被定义成抽象类
        2、抽象类中也可以存在具体实现的方法
        3、抽象类无法被实例化
        4、抽象类可以存在构造方法（目的是什么？为了在继承关系中提供初始化的功能）
        5、当一个具体的类继承一个抽象类的时候，必须要实现抽象类的 所有  抽象方法
        6、抽象类可以继承一个抽象类，可以选择重写或不重写抽象方法
        7、抽象类中既可以存在变量，也可以存在常量

 */
abstract class Animal5{

    int a = 10;
    final int B = 100;

    // 定义一个抽象方法
    public abstract void eat();

    public abstract void sleep();

    public void fun1(){
        System.out.println("动物可以生存");
    }
}


abstract class Demo0 extends Animal5{}   // 抽象类可以继承一个抽象类


// 重写抽象方法的快捷键 光标放在类名上 Alt+Enter

class Dog5 extends Animal5{

    @Override
    public void eat() {
        System.out.println("🐕吃🥩");
    }

    @Override
    public void sleep() {
        System.out.println("🐕趴着睡");
        System.out.println(a);
        System.out.println(B);
    }
}


public class AbstractDemo1 {
    public static void main(String[] args) {
//        Animal5 animal5 = new Animal5();          //  Animal5是抽象的; 无法实例化

        // 父类的引用指向子类对象
        Animal5 a = new Dog5();    // 抽象多态
        a.eat();
        a.sleep();

    }
}
