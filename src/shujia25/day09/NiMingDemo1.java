package shujia25.day09;

/*
    匿名内部类: 没有名字的内部类，这个内部类是我们控制JVM，让JVM去生成的
    语句定义格式：
        new 抽象类/接口(){
            // 重写所有(抽象类/接口)的抽象方法
        }

    JVM:
        1、JVM内部会帮我们创建一个类实现某个接口或者继承某个抽象类
        2、将JVM创建的这个类对应的对象创建出来
        3、重写所有抽象方法

 */
interface Inter{
    void fun1();
}

//class InterImpl implements Inter{
//    @Override
//    public void fun1() {
//        System.out.println("好好学习，天天向上！");
//    }
//}

class Demo6{
    public void show(Inter inter){       // 接口作为传入参数
        inter.fun1();
    }
}

public class NiMingDemo1 {
    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
//        demo6.show(new InterImpl());
        demo6.show(new Inter() {
            @Override
            public void fun1() {
                System.out.println("好好学习，天天向上！");
            }
        });
        demo6.show(new Inter() {
            @Override
            public void fun1() {
                System.out.println("今天天气很炎热");
            }
        });
    }
}
