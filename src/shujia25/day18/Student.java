package shujia25.day18;

public class Student {
    public String name;
    protected int age;
    String address;
    private String like;


    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fun1() {

    }

    public void fun2(String s) {
        System.out.println(s);
    }

    private void fun3(String s) {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", like='" + like + '\'' +
                '}';
    }
}
