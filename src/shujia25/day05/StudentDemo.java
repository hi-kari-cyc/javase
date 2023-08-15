package shujia25.day05;

/*
    学生：
        属性：学号，姓名，年龄，性别
        行为：学习，吃饭

    属性---成员变量：在类中方法外定义，定义格式和之前一样，这里可以不用自己赋值
    行为---成员方法：和我们之前说的方法语句定义格式一样，只不过现在先把static去掉

 */
class Student {
    // 定义成员变量
    String id;
    String name;
    int age;
    String gender;

    // 定义成员方法
    public void study() {
        System.out.println("学习");
    }

    public void eat() {
        System.out.println("吃饭");
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        // 我们现在已经创建出了学生类，现在想要根据学生类创建学生对象
        // 创建对象的语句格式：
        //      类名 对象名 = new 类名(...);
        Student s1 = new Student();

        // 如何通过对象获取成员变量
        // 对象名.成员变量名
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.name = "cyc";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);

        // 如何通过对象调用方法
        // 对象名.方法名(...)
        s1.study();
        s1.eat();
    }
}