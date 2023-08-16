package shujia25.day13;

import java.util.HashSet;
import java.util.Objects;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Teacher> l1 = new HashSet<>();

        Teacher t1 = new Teacher("小虎", 18);
        Teacher t2 = new Teacher("峰峰", 19);
        Teacher t3 = new Teacher("童童", 20);
        Teacher t4 = new Teacher("笑哥", 21);
        Teacher t5 = new Teacher("小虎", 18);

        // HashSet中的add方法底层实际上调用的是HashMap中的put方法
        // put()-->putVal()
        // 其中底层需要调用元素类型的HashCode方法计算出哈希值
        // 底层判断两个对象是否是同一个对象的话，会先计算两个对象的哈希值，当哈希值一样的时候，比较equals方法，如果equals方法是true表示是同一个
        // 否则不是同一个对象
        // 而又因为Teacher类中并没有重写hashCode和equals方法，所以调用的都是Object父类中的方法
        // 而Object类中的equals比较的是地址值，所以永远为false，所以底层永远判断不是同一个对象

        l1.add(t1);
        l1.add(t2);
        l1.add(t3);
        l1.add(t4);
        l1.add(t5);
        System.out.println(l1);
    }
}

class Teacher{
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
