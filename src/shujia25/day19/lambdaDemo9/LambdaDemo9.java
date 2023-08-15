package shujia25.day19.lambdaDemo9;

import java.util.function.Consumer;

/*
    Consumer<T> 消费型接口
        接口类型：

            @FunctionalInterface
            public interface Consumer<T> {
                void accept(T t);
            }
 */
public class LambdaDemo9 {
    public static void main(String[] args) {
        fun(100, e -> System.out.println("您一共消费" + e + "元"));
    }

    public static void fun(int money, Consumer<Integer> consumer) {
        consumer.accept(money);
    }
}
