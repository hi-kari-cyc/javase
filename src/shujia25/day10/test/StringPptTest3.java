package shujia25.day10.test;

/*
        1：遍历获取字符串中的每一个字符
	    2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 */
public class StringPptTest3 {
    public static void main(String[] args) {
        String s = "666HelloWorld888";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c + "\t");

            if (c >= 'A' && c <= 'Z') {
                count1++;
            } else if (c >= 'a' && c <= 'z') {
                count2++;
            } else if (c >= '0' && c <= '9') {
                count3++;
            }
        }
        System.out.println(" ");
        System.out.println("大写字母字符个数为：" + count1);
        System.out.println("大写字母字符个数为：" + count2);
        System.out.println("大写字母字符个数为：" + count3);
    }
}