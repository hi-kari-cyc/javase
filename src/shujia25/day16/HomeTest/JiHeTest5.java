package shujia25.day16.HomeTest;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.*;

/*
    由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容 为exit退出；
    将输入的学生信息分别封装到一个Student对象中，再将每个Student 对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；
    最后遍历集合， 将集合中学生信息写入到记事本，每个学生数据占单独一行。
        推荐步骤：
            a)     创建Student类，并指定按照年龄正序排列
            b)     通过控制台输入多个不同Student信息。格式规定为：编号#姓名#年龄
            c)     取出字符串中相应信息放入Student对象，并将Student加入到集合中
            d)     遍历集合的过程中将学生的信息输入到记事本 难点：
            e)     如何指定学生按照年龄正序排列
            f)      如果从字符串“编号#姓名#年龄”中提取学生信息
 */
public class JiHeTest5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<StudentMap> studentList = new ArrayList<>();

        while (true) {
            System.out.println("请输入学生信息（学号#姓名#年龄）：");
            String studentInfo = sc.nextLine();
            if (studentInfo.equals("exit")) {
                break;
            }

            String[] arr = studentInfo.split("#");

            int id = Integer.parseInt(arr[0]);
            String name = arr[1];
            int age = Integer.parseInt(arr[2]);

            StudentMap student = new StudentMap(id, name, age);
            studentList.add(student);
        }

        // 按照年龄正序排序
        Collections.sort(studentList, Comparator.comparingInt(StudentMap::getAge));

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/shujia25/day16/HomeTest/a.txt"));
        for (StudentMap student : studentList) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();

        System.out.println("学生信息已写入文件。");
    }
}

class StudentMap implements Comparable<StudentMap> {
    private int id;
    private String name;
    private int age;

    public StudentMap() {
    }

    public StudentMap(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "StudentMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMap that = (StudentMap) o;
        return id == that.id && age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public int compareTo(StudentMap o) {
        return this.getAge() - o.getAge();
    }
}