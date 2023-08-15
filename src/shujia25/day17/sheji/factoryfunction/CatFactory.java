package shujia25.day17.sheji.factoryfunction;



public class CatFactory extends AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
