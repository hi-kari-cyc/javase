package shujia25.day13;

/*
    泛型通配符<?>
        任意类型，如果没有明确，那么就是Object以及任意的Java类了

    上界通配符：
        ? extends E
            向下限定，E及其子类
    下界通配符：
        ? super E
            向上限定，E及其父类
 */

import java.util.ArrayList;
import java.util.LinkedList;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}

public class FanXingDemo3 {
    public static void main(String[] args) {

//        ArrayList<Animal> list = new ArrayList<Dog>();        不能直接给子类
        ArrayList<? extends Animal> list0 = new ArrayList<>();  // 可以在集合中传入Animal及Animal的子类类型
        ArrayList<? extends Animal> list1 = new ArrayList<Dog>(); // 在Animal集合中传入Dog类型
        ArrayList<? extends Animal> list2 = new ArrayList<Cat>();
        ArrayList<? extends Animal> list3 = new ArrayList<Animal>();
//        ArrayList<? extends Animal> list4 = new ArrayList<Object>();
        // 例：
        // addAll(Collection<? extends E> c)
        // 将来传入的是Collection相关集合并且<>中的类型是E或者E的子类，如：addALl(List<String> "s")


        ArrayList<? super Animal> list5 = new ArrayList<Animal>();
        ArrayList<? super Animal> list6 = new ArrayList<Object>();
//        ArrayList<? super Animal> list7 = new ArrayList<Dog>();

        // ?表示任意数据类型都可以
        ArrayList<?> list8 = new ArrayList<>();
    }
}
