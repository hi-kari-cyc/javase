package shujia25.regular;

/*
    原义字符，本身也可以是一个正则表达式
 */

import java.util.Arrays;

public class RegularDemo2 {
    public static void main(String[] args) {
        String line = "qweHellordf213ABCDHello98.213Hello4_34";

        // public String replaceAll(String regex, String replacement)
        String s = line.replaceAll("e", "@");
        System.out.println(s);

        // public String[] split(String regex, int limit)
        String[] split = line.split("e",5);
        System.out.println(Arrays.toString(split));
    }
}
