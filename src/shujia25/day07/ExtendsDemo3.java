package shujia25.day07;

/*
    继承与成员变量的关系:
        子类使用变量的顺序：先在当前方法内部查找，如果找到就使用，否则去当前类的成员变量位置上查找，如果找到就使用，否则最终会去父类的成员变量位置上找。
        就近原则

        无法使用父类其他方法中的局部变量

 */


class Fu2{
    int a = 100;

    public void fun1(){
        int a = 11;     // 子类无法调用父类方法里的变量
    }
}

class Zi2 extends Fu2{
    int a = 200;

    public void show1(){
        int a = 300;
        System.out.println(a);   // 局部变量a
        System.out.println(this.a);   // 优先输出成员变量a,当没有成员变量a时输出父类的成员变量a

        //需求：我想打印父类中的a=100怎么办？
        // 方法一
        Fu2 fu2 = new Fu2();
        System.out.println("创建父类对象的方法调用父类中的成员变量："+fu2.a);
        // 方法二
        //java仿照着this关键字提供了另外一个关键字：super (代表的是直接父类的引用)
        System.out.println("使用super直接引用父类的成员变量："+super.a);
    }
}


public class ExtendsDemo3 {
    public static void main(String[] args) {
        Zi2 zi2 = new Zi2();
        zi2.show1();
    }
}
