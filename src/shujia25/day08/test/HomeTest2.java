package shujia25.day08.test;
import java.util.Scanner;
/*
        编写程序实现软料购买：编写程序，接收用户输入的信息，选择购买的饮料。
        可供选择的饮料有：咖啡、矿泉水和可乐。
        其中:
            购买咖啡时可以选择：加糖、加奶还是什么都不加。
            购买可乐时可以选择：买可口可乐还是百事可乐。

 */
abstract class Drink {

    private int volume;
    private String name;

    public Drink(int volume, String name) {
        setVolume(volume);
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("您输入的容量有误！");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void mixture();

    public abstract void show();
}

class Coffee extends Drink {
    private final int idCoffee;

    public Coffee(int volume, String name, int idCoffee) {
        super(volume, name);
        this.idCoffee = idCoffee;
    }


    @Override
    public void mixture() {

        switch (idCoffee) {
            case 1:
                System.out.println("加糖");
                break;
            case 2:
                System.out.println("加奶");
                break;
            case 3:
                System.out.println("什么都不加");
                break;
            default:
                System.out.println("您的输入有误！");
        }
    }

    @Override
    public void show() {
        System.out.println("您购买饮料信息如下。");
        System.out.println("名称：" + getName());
        System.out.print("添加配料：");
        mixture();
        System.out.println("容量：" + getVolume());
    }
}

class Water extends Drink {

    public Water(int volume, String name) {
        super(volume, name);
    }

    @Override
    public void mixture() {
    }

    @Override
    public void show() {
        System.out.println("您购买饮料信息如下。");
        System.out.println("名称：" + getName());
        mixture();
        System.out.println("容量：" + getVolume());
    }
}

class Cole extends Drink {
    private final int idCole;

    public Cole(int volume, String name, int idCole) {
        super(volume, name);
        this.idCole = idCole;
    }

    @Override
    public void mixture() {

        switch (idCole) {
            case 1:
                System.out.println("百事可乐");
                break;
            case 2:
                System.out.println("可口可乐");
                break;
            default:
                System.out.println("您的输入有误！");
        }
    }

    @Override
    public void show() {
        System.out.println("您购买饮料信息如下。");
        System.out.println("名称：" + getName());
        System.out.print("饮料品牌：");
        mixture();
        System.out.println("容量：" + getVolume());
    }
}

public class HomeTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请选择饮料：（1、咖啡 2、矿泉水 3、可乐）");
        int num = sc.nextInt();
        if (num == 1) {
            String name1 = "咖啡";
            System.out.println("请输入购买容量：");
            int volume = sc.nextInt();
            System.out.println("请问是否要配料：(1、加糖 2、加奶 3、什么都不加)");
            int idMixture = sc.nextInt();

            Drink d1 = new Coffee(volume, name1, idMixture);
            d1.show();
        } else if (num == 2) {
            String name2 = "矿泉水";
            System.out.println("请输入购买容量：");
            int volume = sc.nextInt();

            Drink d2 = new Water(volume, name2);
            d2.show();
        } else if (num == 3) {
            String name3 = "可乐";
            System.out.println("请输入购买容量：");
            int volume = sc.nextInt();
            System.out.println("请问你想要什么牌子的可乐：（1、百事可乐 2、可口可乐）");
            int idMixture = sc.nextInt();

            Drink d3 = new Cole(volume, name3, idMixture);
            d3.show();
        } else {
            System.out.println("您的输入有误！");
        }
    }
}