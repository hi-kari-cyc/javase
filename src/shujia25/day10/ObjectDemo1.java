package shujia25.day10;

/*
    java中所有的类，包括自己定义的类都有一个共同的父类：Object
    通过观察API发现，该类是属于java.lang包下的类，所以今后使用的时候不需要导包
    构造方法：Object()


    成员方法：
        public int hashCode()       返回对象的哈希码值
        public final Class getClass()   返回此 Object的运行时类。
        public String toString()    返回对象的字符串表示形式

 */

public class ObjectDemo1 {
    public static void main(String[] args) {
        // 创建一个Object对象
        Object o = new Object();

        // 创建两个无参Student对象
        Student s1 = new Student();
        Student s2 = new Student();

        // hashCode() 获取对象的哈希值
        // 不同对象代表不同的哈希值，判断对象一不一样就可以判断hashCode一不一样
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // getClass    获取class文件对象  class文件可以造很多个对象出来
        System.out.println(s1.getClass()); // class shujia25.day10.Student
        System.out.println(s2.getClass()); // class shujia25.day10.Student

        // 默认自带.toString
        // 直接打印输出对象名，默认调用的是toString()方法，默认是调用父类Object类中的toString()方法
        // 而默认Object中的toString()方法打印的是一串地址值的映射
        System.out.println(s1);  // shujia25.day10.Student@4554617c
        System.out.println(s2);  // shujia25.day10.Student@74a14482
        // getClass().getName() + '@' + Integer.toHexString(hashCode())

        System.out.println(s1.toString());  // shujia25.day10.Student@4554617c
        System.out.println(s2.toString());  // shujia25.day10.Student@74a14482
        System.out.println("=============================");


        // equals()方法在Object内部代码
//        public boolean equals(Object obj) {
//            return (this == obj);
        System.out.println(s1.equals(s2));  // false
        //==如果比较的是基本数据类型，比较的是具体的数值；如果比较的是引用数据类型，比较的是地址值
        System.out.println(s1==s2);    // false


        System.out.println("=============================");

        // 在Student中重写Object中的方法后
        // 创建两个有参学生对象
        Student s3 = new Student("小虎", 20);
        Student s4 = new Student("cyc", 18);
        Student s5 = new Student("cyc", 18);

        System.out.println(s3.getClass()); // class shujia25.day10.Student
        System.out.println(s4.getClass()); // class shujia25.day10.Student

        System.out.println(s3);  // Student{name='小虎', age=20}
        System.out.println(s4);  // Student{name='cyc', age=18}

        // 重写后的toString方法打印成员变量
        System.out.println(s3.toString());  // Student{name='小虎', age=20}
        System.out.println(s4.toString());  // Student{name='cyc', age=18}

        System.out.println(s3.equals(s4));  // false
        System.out.println(s3==s4);    // false

        System.out.println(s4.equals(s5));  // true
        System.out.println(s4==s5);    // false
    }
}
