package shujia25.day07;

/*
    如果父类中某一个非私有的方法只想被子类继承使用，而不能被子类重写
    java提供了一个关键字给我们使用，这个关键字：final
    final可以修饰哪些成员：
        成员方法：修饰成员方法，方法不能被子类重写
        类：修饰类，类不能被继承
        变量：修饰变量，变量的值不能被修改，被final修饰的变量叫做自定义常量

 */

//final class Fu8{}
//
//class Zi8 extends Fu8{}


class Fu7{
    final int A = 100;
    public final void ruyi(){
        System.out.println("保你平安");
    }
}

class Zi7 extends Fu7{
    //    @Override         不可被重写
//    public void ruyi(){
//        System.out.println("保你平安");
//        System.out.println("发大财");
//    }
    public void show1(){
//        a = 33;
        System.out.println(A);
    }
}


public class ExtendsDemo5 {
    public static void main(String[] args) {
        Zi7 zi7 = new Zi7();
        zi7.ruyi();
        zi7.show1();
    }
}