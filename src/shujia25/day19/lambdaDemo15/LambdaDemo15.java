package shujia25.day19.lambdaDemo15;

import shujia25.day13.Inter;

import java.util.Arrays;

/*
    假如我们的 Lambda 表达式符合如下格式：
    (变量) -> new 元素类型[变量]
    我们就可以简写成如下格式：
    元素类型[] :: new

 */
@FunctionalInterface
interface Inter11 {
    String[] fun(int count);
}


public class LambdaDemo15 {
    public static void main(String[] args) {
//        Inter11 inter11 = (e) -> new String[e];
        Inter11 inter11 = String[]::new;

        System.out.println(Arrays.toString(inter11.fun(5)));
    }
}
