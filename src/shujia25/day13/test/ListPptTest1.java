package shujia25.day13.test;

import java.util.ArrayList;

/*
        去除集合中字符串的重复值(字符串的内容相同)
        分析：
            1、创建新集合
            2、遍历旧集合得到每个元素，判断新集合中是否拥有该元素，如果没有就添加进去，反之就不添加
 */
public class ListPptTest1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();

        list1.add("hello");
        list1.add("world");
        list1.add("java");
        list1.add("hadoop");
        list1.add("hello");
        list1.add("java");
        list1.add("hadoop");
        list1.add("spark");
        list1.add("hive");
        System.out.println(list1);
        System.out.println("============================");

        // 创建一个新集合
        ArrayList list2 = new ArrayList();

        // 遍历旧集合
        for (int i = 0; i < list1.size(); i++) {
            String s = (String) list1.get(i);
            // 当新集合不包含的时候才添加
            if (! list2.contains(s)) {
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}
