package shujia25.day04;

/*
        数组的静态初始化
            语句定义格式：
                数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};

            动态初始化和静态初始化的区别：
                动态初始化手动给予数组的长度大小，然后在初始化完毕后在赋值
                静态初始化是先赋值，然后由系统自动推断出数组的长度

            静态初始化的简化写法：简化写法不能将定义和初始化分开。
                数据类型[] 数组名 = {元素1,元素2,元素3,...};

 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 使用动态初始化，创建一个存储3个int类型的元素11，22，33
        int[] arr = new int[]{11,22,33};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 错位的写法
//        int[] arr2 = new int[3]{11,22,33};   // 不能将动态初始化和静态初始化混合使用

        // 简化写法定义并初始化（要在同一条语句中完成）
//        int[] arr1;
//        arr1 = {1,2,3,4};
        int[] arr1 = {1,2,3,4};
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
//        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException  数组索引越界异常 取了不该取的索引

        arr1 = null;
//        System.out.println(arr[0]);  //NullPointerException 空指针异常

    }
}
