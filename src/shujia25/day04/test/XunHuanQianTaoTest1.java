package shujia25.day04.test;

/*
    需求：请输出一个4行5列的星星(*)图案。


    注意：
	在这里说一下如何输出语句print()和println()的区别。
	还有就是空输出语句println()可以实现换行。

	总结出：外循环控制行，内循环控制列。

 */

public class XunHuanQianTaoTest1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
