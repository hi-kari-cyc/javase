package shujia25.regular;

/*
    元字符（边界分类）
    ^:以xxx开头
    $:以xxx结尾
    \b:单词边界
    \B:非单词边界
 */

import java.util.Arrays;

public class RegularDemo6 {
    public static void main(String[] args) {
        String line = "www.baidu.com";

        String regex1 = "[^w]";  // 匹配除了w以外的字符
        String regex2 = "^w";   // 匹配以w开头的字符

        System.out.println(line.replaceAll(regex1, "_"));
        System.out.println(line.replaceAll(regex2, "_"));

        String regex3 = "com$";
        System.out.println(line.replaceAll(regex3, "_"));

        System.out.println("------------------------------------------------");
        String s2 = "hello woreld da a vw java h";
        System.out.println(s2);
        System.out.println(s2.replaceAll("\\b", "_"));
        System.out.println(s2.replaceAll("\\B", "_"));

    }
}
