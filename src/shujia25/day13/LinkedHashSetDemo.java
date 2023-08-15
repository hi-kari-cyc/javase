package shujia25.day13;

/*
    LinkedHashSet: 是HashSet的子类

    HashSet的特点：底层数据结构是哈希表，可以保证元素的唯一性

    LinkedHashSet extends HashSet
        特点：底层数据结构是哈希表和链表，哈希表保证了元素的唯一性，链表保证了元素的有序
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("hive");
        set.add("hadoop");
        set.add("spark");
        set.add("hello");
        set.add("java");
        System.out.println(set);
        // 去重，且有序
    }
}
