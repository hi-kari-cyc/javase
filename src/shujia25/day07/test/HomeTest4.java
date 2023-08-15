package shujia25.day07.test;

/*
        1.请用面向对象的思想，设计自定义类描述演员和运动员的信息 设定
            1)演员类:
                属性包括：姓名，年龄，性别，毕业院校，代表作 方法包括：自我介绍
            2)运动员类：
                属性包括：姓名，年龄，性别，运动项目，历史最好成绩 方法包括：自我介始
            要求
            3)分析演员和运动员的公共成员，提取出父类—人类
            4)利用继承机制，实现演员类和运动员类
            5)编写测试类，分别测试人类，演员类和运动员类对象及相关方法
            定义名为 act 的包存人类，演员类，运动员类和测试

 */

class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
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
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("年龄输入不正确，默认18");
            this.age = 18;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void show() {
        System.out.println("我就是一个普通老百姓");
    }
}

class Performer extends Person {
    private String colleges;
    private String works;

    public Performer(String name, int age, String colleges, String works) {
        super(name, age);
        this.colleges = colleges;
        this.works = works;
    }

    public String getColleges() {
        return colleges;
    }

    public void setColleges(String colleges) {
        this.colleges = colleges;
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
    }

    public void show() {
        System.out.println("大家好！" + "我是" + getName());
        System.out.println("今年" + getAge());
        System.out.println("我毕业于：" + colleges);
        System.out.println("代表作有：" + works);
    }
}

class Sportsman extends Person {
    private String sport;
    private String result;

    public Sportsman(String name, int age, String sport, String result) {
        super(name, age);
        this.sport = sport;
        this.result = result;
    }


    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void show() {
        System.out.println("大家好！" + "我是" + getName());
        System.out.println("今年" + getAge());
        System.out.println("我毕业于：" + sport);
        System.out.println("代表作有：" + result);

    }
}

public class HomeTest4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        System.out.println("======================");
        Sportsman sportsman = new Sportsman("刘小翔", 23, "200米短跑", "22秒30");
        sportsman.show();

        System.out.println("======================");
        Performer performer = new Performer("章依", 27, "北京电影学院", "《寄往天国的家书》");
        performer.show();
    }
}
