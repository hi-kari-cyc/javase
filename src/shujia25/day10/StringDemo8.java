package shujia25.day10;

/*
        按字典顺序比较两个字符串
                int compareTo(String str)
                int compareToIgnoreCase(String str)

 */
public class StringDemo8 {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "world";

        // int compareTo(String str)        判断这两个字符串是否一样
        System.out.println(s.compareTo(s1));
        // 如果两个字符串相等，则返回0
        // 在比较过程中，会逐个比较字符串中对应位置的字符的Unicode编码值，直到找到不同的字符或比较完所有字符为止
        // 返回值为不同的字符的ASCII码值之差

        String s2 = "hel";
        System.out.println(s.compareTo(s2));  //  return len1 - len2;

        String s3 = "Hello";
        System.out.println(s.compareTo(s3));


        /*
                int len1 = value.length;
                int len2 = anotherString.value.length;
                int lim = Math.min(len1, len2);
                char v1[] = value;
                char v2[] = anotherString.value;

                int k = 0;
                while (k < lim) {
                    char c1 = v1[k];
                    char c2 = v2[k];
                    if (c1 != c2) {
                        return c1 - c2;
                    }
                    k++;
                }
                return len1 - len2;
         */


        // int compareToIgnoreCase(String str)    比较字符串，忽略大小写 用法和compareTo类似
        System.out.println(s.compareToIgnoreCase(s3));



    }
}
