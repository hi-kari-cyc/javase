package shujia25.day12;

/*
    Collection集合第二种遍历方式：
        Iterator iterator()  迭代器，Collection集合的专用遍历方式

    所有和集合相关的4步走操作
    1、创建集合对象
    2、创建元素对象
    3、向集合中添加元素
    4、遍历集合
        遍历分两种：
            1）：集合转为数组
            2）：创建迭代器

 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
    public static void main(String[] args) {
        // 1、创建一个Collection集合
        Collection c1 = new ArrayList();

        // 2、向集合中添加元素
        c1.add("java");
        c1.add("mysql");
        c1.add("maven-git");
        c1.add("redis");
        c1.add("clickhouse");
        c1.add("hadoop");
        c1.add("hive");

        System.out.println("c1: " + c1);
        System.out.println("===========================");
        // 获取迭代器对象
        Iterator iterator = c1.iterator();
        /*
            因为观察API发现Iterator是一个接口，就说明iterator()方法底层必然创建了一个实现Iterator接口的对象
            Ctrl点开iterator 发现在 Collection.java 目录下
            编译看左，Collection里面有Iteration抽象方法；运行看右，具体实现看ArrayList里面的。
            Ctrl点开ArrayList 找到：
                public Iterator<E> iterator() {
                    return new Itr();
                }
            底层new了一个对象Itr被迭代器对象接收   Iterator iterator = new Itr();
            Itr是成员内部类实现了Iterator接口，用于返回一个迭代器对象来遍历集合的元素。
         */

        // Iterator接口中有两个抽象方法被实现了
        // public boolean hasNext() 判断下一个位置上是否有元素
        // public Object next()  获取下一个位置上的元素
        // 注意：一个迭代器只能有一个光标 next()控制光标移动

//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());
//
//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());
//
//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());
//
//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());
//
//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());
//
//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());
//
//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());
//
//        System.out.println("下一个位置上是否有元素:" + iterator.hasNext());
//        System.out.println("下一个位置上的元素为：" + iterator.next());        // NoSuchElementException

        while (iterator.hasNext()) {
            Object next = iterator.next();
            // 向下转型
            String s = (String) next;
            System.out.println(s + "----" + s.length());
        }

        while (iterator.hasNext()) {
            Object next = iterator.next();
            String s = (String) next;
            System.out.println(s + "---" + s.length());
        }
        // 无结果，光标已经移动到最后
        // 同一迭代器不能同一方向遍历多次

        // 后面学习增强for循环，直接遍历
    }
}
