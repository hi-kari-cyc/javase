package shujia25.day07;

/*
    继承与成员方法的关系：
        子类调用成员方法，会先在当前子类中查找，如果子类中找不到，就去父类中找，如果父类中都没有，那么就报错。
        口诀：就近原则

    当子类中的方法声明与父类中的方法声明（返回值类型，方法名，参数列表）一模一样，但是方法的实现(方法体)却不同，这个现象：方法的重写
    如果涉及到方法的重写，请在子类重写的方法上面加上一个注解@Override

 */

class Fu5{
    public void fun1(){
        System.out.println("这是父类中的成员方法fun1");
    }
}

class Zi5 extends Fu5{
    public void show1(){
        fun1();
        super.fun1();
    }

    @Override   // 表示该方法已被重写
    public void fun1(){
        System.out.println("这是子类中的成员方法fun1");
    }
}


public class ExtendsDemo4 {
    public static void main(String[] args) {
        Zi5 zi5 = new Zi5();
        zi5.show1();
    }
}
