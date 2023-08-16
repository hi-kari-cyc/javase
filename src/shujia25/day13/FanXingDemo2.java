package shujia25.day13;

/*
    在定义泛型的时候，<>中只是为了接收将来调用时传入的数据类型，泛型将引用数据类型当作参数一样传递了
    <>中需要定义一个接收数据类型的变量即可，既然是一个变量，符合标识符命名规则即可
    阿里巴巴java开发规范手册中明确规定泛型需要使用一个大写的英文字母表示即可

 */

public class FanXingDemo2{
    public static void main(String[] args) {
        // 创建对象时指定具体的类型
        Demo<String> demo = new Demo<>();
        demo.fun("你好");
        // 泛型类被定义之后就只能传指定的类型
//        demo.fun(100);

        // 当以后我们还没想好方法中传什么类型的参数，就可以定义为泛型，什么引用数据类型的都可以传
        Demo2 demo2 = new Demo2();
        demo2.fun(100);
        demo2.fun("100");
        demo2.fun(12.34);

        Demo3<String> demo3 = new Demo3<>();
        demo3.fun(100);
        demo3.fun("100");    // 方法中的泛型和类上的泛型可以不一致
        demo3.fun(false);
    }
}

//  1、泛型类  在类上面加泛型
class Demo<E>{
    public Demo(){
    }

    public void fun(E e){
        System.out.println(e);
    }
}

class Demo2{
    // 2、泛型方法 定义一个泛型方法，表示将来可以传入任意的引用数据类型
    public <T> void fun(T t){
        System.out.println(t);
    }
}

class Demo3<E>{
    public <T> void fun(T t){      // 泛型类上的泛型不一定和泛型方法中的泛型一致
        System.out.println(t);
    }
}