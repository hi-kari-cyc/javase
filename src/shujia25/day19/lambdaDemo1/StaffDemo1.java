package shujia25.day19.lambdaDemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
    需求：创建5个员工对象放到集合中
    1、过滤出年龄小于二十岁的
    2、过滤出薪资大于8000的

 */
public class StaffDemo1 {
    private static final List<Staff> staffList = Arrays.asList(
            new Staff(1001,"张三",18,10000),
            new Staff(1002,"李四",21,11000),
            new Staff(1003,"王五",17,8000),
            new Staff(1004,"赵六",22,15000),
            new Staff(1005,"马七",19,10500)
    );

    public static void main(String[] args) {
        System.out.println("==========过滤出年龄小于二十岁的==========");
        List<Staff> staffList1 = filterStaffOfAge(staffList);
        for (Staff staff : staffList1) {
            System.out.println(staff);
        }

        System.out.println("==========过滤出薪资大于8000的==========");
        List<Staff> staffList2 = filterStaffOfSalary(staffList);
        for (Staff staff : staffList2) {
            System.out.println(staff);
        }
    }

    /**
     * 过滤出年龄小于二十岁的
     */
    public static List<Staff> filterStaffOfAge(List<Staff> list){
        ArrayList<Staff> staffList = new ArrayList<>();
        for (Staff staff : list) {
            if (staff.getAge()<20){
                staffList.add(staff);
            }
        }
        return staffList;
    }

    /**
     * 过滤出薪资大于8000的
     */
    public static List<Staff> filterStaffOfSalary(List<Staff> list){
        ArrayList<Staff> staffList = new ArrayList<>();
        for (Staff staff : list) {
            if (staff.getSalary()>8000){
                staffList.add(staff);
            }
        }
        return staffList;
    }
}
