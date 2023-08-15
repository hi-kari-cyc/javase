package shujia25.day09.fanhuizhi;

/*
    返回值类型：
        基本数据类型：当基本数据类型作为方法的返回值类型的时候，return返回的是具体的数值
        引用数据类型：
            类：当类作为方法的返回值类型的时候，返回的是该类或者该类的子类对象
            抽象类：当你看到一个抽象类作为方法的返回值类型的时候，return返回的是该类的具体子类的对象
            接口：
 */

abstract class Teacher2{
    public abstract void fun1();
}

//class Teacher2Zi extends Teacher2{
//
//    @Override
//    public void fun1() {
//        System.out.println("好好学习，天天向上");
//    }
//}

class TeacherTest2{
    public Teacher2 show2(){
//        return new Teacher2Zi();

        // 写法二
        return new Teacher2() {
            @Override
            public void fun1() {
                System.out.println("好好学习，天天向上");
            }
        };
    }
}

public class TeacherDemo2 {
    public static void main(String[] args) {
        TeacherTest2 tt2 = new TeacherTest2();
        Teacher2 t2 = tt2.show2();        //    Teacher2 t2 = new Teacher2Zi()   抽象多态
        t2.fun1();

        tt2.show2().fun1();
    }
}
