package shujia25.regular;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularDemo10 {
    public static void main(String[] args) {
        String regex = "\\w{3,}";
        String str = "abcdef123;!";
        //public boolean matches(String regex)告诉这个字符串是否匹配给定的regular expression 。
        // matches 表示的是目标字符串整体是否符合正则表达式
        System.out.println(str.matches(regex));
        System.out.println("======================================");

        regex = "[a-z]{2,}";
        str = "abc def hello 123dsa";
        System.out.println(str.matches(regex));
        System.out.println(str.replaceAll(regex, "_"));
        System.out.println(str.replaceFirst(regex, "_"));

        System.out.println("=======================================");
        str = "hllo wdw worel spark";
        //public String[] split(String regex)将此字符串拆分为给定的regular expression的匹配。
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("=======================================");
        String[] ws = str.split("w");
        String s = Arrays.toString(ws);
        System.out.println(s);

        System.out.println("=======================================");

        // Java中正则表达式的操作
        //字符串的查找操作：Pattern和Matcher
        regex = "\\w{4,7}";
        str = "abcd123qqqq122321dddd44";
        System.out.println(str.replaceAll(regex, "_"));

        //创建一个java对应的正则表达式对象
        //public static Pattern compile(String regex)将给定的正则表达式编译为模式
        Pattern compile = Pattern.compile(regex);
        //public Matcher matcher(CharSequence input)创建一个匹配器，匹配给定的输入与此模式。
        Matcher matcher = compile.matcher(str);
//        boolean matches()
        //尝试将整个区域与模式进行匹配。
        System.out.println(matcher.matches());      // 整体匹配
        System.out.println(matcher.find());         // 从左向右查找匹配

        //public int start()返回上一个匹配的起始索引。
        System.out.println(matcher.start());
        System.out.println(matcher.end());     // 返回给定捕获子序列的最后一个字符之后的偏移量
        //String group()
        //返回与上一个匹配匹配的输入子序列。
        System.out.println(matcher.group());
        System.out.println("====================================");
        //boolean find()
        //尝试找到匹配模式的输入序列的下一个子序列。
        System.out.println(matcher.find());
        //int end()
        //返回最后一个字符匹配后的偏移量。
        //public int start()返回上一个匹配的起始索引。
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        //String group()
        //返回与上一个匹配匹配的输入子序列。
        System.out.println(matcher.group());
        System.out.println(matcher.group());
    }
}