package shujia25.day17.sheji.danli2;

/*
        懒汉模式
            开发的时候使用饿汉式，面试的是说懒汉式（会涉及到线程安全的问题）。
 */
public class DanLiDemo2 {
    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();

        System.out.println(s1.equals(s2));

    }
}

class Student{
    String name;
    int age;
    static Student student;

    private Student(){}

    public static Student getStudent(){
        if (student!=null){
            return student;
        }else {
            student =new Student();
            return student;
        }
    }
}