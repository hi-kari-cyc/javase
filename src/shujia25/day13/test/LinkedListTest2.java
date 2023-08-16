package shujia25.day13.test;

import java.util.LinkedList;

/*
        请用LinkedList模拟队列数据结构的集合，并测试

 */
public class LinkedListTest2 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(100);
        myQueue.enQueue(200);
        myQueue.enQueue(300);
        myQueue.enQueue(400);
        myQueue.enQueue(500);
        System.out.println(myQueue);

        int size = myQueue.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println(myQueue.deQueue());
        }
    }
}

class MyQueue {
    private final LinkedList<Object> linkedList;

    public MyQueue() {
        linkedList = new LinkedList<>();
    }

    public void enQueue(Object obj) {
        linkedList.addFirst(obj);
    }

    public Object deQueue() {
        return linkedList.removeLast();
    }

    public int getSize() {
        return linkedList.size();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "linkedList=" + linkedList +
                '}';
    }
}