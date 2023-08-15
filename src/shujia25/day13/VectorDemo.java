package shujia25.day13;

/*
    List接口实现子类：Vector
    特点：底层数据结构也是数组，查询快，增删慢，线程是安全，效率低，但是即使这个集合类是线程安全的，我们也不使用，后面我们会学习如何将一个线程不安全的类变成一个线程安全的

    特有方法：
        public void addElement(E obj)
        public E elementAt(int index)
        public Enumeration elements()


 */

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // 使用无参构造方法创建Vector对象
        Vector vector = new Vector();

        vector.add("你好");
        vector.addElement("世界"); // 从效果上看，和add方法效果一样，都是将元素添加到集合的末尾处，今后就使用add方法添加元素
        System.out.println(vector);

        vector.add("java");
        vector.add("hello");
        vector.add("java");
        System.out.println(vector);

        //  public E elementAt(int index)   根据索引获取元素值
        System.out.println(vector.elementAt(2));  // 从效果上来看，和get方法效果一样,今后就是用get方法获取元素
        System.out.println(vector.get(2));

        // public Enumeration elements()      获取多个元素(Ctrl+左键 进入Enumeration发现有两个方法hasMoreElements和nextElement)
        Enumeration elements = vector.elements();    // 从效果上来看，和迭代器效果一样，今后就是用迭代器遍历元素
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
