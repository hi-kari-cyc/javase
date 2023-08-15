package shujia25.day02;

/*
    逻辑运算符: & | ! ^ && ||

    参与运算的是布尔类型, 最终结果是布尔类型的
 */
public class LuoJiDemo1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        //& 两边有false则false
        System.out.println((a>3)&(b>4)); // false
        System.out.println((a==3)&(b>4)); // false
        System.out.println((a>3)&(b==4)); // false
        System.out.println((a==3)&(b==4)); // true

        //|  有true则true
        System.out.println((a>3)|(b>4)); // false
        System.out.println((a==3)|(b>4)); // true
        System.out.println((a>3)|(b==4)); // true
        System.out.println((a==3)|(b==4)); //  true

        //!  将true变成false,将false变成true
        System.out.println(!(a>4));

        //^  相同则false,不同则true
        System.out.println((a>3)^(b>4)); // false
        System.out.println((a==3)^(b>4)); // true
        System.out.println((a>3)^(b==4)); // true
        System.out.println((a==3)^(b==4)); // false
    }
}
