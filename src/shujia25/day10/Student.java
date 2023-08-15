package shujia25.day10;

import java.util.Objects;

public class Student implements Cloneable{
    private String name;
    private int age;
    private Demo demo;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Demo demo) {
        this.name = name;
        this.age = age;
        this.demo = demo;
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

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }


    // 在此之前，我们要想查看对象中的属性值，可以调用直接编写的show方法查看
//    public void show(){
//
//
//    }
    // 现在可以直接重写toString()方法可以查看成员变量

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", demo=" + demo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(demo, student.demo);
    }


    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
