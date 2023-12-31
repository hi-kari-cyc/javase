package shujia25.day19.lambdaDemo3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    使用匿名内部类的方式改进第二种实现

    结论：使用匿名内部类的方式改写后，发现即使过滤的需求变多，我们也不需要像第一种方式那样加方法，也不需要像第二种方式那样写过多的实现类文件
    但是，写过多的匿名内部类，我发现就一个实现不一样，其他的都要重新写一遍，new 接口
 */

public class StaffDemo3 {
    private static final List<Staff> staffList = Arrays.asList(
            new Staff(1001, "张三", 18, 10000),
            new Staff(1002, "李四", 21, 11000),
            new Staff(1003, "王五", 17, 8000),
            new Staff(1004, "赵六", 22, 15000),
            new Staff(1005, "马七", 19, 10500)
    );

    public static void main(String[] args) {
        System.out.println("-----------------使用过滤年龄的方式------------------");
        List<Staff> staffList1 = StaffFilterFunction(staffList, new FilterField() {
            @Override
            public boolean test(Staff staff) {
                return staff.getAge() < 20;
            }
        });
        for (Staff staff : staffList1) {
            System.out.println(staff);
        }

        System.out.println("-----------------使用过滤薪资的方式------------------");
        List<Staff> staffList2 = StaffFilterFunction(staffList, new FilterField() {
            @Override
            public boolean test(Staff staff) {
                return staff.getSalary() > 10000;
            }
        });
        for (Staff staff : staffList2) {
            System.out.println(staff);
        }

        System.out.println("-----------------使用过滤id的方式------------------");
        List<Staff> staffList3 = StaffFilterFunction(staffList, new FilterField() {
            @Override
            public boolean test(Staff staff) {
                return staff.getId() > 1003;
            }
        });
        for (Staff staff : staffList3) {
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

interface FilterField {
    boolean test(Staff staff);
}



