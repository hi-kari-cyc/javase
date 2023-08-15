package shujia25.day09.chuancan;


/*
    形式参数
        基本类型：当你看到方法的参数类型是基本数据类型的，将来调用方法传入的是对应具体的数值
        引用类型：
            类：当你看到一个类作为方法的形式参数的时候，将来调用时需要传入该类或者该类的子类对象
                抽象类：
            接口：
            数组
 */

class Student1{
    public void fun1(){
        System.out.println("好好学习，天天向上");
    }
}

class StudentTest{
    public void show(Student1 s1){
        s1.fun1();
    }
}


public class StudentDemo1 {
    public static void main(String[] args) {
        StudentTest st1 = new StudentTest();
        // 写法一
        Student1 student = new Student1();
        st1.show(student);
        // 写法二
        st1.show(new Student1());
    }
}
