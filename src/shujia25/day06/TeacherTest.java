package shujia25.day06;

class Teacher {
    private String name = "cyc";
    private int age = 18;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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
        System.out.println("姓名：" + name + ", 年龄：" + age);
    }
}
public class TeacherTest {
    public static void main(String[] args) {
        Teacher t0 = new Teacher();
        t0.show();
        Teacher t1 = new Teacher("小虎", 18);
        t1.show();
    }
}