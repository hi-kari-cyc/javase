package shujia25.day04.test;

/*
        按照要求补齐程序:
            for(int x=1; x<=10; x++) {
                if(x%3==0) {
                    //在此处填写代码
                }
                System.out.println("Java基础班");
            }
            我想在控制台输出2次:“Java基础班“
            我想在控制台输出7次:“Java基础班“
            我想在控制台输出13次:“Java基础班“


 */
public class ContinueTest {
    public static void main(String[] args) {

        // 我想在控制台输出2次:“Java基础班“
        for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {
                break;
            }
            System.out.println("Java基础班");
        }
        System.out.println("------------------------");

        // 我想在控制台输出7次:“Java基础班“
        for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {
                continue;
            }
            System.out.println("Java基础班");
        }
        System.out.println("------------------------");

        // 我想在控制台输出13次:“Java基础班“

        for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {
                System.out.println("Java基础班");
            }
            System.out.println("Java基础班");
        }
    }
}
