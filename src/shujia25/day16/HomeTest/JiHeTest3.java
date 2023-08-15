package shujia25.day16.HomeTest;

import java.util.*;

/*
    实现List和Map数据的转换。具体要求如下：
        功能1 ：定义方法public void listToMap( ){ }将List中Student元素封装到Map中
            1)    使用构造方法Student(int id,String name,int age,String sex )创建多个学生 信息并加入List
            2)    遍历List ，输出每个Student信息
            3)    将List中数据放入Map ，使用Student的id属性作为key ，使用Student对象 信息作为value
            4)    遍历Map ，输出每个Entry的key和value
        功能2 ：定义方法public void mapToList( ){ }将Map中Student映射信息封装到List
            1)     创建实体类StudentEntry ，可以存储Map中每个Entry的信息
            2)    使用构造方法Student(int id,String name,int age,String sex )创建多个学生 信息，并使用Student的id属性作为key ，存入Map
            3)    创建List对象，每个元素类型是StudentEntry
            4)    将Map中每个Entry信息放入List对象

 */
public class JiHeTest3 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "张三", 19, "男");
        Student s2 = new Student(2, "李四", 23, "男");
        Student s3 = new Student(3, "王五", 15, "女");
        Student s4 = new Student(4, "赵六", 21, "男");

        // 创建List集合
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
        System.out.println("-----------------------------------");

        StudentEntry se1 = new StudentEntry( "张三", 19, "男");
        StudentEntry se2 = new StudentEntry( "李四", 23, "男");
        StudentEntry se3 = new StudentEntry( "王五", 15, "女");
        StudentEntry se4 = new StudentEntry( "赵六", 21, "男");

        // 创建Map集合
        HashMap<Integer, StudentEntry> studentsMap = new HashMap<>();
        studentsMap.put(1,se1);
        studentsMap.put(2,se2);
        studentsMap.put(3,se3);
        studentsMap.put(4,se4);
        System.out.println(studentsMap);
        System.out.println("-----------------------------------");


        listToMap(students);
        System.out.println("------------------------------------");
        mapToList(studentsMap);

    }

    public static void listToMap(ArrayList<Student> arrayList) {
        HashMap<Integer, String> map = new HashMap<>();

        Object[] array = arrayList.toArray();
        for (Object o : array) {
            Student student = (Student) o;
            int id = student.getId();
            String information = student.getName() + "," + student.getAge() + "," + student.getSex();
            map.put(id, information);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("学生学号：(" + key + ")  学生信息：" + value);
        }
    }


    public static void mapToList(HashMap<Integer,StudentEntry> studentEntryHashMap) {
        ArrayList<String> strings = new ArrayList<>();
        Set<Map.Entry<Integer, StudentEntry>> entries = studentEntryHashMap.entrySet();
        for (Map.Entry<Integer, StudentEntry> entry : entries) {
            Integer key = entry.getKey();
            String string = key.toString();
            StudentEntry value = entry.getValue();
            strings.add(string+value);
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }
}

class StudentEntry{
    private int id;
    private String name;
    private int age;
    private String sex;

    public StudentEntry() {
    }

    public StudentEntry(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentEntry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntry that = (StudentEntry) o;
        return id == that.id && age == that.age && Objects.equals(name, that.name) && Objects.equals(sex, that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }

}