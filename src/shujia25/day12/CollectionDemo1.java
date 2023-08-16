package shujia25.day12;

/*
    在此之前，我们学习了两种容器：
        1、数组:
            优点：因为有索引，所以查询快，对于不同的数组而言，元素的数据类型可以是不一样的  缺点：长度固定，增删慢
        2、StringBuffer
            优点：长度可以随意的变化，从添加和删除修改都很方便，也有索引的概念  缺点：StringBuffer只能存储字符数据

    所以我们只学习这两个容器是远远不够的，根据数据的存储和取出的顺序，以及架构，使用场景划分出很多的容器
    java根据底层数据存储的结构和查询结构不同，不断地向上提取，形成一个体系，而这些可以装数据的容器，在java中统称为集合
    形成的是集合继承体系。

    Collection: 是Collection集合继承体系的头，通过观察API发现，Collection是一个接口，无法被实例化，
    List接口继承Collection接口，根据我们的排查找到了一个具体的实现子类：
            ArrayList
    所以我们可以借助ArrayList来创建对象，使用Collection接口中的方法

    ArrayList构造方法：
        ArrayList()  构造一个初始容量为十的空列表。


    Collection中的方法1：
        boolean add(E e)        E表示任意引用数据类型
        boolean remove(Object o)
        void clear()
        boolean contains(Object o)
        boolean isEmpty()
        int size()

 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        ArrayList c1 = new ArrayList();// 父类的引用指向子类对象（接口多态）

        // boolean add(E e)     向集合中添加元素
        c1.add(100);     // 里面做了自动装箱把int变成了Integer
        c1.add("hello");
        c1.add(12.34);

        System.out.println("c1: " + c1);

        // boolean remove(Object o)     从集合中删除某一元素
        System.out.println(c1.remove("hello"));
        System.out.println("c1: " + c1);
        System.out.println(c1.remove("hello"));

        System.out.println("-------------------------------------");
        // void clear()     清空集合中的元素
        c1.clear();
        System.out.println("c1: " + c1);

        // boolean contains(Object o)  判断集合中是否包含某一元素
        System.out.println(c1.contains(100));

        // boolean isEmpty()        判断集合是否为空
        System.out.println(c1.isEmpty());

        // int size()       获取集合中的元素个数,对于集合而言元素的个数就是长度
        System.out.println(c1.size());

    }
}
