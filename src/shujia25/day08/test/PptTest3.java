package shujia25.day08.test;

/*
        不同地方饮食文化不同的案例
            Person
             eat()
            SouthPerson
             eat()
            NorthPerson
             eat()

 */

class Person {
    public void eat() {
        System.out.println("吃");
    }
}

class SouthPerson extends Person {
    @Override
    public void eat() {
        System.out.println("南方人吃🍚");
    }

    public void daMaJiang() {
        System.out.println("打麻将");
    }
}

class NorthPerson extends Person {
    @Override
    public void eat() {
        System.out.println("北方人吃🍜");
    }

    public void cuoZao() {
        System.out.println("搓澡");
    }
}


public class PptTest3 {
    public static void main(String[] args) {
        Person p1 = new SouthPerson();
        p1.eat();
//        p1.daMaJiang;
        // 向下转型
        SouthPerson sp = (SouthPerson) p1;
        sp.eat();
        sp.daMaJiang();
        System.out.println("=================");
        Person p2 = new NorthPerson();
        p2.eat();
//        p2.cuoZao();
        // 向下转型
        NorthPerson np = (NorthPerson) p2;
        np.eat();
        ((NorthPerson) p2).cuoZao();   // 类似于匿名对象的写法 不建议写

    }
}
