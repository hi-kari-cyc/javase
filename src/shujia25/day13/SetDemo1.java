package shujia25.day13;

/*
    Set集合：是继承自Collection接口
    特点：Set集合的特点是元素唯一且无序（指的是存储和取出的顺序不一致）
    由于Set是一个接口，我们需要使用它的具体实现子类来创建对象:
        HashSet

 */

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();

        s1.add("hello");
        s1.add("world");
        s1.add("hello");
        s1.add("java");
        s1.add("hadoop");
        s1.add("hbase");

        System.out.println(s1);
        // 自动去重
    }
}
