package shujia25.day10;

/*
        String类的其他功能
            替换功能
                String replace(char old,char new)
                String replace(String old,String new)
            去除字符串两空格
                String trim()

 */
public class StringDemo7 {
    public static void main(String[] args) {
        String s = "qwerdfpdahellojavahelloagjavalkdjava";

        // String replace(char old,char new)
        String s1 = s.replace('a','_');
        System.out.println(s1);
        System.out.println(s);
        System.out.println("===============================");

        // String replace(String old,String new)
        String s2 = s.replace("java","|");
        System.out.println(s2);
        System.out.println(s);
        System.out.println("===============================");

        // String trim()
        String s3 = "    hello    world   ";
        String s4 = s3.trim();
        System.out.println(s4);
        System.out.println(s3);


    }
}
