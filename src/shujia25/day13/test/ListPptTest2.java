package shujia25.day13.test;

import java.util.ArrayList;
import java.util.Objects;

/*
        去除集合中自定义对象的重复值(对象的成员变量值都相同)

 */
public class ListPptTest2 {
    public static void main(String[] args) {
        // 1、创建集合对象
        ArrayList list1 = new ArrayList();

        // 2、创建元素对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 17);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("赵六", 19);
        Student s5 = new Student("张三", 18);

        // 3、将学生对象添加到集合中
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        System.out.println(list1);

        // 4、创建新集合，遍历旧集合，判断新集合中是否包含该元素，如果不包含添加元素到新集合，反之不添加
        ArrayList list2 = new ArrayList();
        for (int i = 0; i < list1.size(); i++) {
            Student student = (Student) list1.get(i);
            // contains底层调用的是元素类型中的equals方法，而我们Student类型中并没有重写equals方法，所以调用的是Object中的equals方法
            // 元素类型必须重写equals方法
            if (!list2.contains(student)){
                list2.add(student);
            }
        }
        System.out.println(list2);
    }
}

/*
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

 */


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