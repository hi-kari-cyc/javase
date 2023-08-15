package shujia25.day07;

/*
    使用继承的注意事项：
        1、子类只能继承父类的非私有的成员
        2、父类的构造方法无法被子类所继承，但是可以被使用，要想初始化子类，必须先初始化父类。（也就是在执行子类构造方法之前先执行父类构造方法）
        3、不要为了部分功能而去继承
            那么什么时候使用继承？ 只要满足英语的”is a“这个语法，就可以使用(什么是什么，例：苹果是水果)
        4、被static修饰的方法不算是被子类继承

    初始化包括父类属性的初始化，构造代码块初始化，构造方法初始化

        class A{
            fun1();
            fun2();
            fun3();
        }

        class B{
            fun3();
            fun4();
            fun5();
        }

        class C{
            fun3();
            fun6();
            fun7();
        }

        --------
        class Demo{
            fun3();
        }
 */

class Fu1{
    Fu1(){
        System.out.println("这是父类的构造方法");
    }

    private int c = 10;   // 加上private c无法被子类继承
    int a = 10;

    public static void fun1(){
        System.out.println("这是父类中的静态fun1方法");
    }
}

class Zi1 extends Fu1{
    static int a;

    Zi1(){
        System.out.println("这是子类的构造方法");
    }

    public static void fun1(){
        System.out.println(a);
    }
}


public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi1 zi1 = new Zi1();
        zi1.fun1();  // 算不上继承，静态属于类本身的东西  父类有静态，子类也能使用 但更好的写法是下面那种
        Fu1.fun1();

        Zi1 zi2 = new Zi1();

    }
}
