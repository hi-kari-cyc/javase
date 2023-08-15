package shujia25.day13;

import java.util.ArrayList;
import java.util.Iterator;

/*
        ArrayList:是List接口的具体实现子类
        特点：底层数据结构是数组，查询快，增删慢，线程不安全的，效率高

        拓展：ArrayList是一个常用的集合类，适用于对元素的随机访问和遍历，以及对元素数量变化不频繁的场景。
        如果需要频繁进行插入和删除操作，或者处理大量数据的修改，可能需要考虑其他更适合的数据结构
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1、创建集合对象
        ArrayList arrayList = new ArrayList();

        // 2、创建字符串元素对象并加入集合中
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("hadoop");
        arrayList.add("hello");
        arrayList.add("java");

        // 3、遍历集合
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
}