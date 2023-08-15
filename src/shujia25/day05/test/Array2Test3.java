package shujia25.day05.test;

/*

        参数传递问题
            在Java中，方法参数传递采用的是值传递（pass-by-value）方式。当你调用change(a, b)方法时，实际上是将变量a和b的值复制给了方法中的参数a和b。
            在change方法内部对参数进行的操作只会修改方法内部的副本，而不会影响原始的变量a和b。因此，当你在方法外部打印a和b的值时，它们仍然保持原始的值。
            简单来说，方法中对传入的参数进行修改，并不会改变原始变量的值，因为方法中操作的是参数的副本。
            如果你想要修改方法外部的变量，可以考虑将方法返回值用于赋值，或者使用传入对象的引用进行修改。

        值传递 vs 引用传递:
            基本数据类型（如int、char、boolean等）是通过值传递的方式进行参数传递。当将一个基本数据类型作为参数传递给方法时，传递的是该值的副本，对副本的修改不会影响原始值。
            引用数据类型（如数组、对象等）是通过引用传递的方式进行参数传递。
            当将一个引用数据类型作为参数传递给方法时，传递的是该对象的引用（地址），对引用所指向的对象进行的修改会影响原始对象。

        对象的改变 vs 对象内容的改变:
            在基本数据类型的值传递中，方法内对参数的修改不会影响到原始变量。例如，对基本数据类型a进行赋值操作，不会改变原始变量b的值。
            在引用数据类型的引用传递中，方法内对参数所指向的对象进行的修改会影响到原始对象。例如，对数组arr中的元素进行修改，会改变原始数组的内容。
            在给定的代码示例中，第一个change方法是基本数据类型的值传递示例，对参数a和b的修改不会影响到原始变量。
            第二个change方法是引用数据类型的引用传递示例，对参数arr所指向的数组进行修改，会影响到原始数组的内容。


 */
public class Array2Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b); // a:10 b:20
        change(a, b);
        System.out.println("a:" + a + ",b:" + b); // a:10 b:20

        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[1]); // 4
    }

    public static void change(int a, int b) {
        System.out.println("a:" + a + ",b:" + b); // a:10 b:20
        a = b;
        b = a + b;
        System.out.println("a:" + a + ",b:" + b); // a:20 b:40
    }

    public static void change(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                arr[x] *= 2;
            }
        }
    }
}
