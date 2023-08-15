package shujia25.day03.test;

import java.util.Scanner;

/*
        键盘录入字符串，根据给定的字符串，来输出你选择的字符串是什么?(表达式是字符串的情况)
        货品： 可乐    雪碧    矿泉水    牛奶
        id：  987     654    321     000

 */
public class SwitchTest2 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你想获取的货品id:");
        String id = sc.next();
        switch(id){
            case "987":
                System.out.println("可乐");
                break;
            case "654":
                System.out.println("雪碧");
                break;
            case "321":
                System.out.println("矿泉水");
                break;
            case "000":
                System.out.println("牛奶");
                break;
            default:
                System.out.println("请输入正确id!");
                break;
        }
    }
}
