package shujia25.day19.lambdaDemo4;


import shujia25.day19.lambdaDemo3.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    使用lambda表达式改进第三种方式：
    1、必须要一个接口
    2、接口中只能存在一个抽象方法，且类型可以自动推断

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
        List<Staff> staffList1 = StaffFilterFunction(staffList, (e) -> e.getAge() < 20);  // e就代表接口中方法的参数Staff
        for (Staff staff : staffList1) {
            System.out.println(staff);
        }
    }

    // 策略模式开发
    // 对于这个案例来说，相当于我指定一个过滤员工的方法，将来只要是员工集合要想过滤，就必须使用我这个方法进行过滤
    // 至于怎么过滤，过滤的方式，在方法内部调用对应接口实现类

    // 传入的是一个待过滤的集合和一个接口(实际传入的是接口的实现类)
    public static List<Staff> StaffFilterFunction(List<Staff> staffList, FilterField filterField) {
        List<Staff> list = new ArrayList<>();
        for (Staff staff : staffList) {
            if (filterField.test(staff)) {
                list.add(staff);
            }
        }
        return list;
    }
}

@FunctionalInterface
interface FilterField {
    boolean test(Staff staff);
}



