package shujia25.day03.test;

import java.util.Scanner;

/*
         某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
         加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位(ge)和第四位(qian)交换，第二位(shi)和第三位(bai)交换。

 */
public class HomeTest3 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个四位数：");
        int i = sc.nextInt();
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100 % 10;
        int qian = i / 1000;

        ge = (ge + 5) % 10;
        shi = (shi + 5) % 10;
        bai = (bai + 5) % 10;
        qian = (qian + 5) % 10;

        i = ge * 1000 + shi * 100 + bai * 10 + qian;
        System.out.println("加密后的数字为："+i);

    }
}
