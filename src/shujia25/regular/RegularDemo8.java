package shujia25.regular;

/*
    分组：()
 */

public class RegularDemo8 {
    public static void main(String[] args) {
        String line = "qqqqqqqabc123AAAABBB1123abcabcabc123123123QWEabc789789qweabc";   // abc123123  abc789789

        String regex = "abc(123|789){2}";
        System.out.println(line.replaceAll(regex, "_"));

    }
}
