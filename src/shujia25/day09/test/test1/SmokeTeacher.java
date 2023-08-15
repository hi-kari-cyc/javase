package shujia25.day09.test.test1;

public class SmokeTeacher extends Teacher implements Smoke{
    public SmokeTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void smoke() {
        System.out.println("老师会抽烟");
    }
}
