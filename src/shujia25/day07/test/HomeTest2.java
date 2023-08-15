package shujia25.day07.test;

/*
2.请使用面向对象的思想，设计自定义类，描述出租车和家用轿车的信息。
设定
    1)出租车类:
        属性包括：车型，车牌，所属出租公司；方法包括：启动，停止
    2)家用轿车类：
        属性包括：车型，车牌，车主姓名；方法包括：启动，停止
    要求
        1)分析出租车和家用轿车的公共成员，提取出父类—汽车类
        2)利用继承机制，实现出租车类和家用轿车类
        3)编写测试类，分别测试汽车类，出租车类和家用轿车类对象的相关方法
        4)定义名为 car 的包存放汽车类，出租车类，家用轿车类和测试
 */

class Car{
    String carType;
    String carPlate;

    public Car(String carType, String carPlate) {
        this.carType = carType;
        this.carPlate = carPlate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public void start(){
        System.out.println("我是车，我启动");
    }

    public void stop(){
        System.out.println("我是车，我停止");
    }
    public void show(){
        start();
        stop();
    }
}

class TaxiCar extends Car{

    private String carCompany;

    public TaxiCar(String carType, String carPlate,String carCompany) {
        super(carType, carPlate);
        this.carCompany = carCompany;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public void start(){
        System.out.println("乘客你好");
        System.out.println("我是"+carCompany+"的，我的车牌是"+carPlate+"，您要去哪里?");
    }

    public void stop(){
        System.out.println("目的地已经到了，请你付费下车，欢迎再次乘坐");
    }
}

class HomeCar extends Car{

    private String hostName;

    public HomeCar(String carType, String carPlate,String hostName) {
        super(carType, carPlate);
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void start(){
        System.out.println("我是"+hostName+"，我的汽车我做主");
    }
    public void stop(){
        System.out.println("目的地到了，我们去玩吧");
    }
}

public class HomeTest2 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马","皖A88888");
        car1.show();
        System.out.println("===================");
        HomeCar car2 = new HomeCar("奔驰","皖K88888","你爸爸");
        car2.show();
        System.out.println("===================");
        TaxiCar car3 = new TaxiCar("大众", "皖A66666", "景顺出租车公司");
        car3.show();
    }
}
