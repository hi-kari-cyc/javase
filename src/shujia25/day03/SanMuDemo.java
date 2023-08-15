package shujia25.day03;

/*
    三目运算符（三元运算符）

    语句定义格式:(关系表达式)?表达式1:表达式2;
    当关系表达式位true的时候执行表达式1，当关系表达式位false的时候执行表达式2;

    注意事项：
        1、三目运算符必须要有返回值，定义一个变量接收，表达式不能是一个输出语句
        2、注意三目运算符的返回值类型，取决于表达式的最大数据类型
 */
public class SanMuDemo {
    public static void main(String[] args) {
        // 求出两个数中的最大值
        int a = 3;
        double b = 4.0;
        double c = (a > b) ? a : b;
        System.out.println("两个数中较大的是：" + c);

    }
}
