package shujia25.day09.test;

/*
    interface Inter {
        void show();
    }
	class Outer { //补齐代码 }

	class OuterDemo {
	    public static void main(String[] args) {
		      Outer.method().show();
		  }
	}
要求在控制台输出”HelloWorld”

 */
interface Inter5{
    void show();
}

//class Inter3Impl implements Inter3{
//
//    @Override
//    public void show() {
//        System.out.println("HelloWorld");
//    }
//}

class Outer3{
    //补齐代码
    public static Inter5 method(){
        return new Inter5() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

public class NiMingTest {
    public static void main(String[] args) {
        //首先通过观察发现，Outer类可以直接通过类名.的方式调用method()
        //说明Outer类中有一个静态方法，方法的名字叫做method
        //再观察后发现，调用完method()还可以继续调用方法，说明一个问题，说明method()调用完后返回的是一个对象
        //又发现，调用的方法叫做show(),恰好和接口中方法的名字同名
        //method()方法的返回值类型是Inter3类型
        Outer3.method().show();
    }
}
