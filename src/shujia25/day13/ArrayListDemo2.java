package shujia25.day13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 1、创建集合对象
        ArrayList list1 = new ArrayList();

        // 2、创建元素对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 17);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("赵六", 19);

        // 3、将学生对象添加到集合中
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

        // 4、遍历集合
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName() + ":" + student.getAge());
        }
    }
}


class Student {
    private String name;
    private int age;

    public Student() {
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
