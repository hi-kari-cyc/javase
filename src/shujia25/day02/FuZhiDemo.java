package shujia25.day02;

/*
    = , +=, -=, *=, /=, %=

 */
public class FuZhiDemo {
    public static void main(String[] args) {
        int a = 10;
        a %= 10;
        System.out.println(a);
/*
    short s=1, s = s+1;
    short s=1, s += 1;
    上面两个代码有没有问题，如果有，那里有问题
    千万不要认为s+=1等价于s = s+1!!!
    实际上 s+=1等价于 s=(s的数据类型)(s+1)
 */
        short s = 1;
        s = (short) (s + 1);
        System.out.println(s);

        short s1 = 1;
        s1 += 1;
        System.out.println(s1);

        byte m = 127;
        m += 1;
        System.out.println(m);

        double s2 = 1;
        s2 = s2 + 1;
        System.out.println(s2);
    }
}