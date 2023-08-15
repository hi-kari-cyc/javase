package shujia25.day05;

/*
        变量的使用顺序:
        方法中使用变量，如果方法内部有该变量，就用方法内部的，如果方法内部找不到，就去成员变量上去找，如果成员变量上也没有，就报错
        this可以访问成员变量，构造方法，成员方法
 */

public class Demo3 {
    int a = 10;
    public void fun(){
        int a = 20;
        System.out.println(a);  // 20
        System.out.println(this.a);   // 10

        this.show();  // 今天是阴天
        show();  // this.show() 等同于 show()
    }

    public void show(){
        System.out.println("今天是阴天");
    }
}

class Demo3Test{
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.fun();
    }
}
