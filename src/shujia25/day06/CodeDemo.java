package shujia25.day06;

/*
    代码块：在Java中，使用{}括起来的代码被称为代码块，根据其位置和声明的不同，可以分为局部代码块，构造代码块，静态代码块，同步代码块(多线程讲解)。
    局部代码块：
        就是在方法内部定义代码块，叫做局部代码块，就是使用一个大括号括起来
        作用：限定变量的生命周期，作用域

    构造代码块：
        在类中方法外定义，也是由大括号括起来的代码块
        执行顺序：构造方法--构造代码块（若存在多个构造代码块，多个构造代码块之间会自上而下执行）
        作用：放到继承的时候讲解

    静态代码块：
        在类中方法外定义，不仅使用大括号括起来，且在最开始使用static修饰,优先于对象

    执行顺序：静态代码块--构造代码块--构造方法（若存在多个构造代码块，多个构造代码块之间会自上而下执行）
        注意：静态代码块只会在程序运行的最开始执行一次，后续不会执行了。

 */
public class CodeDemo {
    CodeDemo() {
        System.out.println("这是无参构造方法！");
    }

    // 构造代码块
    {
        System.out.println("这是构造代码块1");
    }

    {
        System.out.println("这是构造代码块2");
    }

    //静态代码块
    static {
        System.out.println("这是静态的代码块");
    }


    public static void main(String[] args) {
        //局部代码块
        {
            int a = 10;
            int b = 20;
            System.out.println("a:" + a);
            System.out.println("b:" + b);
        }

        {
            int c = 30;
            System.out.println("c:" + c);
        }
//        System.out.println(a);
//        System.out.println(b);


        CodeDemo codeDemo1 = new CodeDemo();
        System.out.println("--------------------");
        CodeDemo codeDemo2 = new CodeDemo();

    }
}

