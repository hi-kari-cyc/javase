package shujia25.day04;

/*
        break:跳出循环
        作用场景：循环和switch语句中

 */
public class BreakDemo {
    public static void main(String[] args) {
        // 在switch 或 loop 外部中断
        // 不能单独使用
//        break;
        // 打印1-10，当打印到5的时候，使用break
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;  // break 虽然在if里面 但结束的是for循环
            }
        }

        // 双重for循环，当内层循环到4的时候，使用break
        for (int i = 1; i <= 9; i++) {        // 外层for循环控制的是行数
            for (int j = 1; j <= i; j++) {    // 内层for循环控制的是列数
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                if (j == 4) {
                    break;      // 如果直接使用的话，结束的是最近的那个循环
                }
            }
            System.out.println(" ");
        }

        // 带标签的双重for循环
        wai:for (int i = 1; i <= 9; i++) {        // 外层for循环控制的是行数
            nei:for (int j = 1; j <= i; j++) {    // 内层for循环控制的是列数
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                if (j == 4) {
                    break wai;      // 结束带标签的循环
                }
            }
            System.out.println(" ");
        }
    }
}
