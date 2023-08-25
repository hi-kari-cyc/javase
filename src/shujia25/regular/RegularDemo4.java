package shujia25.regular;

/*
    元字符（范围类）
    []中可以使用  -  表示一个范围，一般情况下，数字-数字，字母-字母
 */

public class RegularDemo4 {
    public static void main(String[] args) {
        String line = "fvtyhiuj2343helloHe!!!llo1234a;asdfwaevo;iweq..@";
        System.out.println(line);
        System.out.println("============================================");

        //需求1：我想要匹配所有的小写字母 [a-z]
        String regex1 = "[a-z]";
        System.out.println(line.replaceAll(regex1, "_"));

        //需求2：我想要匹配所有的大写字母
        String regex2 = "[A-Z]";
        System.out.println(line.replaceAll(regex2, "_"));

        //需求3：我即想要匹配小写字母，也想要匹配大写字母
        String regex3 = "[A-Z|a-z]";
//        String regex3 = "[A-Za-z]";
        System.out.println(line.replaceAll(regex3, "_"));

        //需求4：我想要匹配所有的数字
        String regex4 = "[0-9]";
        System.out.println(line.replaceAll(regex4, "_"));

        //需求5：我想匹配不仅大小写数字还有感叹号，分号咋办？
        String regex5 = "[A-Z|a-z!-<]";
        System.out.println(line.replaceAll(regex5, "_"));

        //需求6：我想匹配除了大小写字母和数字以外的符号
        String regex6 = "[^0-9A-Za-z]";
        System.out.println(line.replaceAll(regex6, "_"));

    }
}
