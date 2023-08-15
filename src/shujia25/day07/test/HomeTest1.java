package shujia25.day07.test;

/*

        1.编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示  圆半径、圆面积、圆周长，圆柱体的体积。（7 分）
        提示:
        （1）编写一个圆类 Circle，该类拥有：
            1)一个成员变量，radius（私有，浮点型）;//存放圆的半径；

            2)两个构造方法
                Circle（）	//将半径设为 0
                Circle（double	r  ）	//创建 Circle 对象时将半径初始化为 r
            3)三个成员方法
                double getArea（）	//获取圆的面积double getPerimeter（）		//获取圆的周长
                void show（）	//将圆的关径、周长、面积输出到屏幕
        （2）编写一个圆柱体类 Cylinder，它继承于上面的 Circle 类。还拥有：
            1)一个成员变量，double hight	（私有，浮点型）;	//圆柱体的高；
            2)构造方法
                //创建 Cylinder 对象时将半径初始化为 r,高度初始化为 h Cylinder（double r,double h）
            3)成员方法
                double getVolume（）	//获取圆柱体的体积
                void showVolume（）	//将圆柱体的体积输出到屏幕

 */
class Circle {
    private double radius; // 存放圆的半径

    Circle() {
    }

    Circle(double r) {
        setRadius(r);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("请输入有效半径");
        }
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double getPerimeter(double radius) {
        return Math.PI * 2 * radius;
    }

    void show() {
        System.out.println("圆的半径为：" + radius);
        System.out.println("圆的周长为：" + getPerimeter(radius));
        System.out.println("圆的面积为：" + getArea(radius));
    }
}

class Cylinder extends Circle {
    private double hight;

    public Cylinder() {
    }

    public Cylinder(double r, double h) {
        super.setRadius(r);
        setHight(h);
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        if (hight > 0) {
            this.hight = hight;
        } else {
            System.out.println("请输入有效高度！");
        }
    }

    public double getVolume() {
        return getArea(getRadius()) * hight;
    }

    public void show() {
        System.out.println("圆柱体的体积为：" + getVolume());
    }
}

public class HomeTest1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        c1.show();
        Cylinder c2 = new Cylinder(1, 1);
        c2.show();
    }
}
