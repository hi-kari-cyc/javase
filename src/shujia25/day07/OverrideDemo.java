package shujia25.day07;

/*
    1、面试题：重载与重写的区别？
    2、public protected 默认的 private
    重写的注意事项：
        1）子类重写父类方法的时候，权限修饰符不能比父类的还要低，建议：子类重写的权限修饰符和父类保持一致
        2）父类私有的成员方法无法被继承更无法被重写
        3）父类的静态成员方法，无法被子类继承重写，但是经测试发现，子类对象可以使用
 */


class Fu6{

//    private void fun1(){        //父类私有的成员方法无法被重写
    void fun1(){
        System.out.println("这是父类中的fun1方法");
    }

    public static void fun2(){
        System.out.println("这是父类中的静态方法fun2");
    }
}

class Zi6 extends Fu6{

    @Override
//    private void fun1(){     // 权限修饰符不能比父类的还要低
    public void fun1(){
        System.out.println("这是子类中的fun1方法");
    }

//    @Override     // 子类无法重新父类的静态方法，谈不上继承，只能说父类有静态方法，子类也有静态方法 静态方法可以通过类名调用
    public static void fun2(){
        System.out.println("这是子类中的静态fun2");

    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Zi6 zi6 = new Zi6();
        zi6.fun1();
        zi6.fun2();
        Fu6.fun2();
    }
}
