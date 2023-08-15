package shujia25.day11;

/*
        截取功能
            public String substring(int start)
            public String substring(int start,int end)
        截取功能和前面几个功能的不同
            返回值类型是String类型，本身没有发生改变

        String和StringBuffer是两个不同是数据类型，但是StringBuffer可以当作String来使用

 */
public class StringBufferDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HelloWorld");
        String s1 = sb.substring(3);
        // 截取出来 原本的字符串没有动（截取了一个新的字符串出来）
        System.out.println(sb);
        System.out.println(s1);

        // public String substring(int start,int end)
        String s2 = sb.substring(4,7);
        System.out.println(s2);
    }
}
