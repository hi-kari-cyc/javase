package shujia25.day05;

/*
        我们之前在说变量的时候提到一个词：见名知意
        变量的使用规则：就近原则
        java提供了一个关键字：this关键字 代表着当前调用该方法的对象
        什么时候用this：
            区分同名的成员变量和局部变量

 */
public class ThisDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Tom");
        c1.setAge(3);

        c1.show();
    }
}

class Cat {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }
}
