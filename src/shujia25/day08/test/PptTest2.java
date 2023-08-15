package shujia25.day08.test;

/*
        2:看程序写结果（先判断有没有问题，如果没有，写出结果）

*/
class A {
	public void show() {
		show2();
	}

	public void show2() {
		System.out.println("我");
	}
}
class B extends A {

//	public void show()         // A中的show()方法被B继承
//	{
//		show2();
//	}

	public void show2() {
		System.out.println("爱");
	}
}

class C extends B {

	public void show() {
		super.show();            // super.show()是指把父类中的show()方法拿到子类中执行
	}

	public void show2() {
		System.out.println("你");
	}
}

public class PptTest2
{
	public static void main(String[] args) {
		A a = new B();
		a.show();     // 爱
		B b = new C();
		b.show();     // 你
	}
}