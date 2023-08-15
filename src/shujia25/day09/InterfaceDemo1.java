package shujia25.day09;

/*
    接口:是类额外特殊拥有的功能，可以将其功能定义成接口，将来某些类若想要拥有特殊的功能，实现该接口即可
    java提供了一个关键字给我们使用：interface
    将来我们就可以通过该关键字定义一个接口

    定义接口时候的注意事项：
        1、接口中只能存在抽象方法, 默认会在抽象方法的定义前面添加public abstract修饰
        2、接口其实可以被看作成是一个特殊的类，将来也会被编译成一个class文件
        3、当一个具体的类实现接口的时候，使用implements关键字进行实现，并且要实现  接口 中的  所有   抽象方法(抽象类则不用)
        4、一个具体的类在继承一个类的同时可以实现  多个接口
        5、接口中只允许出现常量，而且默认会添加public static final修饰
        6、接口里不允许有构造方法，进而导致接口无法被实例化，只能被实现
        7、当一个抽象类实现一个接口的时候，可以选择或不去实现接口中的抽象方法
            对比抽象类的子类，子类必须抽象类中的抽象方法
 */
interface ZuanHuoQuan {

//    ZuanHuoQuan(){           接口里不允许有构造方法,所以不能创建对象
//
//    }

    int a = 10;

    //    public abstract void Zuan();
    void zuan();
}

abstract class Demo implements ZuanHuoQuan{     // 当一个抽象类实现一个接口的时候，可以选择或不去实现接口中的抽象方法

}

interface QiZiXingChe{
    void qiche();
}

class Cat {
    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }
}



class ZuanHuoQuanCat extends Cat implements ZuanHuoQuan ,QiZiXingChe{


    @Override
    public void zuan() {
        System.out.println(a);
        System.out.println("会钻火圈");
    }

    @Override
    public void qiche() {
        System.out.println("会骑车");
    }
}


public class InterfaceDemo1 {
    public static void main(String[] args) {
        // 创建一个普通的猫
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.sleep();
//        cat1.zuan();
        System.out.println("======================");
        // 创建一个会钻火圈的猫
        ZuanHuoQuanCat cat2 = new ZuanHuoQuanCat();
        cat2.eat();
        cat2.sleep();
        cat2.zuan();
        cat2.qiche();
        System.out.println(ZuanHuoQuan.a);
    }
}
