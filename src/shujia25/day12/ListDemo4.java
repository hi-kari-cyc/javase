package shujia25.day12;

/*
    需求：在使用迭代器(列表迭代器)遍历Collection集合的时候，假设里面存储的是字符串元素，当遍历遇到"java", 就添加"hadoop"

    并发修改的异常：
        当我们使用迭代器时，修改集合本身，就会发生并发错误
        ConcurrentModificationException
        迭代器遍历，使用迭代器修改；集合遍历，使用集合本身的方法修改。

        ListIterator可以在遍历过程中修改集合的内容而不会触发快速失败机制。
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo4 {
    public static void main(String[] args) {
        // 创建一个List集合
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("linux");
        list.add("mysql");
        System.out.println(list);
        System.out.println("-----------------------");

//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            String s = (String) iterator.next();
//            if (s.equals("java")){
//                list.add("hadoop");
//            }
//        }
//        System.out.println(list);

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = (String) listIterator.next();
            if ("java".equals(s)) {
                // 迭代器遍历，就应该使用迭代器做添加
                listIterator.add("hadoop");
            }
        }
        System.out.println(list);
        // 插入操作是相对于迭代器当前位置的操作，而不是在列表末尾进行插入。
        // 如果要将 "hadoop" 添加到列表的末尾，可以在迭代器循环结束后使用 list.add("hadoop") 进行添加。
    }
}
