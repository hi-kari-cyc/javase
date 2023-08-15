package shujia25.day17.sheji.easyfactory;

public class FactoryTest {
    public static void main(String[] args) {
        //我想要养只狗
        Animal dog = AnimalFactory.getAnimal("Dog");
        dog.eat();
        dog.sleep();

        Animal cat = AnimalFactory.getAnimal("Cat");
        cat.eat();
        cat.sleep();
    }
}
