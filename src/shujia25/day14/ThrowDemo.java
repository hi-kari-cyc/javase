package shujia25.day14;

/*
    throw 作用在方法的内部，后面跟的是异常对象，表示一定会出现某种异常
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
