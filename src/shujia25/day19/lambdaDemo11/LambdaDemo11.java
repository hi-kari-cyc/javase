package shujia25.day19.lambdaDemo11;

/*
    当我们要执行的表达式是调用某个对象的方法，并且这个方法的参数列表和接口里抽象函数的参数列表一一对应时，我们就可以采用引用对象的方法的格式。

    假如 Lambda 表达式符合如下格式：
    ([变量1, 变量2, ...]) -> 对象引用.方法名([变量1, 变量2, ...])
    我们可以简写成如下格式：
    对象引用::方法名


 */

@FunctionalInterface
interface Inter7 {
    String fun(Dog dog);
}

public class LambdaDemo11 {
    public static void main(String[] args) {
//        Inter7 inter7 = e ->e.getName();
        Inter7 inter7 = Dog::getName;
        System.out.println(inter7.fun(new Dog("小黑", 3)));
    }
}
