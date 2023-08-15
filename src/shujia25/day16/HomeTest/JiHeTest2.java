package shujia25.day16.HomeTest;

import java.util.*;

/*
    使用HashSet和TreeSet存储多个商品信息，遍历并输出；
    其中商品属性：编号，名 称，单价，出版社；要求向其中添加多个相同的商品，验证集合中元素的唯一性。
        提示：向HashSet中添加自定义类的对象信息，需要重写hashCode和equals( )
             向TreeSet中添加自定义类的对象信息，需要实现Comparable接口，指定比较 规则
 */
public class JiHeTest2 {
    public static void main(String[] args) {
        // 创建HashSet集合
        HashSet<books> books1Hash = new HashSet<>();
        // 创建TreeSet集合
        TreeSet<books> books1Tree = new TreeSet<>(new Comparator<books>() {
            @Override
            public int compare(books o1, books o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // 创建元素对象
        books b1 = new books("0x001", "斗罗大陆", 18.5,"安徽教育出版社");
        books b2 = new books("0x002", "斗破苍穹", 20.0,"新华出版社");
        books b3 = new books("0x003", "猫妖传", 7.9,"中国体育出版社");
        books b4 = new books("0x001", "斗罗大陆", 18.5,"安徽教育出版社");

        books1Hash.add(b1);
        books1Hash.add(b2);
        books1Hash.add(b3);
        books1Hash.add(b4);

        books1Tree.add(b1);
        books1Tree.add(b2);
        books1Tree.add(b3);
        books1Tree.add(b4);

        System.out.println(books1Hash);
        System.out.println(books1Tree);
        // 打印出的集合均去重

    }
}


