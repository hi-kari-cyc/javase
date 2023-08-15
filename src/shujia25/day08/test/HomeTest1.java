package shujia25.day08.test;

import java.util.Scanner;
/*
        1.编写程序实现比萨制作。需求说明编写程序，接收用户输入的信息，选择需要制作的比萨。可供选择的比萨有：培根比萨和海鲜比萨。
            实现思路及关键代码
            1)分析培根比萨和海鲜比萨
            2)定义比萨类
            3)属性：名称、价格、大小
            4)方法：展示
            5)定义培根比萨和海鲜比萨继承自比萨类
            6)定义测试类，根据输入信息产生具体的比萨对象

 */

abstract class Pizza {
    private String name;
    private int price;
    private int size;

    public Pizza() {
    }

    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void material();

}


class PeiPizza extends Pizza {
    private int gram;

    public PeiPizza(String name, int price, int size, int gram) {
        super(name, price, size);
        this.gram = gram;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public void material() {
        System.out.println("培根克数：" + getGram() + "克");
    }
}

class HaiPizza extends Pizza {
    private String mixture;

    public HaiPizza(String name, int price, int size, String mixture) {
        super(name, price, size);
        this.mixture = mixture;
    }

    public String getMixture() {
        return mixture;
    }

    public void setMixture(String mixture) {
        this.mixture = mixture;
    }

    @Override
    public void material() {
        System.out.println("配料：" + getMixture());
    }
}

class PizzaTool {

    public PizzaTool() {
    }

    public static void makePizza(Pizza pizza) {
        System.out.println("名称：" + pizza.getName());
        System.out.println("价格：" + pizza.getPrice() + "元");
        System.out.println("大小：" + pizza.getSize() + "寸");
        pizza.material();
    }
}


public class HomeTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请选择想要制作的披萨（1.培根披萨 2.海鲜披萨）：");
        int num = sc.nextInt();
        if (num == 1) {
            String name1 = "培根披萨";
            System.out.println("请输入培根克数：");
            int gram = sc.nextInt();
            System.out.print("请输入披萨大小：");
            int size = sc.nextInt();
            System.out.print("请输入披萨价格：");
            int price = sc.nextInt();

            Pizza p1 = new PeiPizza(name1, price, size, gram);
            PizzaTool.makePizza(p1);

        } else if (num == 2) {
            String name2 = "海鲜披萨";
            System.out.println("请输入配料信息：");
            String s = sc.next();
            System.out.print("请输入披萨大小：");
            int size = sc.nextInt();
            System.out.print("请输入披萨价格：");
            int price = sc.nextInt();

            Pizza p2 = new HaiPizza(name2, price, size, s);
            PizzaTool.makePizza(p2);

        } else {
            System.out.println("您的输入有误！");
        }
    }
}