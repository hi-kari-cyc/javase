package shujia25.regular;

/*
元字符（量词分类）
    ?:出现了0次或者1次        == {0,1}
    +:代表出现了1次或者多次     == {1,}
    *:代表出现了任意次          == {0,}
    {n}:代表出现了n次
    {n,m}:出现了n-m次
    {n,}:代表出现了至少n次
 */

public class RegularDemo7 {
    public static void main(String[] args) {
        String line = "qqqqqqqabc123AAAABBB1123abcabcabc123123123QWEabcccqweabc";
        System.out.println(line);
        System.out.println("-------------------------------------------------------");

        //匹配一个组合出现多次
        String regex1 = "abc?";
        System.out.println(line.replaceAll(regex1, "_"));

        String regex2 = "abc+";
        System.out.println(line.replaceAll(regex2, "_"));

        String regex3 = "abc*";
        System.out.println(line.replaceAll(regex3, "_"));

        // 匹配单个字符出现多次
        String regex4 = "^q?";
        System.out.println(line.replaceAll(regex4, "_"));

        String regex5 = "^q+";
        System.out.println(line.replaceAll(regex5, "_"));

        String regex6 = "^q*";
        System.out.println(line.replaceAll(regex6, "_"));

        /*
          判断最近的那个字符或者组合出现了次数
              {n}:代表出现了n次
              {n,m}:出现了n-m次  [n,m]
              {n,}:代表出现了至少n次
         */
        System.out.println("-------------------------------------------------------");
        String regex7 = "(abc){2}";
        System.out.println(line.replaceAll(regex7, "_"));

        String regex8 = "q{1,5}";
        System.out.println(line.replaceAll(regex8, "_"));

        String regex9 = "q{8,}";
        System.out.println(line.replaceAll(regex9, "_"));
    }
}
