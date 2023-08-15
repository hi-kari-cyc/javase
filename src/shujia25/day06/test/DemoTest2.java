package shujia25.day06.test;

/*
        定义一个长方形类,定义 求周长和面积的方法，然后定义一个测试了Test2，进行测试

 */

class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerimeter() {
        return (length + width) * 2;
    }

    public int getSize() {
        return length * width;
    }

    public void show() {
        System.out.println("长方形的周长为：" + getPerimeter());
        System.out.println("长方形的面积为：" + getSize());
    }
}

public class DemoTest2 {
    public static void main(String[] args) {
        //创建一个长方形对象
        Rectangle r1 = new Rectangle(10, 5);
        r1.show();
    }
}
