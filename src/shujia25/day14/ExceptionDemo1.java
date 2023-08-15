package shujia25.day14;


/*
    异常：指的是java程序在编译或者运行过程中出现的错误
    java中的异常分类：
        Error：错误
        Exception：异常
            RuntimeException：运行时期异常
            除RuntimeException以外的：编译时期异常


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
