package shujia25.day19.lambdaDemo5;

/*
    格式2：有一个参数，无返回值
    格式3：若只有一个参数，小括号可以省略不写

 */


@FunctionalInterface
interface Inter2 {
    void fun2(Student student);
}

@FunctionalInterface
interface Inter3 {
    void show(String s1, String s2);
}

public class LambdaDemo6 {
    public static void main(String[] args) {

        Inter2 inter2 = new Inter2() {
            @Override
            public void fun2(Student student) {
                System.out.println(student.getId() + "---" + student.getName() + "---" + student.getAge());
            }
        };
        inter2.fun2(new Student("1001", "张三", 18));

        // 使用lambda表达式改写
        Inter2 inter21 = (student) -> System.out.println(student.getId() + "---" + student.getName() + "---" + student.getAge());
        inter21.fun2(new Student("1002", "张三", 18));

        // 如果接口中的方法只有一个参数的时候，Lambda表达式左侧可以不用写小括号
        Inter2 inter22 = student -> System.out.println(student.getId() + "---" + student.getName() + "---" + student.getAge());
        inter21.fun2(new Student("1002", "张三", 18));

        // 多个参数，小括号不能省
        Inter3 inter31 = (s1, s2) -> System.out.println(s1 + "---" + s1.length() + "\t" + s2 + "---" + s2.length());
        inter31.show("java","lambda");
    }
}
