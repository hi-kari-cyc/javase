package shujia25.day14;

/*
    Map集合：元素是一个键值对存在的
    由于Map本身是一个接口，所以我们需要借助实现子类来创建对象：HashMap

    注意事项：
        1、在Map集合中，对于同一个Map集合，key是唯一的，value值可以发生重复

    Map接口中的方法：
        V put(K key,V value)        添加键值对
        V remove(Object key)        删除键值对
        void clear()                清空集合
        boolean containsKey(Object key)
        boolean containsValue(Object value)
        boolean isEmpty()
        int size()
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        // 创建对象
        Map<Integer,String> map = new HashMap<>();

        // V put(K key,V value)     当key重复的时候，新的value值会覆盖旧的value值，返回旧的value值
        System.out.println(map.put(1001, "xxx"));   // 方法会返回之前与键 1001 相关联的值。如果之前没有与该键相关联的值，则返回 null。
        System.out.println(map.put(1001, "cyc"));
        System.out.println(map);
        System.out.println(map.put(1002, "cyc"));       // value可以重复
        map.put(1003, "张三");
        map.put(1004, "李四");
        map.put(1005, "王五");
        System.out.println(map);

        // V remove(Object key)
        System.out.println(map.remove(1002));   // 返回删除键所对应的值
        System.out.println(map.remove(1006));   // 如果没有该键返回null
        System.out.println(map);

        // void clear()
        map.clear();
        System.out.println(map);

        System.out.println("--------------------------------");

        // boolean containsKey(Object key)  判断是否存在某一个key
        System.out.println(map.containsKey(1002));

        // boolean containsValue(Object value)  判断是否存在某一个value
        System.out.println(map.containsValue("cyc"));

        // boolean isEmpty()        判断是否为空
        System.out.println(map.isEmpty());

        // int size()       获取共有多少键值对
        System.out.println(map.size());
    }
}
