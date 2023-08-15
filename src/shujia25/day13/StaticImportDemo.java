package shujia25.day13;

/*
    静态导入：使用的方法必须是静态的
    当类中有定义的方法与其他要使用工具类中的静态方法重名的时候，建议不要使用，因为很麻烦

 */

//import static java.lang.Math.max;
//import static java.lang.Math.min;
import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        // Math
        System.out.println(Math.max(12,34));

        // 如果自己的方法和导入的方法重名，要写出完整的语句
        System.out.println(java.lang.Math.max(56,78));

        // 静态导入之和就可以不用再写Math.
        System.out.println(min(56,78));

    }

    public static void max(int a,int b){
        System.out.println("max方法");
    }
}
