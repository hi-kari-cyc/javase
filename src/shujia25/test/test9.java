package shujia25.test;

/*
    给定n个非负整数表示每个宽度为1的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

    右边大，左边走，记下最大减小值，做累加
    左边大或等于，右边走
 */


public class test9 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }

    public static int trap(int[] arr) {

        int left = 0, right = arr.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;

        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= left_max) {
                    left_max = arr[left];
                } else {
                    ans += (left_max - arr[left]);
                }
                ++left;
            } else {
                if (arr[right] >= right_max) {
                    right_max = arr[right];
                } else {
                    ans += (right_max - arr[right]);
                }
                --right;
            }
        }
        return ans;
    }
}