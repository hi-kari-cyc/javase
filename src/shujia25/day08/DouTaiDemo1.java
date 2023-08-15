package shujia25.day08;

/*
    多态：多种状态，某一个事物在不同时刻下表现的不同状态
        水：固态 气态 液态
        水果：苹果 西瓜 桃子
        动物：狗 猫 猪
    多态的前提：
        1、要有继承关系
        2、要有方法的重写，不重写也可以，但是体现不出事物的特性
        3、要有父类的引用指向子类对象

 */

class Animal {

    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }
}

class Dog extends Animal {
    int a = 20;

    @Override
    public void eat() {
        System.out.println("🐕吃🥩");
    }

    @Override
    public void sleep() {
        System.out.println("🐕趴着睡");
    }
}


public class DouTaiDemo1 {
    public static void main(String[] args) {
        Animal dog = new Dog();  // 狗是动物的一种状态 类与类之间的多态
        dog.eat();
        dog.sleep();

    }
}
