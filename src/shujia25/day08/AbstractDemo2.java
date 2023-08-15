package shujia25.day08;

/*
        一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?
            没有抽象方法，定义一个抽象类仍然可以有意义。
            抽象类可以作为其他类的基类，提供一些通用的属性和方法。即使它没有抽象方法，它仍然可以包含非抽象的方法和成员变量，这些可以被子类继承和使用
        abstract class A{}

        abstract不能和哪些关键字共存
            private	冲突
            final	冲突
            static	无意义

 */


abstract class Demo3 {

//    public abstract static void fun1();            非法的修饰符组合: abstract和static
    // 抽象方法需要被子类实现或覆盖，它是针对实例的。而静态方法是属于类的，与具体的实例无关


    // abstract关键字用于修饰类、方法或接口，表示这个类、方法或接口是抽象的，需要子类去实现或继承。
    // 而private关键字用于修饰类的成员（字段和方法），表示这个成员只能在当前类内部访问，对外部是不可见的。
    // 由于抽象方法和抽象类需要子类去实现或继承，而private关键字限制了成员的访问权限，使得该成员对子类是不可见的。
    // 这样一来，如果在抽象类中定义了一个私有的抽象方法，子类就无法访问该方法，也无法实现或继承该方法，从而违背了抽象类的设计初衷
}

//     final abstract class Demo4{ }
// final类不能被继承，final方法不能被重写，final变量不能被修改    abstract目的就是让子类去继承


public class AbstractDemo2 {
    public static void main(String[] args) {

    }
}
