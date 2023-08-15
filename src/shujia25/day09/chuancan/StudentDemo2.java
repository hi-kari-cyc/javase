package shujia25.day09.chuancan;

/*
    形式参数
        基本类型：当你看到方法的参数类型是基本数据类型的，将来调用方法传入的是对应具体的数值
        引用类型：
            类：当你看到一个类作为方法的形式参数的时候，将来调用时需要传入该类或者该类的子类对象
                抽象类：当你看到一个抽象类作为方法的形式参数类型的时候，将来调用时需要传入该抽象类的具体子类对象
            接口：
 */
abstract class Student2{
    public abstract void fun1();
}

class StudentTest2{
    public void show(Student2 student2){      //  Student2 student2 = new StudentZi(); 编译看左，运行看右
        student2.fun1();
    }
}

class StudentZi extends Student2{    //  抽象类不能实例化，所以创建一个子类作为参数传递

    @Override
    public void fun1() {
        System.out.println("好好学习，天天向上");
    }
}

public class StudentDemo2 {
    public static void main(String[] args) {
        // 方法一
        StudentTest2 st2 = new StudentTest2();
        StudentZi sz = new StudentZi();
        st2.show(sz);

        //方法二
        st2.show(new Student2() {
            @Override
            public void fun1() {
                System.out.println("好好学习，天天向上");
            }
        });
    }
}

