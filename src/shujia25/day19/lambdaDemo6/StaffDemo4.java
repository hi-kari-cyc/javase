package shujia25.day19.lambdaDemo6;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
    Predicate<T> 断言型接口
        接口类型：
            @FunctionalInterface
            public interface Predicate<T> {
                boolean test(T t);
            }
 */

public class StaffDemo4 {
    private static final List<Staff> staffList = Arrays.asList(
            new Staff(1001, "张三", 18, 10000),
            new Staff(1002, "李四", 21, 11000),
            new Staff(1003, "王五", 17, 8000),
            new Staff(1004, "赵六", 22, 15000),
            new Staff(1005, "马七", 19, 10500)
    );

    public static void main(String[] args) {
        System.out.println("-----------------使用过滤年龄的方式------------------");
        List<Staff> staffList1 = StaffFilterFunction(staffList, (e) -> e.getAge() < 20);
        for (Staff staff : staffList1) {
            System.out.println(staff);
        }
    }

    public static List<Staff> StaffFilterFunction(List<Staff> staffList, Predicate<Staff> predicate) {
        List<Staff> list = new ArrayList<>();
        for (Staff staff : staffList) {
            if (predicate.test(staff)) {
                list.add(staff);
            }
        }
        return list;
    }
}




