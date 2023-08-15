package shujia25.day13;

/*
    LinkedList:
    特点：底层数据结构是一个双链表，增删快，查询慢，线程不安全的，效率高

    根据链表的的特点，LinkedList具有的特有方法：
        public void addFirst(E e)及addLast(E e)
        public E getFirst()及getLast()
        public E removeFirst()及public E removeLast()

 */

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        linkedList.add("hadoop");
        linkedList.add("hello");

        System.out.println(linkedList);
        System.out.println("==================================================");

        // public void addFirst(E e)及addLast(E e)
        linkedList.addFirst("你好");
        linkedList.addLast("世界");
        System.out.println(linkedList);

        // public E getFirst()及getLast()
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("==================================================");

        // public E removeFirst()及public E removeLast()
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
