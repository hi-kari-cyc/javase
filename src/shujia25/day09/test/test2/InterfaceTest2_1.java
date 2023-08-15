package shujia25.day09.test.test2;

/*
        教练和运动员案例
            乒乓球运动员和篮球运动员。
            乒乓球教练和篮球教练。
            为了出国交流，跟乒乓球相关的人员都需要学习英语。
            请用所学知识：
            分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。

        抽象类：人，乒乓球相关的人，篮球相关的人
        具体类：乒乓球运动员，乒乓球教练，篮球运动员，篮球教练
        接口：学习英语


                       人
               乒乓类         篮球类
     乒乓运动员  乒乓教练  篮球运动员  篮球教练
         |        |
         |        |
        接口      接口
 */

abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄" + age);
    }
}


class PingPangQiu extends Person {
    public PingPangQiu() {
    }

    public PingPangQiu(String name, int age) {
        super(name, age);
    }
}


class LanQiu extends Person {
    public LanQiu() {
    }

    public LanQiu(String name, int age) {
        super(name, age);
    }
}

interface StudyEnglish {
    void study();
}

class PingPangSportsman extends PingPangQiu implements StudyEnglish{
    public PingPangSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习英语");
    }
}

class PingPangCoach extends PingPangQiu implements StudyEnglish{
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球教练学习英语");
    }
}

class LanQiuSportsman extends LanQiu{
    public LanQiuSportsman(String name, int age) {
        super(name, age);
    }
}

class LanQiuCoach extends LanQiu{
    public LanQiuCoach(String name, int age) {
        super(name, age);
    }
}

public class InterfaceTest2_1 {
    public static void main(String[] args) {
        PingPangSportsman ppsm = new PingPangSportsman("小白", 18);
        ppsm.study();

        PingPangCoach ppc = new PingPangCoach("老白", 40);
        ppc.study();
    }
}
