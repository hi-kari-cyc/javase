package shujia25.day06;

/*
    构造方法：每次在对象创建时都会被调用
    语句定义格式：
        方法名和类名一致，没有返回值类型，连void都不能有
 */

class Student {

    private String name;
    private int age;

    // 构造方法1:无参构造方法 成员变量默认初始化
    public Student() {
        System.out.println("姓名：" + name + " 年龄：" + age);
    }

    // 构造方法2:带有参数的构造方法 成员变量显示初始化
    public Student(String name, int age) {
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
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
}

public class StudentTest {
    public static void main(String[] args) {

        // 调用方法1
        Student s0 = new Student();

        // 调用方法2
        Student s1 = new Student("cyc",20);
        s1.show();

        // 成员变量赋值
        s1.setName("常允城");
        s1.setAge(21);
        s1.show();
    }
}

