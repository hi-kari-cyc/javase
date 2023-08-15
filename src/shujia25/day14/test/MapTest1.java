package shujia25.day14.test;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    "aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)

 */
public class MapTest1 {
    public static void main(String[] args) {
        // 创建集合对象
        TreeMap<Character, Integer> map = new TreeMap<>();
        // 遍历字符串
        String s = "aababcabcdabcde";
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
//        // 遍历集合 方法一
          // 获取键值对Set集合，遍历集合获得键和值
//        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//        for (Map.Entry<Character, Integer> entry : entries) {
//            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
//        }

        // 方法二
        // 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println(sb);
    }
}
