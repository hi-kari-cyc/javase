package shujia25.day05;

/*
        手机：
            属性：品牌，价格，颜色
            行为：打电话，发短信，学习
 */
class Phone {
    // 成员变量
    String brand;
    int price;
    String color;

    // 成员方法
    public void call(String n) {
        System.out.println("打电话给" + n);
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }

    public String study() {
        System.out.println("学习");
        return "快乐";
    }
}

public class PhoneDemo {
    public static void main(String[] args) {
        // 通过手机类创建一个手机对象
        Phone p1 = new Phone();

        // 对变量赋值并输出
        p1.brand = "华为";
//        p1.brand = 12.34    赋值的时候类型要对应上
        p1.price = 5000;
        p1.color = "黑色";
        System.out.println("品牌" + p1.brand);
        System.out.println("价格" + p1.price);
        System.out.println("颜色" + p1.color);

        p1.call("me");
        p1.sendMessage();

        String s1 = p1.study();   // 找个变量接收返回值
        System.out.println(s1);

        System.out.println("===================================");
        // 再创建一个对象
        Phone p2 = p1;
        System.out.println("品牌" + p2.brand);
        System.out.println("价格" + p2.price);
        System.out.println("颜色" + p2.color);

        p1.call("me");
        p1.sendMessage();
        String s2 = p1.study();
        System.out.println(s2);

        System.out.println("======================================");

        // 对p2作修改
        p2.brand = "苹果";
        p2.price = 6000;
        p2.color = "白色";

        // 输出p1变量
        System.out.println("品牌" + p1.brand);
        System.out.println("价格" + p1.price);
        System.out.println("颜色" + p1.color);

        // p1的变量值改变了，因为class是引用数据类型
    }
}

