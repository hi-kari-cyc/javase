package shujia25.day10;


public class Demo {
    private int a;

    public Demo() {
    }

    public Demo(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                '}';
    }
}
