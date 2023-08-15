package shujia25.day10;

import java.util.Scanner;

/*
            Scanner的构造方法
                Scanner(InputStream source)
                构造一个新的 Scanner ，产生从指定输入流扫描的值
                InputStream 字节输入流
                System类提供的System包括标准输入，标准输出和错误输出流;
                    static InputStream in “标准”输入流。

            基本格式
                hasNextXxx()  判断是否还有下一个输入项,其中Xxx可以是Int,Double等。如果需要判断是否包含下一个字符串，则可以省略Xxx
                nextXxx()  获取下一个输入项。Xxx的含义和上个方法中的Xxx相同
                默认情况下，Scanner使用空格，回车等作为分隔符

            常用方法
                public int nextXxx()
                public String nextLine()
 */

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // System提供了一个InputStream方法  public final static InputStream in = null;
        System.out.println("请输入一个数字：");
        boolean b = sc.hasNextInt();  // 判断下一个输入值是否是int类

        int i;
        if (b) {
            i = sc.nextInt();     // 取值
            System.out.println("数字为" + i);
        } else {
            i = 0;
            System.out.println("输入不正确，默认数字为0");
        }

        System.out.println("请输入一个字符串：");
        String s0 = sc.next();
        System.out.println("您的输入为：" + s0);


        String s = sc.nextLine();  // 可以接收一些特殊字符，如：换行
        System.out.println("您的输入为：" + s);

        // nextLine吞噬回车键解决方案
        // 再创建一个输入管道
        Scanner sc0 = new Scanner(System.in);
        System.out.println("请输入:");
        String s1 = sc0.nextLine();
        System.out.println(s1);
        String s2 = sc0.next();
        System.out.println(s2);

    }
}
/*
        首先，在程序开始执行时，创建了一个 Scanner 对象sc，用于从标准输入读取用户输入的内容。
        程序会打印出提示信息 "请输入一个数字："
        接下来，程序调用Scanner对象的 hasNextInt() 方法，该方法会等待用户输入一个整数，并返回一个布尔值表示是否输入了一个整数。
        用户在控制台输入一个值后,程序会根据用户输入的内容判断是否为整数。
        如果是整数，hasNextInt() 方法返回 true，进入 if 语句块；
        如果不是整数，返回 false，进入 else 语句块。
        如果用户输入的是一个整数，程序会调用 nextInt() 方法从 Scanner 对象中读取输入的整数，并将其赋值给变量 i。
        程序根据输入的情况打印出相应的信息，如果输入的是整数，打印 "数字为"+i；如果输入的不是整数，打印 "输入不正确，默认数字为0"
 */