package shujia25.day19.lambdaDemo8;

/*
    Supplier<T> 供给型接口
    //需求：随机生成若干个随机数1-100
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class LambdaDemo8 {
    public static void main(String[] args) {
        List<Integer> list = fun(10, () -> new Random().nextInt(100) + 1);
        System.out.println(list);
    }

    public static List<Integer> fun(int count, Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Integer integer = supplier.get();
            list.add(integer);
        }
        return list;
    }
}
