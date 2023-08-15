package shujia25.day19.lambdaDemo7;

/*
    Function<T,R> 函数型接口
        接口类型：

            @FunctionalInterface
            public interface Function<T, R> {
                R apply(T t);
            }
 */


import java.util.function.Function;

public class LambdaDemo7 {
    public static void main(String[] args) {
        System.out.println(fun("hello", e -> e.length()));
    }

    public static int fun(String s, Function<String, Integer> function) {
        return function.apply(s);
    }
}
