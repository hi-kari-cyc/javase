package shujia25.day06.test;

/*
        2.以面向对象的思想，编写自定义类描述 IT 从业者。设定属性包括：姓名，年龄， 技术方向，工作年限, 工作单位和职务；方法包括：工作
        要求：
            1)设置属性的私有访问权限，通过公有的 get,set 方法实现对属性的访问
            2)限定 IT 从业人员必须年满 15 岁，无效信息需提示，并设置默认年龄为 15。
            3)限定“技术方向”是只读属性(只提供 get 方法)
            4)工作方法通过输入参数，接收    工作单位和职务    ，输出个人工作信息
            5)编写测试类，测试 IT 从业者类的对象及相关方法（测试数据信息自定义）


 */
public class HomeDemo2 {
    private String name;
    private int age;
    private final String direction;
    private int seniority;
    private String unit;
    private String job;

    public HomeDemo2(String name, int age, String direction, int seniority) {
        this.name = name;

        this.direction = direction;
        this.seniority = seniority;

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
        if (age > 15) {
            this.age = age;
        } else {
            System.out.println("从业人员必须年满 15 岁,输入无效,以默认年龄为15。");
            this.age = 15;
        }
    }

    public String getDirection() {
        return direction;
    }


    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public void work(String unit, String job) {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + getAge());
        System.out.println("技术方向：" + direction);
        System.out.println("工作年限：" + seniority);
        System.out.println("目前就职于：" + unit);
        System.out.println("职务是：" + job);
    }
}

class HomeTest2{
    public static void main(String[] args) {
        HomeDemo2 it1 = new HomeDemo2("马未龙",35, "数据库维护", 10);
        it1.work("腾讯实业","数据库维护工程师");
        System.out.println("===============================");
        HomeDemo2 it2 = new HomeDemo2("张凯",10, "java开发", 1);
        it2.work("鼎盛科技","java开发工程师");
    }
}