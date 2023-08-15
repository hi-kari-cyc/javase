package shujia25.day08.test;

/*
    老师案例
    具体事物：二十五期老师，二十四期老师
    共性：姓名，年龄，讲课。

    老师类：（抽象类）
        姓名
        年龄
        讲课（抽象方法）

    二十五期老师 extends 老师类
    二十四期老师 extends 老师类

 */

abstract class Teacher{
    String name;
    int age;

    public abstract void teach();
}

class Teacher24 extends Teacher{

    @Override
    public void teach() {
        System.out.println("24期老师讲解Scala");
    }
}

class Teacher25 extends Teacher{

    @Override
    public void teach() {
        System.out.println("25期老师讲解Java");
    }
}

public class AbstractTest1 {
    public static void main(String[] args){
        Teacher t1 = new Teacher24();
        t1.teach();
        Teacher t2 = new Teacher25();
        t2.teach();
    }
}
