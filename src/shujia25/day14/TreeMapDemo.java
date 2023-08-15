package shujia25.day14;

/*
    TreeMap: 底层是红黑树
    两种排序方式：针对于key来进行排序
        1、自然排序
        2、比较器排序
 */


import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // 创建集合对象
        TreeMap<Student, String > map = new TreeMap<>(new Comparator<Student>(){
            @Override
            // o1待插入  o2根节点
            public int compare(Student o1,Student o2){
                // 主要条件
                int i = o1.getAge()- o2.getAge();
                // 次要条件
                return (i==0)?o1.getName().compareTo(o2.getName()):i;
            }
        });

        // 创建元素对象并添加到集合
        map.put(new Student("张三",20),"吃");
        map.put(new Student("李四",15),"喝");
        map.put(new Student("王五",18),"玩");
        map.put(new Student("张三",21),"乐");

        System.out.println(map);
    }
}
