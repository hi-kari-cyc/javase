package shujia25.day17.sheji.easyfactory;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("🐕吃🥩");
    }

    @Override
    public void sleep() {
        System.out.println("🐕侧着睡");
    }
}
