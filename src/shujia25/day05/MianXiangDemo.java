package shujia25.day05;

/*
        数据类型：
        基本数据类型：byte,short,int,long,float,double,boolean,char
        引用数据类型：类、接口、数组、枚举、字符串、包装类

        一个java程序运行过程：编写java文件.java --> .class(我们代码中每一个class类将来都会被编译成一个class文件)  --> 运行

        一个java文件中可以定义多个class类，但是只能有一个class类被public修饰，且要与java文件重名
 */
public class MianXiangDemo {
    public static void main(String[] args) {
        // 需求：在控制台上输出 教学
        Teacher t1 = new Teacher();
        t1.teach();

        // 调用fun方法
//        fun(); 类与类之间是相对隔离的 要想调用fun方法，必须创建TeacherTest对象
        TeacherTest tt1 = new TeacherTest();

        //创建一个对象，把这个对象当作形参传入类方法
        Teacher t2 = new Teacher();
        tt1.fun(t2);

        // 匿名对象
        tt1.fun(new Teacher());
    }

}

class Teacher{
    String name;
    int age;

    public void teach(){
        System.out.println("教学");
    }
}

class TeacherTest{
    // 今后当你看到一个类作为方法的形式参数类型的时候，将来调用改方法时，需要传入该类的对象
    public void fun(Teacher t){
        t.teach();
    }
}