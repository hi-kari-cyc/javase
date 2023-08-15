package shujia25.day10;

/*
    protected void finalize(): 做垃圾回收的，但是具体什么时候回收不清楚
 */

public class ObjectDemo3 {
    public static void main(String[] args) {
        Object o = new Object();

    }
}

/*
        终结方法 finalize() 是 Java 提供的一种机制，用于在对象被垃圾回收之前执行一些清理操作。
        当对象即将被垃圾回收器回收时，垃圾回收器会先调用该对象的 finalize() 方法
        在 finalize() 方法中，你可以编写代码来释放对象所占用的资源、关闭文件、断开连接或执行其他清理操作。
        它通常被用于回收非内存资源，例如关闭数据库连接、释放文件句柄等

 */