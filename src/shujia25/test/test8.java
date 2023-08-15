package shujia25.test;

public class test8 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 1; i <= 20; i++) {
            int x = i;
            int num = 1;
            while (x > 0) {
                num *= x;
                x--;
            }
            res += num;
        }
        System.out.println(res);
    }
}