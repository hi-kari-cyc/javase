package shujia25.day05;

/*
        按照正常创建类，并通过类创建对象，且对对象的成员变量赋值操作是没有问题的，但是呢，我们却可以赋予一个不符合现实的一个值
        我们实际上，一个的年龄是不可能有1800岁的，所以针对现实情况，应该是不允许赋值
        我们应该在赋值之前。先判断一下这个值是否合理。
        于是我们应该提供一个方法来帮助我们判断，并赋值。
        我们提供了一个方法帮助我们判断，并赋值，但是谁规定了提供了方法就一定要使用方法赋值
        于是java提供了一个关键字给我们使用：private 私有的
            可以修饰成员变量和成员方法，构造方法
            被修饰的成员的特点：
                无法被外界直接获取，但是在同一个类中是透明的随意访问。

        讲到现在的故事，其实就是面向对象的三大特征之一：封装的思想

        私有制之和，别的类只能通过setXxx  和 getXxx 方法设置和获取成员变量


        1.0版本
 */

public class Student2 {
    String name;
    private int age;

    public void setAge(int i) {
        if (i > 0 && i <= 150) {
            age = i;
        } else {
            System.out.println("您给的年龄不合理,默认是18");
            age = 18;
        }
    }

    public int getAge() {
        return age;
    }
}

class StudentTest2 {
    public static void main(String[] args) {
        // 创建一个学生对象
        Student2 s1 = new Student2();
        // 给s1成员变量赋值
        s1.name = "cyc";
//        s1.age = 1800;
        // 调用成员方法对成员变量进行赋值
        s1.setAge(1800);
        System.out.println("姓名：" + s1.name);
//        System.out.println("年龄：" + s1.age);
        System.out.println("年龄：" + s1.getAge());
    }
}