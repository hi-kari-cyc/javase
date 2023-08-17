package shujia25.day14;


/*
    异常：指的是java程序在编译或者运行过程中出现的错误
    java中的异常分类：

        Error：
            Error 类表示严重的问题，通常是由于虚拟机内部错误或系统资源耗尽等导致的。
            例如，OutOfMemoryError 表示内存不足，StackOverflowError 表示堆栈溢出等。与异常不同，一般情况下不需要程序显式地处理或捕获错误。

        Exception：
            Exception 是 Error 的子类，它是表示程序可能遇到的各种异常情况的基类。在 Exception 类中，有两个主要的子类，分别是：
            编译时异常（Checked Exception）：
                这些异常在编译代码时必须显式处理或声明抛出，否则编译器会报错。
                例如，IOException 表示输入输出操作可能出现的异常。
            运行时异常（RuntimeException）：
                这些异常是在运行时可能发生，但不强制要求显式地处理或声明抛出。
                例如，NullPointerException、ArrayIndexOutOfBoundsException 等都属于运行时异常。

    有一天，班长要去爬大蜀山，骑共享单车去，扫了一辆共享单车，扫开之后发现，没电。（编译时期的问题）
    于是换了一辆，开始骑车，骑到半路，车爆胎了。（运行时期问题）
    补胎结束后，继续骑车，骑到半山腰，山崩塌了，堵住了前面的路。（Error）

 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        System.out.println(a/b);  // ArithmeticException

        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[6]); // ArrayIndexOutOfBoundsException

        System.out.println("好好学习，天天向上");  // 前面报错，后面代码不会执行
    }
}
