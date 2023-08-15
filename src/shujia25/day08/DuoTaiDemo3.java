package shujia25.day08;

/*
    多态的好处
        提高了程序的维护性(由继承保证)
            通过多态性，可以将程序中的通用功能定义在父类中，而具体的实现可以放在各个子类中。
            这样，如果需要修改某个功能，只需修改父类中的代码，而不需要修改所有子类的代码。这提高了程序的维护性，减少了修改的工作量和风险

        提高了程序的扩展性(由多态保证)

 */
class Animal2{
    String name;
    int age;

    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃");
    }

    public void sleep(){
        System.out.println("睡");
    }
}


class Dog2 extends Animal2 {

    public Dog2(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("🐕吃🥩");
    }

    @Override
    public void sleep() {
        System.out.println("🐕趴着睡");
    }
}


class Cat extends Animal2 {
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


class Pig extends Animal2{
    public Pig(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("🐖吃🍜");
    }

    @Override
    public void sleep(){
        System.out.println("🐖侧着睡");
    }
}

class Cow extends Animal2{
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("🐂吃草");
    }

    @Override
    public void sleep(){
        System.out.println("牛窝着睡");
    }
}


class AnimalTool{
    private AnimalTool() {
    }

    // 静态方法可以直接通过类名调用，而无需实例化类的对象。
    public static void useAnimal(Animal2 animal2){   // Animal2 animal2 = new Dog2("小白", 2);
        animal2.eat();
        animal2.sleep();
    }
}


public class DuoTaiDemo3 {
    public static void main(String[] args) {
        // 我想养一只🐕
        Dog2 dog1 = new Dog2("小白", 2);
        dog1.eat();
        dog1.sleep();

        AnimalTool.useAnimal(dog1);

        /*
        在Java中，子类对象可以赋值给父类类型的变量。这是因为子类是父类的一种特殊类型，拥有父类的所有属性和方法。
        当子类对象传递给父类类型的参数时，会发生向上转型，即将子类对象视为父类类型的对象。
        在这段代码中，Dog2类是Animal2类的子类，因此Dog2对象可以赋值给Animal2类型的变量。
        当调用AnimalTool.useAnimal(dog1)时，dog1作为实参传入了useAnimal方法中，这里发生了向上转型，将dog1视为Animal2类型的对象。
        由于Dog2类是Animal2类的子类，所以dog1对象拥有Animal2类的所有属性和方法，包括eat和sleep方法。
        因此，可以将dog1作为参数传递给useAnimal方法，并在该方法内部调用dog1的eat和sleep方法，实现对狗狗对象的操作。
         */



        // 我还想养一只🐕
        Dog2 dog2 = new Dog2("小黑", 3);
        AnimalTool.useAnimal(dog2);

        // 我想养n只狗狗 （单独写一个方法，表示狗的行为）

        // 我想养一只猫
        Cat cat1 = new Cat("花花", 2);
        AnimalTool.useAnimal(cat1);

        //但是我不仅想要养狗和猫，还想养猪
        //按照上面的写法，我们先定义一个Pig类，然后继承Animal2类，然后重写吃和睡的方法，然后在当前类中写一个usePig的方法调用猪一些能力
        //随着我想养动物的种类增多，类不可避免的去定义，但是当前类的useXxx的方法会增多，这样会显得当前类非常臃肿
        //我们就可以将这些调用动物功能的方法单独提取出来到一个类中，这个类就是专门调用动物能力的工具类

        Pig pig = new Pig("佩奇", 2);
        AnimalTool.useAnimal(pig);

        //随着我们动物种类增多，每次新增一种动物都需要修改动物的工具类
        //这是一个非常忌讳的事情，一般来说工具类一旦被创建好，就不能随意被改变
        //怎么解决呢？如何修改工具类，让他能够适配所有的动物？
        //答案：使用多态
        //原因：所有的动物类都是Animal2的子类
        Animal2 cow1 = new Cow("大角牛", 3);
        AnimalTool.useAnimal(cow1);

        /*
        解释：
            把new Cow("大角牛", 3)传给cow1，再将cow1赋给工具类中的animal，
            即：Animal animal = new Cow("大角牛", 3);  这就是多态语句
         */

        /*
            在这段代码中，定义了一个Animal2类作为父类，以及Dog2、Cat、Pig和Cow类作为子类，它们都继承自Animal2类。
            AnimalTool类是一个工具类，其中定义了一个静态方法useAnimal，该方法接受一个Animal2类型的参数，并在方法内部调用传入对象的eat和sleep方法。
            在DuoTaiDemo3的main方法中，创建了一个Cow对象cow1。然后调用AnimalTool.useAnimal(cow1)，将cow1作为参数传递给useAnimal方法。
            在useAnimal方法内部，由于参数类型是Animal2，而Cow是Animal2的子类，因此参数cow1会被自动向上转型为Animal2类型。
            在编译时，编译器会检查useAnimal方法的参数类型，并确定调用哪个方法。由于cow1被向上转型为Animal2类型，所以会调用Animal2类中的eat和sleep方法。
            然而，由于Cow类覆盖了Animal2类的eat和sleep方法，实际上会调用Cow类中重写的方法。
            即使参数类型是Animal2，在运行时，由于方法重写的多态特性，实际上会执行Cow类中的eat和sleep方法，输出相应的内容。
         */

    }
}
