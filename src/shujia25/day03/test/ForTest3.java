package shujia25.day03.test;

/*
    请统计1-1000之间同时满足如下条件的数据有多少个:
        对3整除余2
        对5整除余3
        对7整除余2

 */
public class ForTest3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 2 & i % 5 == 3 & i % 7 == 2) {
                count++;
            }
        }
        System.out.println("满足条件的数据有"+count+"个");
    }
}
