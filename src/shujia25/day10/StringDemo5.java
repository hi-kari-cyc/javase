package shujia25.day10;

/*
        String类的获取功能
            int length()
            char charAt(int index)
            int indexOf(int ch)
            int indexOf(String str)
            int indexOf(int ch,int fromIndex)
            int indexOf(String str,int fromIndex)
            lastIndexOf()
            String substring(int start)
            String substring(int start,int end)

 */

public class StringDemo5 {
    public static void main(String[] args) {
        String s = "helloworldoworldoworld";
        System.out.println(s.length());   // 获取字符串中的字符个数

        // char charAt(int index)      根据索引获取对应位置上的字符
        System.out.println(s.charAt(5));
        // IndexOutOfBoundsException - 如果 index参数为负数或不小于此字符串的长度。

        // int indexOf(int ch)     传入ASCII码值得到对应字符在字符串从左往右第一次出现的位置，如果不存在返回-1
        System.out.println(s.indexOf(100));
        System.out.println(s.indexOf(97));

        // int indexOf(String str)   获取小字符串在大字符串中第一次出现的位置，返回的是小字符串第一个字符的索引
        System.out.println(s.indexOf("owo"));

        // int indexOf(int ch,int fromIndex)  从指定位置找字符的索引,返回在大字符串中的位置索引
        System.out.println(s.indexOf(100,11));

        // int indexOf(String str,int fromIndex)     从指定位置找小字符串在大字符串中第一次出现的位置，返回的是小字符串第一个字符的索引
        System.out.println(s.indexOf("owo",2));

        // String substring(int start)    字符串截取，从指定位置截取到末尾
        String s1 = s.substring(2);
        System.out.println(s1);

        // String substring(int start,int end)  字符串截取，截取一部分  左闭右开[start,end)
        String s2 = s.substring(4,10);
        System.out.println(s2);

        System.out.println("==================");
        // lastIndexOf()     用于查找指定字符或子字符串在字符串中最后一次出现的位置（索引）,返回查找字符串的首字符索引
        int index = s.lastIndexOf("owo");
        System.out.println(index);
    }
}
