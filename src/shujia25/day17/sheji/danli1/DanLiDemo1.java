package shujia25.day17.sheji.danli1;

/*
        单例模式：
            a.饿汉式
 */
public class DanLiDemo1 {
    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        System.out.println(s1);

        Student s2 = Student.getStudent();
        System.out.println(s2);

        System.out.println(s1.equals(s2));

    }
}

class Student{
    String name;
    int age;
    static Student student = new Student();

    private Student() {}

    public static Student getStudent(){
        return student;
    }

}
