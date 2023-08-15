package shujia25.day11;

/*
    java提供了一个专门对日期做操作的类：Date
    构造方法：
        Date() 分配一个 Date对象，并初始化它，以便它代表它被分配的时间，测量到最近的毫秒。
        Date(long date) 分配一个 Date对象，并将其初始化为表示自称为“时代”的标准基准时间以后的指定毫秒数，即1970年1月1日00:00:00 GMT。

    SimpleDateFormat类对日期进行格式化。
        构造方法：
            SimpleDateFormat(String pattern) 使用给定模式 SimpleDateFormat并使用默认的 FORMAT语言环境的默认日期格式符号。

    时间戳转成标准格式的步骤：
        1、获得时间戳并封装成Date类对象
        2、创建SimpleDateFormat对象，编写格式模板
        3、使用SimpleDateFormat对象将Date进行格式化
 */

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(1688905325027L);
        System.out.println(date1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date1));

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
    }
}
