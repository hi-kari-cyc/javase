package shujia25.day06.test;

/*
        1.以面向对象的思想，编写自定义类描述图书信息。设定属性包括：书名，作者，出版社名，价格；方法包括：信息介绍 show()
            要求：
            1)设置属性的私有访问权限，通过公有的 get,set 方法实现对属性的访问
            2)限定价格必须大于 10，如果无效进行提示
            3)限定作者，书名为只读属性
            4)设计构造方法实现对属性赋值
            5)信息介绍方法描述图书所有信息
            编写测试类，测试图书类的对象及相关方法（测试数据信息自定）

 */
public class HomeDemo3 {
    private final String bookName;
    private final String author;
    private String pressName;
    private double price;

    public HomeDemo3(String bookName, String author, String pressName,double price) {
        this.bookName = bookName;
        this.author = author;
        this.pressName = pressName;
        setPrice(price);
    }

    public String getBookName() {
        return bookName;
    }


    public String getAuthor() {
        return author;
    }


    public String getPressName() {
        return pressName;
    }

    public void setPressName(String pressName) {
        this.pressName = pressName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 10) {
            this.price = price;
        } else {
            System.out.println("价格必须大于10，输入无效！");
            this.price = 0.0;
        }
    }

    public void show() {
        System.out.println("书名：" + bookName);
        System.out.println("作者：" + author);
        System.out.println("出版社：" + pressName);
        System.out.println("价格：" + price + "元");
    }
}

class HomeTest3 {
    public static void main(String[] args) {
        HomeDemo3 book1 = new HomeDemo3("鹿鼎记", "金庸", "人民文学出版社",150.0);
        book1.show();
        System.out.println("=====================");
        HomeDemo3 book2 = new HomeDemo3("绝代双骄", "古龙", "中国长安出版社",55.5);
        book2.show();
    }
}