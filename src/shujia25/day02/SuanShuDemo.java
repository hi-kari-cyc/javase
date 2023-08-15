package shujia25.day02;

/*
    算术运算符:
        +  - * /  %  ++ --
 */
public class SuanShuDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);  //取整数部分
        System.out.println(a%b);  //取小数部分


        //需求: 我就想3除以4有小数部分,怎么办?
        //注意: 表达式的计算结果最终数据类型,是由参与运算的最大的数据类型决定的
        System.out.println(a*1.0/b);


/*
    算术运算符:
        ++(自加1) 当++在变量的后面的时候,先做赋值运算,再做自加1运算,如果在前,先做自加1运算,再做赋值运算
        --(自减1) 当--在变量的后面的时候,先做赋值运算,再做自减1运算,如果在前,先做自减1运算,再做赋值运算
 */

        //单独使用的时候,对某一变量做++或者--
//        System.out.println(10++);
        int c = 3;

        int d = ++c;
        System.out.println("c: " + c); // 4
        System.out.println("d: " + d); // 4

        int a1 = 4;
        int b1 = (a1++)+(++a1)+(a1*10);
        // b1      4       6      60
        // a1      5       6      6
        System.out.println("a1:"+a1);
        System.out.println("b1:"+b1);


    }
}
