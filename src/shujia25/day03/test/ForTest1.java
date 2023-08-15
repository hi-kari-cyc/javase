package shujia25.day03.test;

/*
    请在控制台输出数据1-10
    请在控制台输出数据10-1
    求出1-10之间数据之和
    求出1-100之间偶数和
    求出1-100之间奇数和
    求5的阶乘
    在控制台输出所有的”水仙花数”
    统计”水仙花数”共有多少个

 */
public class ForTest1 {
    public static void main(String[] args) {
        // 请在控制台输出数据1-10
        // 求出1-10之间数据之和
        int res1 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            res1 += i;
        }
        System.out.println(" ");
        System.out.println(res1);


        // 请在控制台输出数据10-1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        // 求出1-100之间偶数和
        // 求出1-100之间奇数和
        int res2 = 0;
        int res3 = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 0) {
                res2 += i;
            } else {
                res3 += i;
            }
        System.out.println("1-100之间偶数和为:" + res2);
        System.out.println("1-100之间奇数和为:" + res3);

        // 求5的阶乘
        int res4 = 1;
        for (int i = 1; i <= 5; i++) {
            res4 *= i;
        }
        System.out.println(res4);

        // 在控制台输出所有的”水仙花数”
        // 统计”水仙花数”共有多少个
        int count = 0;

        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("共有" + count + "个水仙花数");
    }
}
