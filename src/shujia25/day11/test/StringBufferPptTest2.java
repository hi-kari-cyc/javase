package shujia25.day11.test;

/*
        把数组拼接成一个字符串

 */
public class StringBufferPptTest2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        // 创建一个空的StringBuffer
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
