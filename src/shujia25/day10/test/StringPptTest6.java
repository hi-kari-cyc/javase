package shujia25.day10.test;

/*
        统计大串中小串出现的次数（作业）
举例：在字符串” woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”中java出现了5次

        1、先找Java第一次出现的位置 indexof()
        2、截取Java后面的字符串继续查找

 */
public class StringPptTest6 {
    public static void main(String[] args) {
        String s = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        System.out.println(cha(s));
    }

    public static int cha(String s) {
        int count = 0;
        int index = -1;
        while (true) {
            index = s.indexOf("java", index + 1);
            if (index != -1) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
