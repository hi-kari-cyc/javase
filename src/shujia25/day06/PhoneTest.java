package shujia25.day06;

class Phone {
    //成员变量
    private String brand;
    private int price;
    private String color;

    //构造方法
    public Phone() {
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.println("品牌：" + brand + " 价格：" + price + " 颜色：" + color);
    }
}


public class PhoneTest {
    public static void main(String[] args) {
        //创建一个手机对象
        Phone p1 = new Phone();
        p1.show();
        p1.setBrand("华为");
        p1.setPrice(8000);
        p1.setColor("白色");
        p1.show();
        System.out.println("-------------------------");
        //使用带参数的构造方法创建对象
        Phone p2 = new Phone("iphone", 6000, "紫色");
        p2.setPrice(8000);
        p2.show();
    }
}


