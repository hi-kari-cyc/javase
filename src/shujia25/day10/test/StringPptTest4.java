package shujia25.day10.test;

/*
        把数组中的数据按照指定个格式拼接成一个字符串
            举例：int[] arr = {1,2,3};	输出结果：[1, 2, 3]


 */
public class StringPptTest4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                s = s.concat("[").concat(String.valueOf(arr[i])).concat(",");
            } else if (i == arr.length - 1) {
                s = s.concat(String.valueOf(arr[i])).concat("]");
            }else {
                s = s.concat(String.valueOf(arr[i])).concat(",");
            }
        }
        System.out.println(s);
    }
}
