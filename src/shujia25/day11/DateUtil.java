package shujia25.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private DateUtil() {
    }

    public static String formatDate(long timestamp) {
        Date date = new Date(timestamp);

        // 编写格式模板
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);

    }
}

class test0 {
    public static void main(String[] args) {
        // 使用工具类将当前的时间戳变成指定格式的时间
        String time = DateUtil.formatDate(System.currentTimeMillis());
        System.out.println("当前的时间是" + time);
    }
}
