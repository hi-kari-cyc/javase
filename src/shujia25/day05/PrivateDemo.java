package shujia25.day05;
/*

        private关键字修饰成员方法

 */
public class PrivateDemo {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
//        d.show1();
        // 间接调用了show方法
        d.fun();
    }
}

class Demo2{
    private void show(){
        System.out.println("好好学习，天天向上");
    }

    public void fun(){
        show();
    }
}
