package shujia25.day06.test;

/*
        定义一个员工类,自己分析出几个成员，然后给出成员变量，构造方法，getXxx()/setXxx()方法，以及一个显示所有成员信息的方法。并测试。

        属性：姓名，年龄，性别
        方法：显示所以成员信息
 */

class Staff {
    private String name;
    private int age;
    private String gender;

    public Staff() {

    }

    public Staff(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + gender);
    }
}

public class DemoTest3 {
    public static void main(String[] args) {
        Staff s1 = new Staff();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");
        s1.show();

        Staff s2 = new Staff("李四", 20, "男");
        s2.show();
    }
}
