package shujia25.day05;

/*
        我们在学习过程中，一个标准类最终是4.0版本
        现在加入了private关键字，将1.0版本升级到2.0版本
        如何去定义一个2.0版本的类：
        类：
            成员变量：必须使用private关键字修饰
            成员方法：必须提供成员变量对应的公共的setXxx()和getXxx()，特殊情况除外,show()方法展示所有的成员变量
                setXxx()和getXxx()用来操作成员变量，show()仅展示所有的成员变量值
        学生：
            属性：姓名，年龄，性别，班级
            行为：学习，吃，睡


 */
class Student3 {
    // 定义成员变量
    private String name;
    private int age;
    private String gender;
    private String classes;

    // 定义成员方法
    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setAge(int i) {
        age = i;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String s) {
        gender = s;
    }

    public String getGender() {
        return gender;
    }

    public void setClasses(String s) {
        classes = s;
    }

    public String getClasses() {
        return classes;
    }

    // 展示成员变量的情况
    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("班级：" + classes);
    }
}

public class Student3Test {
    public static void main(String[] args) {
        // 创建一个Student3类的对象
        Student3 s1 = new Student3();

        // 对成员变量进行赋值
//        s1.name = "xxx";
        s1.setName("小黑");
        s1.setAge(18);
        s1.setGender("男");
        s1.setClasses("25期");

        // 获取成员变量并打印
//        System.out.println("姓名："+s1.getName());
//        System.out.println("年龄："+s1.getAge());
//        System.out.println("性别："+s1.getGender());
//        System.out.println("班级："+s1.getClasses());
        s1.show();

    }
}