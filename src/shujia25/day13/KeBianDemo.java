package shujia25.day13;

/*
    可变参数:
            前提：方法的参数如果要使用可变参数的话，可变参数的类型要一样
        可变参数（Varargs）是Java中的一种特殊语法，允许方法接受可变数量的参数。
        它允许你在方法声明中指定一个参数，用于表示一系列相同类型的参数，而无需指定具体的参数个数。
        当某一种类型的参数个数未知时，使用可变参数
 */

public class KeBianDemo {
    public static void main(String[] args) {
        // 1、调用方法求两个数之和
        sum(10, 20);

        // 2、调用方法求三个数之和
        sum(10, 20, 30);

        // 3、调用方法求四个数之和
        sum(10, 20, 30, 40);

        // 4、调用方法求n个数之和
        sum(10, 20, 30, 40, 99, 49, 22, 87, 64, 87, 32, 97);


        //需求：求一个学生的总分
        //学生的姓名，三个科目成绩
        sumScore("张三", 98, 87, 91);

    }

    public static void sum(int... arr) {      // 接收多个int类型的实参，将这多个实参封装成一个数组，数组的名字叫做arr
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }


//    public static void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public static void sum(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//
//    public static void sum(int a, int b, int c, int d) {
//        System.out.println(a + b + c + d);
//    }

    public static void sumScore(String s, int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(s + "的总分为：" + sum);
    }

    //如果一个方法定义有可变参数，必须是最后一个定义，只能存在一个可变参数
//    public static void sumScore0( int... arr,String s) {
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        System.out.println(s + "的总分为：" + sum);
//    }
}
