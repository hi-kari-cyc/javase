package shujia25.test;

import java.util.TreeSet;

/*
    1.编写一个Worker类，为Worker类添加相应的代码，使得Worker对象能正确放入TreeSet中。并编写相应的测试代码。
        提示:
        1)Worker类含有name,age,salary三个属性
        2)取值，赋值的方法可省略
        3)比较时，先比较工人的年龄大小，年龄小的排在前面。如果两个工人年龄相同，则根据字典顺序比较工人姓名。
        4)编写测试类，向集合中添加三条数据
        5)遍历集合，输出集合中的元素信息(Worker类编写toString方法)

 */
public class test1 {
    public static void main(String[] args) {
        // 创建集合对象 TreeSet
        TreeSet<Worker> workers = new TreeSet<>();

        // 创建元素对象
        Worker w1 = new Worker("张三",23,6000);
        Worker w2 = new Worker("李四",21,4000);
        Worker w3 = new Worker("王五",21,5000);

        // 添加元素
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);

        // 遍历集合
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}

class Worker implements Comparable<Worker>{
    private String name;
    private int age;
    private int salary;

    public Worker() {
    }

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        int age = this.getAge()-o.getAge();
        return (age == 0)? o.getName().compareTo(this.getName()):age;
    }
}