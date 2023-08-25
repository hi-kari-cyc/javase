package shujia25.regular;

/*
    元字符（预定义分类）
    使用预定义类匹配的时候，如果只是匹配一个范围，就不用再使用中括号了
    \d == [0-9] 代表的是数字
    \D == [^0-9]代表的是非数字
    \s == 空白字符（空格，tab键）
    \w == [a-zA-Z0-9]
    \W == [^a-zA-Z0-9]
    .  == 任意字符
 */

public class RegularDemo5 {
    public static void main(String[] args) {
        String line = "fvtyhiuj    2343he lloHe!!!llo1  234a;asd    fwae    vo;iweq..@";
        System.out.println(line);
        System.out.println("============================================");

        // 匹配数字
//        String regex1 = "[0-9]";
        String regex1 = "\\d";      //  \ 表示转义字符  将\d 转为特殊含义
        System.out.println(line.replaceAll(regex1, "_"));

        // 匹配非数字
        String regex2 = "\\D";
        System.out.println(line.replaceAll(regex2, "_"));

        // 匹配空白字符
        String regex3 = "\\s";
        System.out.println(line.replaceAll(regex3, "_"));

        // \w == [a-zA-Z0-9]
        String regex4= "\\w";
        System.out.println(line.replaceAll(regex4, "_"));

        // \W == [^a-zA-Z0-9]
        String regex5 = "\\W";
        System.out.println(line.replaceAll(regex5, "_"));

        // 匹配任意字符
        String regex6 = ".";
        System.out.println(line.replaceAll(regex6, "_"));
    }
}
