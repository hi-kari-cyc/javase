package shujia25.day07;

/*
    如果父类中的方法只想让子类去使用，而不是去重写，怎么办呢？
    可以在父类方法前面添加 final 关键字来修饰该方法

    final注意事项：
        final修饰变量,若修饰的是引用数据类型，表示变量的地址值不能被改。说白了，今后判断是否能改值，就直接看这个变量是否被final修饰


 */

class Demo2{
    int a = 20;
}

public class FinalDemo1 {
    public static void main(String[] args) {
        final Demo2 dd = new Demo2();
//        dd = new Demo2();    // 地址值不能改变
        dd.a = 100;  // ?    引用数据可以变
        System.out.println(dd.a);
    }
}