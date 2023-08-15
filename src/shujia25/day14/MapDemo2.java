package shujia25.day14;

/*
    V get(Object key)
    Set<K> keySet()
    Collection<V> values()
    Set<Map.Entry<K,V>> entrySet()
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        // 1、创建集合对象
        Map<String, String> map = new HashMap<>();

        // 2、创建元素对象
        // 3、添加元素
        map.put("邓超","孙俪");
        map.put("张三","李四");
        map.put("吴京","谢楠");
        System.out.println(map);
        System.out.println("-----------------------");

        // V get(Object key)    根据key获取对应的value值
        System.out.println(map.get("邓超"));

        // Set<K> keySet()      获取所有的key组成一个Set集合
        Set<String> set = map.keySet();
        System.out.println(set);

        // Collection<V> values()   获取所有的value组成一个Collection集合
        Collection<String> values = map.values();
        System.out.println(values);

        // Set<Map.Entry<K,V>> entrySet()   获取所有的键值对
        // 获取所有键值对组成Set集合，每一个键值对组成Map.Entry类型封装起来
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);

    }
}
