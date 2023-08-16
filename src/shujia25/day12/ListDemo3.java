package shujia25.day12;

/*
    因为List集合具备索引的条件，于是多了很多与索引使用相关的方法，索引是从左向右，从0开始
        element(元素)
    void add(int index,Object element)
    Object remove(int index)
    Object get(int index)
    Object set(int index,Object element)
    ListIterator listIterator()

 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    public static void main(String[] args) {
        // 创建List集合对象
        List list1 = new ArrayList();
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        list1.add("hadoop");
        System.out.println(list1);
        System.out.println("----------------------------");

        // void add(int index,Object element)       根据索引添加元素
        list1.add(1, "mysql");
        System.out.println(list1);

        // Object remove(int index)     根据索引删除某一个元素,返回值为删除的元素
        Object remove = list1.remove(3);
        System.out.println(remove);
        System.out.println(list1);

        // Object get(int index)    根据索引获取元素
        System.out.println(list1.get(1));
        System.out.println(list1);

        // Object set(int index,Object element)     修改某一位置上的元素
        System.out.println(list1.set(2, "linux"));  // 返回被修改的元素
        System.out.println(list1);
        System.out.println(list1.size());


        // List集合的第三种遍历方式：使用get和size方法进行遍历
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
            // 得到的元素依旧是Object类，要想使用元素本身类型特有的方法，需要向下转型
        }

        System.out.println("--------------------------");
        // ListIterator listIterator()    列表迭代器，是List集合特有的迭代器
            // listIterator 不但能使用next()和hasnext()方法还有自己独特的方法
        ListIterator listIterator = list1.listIterator();
        // public E previous()              获取前一个位置上的元素
        // public boolean hasPrevious()     判断前一个位置上是否有元素
        // ListIterator不仅能正着遍历，还能倒着遍历

        // 因为一开始的光标就在第一个位置前面，要想倒着遍历必须先正着遍历
        // 正向遍历
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // 倒着遍历
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
