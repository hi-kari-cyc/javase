package shujia25.day04;

/*
            当一个方法没有返回值的时候，方法怎么定义呢？
            Java提供了一个关键字给我们使用，表示方法没有返回值，void


 */
public class FunctionDemo2 {
    public static void main(String[] args) {
        // 定义一个吃饭的方法并调用
        // 当一个方法没有返回值类型的时候，直接调用即可
        eat();
    }

    public static void eat() {
        System.out.println("吃饭");
    }
}