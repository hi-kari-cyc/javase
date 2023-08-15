package shujia25.day09.chuancan;

/*
    形式参数
        基本类型：当你看到方法的参数类型是基本数据类型的，将来调用方法传入的是对应具体的数值
        引用类型：
            类：当你看到一个类作为方法的形式参数的时候，将来调用时需要传入该类或者该类的子类对象
                抽象类：当你看到一个抽象类作为方法的形式参数类型的时候，将来调用时需要传入该抽象类的具体子类对象
            接口：当你看到一个接口作为方法的形式参数类型的时候，将来调用时需要传入实现该接口的子类对象
 */
interface Inter{
    void fun1();
}

class StudentTest3{
    public void show(Inter inter){    //   Inter inter = new StudentImpl()   // 接口多态
        inter.fun1();
    }
}

class StudentImpl implements Inter{

    @Override
    public void fun1() {
        System.out.println("好好学习，天天向上");
    }
}

public class StudentDemo3 {
    public static void main(String[] args) {
        StudentTest3 st3 = new StudentTest3();
        StudentImpl si = new StudentImpl();
        st3.show(si);

        st3.show(new StudentImpl());

        // 方法二 匿名内部类
        st3.show(new Inter() {
            @Override
            public void fun1() {
                System.out.println("好好学习，天天向上");
            }
        });
    }
}
