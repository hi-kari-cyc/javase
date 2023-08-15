package shujia25.day07.test;
/*
3:面试题
	铺垫的小知识：
	第一个：成员变量有基本类型和引用类型的。
	class Demo {
		//基本类型
		int x = 10;
		//引用类型
		Student s = new Student();
	}

	第二个：类的初始化过程
		加载class文件
		堆中开辟空间
		变量的默认初始化
		变量的显示初始化
		构造代码块初始化
		构造方法初始化

	第三个：遇到extends，就要知道，先初始化父类数据，然后初始化子类数据。
		分层初始化。
		super在这里仅仅表示要先初始化父类数据。

        1、想要初始化子类，必须先初始化父类
        2、子类构造方法第一句话默认会有一个super()
        3、父类只能初始化一次,不是父类可以多次初始化
 */


class X {
    Y b = new Y();
    X() {
        System.out.print("X");
    }
}

class Y {
    Y() {
        System.out.print("Y");
    }
}
public class Z extends X {
    Y y = new Y();
    Z() {
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}

