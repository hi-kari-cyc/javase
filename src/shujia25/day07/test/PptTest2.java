package shujia25.day07.test;


            //2:面试题


class Zi0 extends Fu0 {
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public Zi0() {
        System.out.println("构造方法Zi");
    }
}

class Fu0 {
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块Fu");
    }

    public Fu0() {
        System.out.println("构造方法Fu");
    }
}


public class PptTest2 {
    public static void main(String[] args) {
        Zi0 zi0 = new Zi0();
    }
}





//    Zi z = new Zi(); 请执行结果。
//
//        A:静态随着类的加载而加载。
//        B:静态代码块 -- 构造代码块 -- 构造方法的执行流程
//        静态代码块 -- 构造代码块 -- 构造方法
//        C:只要有子父关系，肯定先初始化父亲的数据，然后初始化子类的数据。
//
//        结果：
//        静态代码块Fu
//        静态代码块Zi
//        构造代码块Fu
//        构造方法Fu
//        构造代码块Zi
//        构造方法Zi

