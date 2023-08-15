package shujia25.day03.test;

/*
        我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
        请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?

 */
public class WhileTest2 {
    public static void main(String[] args) {
        // 定义初始化条件语句
        double d = 0.01;
        int count = 0;
        // while中存放 判断条件语句
        while (d<=8848){
            // 循环体语句
            count ++;
            // 控制条件语句
            d *= 2;
        }
        System.out.println("折叠了"+count+"次");
        System.out.println("此时纸张的厚度为:"+d);
    }
}
