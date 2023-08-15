package shujia25.day02;

/*
    看代码说明原因

    自动类型转换:
        byte、short 和 char 类型在表达式中会被提升为 int 类型。
        当操作数中包含不同的数据类型时，会将其中较低的数据类型自动提升为较高的数据类型。
        自动提升的数据类型顺序为：byte → short → int → long → float → double。

    强制类型转换:
        语句定义格式:  目标数据类型 变量名 = (目标数据类型)(要转的表达式或者值);
        当用小的数据类型接受大的数据类型的时候,需要强制类型转换.但是不推荐大量的使用,有可能会损失精度,推荐是什么类型就用什么类型接受
 */
public class DataTypeDemo2 {
    public static void main(String[] args) {
        //两个int类型的数据相加
        int a = 10;
        int b = 20;
        System.out.println(10 + 20);  //如果加号两边任意一边是字符串类型，就做字符串拼接运算，否则就是加法运算
        //额外定义一个变量存储两数之和
        int c = a + b;
        System.out.println(c);

        //一个byte类型与一个int类型相加
        byte a2 = 3;
        int b2 = 4;
//      byte c2 = a2 + b2;    a2会自动提升数据类型
        byte c2 = (byte) (a2 + b2);
        System.out.println(c2);
    }
}
