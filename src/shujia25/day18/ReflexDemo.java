package shujia25.day18;

/*
    反射：使用反射的前提，是要获取该类的字节码文件对象（Class文件对象）
    一个类对应的Class对象在内存是唯一的。
 */

public class ReflexDemo {
    public static void main(String[] args) throws Exception {
        // 使用java获取一个类的Class文件对象的三种方式：
        // 方式1：在对象已经存在的前提
        Student student = new Student();
        Class<? extends Student> studentClass1 = student.getClass();

        // 方式2：直接通过类名.class
        Class<Student> studentClass2 = Student.class;
        System.out.println(studentClass1 == studentClass2);

        //方式3：使用Class类中的静态方法获取（最常用，下周将Mysql JDBC的时候会使用）
        //static 类<?> forName(String className)
        //返回与给定字符串名称的类或接口相关联的 类对象。
        Class<?> studnetClass3 = Class.forName("shujia25.day18.Student");
        System.out.println(studentClass1 == studnetClass3);
    }
}
