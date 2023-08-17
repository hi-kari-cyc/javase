package shujia25.day14;

/*
    异常处理的第二种方式：throws 作用在方法的定义上,throws后面跟的是类名，表示将来方法内部可能会出现某种异常
    方法内部如果出现了异常，内部不做处理，由throws抛给 调用者 进行处理

    方法中有错误，在方法定义时加上抛出异常，调用的时候用Alt+Enter 快捷键调用异常处理
    也可以在main方法中加上抛出异常，抛给Java虚拟机
    但问题依旧没有解决，当出现问题时，后续的代码不会执行，因为JVM的默认处理方式就是程序停止报错
 */

public class ThrowsDemo {
    public static void main(String[] args) throws Exception{
//        try {
//            getNum();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        // 开发的时候有错误抛到测试类中解决

        getNum();

        System.out.println("===========================");
    }

    public static void getNum() throws Exception{
        int a = 10;
        int b = 0;
        System.out.println(a/b);

    }
}
