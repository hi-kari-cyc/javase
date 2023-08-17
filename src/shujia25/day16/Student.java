package shujia25.day16;

import java.io.Serializable;

/*
    我们在实现序列化和反序列化之后，我们修改了类，再进行读取的时候发现，出错了
    InvalidClassException:
        com.shujia.wyh.day16.Student;
        local class incompatible:
            stream classdesc serialVersionUID = 6275232661873349923,
            local class serialVersionUID = -3083611588526176444

    解决方案，为了不让每次修改类都会影响serialVersionUID变化，我们就可以写死，自动生成即可

    如果某成员不想跟对象一起序列化，java提供了一个关键字给我们使用修饰该成员transient
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 7284118704208747782L;
    private String name;
    private transient int age;   // transient 不可被序列化

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
