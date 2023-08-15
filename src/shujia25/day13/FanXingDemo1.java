package shujia25.day13;

/*
    我们在此之前遍历集合元素的时候，如果想用元素本身类型中的方法的时候，必须要向下转型才可以
    我们再回想一下，数组，我们在定义一个数组的时候，就确定这个数组中只能存某种元素
    如果集合能够吸取数组这个特点，这样我们在定义集合的时候，就明确集合中只能存某种数据类型、就好了
    java提供了一个机制可以让集合在定义的时候，限定集合中的元素类型，这个机制叫做泛型机制
    语句定义格式：<引用数据类型>

    E:代表集合中元素的类型

    泛型的好处：
        1、限定集合存储的数据类型
        2、消除了大量的黄色警告
        3、不需要做向下转型

    泛型使用的地方：
        类，集合，接口，方法

    泛型的使用方式：
        1、泛型类  在类上面加泛型
        2、泛型方法 定义一个泛型方法，表示将来可以传入任意的引用数据类型
        3、泛型接口 将泛型定义在接口上，如果子类要实现该接口，子类上也要标注泛型

 */

import java.util.ArrayList;


public class FanXingDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();   // 右边的泛型，Java会根据左边定义的泛型自动类型推断

        list1.add("hello");
        list1.add("world");
        list1.add("java");
        list1.add("hadoop");
        list1.add("hello");
        list1.add("java");
        list1.add("hadoop");
        list1.add("spark");
        list1.add("hive");

//        list1.add(100);   明确了集合存储类型就不能存储其他类型

        System.out.println(list1);
        System.out.println("============================");
        for (int i = 0; i < list1.size(); i++) {
//            Object o = list1.get(i);

            // 明确了类型就不需要做向下转型
//            String s = (String) list1.get(i);
            String s = list1.get(i);
            System.out.println(s + ":" + s.length());

        }
    }
}
