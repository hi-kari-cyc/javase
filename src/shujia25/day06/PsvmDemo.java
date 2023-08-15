package shujia25.day06;

/*
    main方法上的参数使用场景：
        1、JDK1.5之前，还没有出现Scanner，就借助于这个args进行传参
        2、将来程序会打包放置集群中运行，使用命令行的方式启动，args就可以接收命令行传入的参数
 */


public class PsvmDemo {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
