package shujia25.day16.HomeTest;

import java.util.*;

/*
    使用List和Map存放多个图书信息，遍历并输出。
    其中商品属性：编号，名称，单价，出版社；使用商品编号作为Map中的key。
 */
public class JiHeTest1 {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<books> booksList = new ArrayList<>();
        // 创建HashMap集合
        HashMap<String, books> booksMap = new HashMap<>();

        // 创建元素对象
        books b1 = new books("0x001", "斗罗大陆", 18.5,"安徽教育出版社");
        books b2 = new books("0x002", "斗破苍穹", 20.0,"新华出版社");
        books b3 = new books("0x003", "猫妖传", 7.9,"中国体育出版社");

        books b4 = new books("斗罗大陆", 18.5,"安徽教育出版社" );
        books b5 = new books("斗破苍穹", 20.0,"新华出版社" );
        books b6 = new books("猫妖传", 7.9,"中国体育出版社" );

        // 将元素加入集合
        booksList.add(b1);
        booksList.add(b2);
        booksList.add(b3);

        booksMap.put("0x001", b4);
        booksMap.put("0x002", b5);
        booksMap.put("0x003", b6);

        // 遍历集合
        Object[] booksArray = booksList.toArray();
        for (Object o : booksArray) {
            System.out.println(o);
        }

        System.out.println("---------------------------------------");
        Set<Map.Entry<String, books>> entries = booksMap.entrySet();
        for (Map.Entry<String, books> entry : entries) {
            String key = entry.getKey();
            books value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}

class books {
    private String id;
    private String name;
    private double price;
    private String press;

    public books() {
    }

    public books(String name, double price, String press) {
        this.name = name;
        this.price = price;
        this.press = press;
    }

    public books(String id, String name, double price, String press) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "books{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        books books = (books) o;
        return Double.compare(books.price, price) == 0 && Objects.equals(id, books.id) && Objects.equals(name, books.name) && Objects.equals(press, books.press);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, press);
    }
}