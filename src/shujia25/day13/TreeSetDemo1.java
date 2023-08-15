package shujia25.day13;

/*
    TreeSet: 是Set接口实现子类
    特点：底层数据结构是红黑树，可以自己定义元素的顺序，我们可以对元素进行排序
    两种排序方式：
        1、自然排序
            自然顺序是由元素类实现的 Comparable 接口定义的顺序。
            Comparable 接口有一个方法 compareTo，用于比较两个对象的顺序。
            通过实现 Comparable 接口，元素类可以定义元素之间的默认排序方式。
        2、比较器排序
            TreeSet 还可以通过传入一个比较器（Comparator）来定义元素的排序方式。
            比较器是一个独立的类，实现了 Comparator 接口，它提供了一种可以与元素类不相关的排序方式。
            通过比较器，可以灵活地定义不同的排序逻辑，而不需要修改元素类的源代码。
 */

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        // 创建一个TreeSet集合对象
        TreeSet<Integer> set = new TreeSet<>();

        // TreeSet中add方法底层调用的是TreeMap中的put方法
        // 是通过比较器排序还是自然排序，取决于TreeMap构造方法的调用是无参（自然排序）还是带参（比较器排序）
        // 底层是红黑树，特点：左<根<右
        // 去重的原因：无参构造方法调用的是自然排序，会先判断元素类型是否实现了Comparable接口，调用compareTo方法
        // 判断方法的结果与0进行比较，当等于0的时候，表示遇到了重复的元素，不会添加到集合
        // 我们看到的结果是排序结果原因是中序遍历的结果。

        set.add(12);
        set.add(14);
        set.add(2);
        set.add(17);
        set.add(25);
        set.add(15);
        set.add(12);


        System.out.println(set);
        // 去重，且自动排序
    }
}
