package shujia25.day10;

/*
    public boolean equals(Object obj)

 */

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("小白", 2);
        Student s2 = new Student("小白", 2);
        System.out.println(s1==s2);

        //调用equals方法，如果子类中没有重写该方法，调用的是父类Object类中的equals方法，而父类Object类中的equals方法默认是使用==去比较的
        //而我们说过==比较引用数据类型的时候，比较的是地址值
        //又因为这里s1和s2都是分别new出来的东西，所以这里的equals比较地址值结果是false
        //要想实现比较对象之间的内容值，就应该子类去重写equals方法
        //自动生成即可
        System.out.println(s1.equals(s2));
    }
}
