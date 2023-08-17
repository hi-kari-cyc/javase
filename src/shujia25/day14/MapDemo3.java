package shujia25.day14;

/*
    如何遍历Map集合
    方式1：
        先获取所有的key(keySet)，然后遍历每一个key进而得到每一个value值

    方式2：
        先获取所有的键值对，然后遍历得到每一个键值对，进而得到每一个key和value

 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        // 1、创建集合对象
        Map<String, String> map = new HashMap<>();

        // 2、创建元素对象
        // 3、添加元素
        map.put("邓超", "孙俪");
        map.put("张三", "李四");
        map.put("吴京", "谢楠");
        System.out.println(map);
        System.out.println("-----------------------");

        // 方式一
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println("------------------------------");

        // 方式二
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        // Entry有两个方法getKey,getValue，分别获得每个键和值
        System.out.println("------------------------------");

        // 拓展一种遍历方式
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
