package shujia25.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionDemo5 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c1 = new ArrayList();

        // 创建元素对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("赵六", 21);

        // 向集合中添加元素
        c1.add(s1);
        c1.add(s2);
        c1.add(s3);
        c1.add(s4);

        // 遍历集合
        // 方法1：先转数组再遍历
        Object[] arr = c1.toArray();
        for (int i = 0; i < arr.length; i++) {
            Student s = (Student) arr[i];
            System.out.println(s.toString());
        }

        System.out.println("------------------------------");
        // 方法2：迭代器遍历
        // 创建迭代器
        Iterator iterator = c1.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Student s = (Student) object;
            System.out.println(s.getName()+": "+s.getAge());
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
        return "[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}