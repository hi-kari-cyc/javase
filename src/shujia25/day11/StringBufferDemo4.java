package shujia25.day11;

/*
    StringBuffer作为参数传递（难点）

    注意StingBuffer和String的不同点：
        Demo3中s1+s2创建了一个新的字符串地址值发生改变
        Demo4中的sb1.append(sb2)是在原字符串基础上增加字符串，在原来传入方法的地址值上做出改变

 */

public class StringBufferDemo4 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println("sb1: " + sb1 + ", sb2: " + sb2);  //
        change(sb1, sb2);
        System.out.println("sb1: " + sb1 + ", sb2: " + sb2);  //
    }

    public static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;  // world赋给了sb1
        sb2 = sb1.append(sb2);
        System.out.println("sb1: " + sb1 + ", sb2: " + sb2);  //
    }
}
