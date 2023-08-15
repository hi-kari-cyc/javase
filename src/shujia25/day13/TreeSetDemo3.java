package shujia25.day13;

/*
    比较器排序
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        //1、创建集合对象
        TreeSet<Student2> set = new TreeSet<>(new Comparator<Student2>() {
            @Override
            // 从小到大排序：o1是待插入的元素，o2是已经插入的元素
            public int compare(Student2 o1, Student2 o2) {
                int age = o1.getAge() - o2.getAge();
                // 如果年龄一样再比较姓名，比较姓名用compareTo，因为equals返回值为Boolean类型，而compareTo的返回值是int类型
                return (age == 0) ? o1.getName().compareTo(o2.getName()) : age;
            }
        });

        //2、创建元素对象
        //当学生的姓名和年龄都一样的时候，说明是同一个学生对象
        //最终按照年龄从小到大排序
        Student2 s1 = new Student2("小虎", 18);
        Student2 s2 = new Student2("小灿", 17);
        Student2 s3 = new Student2("小杰", 19);
        Student2 s4 = new Student2("小虎", 18);
        Student2 s5 = new Student2("小保", 18);
        Student2 s6 = new Student2("小灿", 17);

        //3、将元素添加到集合中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        System.out.println(set);
    }
}


class Student3{
    private String name;
    private int age;

    public Student3() {
    }

    public Student3(String name, int age) {
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
        return "Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
