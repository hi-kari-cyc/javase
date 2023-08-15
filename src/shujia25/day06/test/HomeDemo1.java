package shujia25.day06.test;


/*
        1.使用面向对象的思想，编写自定义描述狗的信息。设定属性包括：品种，年龄，心情，名字；方法包括：叫，跑。
            要求：
            1)设置属性的私有访问权限，通过公有的 get,set 方法实现对属性的访问
            2)限定心情只能有“心情好”和“心情不好”两种情况，如果无效输入进行提示，  默认设置“心情好”。
            3)设置构造函数实现对属性赋值
            4)叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
            5)编写测试类，测试狗类的对象及相关方法（测试数据信息自定义）

            心情好：汪汪叫，开心地围着主人身边转
            心情不好：呜呜叫，伤心地一动不动


 */
public class HomeDemo1 {
    private String breed;
    private int age;
    private String mood;
    private String name;

    public HomeDemo1(String breed, int age, String mood, String name) {
        this.breed = breed;
        this.age = age;
        setMood(mood);
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        if (mood.equals("心情很好") | mood.equals("心情不好")) {
            this.mood = mood;
        } else {
            System.out.println("无效输入,默认心情很好");
            this.mood = "心情很好";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String bark() {
        if (mood.equals("心情很好")) {
            return "开心的汪汪叫";
        } else {
            return "伤心的呜呜叫";
        }
    }

    public String sun() {
        if (mood.equals("心情很好")) {
            return "开心的围着主人身边转";
        } else {
            return "伤心的一动不动";
        }
    }

    public void show(){
        System.out.println("名字叫"+name+"的"+breed+mood+","+bark());
        System.out.println("名字叫"+name+"的"+breed+mood+","+sun());
    }
}

class HomeTest1 {
    public static void main(String[] args) {
        HomeDemo1 d1 = new HomeDemo1("贵宾犬", 3, "心情一般","甜心");
        d1.show();

        System.out.println("====================");
        HomeDemo1 d2 = new HomeDemo1("德牧", 2,"心情不好", "太子");
        d2.show();
    }
}
