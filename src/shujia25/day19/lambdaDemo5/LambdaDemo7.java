package shujia25.day19.lambdaDemo5;

/*
    格式4：有两个以上的参数，有返回值，并且 Lambda 体中有多条语句

    需求：给一个对象进行赋值

 */

interface Inter4 {
    Student fun(String s1, Student student);
}

public class LambdaDemo7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Inter4 inter4 = (name,student) -> {
            student.setName(name);
            return student;
        };

        Student student = inter4.fun("张三", new Student());
        System.out.println(student);
    }

}
