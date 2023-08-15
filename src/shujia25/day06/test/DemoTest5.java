package shujia25.day06.test;
import java.util.Scanner;
/*
        Math类讲解一个方法
            获取随机数
            获取1-100之间的随机数
            猜数字小游戏

 */

public class DemoTest5 {
    public static void main(String[] args) {
//        int res =  (int) (Math.random() * 100 + 1);
//        System.out.println(res);

        // 随机在1-100之间随机生成一个数字
        int num = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("请输入一个数字：");
            int i = sc.nextInt();
            if (i>num){
                System.out.println("您输入的数较大！");
            } else if (i < num) {
                System.out.println("您输入的数较小！");
            }else {
                System.out.println("恭喜你猜中了！");
                break;
            }
            count ++;
        }
        System.out.println("猜了"+count+"次。");
    }
}

