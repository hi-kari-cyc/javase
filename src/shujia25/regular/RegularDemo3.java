package shujia25.regular;

/*
    元字符（字符类）
    一般情况下，我们会去匹配，查找某一个字符或者是以某个字符分割
    []: 中括号表示的是可选项。字符集合。匹配所包含的任意一个字符。
 */

public class RegularDemo3 {
    public static void main(String[] args) {
        String line = "fvtyhiuj2343helloHello1234aasdfwaevoiweq..@";

        //需求：将上面字符串中的e或a替换成_
        //中括号中的字符是单独来看的
        String s1 = line.replaceAll("[ae]", "_");
        System.out.println(s1);

        String s2 = line.replaceAll("[a|e]", "_");
        System.out.println(s2);

        String s3 = line.replaceAll("(ae)", "_");
        System.out.println(s3);

    }
}
