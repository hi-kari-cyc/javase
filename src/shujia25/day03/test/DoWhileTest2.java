package shujia25.day03.test;

/*
        看程序写结果
        区分while和do...while的区别

 */
public class DoWhileTest2 {
    public static void main(String[] args) {
        int x = 3;
        do {
            System.out.println("我爱林青霞");
            x++;
        } while (x < 3);
        System.out.println(x);

        System.out.println("=================================");
        int y = 3;
        while (y < 3) {
            System.out.println("我爱林青霞");
            y++;
        }
        System.out.println(y);
    }
}
