package shujia25.day11;

/*
    基本数据类型char对应的包装类类型：Character

    构造方法：
        public Character(char value)

    成员方法：
        public static boolean isUpperCase(char ch)
        public static boolean isLowerCase(char ch)
        public static boolean isDigit(char ch)
        public static char toUpperCase(char ch)
        public static char toLowerCase(char ch)

 */

public class CharacterDemo {
    public static void main(String[] args) {
        // public Character(char value)
        Character c1 = new Character('a');     // 高亮原因是因为可以自动装箱
        System.out.println(c1);

        // public static boolean isUpperCase(char ch)       判断一个字符是否为大写
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));

        // public static boolean isLowerCase(char ch)       判断一个字符是否为小写
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));

        // public static boolean isDigit(char ch)       判断一个字符是否是数字字符
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('w'));

        // public static char toUpperCase(char ch)      转大写
        System.out.println(Character.toUpperCase('a'));

        // public static char toLowerCase(char ch)      转小写
        System.out.println(Character.toLowerCase('A'));
    }
}
