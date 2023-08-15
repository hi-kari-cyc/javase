package shujia25.day09.test.test1;

public class SmokeStudent extends Student implements Smoke{
    public SmokeStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void smoke() {
        System.out.println("学生抽烟");
    }
}
