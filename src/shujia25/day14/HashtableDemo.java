package shujia25.day14;

/*
    面试题：HashMap和Hashtable的区别
    1、HashMap是线程不安全的，而Hashtable是线程安全的
    2、HashMap的key和value值允许为null值，而Hashtable的key和value值不允许为null
 */

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
//        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null,"111");
//        table.put("222",null);
//        System.out.println(table);

        HashMap<String, String> map = new HashMap<>();
        map.put(null,"111");
        map.put("222",null);
        System.out.println(map);
    }
}
/*
        HashMap和Hashtable是两种常见的哈希表实现，它们在功能上有一些相似之处(key、value结构)，但也有一些区别。
            1. 线程安全性：Hashtable是线程安全的，而HashMap不是。
            2. Null值和键：Hashtable不允许null值或null键.而HashMap允许null值和null键。可以存储一个null值和多个null键。
            3. 迭代器：Hashtable的迭代器（Enumeration）是早期Java版本的遗留API，只能遍历元素而不能进行并发修改。
                而HashMap的迭代器（Iterator）支持并发修改，可以在迭代过程中进行增删改操作。
 */
