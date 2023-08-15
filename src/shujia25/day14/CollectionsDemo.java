package shujia25.day14;

/*
    Collections：该类是由java提供给我们专门操作集合的工具类（对list集合进行操作）
    静态成员方法：
        public static <T> void sort(List<T> list)
        public static <T> int binarySearch(List<?> list,T key)
        public static <T> T max(Collection<?> coll)
        public static void reverse(List<?> list)
        public static void shuffle(List<?> list)


    我们之前说过，即便Vector是线程安全的，我们也不用，我们可以使用Collections工具类将不安全的集合变成一个安全的集合

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        // public static <T> void sort(List<T> list)    对list集合做排序(底层是归并排序)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(2);
        list.add(16);
        list.add(15);
        list.add(33);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // public static <T> int binarySearch(List<?> list,T key)  二分查找
        System.out.println(Collections.binarySearch(list,23));
        System.out.println(Collections.binarySearch(list,223));

        // public static <T> T max(Collection<?> coll)  获取最大值
        System.out.println(Collections.max(list));

        // public static void reverse(List<?> list)     集合反转
        Collections.reverse(list);
        System.out.println(list);

        // public static void shuffle(List<?> list)     随机排序集合
        //在java中这里的shuffle将序列中元素随机打乱
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("-------------------------------");


        // 使用Collections工具类将不安全的集合变成一个安全的集合
        /*
            synchronizedCollection(Collection<T> c)
                返回由指定集合支持的同步（线程安全）集合。
            static <T> List<T> synchronizedList(List<T> list)
                返回由指定列表支持的同步（线程安全）列表。
            static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)
                返回由指定地图支持的同步（线程安全）映射。
            static <K,V> NavigableMap<K,V> synchronizedNavigableMap(NavigableMap<K,V> m)
                返回由指定的可导航地图支持的同步（线程安全）可导航地图。
            static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s)
                返回由指定的可导航集支持的同步（线程安全）可导航集。
            static <T> Set<T> synchronizedSet(Set<T> s)
                返回由指定集合支持的同步（线程安全）集。
            static <K,V> SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m)
                返回由指定的排序映射支持的同步（线程安全）排序映射。
            static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s)
                返回由指定的排序集支持的同步（线程安全）排序集。
         */

        // 将一个线程不安全的ArrayList集合变成安全的集合
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = Collections.synchronizedList(list1);
        System.out.println(System.identityHashCode(list1));     //  分别取list1和list2的地址值
        System.out.println(System.identityHashCode(list2));

        // 下次想创建一个线程安全的ArrayList可以直接使用Collections工具类
        List<String> list3 = Collections.synchronizedList(new ArrayList<String>());

    }
}
