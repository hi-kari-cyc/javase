package shujia25.day07;

/*
    我们按照之前的封装的思想编写两个类，发现一个现象，这两个类中的成员基本上是一模一样的，将来呢，我们还会去定义消防员，程序员，医护人员等等，他们这些类中
    也会存在大部分相同的成员。于是呢，我们发现十分的重复编写代码。
    我们就在想，能不能有一个技术，只要写一遍相同的类，然后呢，让其他的类，于这个类产生一个关系，这样其他类的内部就有相同的部分了。
    java提供了新的特征：继承
    将多个类相同的部分写到一个类A中,然后其他类与这个类A产生一个继承的关系，这样，其他类就存在，类A中的成员。
    这个关系，java提供了一个关键字给我们使用：extends

    叫法解释：
        A extends B:
            A: 子类，派生类
            B: 父类，基类，超类
 */

class Person{
    String name;
    int age;

    public void eat(){
        System.out.println("吃");
    }

    public void run(){
        System.out.println("跑");
    }
}

class Father1 extends Person{
}

class Son1 extends Person{
    public void code(){
        System.out.println("敲代码");
    }
}


public class JiChengDemo1 {
    public static void main(String[] args) {
        Father1 father1 = new Father1();
        father1.eat();

        Son1 son1 = new Son1();
        son1.code();
    }
}
