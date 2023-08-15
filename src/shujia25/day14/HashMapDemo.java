package shujia25.day14;

/*
    HashMap: 底层数据结构是哈希表
    HashMap<Student,String>   当Student对象中的成员变量值都一样的时候，我们认为是同一个学生对象，同一个key
    唯一性是针对于key来说的

 */

import java.util.HashMap;
import java.util.Objects;

public class HashMapDemo {
    public static void main(String[] args) {
        // 1、创建集合对象
        HashMap<Student, String> map = new HashMap<>();

        // 2、创建元素对象
        Student s1 = new Student("张三",16);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        Student s4 = new Student("赵六",17);
        Student s5 = new Student("张三",16);

        // 3、将元素添加到集合中
        map.put(s1,"吃");
        map.put(s2,"喝");
        map.put(s3,"玩");
        map.put(s4,"乐");
        map.put(s5,"跑");
        System.out.println(map);     // 第一个张三的值被第二个值替换了
        System.out.println("-----------------------------------");

        // put底层通过equals方法和HashCode方法去重。
    }
}


class Student{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
