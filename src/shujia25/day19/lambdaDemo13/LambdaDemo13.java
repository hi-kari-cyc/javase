package shujia25.day19.lambdaDemo13;

/*
    假如我们的 Lambda 表达式符合如下格式：
    (变量1[, 变量2, ...]) -> 变量1.实例方法([变量2, ...])
    那么我们的代码就可以简写成：
    变量1对应的类名::实例方法名

    若Lambda 的参数列表的第一个参数，是实例方法的调用者，第二个参数(或无参)是实例方法的参数时，格式： ClassName::MethodName

 */
@FunctionalInterface
interface Inter9{
    boolean fun(Dog d1,Dog d2);
}

public class LambdaDemo13 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("小黑", 2);
        Dog dog2 = new Dog("大黄", 3);

//        Inter9 inter9 = (d1,d2)->d1.equals(d2);
        Inter9 inter9 = Dog::equals;
        System.out.println(inter9.fun(dog1,dog2));


    }
}
