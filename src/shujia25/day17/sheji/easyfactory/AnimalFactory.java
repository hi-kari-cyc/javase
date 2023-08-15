package shujia25.day17.sheji.easyfactory;

public class AnimalFactory {
    //构造方法私有化
    private AnimalFactory(){}

    public static Animal getAnimal(String name){
        if("Dog".equals(name)){
            return new Dog();
        }else if("Cat".equals(name)){
            return new Cat();
        }else {
            System.out.println("目前工厂不支持造该种动物");
            return null;
        }
    }
}
