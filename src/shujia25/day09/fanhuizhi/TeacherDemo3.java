package shujia25.day09.fanhuizhi;

/*
    返回值类型：
        基本数据类型：当基本数据类型作为方法的返回值类型的时候，return返回的是具体的数值
        引用数据类型：
            类：当类作为方法的返回值类型的时候，返回的是该类或者该类的子类对象
            抽象类：当你看到一个抽象类作为方法的返回值类型的时候，return返回的是该类的具体子类的对象
            接口：当你看到一个接口作为方法的返回值类型的时候，return返回的是该接口的具体实现子类对象。


 */

interface Inter{
    void fun1();
}

//class Teacher3Impl implements Inter{
//
//    @Override
//    public void fun1() {
//        System.out.println("好好学习，天天向上");
//    }
//}

class Teacher3{
    public Inter show3(){
//        return new Teacher3Impl();

        // 匿名内部类
        return new Inter(){
            @Override
            public void fun1(){
                System.out.println("好好学习，天天向上");
            }
        };
    }
}

public class TeacherDemo3 {
    public static void main(String[] args) {
//        Teacher3 t3 = new Teacher3();
//        Inter inter = t3.show3();       // Inter inter = new Teacher3Impl()   // 接口多态
//        inter.fun1();

        // 写法二
        new Teacher3().show3().fun1();     // 链式调用：调用完方法后还可以调用其他方法

    }
}
