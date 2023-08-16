package shujia25.day13.test;

import java.util.LinkedList;
import java.util.Objects;

/*
    请用LinkedList模拟栈数据结构的集合，并测试

    栈：先进后出

    题目的本意是自己定义一个类，底层是LinkedList，然后使用自己定义的这个类存储元素，调用自己的方法实现栈

    以后遇见请用xxx技术实现xxx，自己写个类包装一下

 */
public class LinkedListTest1 {
    public static void main(String[] args) {

        // 创建自己的集合类底层是LinkedList
        MyStack myStack = new MyStack();
        myStack.addYuanSu("hello");
        myStack.addYuanSu("world");
        myStack.addYuanSu("java");
        myStack.addYuanSu("hadoop");
        myStack.addYuanSu("hive");
        myStack.addYuanSu("hbase");
        myStack.addYuanSu("spark");

        int s = myStack.getSize();    // getSize值如果定义在for循环里会一直在变
                                      // 先保存下来getSize值就固定下来了
        for (int i = 0; i < s; i++) {
            System.out.println(myStack.chuZhan());
        }
    }
}

class MyStack {
    private final LinkedList<Object> linkedList;

    public MyStack() {
        linkedList = new LinkedList<>();
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