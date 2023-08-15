package shujia25.day09;

/*
        当接口作为方法的返回值类型的时候

 */
interface Inter8{
    void fun1();
}

//class Inter2Impl implements Inter2{
//
//    @Override
//    public void fun1() {
//        System.out.println("刘天保真帅！");
//    }
//}

class Demo7{
    public Inter8 show1(){
//        return new Inter2Impl();
        return new Inter8() {
            @Override
            public void fun1() {
                System.out.println("好好学习，天天向上！");
            }
        };
    }
}

public class NiMingDemo2 {
    public static void main(String[] args) {
        Demo7 demo7 = new Demo7();
        Inter8 i = demo7.show1();
        i.fun1();

        demo7.show1().fun1();
    }
}

