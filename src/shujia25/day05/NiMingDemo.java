package shujia25.day05;

/*
    匿名对象：没有名字的对象
    当对象只是使用一次的时候，就可以采用匿名对象
    匿名对象常用的场景是当作方法的实参传递。

 */
public class NiMingDemo {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.fun();

        // 匿名对象
        new Student1().fun();
    }
}


class Student1 {
    public void fun(){
        System.out.println("好好学习，天天向上");
    }
}