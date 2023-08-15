package shujia25.day19.lambdaDemo12;

/*
    当我们要执行的表达式是调用某个类的静态方法，并且这个静态方法的参数列表和接口里抽象函数的参数列表一一对应时，我们可以采用引用静态方法的格式。

    假如 Lambda 表达式符合如下格式：
        ([变量1, 变量2, ...]) -> 类名.静态方法名([变量1, 变量2, ...])
    我们可以简写成如下格式：
        类名::静态方法名
    注意这里静态方法名后面不需要加括号，也不用加参数，因为编译器都可以推断出来。

 */

@FunctionalInterface
interface Inter8 {
    String fun();
}

public class LambdaDemo12 {
    public static void main(String[] args) {
//        Inter8 inter8 = () -> Student.get();
        Inter8 inter8 = Student::get;

        System.out.println(inter8.fun());
    }
}


class Student {


    public static String get() {
        return "好好学习，天天向上";
    }
}
