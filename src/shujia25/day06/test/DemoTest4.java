package shujia25.day06.test;

/*
        定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。

 */

class MyMath {
    // 加
    public int add(int a, int b) {
        return a + b;
    }

    // 减
    public int subtract(int a, int b) {
        return a - b;
    }

    // 乘
    public int multiply(int a, int b) {
        return a * b;
    }

    // 除
    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为零");
        } else {
            System.out.println((double) (a/b));
        }
    }

}

public class DemoTest4 {
    public static void main(String[] args) {
        MyMath num = new MyMath();
        int a = 10;
        int b = 0;

        System.out.println(num.add(a,b));
        System.out.println(num.subtract(a,b));
        System.out.println(num.multiply(a,b));
        num.divide(a,b);
    }
}
