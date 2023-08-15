package shujia25.day14;

/*
    final,finally和finalize的区别
    如果catch里面有return语句，请问finally的代码还会执行吗? 会
    如果会，请问是在return前还是return后。之间
 */

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println(getNum());   // a = 40
        System.out.println(getNumber());
        // 执行顺序:try-->catch(return)-->finally
        // 最后的return是用来防止程序没有错误
    }

    public static int getNum(){
        int a = 10;
        try {
            a = 20;
        }catch (Exception e){
            a = 30;
            return a;
        }finally {
            a = 40;
        }
        return a;
    }

    public static int getNumber(){
        int a = 10;
        int b = 0;

        try {
            a = 20;
            System.out.println(a/b);
        }catch (Exception e){
            a = 30;
            return a;  // 30
        }finally {
            a = 40;
            System.out.println(a);  //  40
//            return a;
        }
        return a;
    }
}
