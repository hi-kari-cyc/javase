package shujia25.day11;

/*
        每一对基本数据与对应的包装类类型，都可以进行自动装箱和自动拆箱


        构造方法：
        Integer(int value)  构造一个新分配的 Integer对象，该对象表示指定的 int值。
        Integer(String s)   构造一个新分配 Integer对象，表示 int由指示值 String参数。

    Integer中的成员方法：
        int类型和String类型的相互转换
        int –-> String     toString(int i)
        String –-> int    valueOf(String s) parseInt(String s)

        public int intValue()
        public static int parseInt(String s)
        public static String toString(int i)
        public static Integer valueOf(int i)
        public static Integer valueOf(String s)

        常用的基本进制转换
        public static String toBinaryString(int i)
        public static String toOctalString(int i)
        public static String toHexString(int i)

 */
public class IntegerDemo {
    public static void main(String[] args) {
        int a = 10;
        // Integer
        // Integer(int value)
//        Integer i1 = new Integer(100);
        Integer i1 = 100;   // 自动装箱
        System.out.println(i1);

        int i2 = i1 + 100;  // 把值取出来加100加上i1赋给int类型的值 相当于把箱子拆开拿出来在和另外一个值相加 ----- 自动拆箱
        System.out.println(i2);

        Character c1 = 'a'; // 都可以自动装箱和拆箱

        // Integer(String s)     String –-> int
//        Integer i3 = new Integer("ddd");  // NumberFormatException
        Integer i4 = new Integer("666");  // 字符串类型必须是数值型
        System.out.println(i4);

        // int –-> String
        String s1 = String.valueOf(100);

        // public int intValue()        取出包装的数值
        int i = i1.intValue();
        System.out.println(i);

        // public static int parseInt(String s)     将字符串转换成int类型    String –-> int
        int i5 = Integer.parseInt("100");
//        int i3 = Integer.parseInt("ddd");
        System.out.println(i5);

        // public static String toString(int i)     将数值转换为字符串   int –-> String
        String s2 = Integer.toString(200);
        System.out.println(s2);

        // public static Integer valueOf(int i)     将int值转换为Integer类型
        Integer i6 = Integer.valueOf(300);   // 装箱过程

        // public static Integer valueOf(String s)      String --> Integer
        Integer i7 = Integer.valueOf("1000");
//        Integer integer = Integer.valueOf("dddd");
        System.out.println(i7);

        // public static String toBinaryString(int i)   十进制转换为二进制
        String bs = Integer.toBinaryString(100);
        System.out.println(bs);

        // public static String toOctalString(int i)    十进制转换为八进制
        String os = Integer.toOctalString(100);
        System.out.println(os);

        // public static String toHexString(int i)      十进制转换为十六进制
        String hs = Integer.toHexString(100);
        System.out.println(hs);

    }
}
