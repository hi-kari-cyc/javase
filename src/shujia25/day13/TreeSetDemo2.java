package shujia25.day13;

/*
    TreeSet集合存储自定义对象并遍历
    如果对象的成员变量值相同即为同一个对象
    按照年龄进行从大到小进行排序

    我们按照正常的4步走后运行发现报错了
    // 类转换异常
    Comparable<? super K> k = (Comparable<? super K>) key;    // 元素类型要转成comparable类型
    ClassCastException: shujia25.day13.Student2 cannot be cast to java.lang.Comparable
 */


import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //1、创建集合对象
        TreeSet<Student2> set = new TreeSet<>();

        //2、创建元素对象
        //当学生的姓名和年龄都一样的时候，说明是同一个学生对象
        //最终按照年龄从小到大排序
        Student2 s1 = new Student2("小虎", 18);
        Student2 s2 = new Student2("小灿", 17);
        Student2 s3 = new Student2("小杰", 19);
        Student2 s4 = new Student2("小虎", 18);
        Student2 s5 = new Student2("小保", 18);

        //3、将元素添加到集合中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
    }
}

class Student2 implements Comparable<Student2> {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
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
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student2 o) {
//        return 0;
        // 这里返回的结果是大于0还是小于0还是等于0，取决于你的需求
        // 当学生的姓名和年龄都一样的时候，说明是同一个学生对象
        // 主要条件：最终按照年龄从小到大排序
        // 次要条件：年龄一样的，姓名不一定一样
        // this -- 待插入的元素
        // o -- 已经在树中的元素

        // 比较年龄
        int age = this.getAge() - o.getAge();
        // 如果年龄一样再比较姓名，比较姓名用compareTo，因为equals返回值为Boolean类型，而compareTo的返回值是int类型
        return (age == 0) ? this.getName().compareTo(o.getName()) : age;
        // 返回的值大于零升序
        // 返回的值大于零降序
    }
}
