package shujia25.day08;

/*

        多态访问成员方法的时候，编译看左，运行看右，当父类中没有调用时的方法的时候，就会报错，如何解决？
        多态的弊端：无法使用子类中特有的方法
        解决方案：向下转型
        语句格式：目标类型 新变量名 = (目标类型)(要转的对象)
        注意向上向下转型只能发生在继承中

 */


class Animal3{
    public void eat(){
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡");
    }
}


class Duck extends Animal3{

    @Override
    public void eat(){
        System.out.println("🦆吃🦐");
    }

    @Override
    public void sleep(){
        System.out.println("🦆趴着睡");
    }

    public void swim(){
        System.out.println("🦆会游泳");
    }
}


public class DuoTaiDemo4 {
    public static void main(String[] args) {

        Animal3 duck1 = new Duck();
        duck1.eat();
        duck1.sleep();
//        duck1.swim();    // 会报错
        // 写法一
        Duck duck2 = (Duck)duck1;   // 向下转型
        // 写法二
        ((Duck)duck1).swim();

        duck2.swim();
    }
}
