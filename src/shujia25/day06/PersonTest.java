package shujia25.day06;

/*
    java中提供了一个关键字：static 静态的
    可以成员变量，成员方法

 */

class Person {
    private String name;
    private int age;
    private static String nationality;  // 被static修饰的成员变量，表示被所有的该类的对象共享

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        Person.nationality = nationality;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，国籍：" + nationality);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("蔡某某", 30, "中国");
        p1.show();
//        Person p2 = new Person("李某某", 35, "中国");
//        p2.show();
//        Person p3 = new Person("王菲", 50, "中国");
//        p3.show();
        System.out.println("=====================================");
        // 我们中国的明星有太多了，虽然姓名和年龄都不太一样，但是国籍都是中国，那也就是说，"中国"被所有中国的明显所共享
        Person p2 = new Person("李某某", 35);
        p2.show();
        Person p3 = new Person("王菲", 50);
        p3.show();
        System.out.println("-----------------------");
        p1.setNationality("韩国");
        p1.show();
        p2.show();
        p3.show();
    }
}
