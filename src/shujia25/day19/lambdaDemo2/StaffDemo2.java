package shujia25.day19.lambdaDemo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    策略模式开发虽然比第一种纯写静态方法开发要通用的多，但是呢，随着过滤的条件越来越多，实现接口的实现类就会越写越多
 */

public class StaffDemo2 {
    private static final List<Staff> staffList = Arrays.asList(
            new Staff(1001, "张三", 18, 10000),
            new Staff(1002, "李四", 21, 11000),
            new Staff(1003, "王五", 17, 8000),
            new Staff(1004, "赵六", 22, 15000),
            new Staff(1005, "马七", 19, 10500)
    );

    public static void main(String[] args) {
        System.out.println("-----------------使用过滤年龄的方式------------------");
        List<Staff> staffList1 = StaffFilterFunction1(staffList, new FilterStaffOfAge());
        for (Staff staff : staffList1) {
            System.out.println(staff);
        }

        System.out.println("-----------------使用过滤薪资的方式------------------");
        List<Staff> staffList2 = StaffFilterFunction2(staffList, new FilterStaffOffSalary());
        for (Staff staff : staffList2) {
            System.out.println(staff);
        }

    }

    // 策略模式开发
    // 对于这个案例来说，相当于我指定一个过滤员工的方法，将来只要是员工集合要想过滤，就必须使用我这个方法进行过滤
    // 至于怎么过滤，过滤的方式，在方法内部调用对应接口实现类

    // 传入的是一个待过滤的集合和一个接口(实际传入的是接口的实现类)
    // 过滤年龄小于20的
    public static List<Staff> StaffFilterFunction1(List<Staff> staffList, FilterField filterField) {
        List<Staff> list = new ArrayList<>();
        for (Staff staff : staffList) {
            if (filterField.test(staff)) {
                list.add(staff);
            }
        }
        return list;
    }

    // 过滤薪资大于一万的员工
    public static List<Staff> StaffFilterFunction2(List<Staff> staffList, FilterField filterField){
        List<Staff> list = new ArrayList<>();
        for (Staff staff : staffList) {
            if (filterField.test(staff)){
                list.add(staff);
            }
        }
        return list;
    }

}

interface FilterField {
    boolean test(Staff staff);
}

class FilterStaffOfAge implements FilterField {

    @Override
    public boolean test(Staff staff) {
        return staff.getAge() < 20;
    }
}

class FilterStaffOffSalary implements FilterField {

    @Override
    public boolean test(Staff staff) {
        return staff.getSalary() > 10000;
    }
}