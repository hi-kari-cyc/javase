package shujia25.day19.lambdaDemo14;

/*
    构造方法引用 ClassName::new

    当我们要执行的表达式是新建一个对象，并且这个对象的构造方法的参数列表和接口里函数的参数列表一一对应时，我们就可以采用「引用构造方法」的格式。

    假如我们的 Lambda 表达式符合如下格式：
        ([变量1, 变量2, ...]) -> new 类名([变量1, 变量2, ...])
    我们就可以简写成如下格式：
        类名::new

 */
@FunctionalInterface
interface Inter10{
    Teacher fun(String name,int age);
}

public class LambdaDemo14 {
    public static void main(String[] args) {
//        Inter10 inter10 = (name, age) -> new Teacher(name,age);
        Inter10 inter10 = Teacher::new;

        System.out.println(inter10.fun("小虎", 18));
    }
}
