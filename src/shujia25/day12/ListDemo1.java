package shujia25.day12;


/*
    因为List接口是继承自Collection接口的，所以，我们可以直接根据使用Collection集合的操作，同样适配List集合的
    Collection:
        List: 存储的元素是有序（指的是存储和取出的顺序一致）的，且可以发生重复，并且有索引的概念，可以根据索引获取元素
        Set: 存储的元素是无序（指的是存储和取出的顺序不一致）的，且唯一的，没有索引。
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // 创建一个List集合对象
        List l1 = new ArrayList();

        l1.add("hello");
        l1.add("world");
        l1.add("java");
        l1.add("hadoop");

        Iterator iterator = l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
