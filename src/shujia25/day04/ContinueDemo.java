package shujia25.day04;

/*
        continue:继续  跳过/结束当此循环
        作用场景：循环


 */
public class ContinueDemo {
    public static void main(String[] args) {

        // continue 单独使用没有意义，必须作用在循环的内部
//        continue;

        //打印1-10，当打印到4的时候，使用continue
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;  // 在执行代码前使用
            }
            System.out.println(i);
        }
    }
}
