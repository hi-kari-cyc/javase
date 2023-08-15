package shujia25.day19.lambdaDemo5;

/*
    格式5：若 Lambda 体中只有一条语句， return 和 大括号都可以省略不写
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@FunctionalInterface
interface Inter5 {
    int show();
}


public class LambdaDemo8 {
    public static void main(String[] args) {
        //需求：随机生成若干个随机数1-100
        List<Integer> list = fun(10, () -> new Random().nextInt(100) + 1);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static List<Integer> fun(int count, Inter5 inter5) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int show = inter5.show();
            list.add(show);
        }
        return list;
    }
}
