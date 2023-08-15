package shujia25.day08;

/*
    能否做向下转型，看一看类型是否一样或者是存在继承关系，其他一律无法做向下转型。
 */


class Animal4{
    public void fun1(){
        System.out.println("a");
    }
}

class Dog4 extends Animal4{
    @Override
    public void fun1(){
        System.out.println("aa");
    }

    public void fun2(){
        System.out.println("bb");
    }
}

class Cat4 extends Animal4{
    @Override
    public void fun1(){
        System.out.println("aaa");
    }

    public void fun2(){
        System.out.println("bbb");
    }

}

public class DuoTaiDemo5 {
    public static void main(String[] args) {
        Animal4 a1 = new Dog4();
        a1.fun1();
//        a1.fun2();

//        Cat4 c1 = (Cat4)a1;       // ClassCastException 类转换异常
//        c1.fun1();                // java内部检测机制会检测强制类型与目标类型是否一样或者是存在继承关系
//        c1.fun2();

        Dog4 d1 = (Dog4)a1;
        d1.fun1();
        d1.fun2();


    }
}
