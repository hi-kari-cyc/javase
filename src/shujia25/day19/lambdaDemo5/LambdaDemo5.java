package shujia25.day19.lambdaDemo5;

/*
    格式1：无参数，无返回值的接口改写成Lambda表达式
 */

@FunctionalInterface
interface Inter1{
    void fun1();
//    void fun2();
}

class InterImpl implements Inter1{

    @Override
    public void fun1() {
        System.out.println("hello world");
    }
}

public class LambdaDemo5 {
    public static void main(String[] args) {
        Inter1 inter1 = new InterImpl();
        inter1.fun1();

        // 匿名内部类实现
        Inter1 inter11 = new Inter1() {
            @Override
            public void fun1() {
                System.out.println("hello java");
            }
        };
        inter11.fun1();

        // lambda表达式改写
        Inter1 inter111 = () -> {
            System.out.println("hello world");
            System.out.println("hello lambda");
        };
        inter111.fun1();
        System.out.println("----------------------------");

        Inter1 inter112 = () ->
        System.out.println("hello world");
        System.out.println("hello lambda");
        inter112.fun1();
    }
}
