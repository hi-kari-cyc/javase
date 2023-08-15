package shujia25.day09.test;


class Outer {
    public int num = 10;

    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(new Outer().num);
            System.out.println(Outer.this.num);  // Outer.this 表示外部类的当前实例，可以通过它来访问外部类的成员变量
        }
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
