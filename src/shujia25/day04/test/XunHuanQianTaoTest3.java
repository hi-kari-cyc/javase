package shujia25.day04.test;

/*

    需求：在控制台输出九九乘法表。

    输出九九乘法表时，考虑空格问题。
	用\t解决。这个时候，提出转移字符的概念。
	\t:一个制表符的位置。tab

 */

public class XunHuanQianTaoTest3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {        // 外层for循环控制的是行数
            for (int j = 1; j <= i; j++) {    // 内层for循环控制的是列数
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println(" ");
        }
    }
}
