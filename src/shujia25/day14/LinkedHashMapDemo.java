package shujia25.day14;

/*
    LinkedHashMap: 底层数据结构是哈希表和链表 哈希表保证了key的唯一性，链表保证了key的有序（插入和输出的顺序一致）
 */

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // 1、创建集合对象
        LinkedHashMap<Student, String> map = new LinkedHashMap<>();

        // 2、创建元素对象
        Student s1 = new Student("张三",16);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        Student s4 = new Student("赵六",17);
        Student s5 = new Student("张三",16);

        // 3、将元素添加到集合中
        map.put(s1,"吃");
        map.put(s2,"喝");
        map.put(s3,"玩");
        map.put(s4,"乐");
        map.put(s5,"跑");
        System.out.println(map);     // 第一个张三的值被第二个值替换了
        System.out.println("-----------------------------------");
    }
}
