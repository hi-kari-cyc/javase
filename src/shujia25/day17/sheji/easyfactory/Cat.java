package shujia25.day17.sheji.easyfactory;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("🐱吃🐟");
    }

    @Override
    public void sleep() {
        System.out.println("🐱蜷着睡");
    }
}
