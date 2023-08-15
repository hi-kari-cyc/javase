package shujia25.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List list1 = new ArrayList();

        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("赵六", 21);

        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());    // 打印的是重写后的toString方法
        }
    }
}
