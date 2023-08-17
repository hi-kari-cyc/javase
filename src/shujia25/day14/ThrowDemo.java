package shujia25.day14;

/*
    throw 关键字用于在方法内部抛出异常。它后面通常跟着一个异常对象，表示您希望在当前方法中抛出特定类型的异常

    throw和throws的区别：
        throws：
            用在方法声明后面，跟的是异常类名
            可以跟多个异常类名，用逗号隔开
            表示抛出异常，由该方法的调用者来处理
            throws表示出现异常的一种可能性，并不一定会发生这些异常
        throw：
            用在方法体内，跟的是异常对象名
            只能抛出一个异常对象名
            表示抛出异常，由方法体内的语句处理
            throw则是抛出了异常，执行throw则一定抛出了某种异常
 */

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            getNum();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getNum() throws Exception{
        int a = 10;
        int b = 0;
        if(b==0){
            throw new ArithmeticException();
        }else {
            System.out.println(a/b);
        }

    }
}
