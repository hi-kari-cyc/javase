package shujia25.day02;

/*
    && 有false则false, 短路与,当左边表达式结果为false的时候,右边表达式不参与运算
    || 有true则true, 短路或,当左边表达式结果为true的时候,右边表达式不参与运算
 */
public class LuoJiDemo2 {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        //&&
//        System.out.println((a++) == 4 && (b++) == 4); // false
//        System.out.println("a: " + a);  // 4
//        System.out.println("b: " + b);  //

        System.out.println((a++) == 4 || (b++) == 4); // true
        System.out.println("a: " + a);  // 4
        System.out.println("b: " + b);  //

/*
        &&,||和&以及|的区别
        结果相同，但是有短路效果，一般建议使用&&,||
 */
    }
}