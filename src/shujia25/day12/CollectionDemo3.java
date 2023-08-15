package shujia25.day12;

/*
    Collection集合遍历的第一种方式：
        Object[] toArray() 把集合转成数组，可以实现集合的遍历

 */

import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo3 {
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

        // Object[] toArray() 把集合转成数组
        Object[] arr = c1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            /*
                为什么返回的是Object类型的数组：
                    因为数组不知道我们的输入是什么，添加元素的时候可以添加任意元素，返回类型未知，干脆返回一个Object类型的数组
                    Object类型的数组什么类型都能往里面放
                    遍历Object数组此刻得到的是一个Object类型
                    相当于底层有一个  Object obj = new String("java");   （多态）
                    Object（是任何一个类的父类） String(子类)
             */

//            System.out.println(arr[i].length());
            /*
                调用不了length方法，说明这个元素不是String类型的，要想调用元素类型特有的方法，要进行 向下转型
             */
            System.out.println(((String) arr[i]).length());
        }
    }
}
