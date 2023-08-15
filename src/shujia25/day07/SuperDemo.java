package shujia25.day07;

/*
    super关键字：代表的是直接父类的引用，将来可以通过super关键字调用直接父类中的成员
    类：
        成员变量：super.成员变量名
        成员方法：super.成员方法名(...)
        构造方法：子类的构造方法第一句话默认存在一个super()
    1、对父类做初始化，代码层面其实就是调用父类的构造方法就行了，无论是无参还是有参
    2、父类不能进行多次初始化
 */

class Fu3{
    int a = 300;

    Fu3(){
        // 在子类中对应调用方法为 super()
        System.out.println("这是父类中的无参构造方法");
    }

    Fu3(String s){
        // 在子类中对应调用方法为 super("s")
        System.out.println("这是父类中的带参数的构造方法");
    }
    // 无论是有参还是无参只要能调用父类的构造方法完成初始化即可，且只能初始化一次。

    public void show1(){
        System.out.println("这是父类中的show1方法");
    }
}


class Zi3 extends Fu3{

    Zi3(){
//        super();        // 默认存在的 调用直接父类的无参构造方法   达到初始化父类的作用
//        super("shujia");
        this("s");  // this() 表示调用当前类的其他构造方法 间接完成对父类的初始化
        System.out.println("这是子类中的无参构造方法");
    }

    Zi3(String s){
        super(s);
        System.out.println("这是子类带参的构造方法");
    }

    public void fun1(){
        int a = 200;
        System.out.println(super.a);
        super.show1();    // super可以省略
    }
}


public class SuperDemo {
    public static void main(String[] args) {
        Zi3 zi3 = new Zi3();
        System.out.println("=====================");
        zi3.fun1();

    }
}
