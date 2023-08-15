package shujia25.day03.test;

/*
        需求：请输出如下图形
                *
                **
                ***
                ****
                *****

        看列数是如何变化的
        y的变化和x是相关的。

        我们还可以输出一个倒三角形。
 */
public class XunHuanQianTaoTest2 {
    public static void main(String[] args) {
        // 正三角
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("==========================");
        // 倒三角
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
