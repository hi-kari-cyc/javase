package shujia25.day02;

/*
    byte b = 130;有没有问题?如果我想让赋值正确，可以怎么做?结果是多少呢?

 */
public class DataTypeDemo4 {
    public static void main(String[] args) {
        byte b = (byte)(130);
        System.out.println(b); // -126

    }
}

/*
    计算机内部都是采用补码的形式参与运算的,整数默认是int类型的
    130的原码,反码,补码: 00000000 00000000 00000000 10000010
    强制类型转换后: 10000010
    已知补码求原码:
            符号位     数值位
    补码:      1       0000010
    反码:      1       0000001
    原码:      1       1111110
    --------------------------
    64+32+16+8+4+2 = 126
    最终结果是:  -126


 */
