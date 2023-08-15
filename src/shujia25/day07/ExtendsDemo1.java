package shujia25.day07;

/*
    继承：
        1、继承的好处：
            提高了代码的复用性
                多个类相同的成员可以放到同一个类中
            提高了代码的维护性
                如果功能的代码需要修改，修改一处即可
            让类与类之间产生了关系，是多态的前提
                其实这也是继承的一个弊端：类的耦合性很强(耦合性-----关系密切性)
                将来的开发的原则：低耦合，高内聚（内聚：专注做自己内部的事情）
        2、继承的特点：
            1）java中类与类之间不允许多继承（不允许一个类同时继承多个类），只允许单继承
            2）java允许多层继承，形成一个继承体系

 */
class GrandFather2{

}

class Father2 extends GrandFather2{

}

class Son2 extends Father2{
    // 可以多层继承
}

class Mother2{

}

//class Son2 extends Father2,Mather2{
//
//}                       // 只能继承一个




class Person2{
    private String name;
    private int age;

    public void eat(){
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡");
    }

    public void fly(){
        System.out.println("飞");
    }

}

class Teacher extends Person2{

}

class Student extends Person2{

}



public class ExtendsDemo1 {
}
