package shujia25.day06;


/*
    构造方法：
        1、我们之前从来没有自己写过构造方法，但是呢，也可以调用并创建对象，那么我们之前使用的构造方法从哪里来呢？
        如果我们不提供构造方法，那么java会自动提供一个公共的无参无方法体的构造方法

        2、如果我们自己提供了构造方法，那么系统将不再提供任何构造方法

        3、方法在同一个类中可以发生重载，构造方法也可以发生重载

        4、构造方法的第二个使用方式：给成员变量进行赋值

 */
public class StructureDemo {
    public static void main(String[] args) {
        //使用类中带有参数的构造方法来创建对象
        //无论时使用带参数的构造方法还是无参数构造方法，目的就一个：都是创建该类的对象
        Student s0 = new Student();

        Student s1 = new Student("cyc",18);
        s1.show();
    }
}
