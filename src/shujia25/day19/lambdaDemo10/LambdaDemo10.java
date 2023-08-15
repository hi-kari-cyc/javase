package shujia25.day19.lambdaDemo10;

/*
    Interface BiFunction<T,U,R>
 */

import java.util.function.BiFunction;

public class LambdaDemo10 {
    public static void main(String[] args) {
        Dog dog = getDog("小花",3,(name,age)->new Dog(name,age));
        System.out.println(dog);
    }

    public static Dog getDog(String name,int age,BiFunction<String,Integer,Dog> biFunction){
        return biFunction.apply(name,age);
    }
}


