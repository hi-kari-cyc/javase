package shujia25.day03.test;

/*

    需求：在控制台输出九九乘法表。

    输出九九乘法表时，考虑空格问题。
	用\t解决。这个时候，提出转移字符的概念。
	\t:一个制表符的位置。tab

 */
public class XunHuanQianTaoTest3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println(" ");
        }
    }
}
