package shujia25.day17.sheji.factoryfunction;

public class FactoryTest {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.getAnimal();
        dog.eat();
        dog.sleep();

        CatFactory catFactory = new CatFactory();
        Animal cat = catFactory.getAnimal();
        cat.eat();
        cat.sleep();

    }
}
