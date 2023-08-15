package shujia25.day09.test.test2;

/*
        换一种思路：验证接过接口是否还能继承，如果能继承，子类是否能使用接口方法

                      人
       接口——乒乓类             篮球类
     乒乓运动员  乒乓教练  篮球运动员  篮球教练

 */

class Person1{
    private String name;
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {

    }
}

interface Study{
    void study();
}

class Ping extends Person implements Study{
    public Ping() {
    }

    public Ping(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习英语");
    }

    public void show(){
        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
        study();
    }
}

class Lan extends Person{
    public Lan() {
    }

    public Lan(String name, int age) {
        super(name, age);
    }

}

class PingSports extends Ping{
    public PingSports() {
    }

    public PingSports(String name, int age) {
        super(name, age);
    }
}

class PingCoach extends Ping{
    public PingCoach() {
    }

    public PingCoach(String name, int age) {
        super(name, age);
    }
}

class LanSports extends Lan{
    public LanSports(String name, int age) {
        super(name, age);
    }
}

class LanCoach extends Lan{
    public LanCoach(String name, int age) {
        super(name, age);
    }
}

public class InterfaceTest2_2 {
    public static void main(String[] args) {
        PingSports ps = new PingSports("小白", 18);
        PingCoach pc = new PingCoach("老白", 40);
        ps.show();
        pc.show();

        LanSports ls = new LanSports("小黑", 20);
        LanCoach lc = new LanCoach("老黑", 45);
        ls.show();
        lc.show();

    }
}
