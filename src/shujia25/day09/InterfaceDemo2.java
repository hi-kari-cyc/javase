package shujia25.day09;

/*
            接口如何实例化
                按照多态的方式，由具体的子类实例化。其实这也是多态的一种，接口多态。

 */
interface Inter1{
    String sayHello();
}

class Inter1Impl implements Inter1{

    @Override
    public String sayHello() {
        return "Hello World";
    }

    public void fun1(){
        System.out.println("是具体的类特有的方法");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        Inter1 i1 = new Inter1Impl();   //接口多态（把接口当作父类去实现）
        String s = i1.sayHello();
        System.out.println(s);

//        i1.fun1();
    }
}