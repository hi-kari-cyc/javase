package shujia25.day06;

/*
    前区：1-35  5
    后区：1-12  2

    [31,35,19,22,5,7,5]
    [11,16,24,26,17,12,9]
    [25,28,32,33,13,3,4]
    [3,5,9,34,12,1,7]
 */
public class MathDemo3 {
    public static void main(String[] args) {
//        int number = (int) (Math.random() * 35 + 1);
//        System.out.println(number);
        int[] arr = new int[7];

        for (int i = 0; i < 5; i++) {
            int number = (int) (Math.random() * 35 + 1);
            arr[i] = number;
        }

        for (int i = 5; i < 7; i++) {
            int number = (int) (Math.random() * 12 + 1);
            arr[i] = number;
        }

        System.out.println("下一期开奖号码预测：");
        ArrayTool.printArray(arr);

    }
}
