package shujia25.day09.test.test1;

/*
         老师和学生案例,加入抽烟的额外功能
    人：（抽象类）
    抽烟：（接口）
    老师 extends 人
    学生 extends 人
    会抽烟的老师 extends 人 implements 抽烟
    会抽烟的学生 extends 人 implements 抽烟

    面向接口编程：
        1、定义接口
        2、实现接口

 */

public class InterfaceTest1 {
    public static void main(String[] args) {
        // 创建一个普通的老师对象
        Teacher t1 = new Teacher("cyc", 18);
        t1.show();
//        t1.smoke();

        SmokeTeacher st1 = new SmokeTeacher("常允城",20);
        st1.show();
        st1.smoke();

    }
}
