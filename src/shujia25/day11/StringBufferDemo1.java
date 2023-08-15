package shujia25.day11;

/*
        获取StringBuffer容量大小：
            xxx.capacity()
        获取存储字符串中的字符个数：
            xxx.length()

        添加功能
            public StringBuffer append(String str)
            public StringBuffer insert(int offset,String str)
        删除功能
            public StringBuffer deleteCharAt(int index)
            public StringBuffer delete(int start,int end)
        替换功能
            public StringBuffer replace(int start,int end,String str)
        反转功能
            public StringBuffer reverse()

 */
public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        // 获取StringBuffer的容量大小
        System.out.println(sb.capacity());
        // 获取实际存储的字符大小
        System.out.println(sb.length());

//         public StringBuffer append(String str)    在末尾添加一个字符串
        StringBuffer sb2 = sb.append(100);
        // sb字符本身加上一个字符串100 再赋给sb2

        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println(sb == sb2);
        System.out.println("=====================================");

        sb.append(100);
        sb.append(12.34);
        sb.append(true);
        sb.append("你好");
        // 无论append是什么数据类型，一旦进入StringBuffer中都是一个一个字符
        // 所以StringBuffer中只能存在一个一个字符构成的字符串，不存在其他的数据类型
        // 缺点：每次添加只能在末尾添加
        System.out.println(sb);

        // public StringBuffer insert(int offset,String str)   指定位置添加字符串
        sb.insert(6,"世界");
        System.out.println(sb);

        // public StringBuffer deleteCharAt(int index)      根据索引删除字符
        sb.deleteCharAt(7);
        System.out.println(sb);

        System.out.println("=====================================");
        // public StringBuffer delete(int start,int end)        根据索引删除一部分字符[start,end)
        sb.delete(8,13);
        System.out.println(sb);

        // public StringBuffer replace(int start,int end,String str)        传入索引，将这一部分字符替换为其他字符[start,end)
        sb.replace(6,7,"java");
        System.out.println(sb);

        // public StringBuffer reverse()        字符串反转
        sb.reverse();
        System.out.println(sb);
    }
}
