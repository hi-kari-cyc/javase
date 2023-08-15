package shujia25.day13;

/*
    增强for循环：是用来替代迭代器的
        应用场景：只能遍历Collection集合和数组

    语句定义格式：
        for(元素数据类型 变量名:Collection集合对象名/数组名){
            变量接收的就是一个一个的元素
        }
        例：
            for(int i : arr){
                System.out.println(i);
            }
        解释：
            增强for循环 从集合或者数组中一步一步的取出元素赋给变量,直接使用被赋值的变量即可
 */

import java.util.ArrayList;

public class ZengForDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

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

//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }

        for (String s : list1) {
            System.out.println(s);
        }

        int[] arr = {11, 22, 33, 44, 55};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("----------------------------------");
        // 替换迭代器
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        System.out.println(list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
