package shujia25.day14.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        集合的嵌套遍历
            HashMap嵌套HashMap
            HashMap嵌套ArrayList
            ArrayList嵌套HashMap

 */
public class MapTest2 {
    public static void main(String[] args) {
        // HashMap嵌套HashMap
        // HashMap嵌套ArrayList


        // ArrayList嵌套HashMap

        // 创建外层集合
        ArrayList<HashMap<Student, String>> list = new ArrayList<>();
        // 创建第一个内层集合
        HashMap<Student, String> map1 = new HashMap<>();
        // 创建元素并添加到内层集合中
        map1.put(new Student("张三1", 16), "吃");
        map1.put(new Student("李四1", 20), "喝");
        map1.put(new Student("王五1", 18), "玩");
        map1.put(new Student("赵六1", 21), "乐");

        // 创建第二个内层集合
        HashMap<Student, String> map2 = new HashMap<>();
        // 创建元素并添加到内层集合中
        map2.put(new Student("张三2", 16), "吃");
        map2.put(new Student("李四2", 20), "喝");
        map2.put(new Student("王五2", 18), "玩");
        map2.put(new Student("赵六2", 21), "乐");

        // 创建第三个内层集合
        HashMap<Student, String> map3 = new HashMap<>();
        // 创建元素并添加到内层集合中
        map3.put(new Student("张三3", 16), "吃");
        map3.put(new Student("李四3", 20), "喝");
        map3.put(new Student("王五3", 18), "玩");
        map3.put(new Student("赵六3", 21), "乐");

        // 创建第四个内层集合
        HashMap<Student, String> map4 = new HashMap<>();
        // 创建元素并添加到内层集合中
        map4.put(new Student("张三4", 16), "吃");
        map4.put(new Student("李四4", 20), "喝");
        map4.put(new Student("王五4", 18), "玩");
        map4.put(new Student("赵六4", 21), "乐");

        // 把内层集合添加到外层集合中
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        for (HashMap<Student, String> map : list) {
            Set<Map.Entry<Student, String>> entries = map.entrySet();
            for (Map.Entry<Student, String> entry : entries) {
                Student key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " : " + value);
            }
            System.out.println("---------------------------------");
        }


    }
}
