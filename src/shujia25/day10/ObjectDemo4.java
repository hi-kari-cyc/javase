package shujia25.day10;
import java.util.Objects;

/*
    protected Object clone()
    java中不是所有的类都允许被克隆，如果一个要想调用clone()方法，这个类必须要实现一个接口Cloneable
    通过观察后发现，Cloneable这样的接口中没有常量，也没有抽象方法，就一堆介绍
    像这样的接口，称之为标记接口，实现该接口的类还要重写clone()方法

    Object中的拷贝是浅拷贝

    IT行业中的拷贝：
        浅拷贝
        深拷贝
 */

public class ObjectDemo4 {
    public static void main(String[] args) {
        Demo demo = new Demo(100);
        Student s1 = new Student("cyc",18,demo);
        System.out.println(s1);

        Student c1 = s1.clone();
        System.out.println(c1);

        System.out.println(s1 == c1);
        // 内容一样,地址值不一样

        System.out.println("===============");
        Demo d1 = s1.getDemo();
        Demo d2 = c1.getDemo();
        System.out.println(d1 == d2);

    }
}
/*
        浅拷贝
            是指创建一个新对象，该对象的字段与原始对象相同，并且对于引用类型的字段，仅复制引用而不复制实际的对象。
            也就是说，新对象和原始对象共享同一个引用类型的字段，对其中一个对象所做的修改会影响到另一个对象。
            浅拷贝可以通过 Object 类的 clone() 方法来实现，或者通过复制构造函数、拷贝工厂方法等方式手动实现

        深拷贝
            是指创建一个新对象，该对象的字段不仅与原始对象相同，而且对于引用类型的字段，会创建一个新的对象来存储其副本。
            也就是说，新对象和原始对象拥有独立的引用类型字段，对其中一个对象所做的修改不会影响到另一个对象。
            深拷贝通常需要自定义实现，可以通过序列化和反序列化、递归复制对象图等方式来实现

 */