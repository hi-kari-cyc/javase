package shujia25.day03.test;

/*
    请在控制台输出满足如下条件的五位数:
        个位等于万位
        十位等于千位
        个位+十位+千位+万位=百位

 */
public class ForTest2 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000;
            if (ge == wan & shi == qian & bai == ge + shi + qian + wan) {
                System.out.println("满足条件的五位数为:" + i);
            }
        }
    }
}
