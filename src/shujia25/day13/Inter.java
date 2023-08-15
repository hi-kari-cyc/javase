package shujia25.day13;

public interface Inter<E> {
    void fun(String s);
    void fun1(E e);
}

// 3、泛型接口 将泛型定义在接口上，如果子类要实现该接口，子类上也要标注泛型
class InterImpl<E> implements Inter<E>{

    @Override
    public void fun(String s) {
        System.out.println(s);
    }

    @Override
    public void fun1(E e) {
        System.out.println(e);
    }
}

class Test{
    public static void main(String[] args) {
        InterImpl<String> o = new InterImpl<>();
        o.fun("hello");
        o.fun1("world");
    }
}

