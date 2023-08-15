package shujia25.day13.test;

import java.util.LinkedList;
import java.util.Objects;

/*
    请用LinkedList模拟栈数据结构的集合，并测试

    栈：先进后出

    如果面试遇到这个题，写法一的解法是0分

    题目的本意是自己定义一个类，底层是LinkedList，然后使用自己的类存储元素，调用自己的方法实现栈

 */
public class LinkedListTest1 {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//
//        list.add("hello");
//        list.add("world");
//        list.add("java");
//        list.add("hadoop");
//        list.add("hive");
//
//        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.println(list.get(i));
//        }

        // 创建自己的集合类底层是LinkedList
        MyStack myStack = new MyStack();
        myStack.addYuanSu("hello");
        myStack.addYuanSu("world");
        myStack.addYuanSu("java");
        myStack.addYuanSu("hadoop");
        myStack.addYuanSu("hive");
        myStack.addYuanSu("hbase");
        myStack.addYuanSu("spark");

        int s = myStack.getSize();
        for (int i = 0; i < s; i++) {
            System.out.println(myStack.chuZhan());
        }
    }
}

class MyStack {
    private LinkedList linkedList;

    public MyStack() {
        linkedList = new LinkedList();
    }

    public void addYuanSu(Object obj) {
        linkedList.addFirst(obj);
    }

    public Object chuZhan() {
        return linkedList.removeFirst();
    }

    public int getSize() {
        return linkedList.size();
    }
}