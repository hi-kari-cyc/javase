package shujia25.regular;

/*
    题目：治疗口吃

将字符串"我我我我我我我..........我........要要要要要.............要要要要....学习习习......习习习习习习习习习编程程程程程程程程程程程.....程程程程程程程程"
    ----> "我要学习编程"

分析：1、先将.去掉      2、再将叠词变成一个
 */
public class Test {
    public static void main(String[] args) {
        String line = "我我我我我我我..........我........要要要要要.............要要要要....学习习习......习习习习习习习习习编程程程程程程程程程程程.....程程程程程程程程";

        String s = line.replaceAll("[.]", "");
        String regex1 = "我+";
        String regex2 = "要+";
        String regex3 = "习+";
        String regex4 = "程+";
        String s1 = s.replaceAll(regex1, "我");
        String s2 = s1.replaceAll(regex2, "要");
        String s3 = s2.replaceAll(regex3, "习");
        String s4 = s3.replaceAll(regex4, "程");
        System.out.println(s4);

        // 改进
        String regex = "(.)(\\1+)";
        System.out.println(s.replaceAll(regex, "$1"));

    }
}
