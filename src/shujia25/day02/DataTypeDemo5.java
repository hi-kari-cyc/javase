package shujia25.day02;

/*
    记住常见的三个字符所对应的ASCII码值:
        '0'  48
        'A'  65
        'a'  97
 */
public class DataTypeDemo5 {
    public static void main(String[] args) {
        System.out.println('a'); // 97
        System.out.println('a'+1); // 98
        System.out.println((char)('A'+10));   // K
        System.out.println("hello" + 'a' + 1); // helloa1
        System.out.println('a' + 1 + "hello");  // 98hello
        System.out.println("5+5=" + 5 + 5);    // 5+5=55
        System.out.println("5+5=" + (5 + 5)); //5+5=55
        System.out.println(5 + 5 + "=5+5"); //10=5+5
    }
}
