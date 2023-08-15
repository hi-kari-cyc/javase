package shujia25.day08.test;

/*
        面试题：
        1:看程序写结果（先判断有没有问题，如果没有，写出结果）


 */

class Fu {
    public void show() {
        System.out.println("fu show");
    }
}

class Zi extends Fu {
    public void show() {
        System.out.println("zi show");
    }

    public void method() {
        System.out.println("zi method");
    }
}

class Test {
    public static void main(String[] args) {
        Fu f = new Zi();
//        f.method();
        Zi z = (Zi) f;
        z.method();
    }
}

public class PptTest1 {
}
