package shujia25.day03;
import java.util.Scanner;

/*
    switch选择语句：
    语句定义格式：
        switch(表达式){
            case 常量值1:表达式1:break;
            case 常量值2:表达式2:break;
            case 常量值3:表达式3:break;
            case 常量值4:表达式4:break;
            case 常量值5:表达式5:break;
            ...
            default:表达式n;break;
        }
    执行顺序：
        1、先计算小括号中的表达式的值，表达式的取值：byte,short,int,char，JDK5以后可以是枚举，JDK7以后可以是String。
        2、拿着计算出的值去匹配对应的case语句后面的常量值，如果有对应匹配上的常量值，就执行对应的语句体，执行完后，若遇到break,结束整个switch语句。
        3、若所有的case都不匹配，那么就会执行default语句后面的语句体，若遇到break,结束整个switch语句。

    使用switch语句的注意事项：
        1、case后面的值能不能换成变量？不能！！
        2、default能否不写？可以不写，但是程序不够严谨
        3、break语句能否不写？可以不写，但是输出的结果可能不是你想要的，会发生switch穿透
        4、default一定要写在最后吗？不一定，可以放在任意位置。

 */
public class SwitchDemo {
    public static void main(String[] args) {
        //情况：所带的金额正好是买一瓶饮料的价格
        //可乐 3元，红牛 5元，脉动 4元，魔爪 6元，农夫山泉 2元。
        System.out.println("请输入您所带的金额：");
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

//        int a = 5;
        switch (money){

            case 2:
                System.out.println("欢迎购买农夫山泉！！");
                break;
            case 3:
                System.out.println("欢迎购买可乐！！");
                break;
            default:
                System.out.println("没有对应金额的饮料。。。");
                break;
            case 4:
                System.out.println("欢迎购买脉动！！");
                break;
            case 5:
                System.out.println("欢迎购买红牛！！");
                break;
            case 6:
                System.out.println("欢迎购买魔爪！！");
                break;
        }
    }
}
/*
        if语句使用场景：
            针对结果是boolean类型的判断
            针对一个范围的判断
            针对几个常量值的判断
        switch语句使用场景：
            针对几个常量值的判断

 */