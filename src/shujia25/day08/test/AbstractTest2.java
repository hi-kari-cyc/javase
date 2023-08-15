package shujia25.day08.test;

/*
    假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。
    经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
    请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。

    员工类：（抽象类）
        姓名，工号，工资
        工作（抽象方法）

    程序猿programmer extends 员工类:
        工作（程序员敲代码）

    经理 extends 员工类:
        工作（做PPT）

 */

abstract class Staff {
    String name;
    String id;
    int price;

    public Staff(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public abstract void work();

    public abstract void show();
}


class Programmer extends Staff {

    public Programmer(String name, String id, int price) {
        super(name, id, price);
    }

    @Override
    public void work() {
        System.out.println("工作是敲代码");
    }

    @Override
    public void show() {
        System.out.println("姓名:" + name);
        System.out.println("编号:" + id);
        System.out.println("工资:" + price);
        work();
    }
}


class Manager extends Staff {
    int bonus;

    public Manager(String name, String id, int price, int bonus) {
        super(name, id, price);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("工作是做PPT");
    }

    @Override
    public void show() {
        System.out.println("姓名:" + name);
        System.out.println("编号:" + id);
        System.out.println("工资:" + price);
        System.out.println("奖金:" + bonus);
        work();
    }

}

public class AbstractTest2 {
    public static void main(String[] args) {
        // 创建一个程序员对象
        Staff p1 = new Programmer("常允城", "0x001", 8000);
        p1.show();
        System.out.println("====================");
        // 创建一个经理对象
        Staff p2 = new Manager("cyc", "0x002", 6000, 20000);
        p2.show();
    }
}
