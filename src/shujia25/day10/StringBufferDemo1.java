package shujia25.day10;

/*
StringBuffer:  (StringBuilder)
    线程安全，可变的字符序列。
    字符串缓冲区就像一个String ，但可以修改。
    在任何时间点，它包含一些特定的字符序列，但可以通过某些方法调用来更改序列的长度和内容。

    构造方法：
        public StringBuffer()
        public StringBuffer(int capacity)
        public StringBuffer(String str)

    方法：
        capacity()   返回当前容量

 */

public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        // 获取StringBuffer容量大小    初始默认大小16个字符

        //public StringBuffer()   无参构造方法
        System.out.println(sb1.capacity());

        /*
            public StringBuffer() {
                super(16);
            }
         */
        // public StringBuffer(int capacity)   创建字符的时候给点容量
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println(sb2.capacity());

        // public StringBuffer(String str)     创建字符的时候给个初始值
        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println(sb3.capacity());
    }
}
