package shujia25.day06;

public class CodeDemo1 {
    CodeDemo1() {
        System.out.println("这是无参构造方法。");
    }

    {
        System.out.println("这是构造代码块");
    }

    static {
        System.out.println("这是静态代码块");
    }
}


class CodeTest {
    public static void main(String[] args) {
        CodeDemo1 c1 = new CodeDemo1();
        {
            String i = "这是局部代码块";
            System.out.println(i);
        }

        System.out.println("====================");
        CodeDemo1 c2 = new CodeDemo1();
    }
}
