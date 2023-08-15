package shujia25.day09.fanhuizhi;

/*
    返回值类型：
        基本数据类型：当基本数据类型作为方法的返回值类型的时候，return返回的是具体的数值
        引用数据类型：
            类：当类作为方法的返回值类型的时候，返回的是该类或者该类的子类对象
            抽象类：
            接口：
 */
class Teacher1{
    public void fun1(){
        System.out.println("好好学习，天天向上");
    }
}

class TeacherTest1{
    public Teacher1 show(){
        return new Teacher1();            // 返回Teacher1的对象或者子类对象

//        Teacher1 teacher1 = new Teacher1();
//        return teacher1;
    }
}


public class TeacherDemo1 {
    public static void main(String[] args) {
        TeacherTest1 tt1 = new TeacherTest1();
        Teacher1 t1 = tt1.show();            // Teacher1 t1 = new Teacher1()
        t1.fun1();

        tt1.show().fun1();
    }
}
