package shujia25.day03.test;

/*
    看完格式和图解后把for循环的案例用while循环改写
        A:输出10次HelloWorld案例
        B:求出1-100之和
        C:统计水仙花数有多少个


 */
public class WhileTest1 {
    public static void main(String[] args) {
        // A:输出10次HelloWorld案例
        int i = 1;
        while(i<=10){
            System.out.println("Hello World");
            i++;
        }

        // B:求出1-100之和
        int j = 1;
        int res=0;
        while (j<=100){
            res += j;
            j++;
        }
        System.out.println(res);

        // C:统计水仙花数有多少个
        int k = 100;
        int count = 0;
        while (k<=999){
            int ge = k%10;
            int shi = k/10%10;
            int bai = k/100;
            if (k==ge*ge*ge+shi*shi*shi+bai*bai*bai){
                count++;
            }
            k++;
        }
        System.out.println("水仙花数有"+count+"个");
    }
}
