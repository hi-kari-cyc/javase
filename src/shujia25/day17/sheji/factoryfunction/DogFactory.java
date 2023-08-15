package shujia25.day17.sheji.factoryfunction;


public class DogFactory extends AnimalFactory{
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
