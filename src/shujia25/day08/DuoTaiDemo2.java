package shujia25.day08;

/*
    多态访问成员的特点：
        成员变量：多态访问成员变量，编译看左，运行看左     访问的是父类的成员变量
        成员方法：多态访问成员方法，编译看左，运行看右     访问的是子类中重写的方法
        静态的成员方法：多态访问静态成员方法，编译看左，运行看左    访问的是父类的静态方法

        子类中特有的方法无法直接调用

        编译看左，运行看左  解释：
            编译阶段根据引用变量的类型（左边）来确定可访问的成员变量 运行阶段则仍然使用引用变量指向的对象的类型（左边）来确定实际访问的成员变量
 */

class Person{
    int a = 100;

    public void fun1(){
        System.out.println("这是Person类的fun1");
    }

    public static void fun2(){
        System.out.println("这是Person类的静态方法fun2");
    }
}

class Student extends Person{
    int a = 200;

    @Override
    public void fun1(){
        System.out.println("这是Student类的fun1");
    }

    // 子类中的静态方法将隐藏父类中的静态方法  不算作方法重写
    public static void fun2(){
        System.out.println("这是Student类的静态方法fun2");
    }

    public void fun3(){
        System.out.println("这是Student独有的方法fun3");
    }
}

public class DuoTaiDemo2 {
    public static void main(String[] args) {

        Person p1 = new Student();

        System.out.println(p1.a);  // 100

        p1.fun1();   // 这是Student类的fun1

        p1.fun2();  // 这是Person类的静态方法fun2

//        p1.fun3();    // fun3不能被调用

        // 要想执行Student类中的fun2 直接用调用静态方法的语句
        Student.fun2();
    }
}
