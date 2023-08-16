package shujia25.day12;

import java.util.ArrayList;
import java.util.Collection;

/*

    Collection中的方法2：
        boolean addAll(Collection c)
            注意与add的区别：
                add添加元素，addAll添加集合
        boolean removeAll(Collection c)
        boolean containsAll(Collection c)
        boolean retainAll(Collection c)

 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Integer> c1 = new ArrayList<>();

        // 向c1集合中添加元素(以后一种集合最好只存一种类型.开发规范)
        c1.add(100);
        c1.add(200);
        c1.add(300);

        ArrayList<Integer> c2 = new ArrayList<>();
        c2.add(11);
        c2.add(22);
        c2.add(33);

        ArrayList<Integer> c3 = new ArrayList<>();
        c3.add(1000);
        c3.add(2000);
        c3.add(100);

        // boolean addAll(Collection c)     将另一个集合中的元素加入原集合（集合的拼接）
        c2.addAll(c1);
        System.out.println("c2: " + c2);

        // boolean removeAll(Collection c)      将另一个集合中的元素从当前集合中移除
//        c2.removeAll(c1);
//        System.out.println("c2: " + c2);
        c2.removeAll(c3);
        System.out.println("c2: " + c2);        // 不一定全部拥有才能删，删除相交的部分

        // boolean containsAll(Collection c)        判断是否包含另外一个集合中的元素(必须要完全包含)
        System.out.println(c2.containsAll(c1));

        System.out.println("-----------------------------");
        // boolean retainAll(Collection c)      取交集，将交集的结果存储在调用方法的集合中，另一个集合元素不变
        System.out.println(c1.retainAll(c3));
        System.out.println("c1: " + c1);
        System.out.println("c3: " + c3);
    }
}
