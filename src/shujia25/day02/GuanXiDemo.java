package shujia25.day02;

/*
    关系运算符: == !=  >   <   >=   <=

    关系运算符表达式的结果一定是布尔类型的!

    注意：不同数据类型进行比较时，会进行类型提升以保持操作数的类型一致。这是为了确保比较操作的正确性和一致性
 */
public class GuanXiDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        System.out.println("-------------------------------------");
        // 赋值的时候要注意类型问题
        int x = 10;
        int y = 10;
        boolean flag = (x == y);
//        boolean flag = (x = y);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (b1 == b2);
        boolean b4 = (b1 = b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
