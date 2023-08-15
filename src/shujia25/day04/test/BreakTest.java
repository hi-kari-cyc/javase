package shujia25.day04.test;

/*
        小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
        请问，经过多少天，小芳才可以存到100元钱。
 */
public class BreakTest {
    public static void main(String[] args) {
//        int day = 1;
//        double money = 2.5;
//        while (money<=100){
//            day += 1;
//            money += 2.5;
//            if (day%5==0){
//                money -=6;
//            }
//        }
//        System.out.println("至少经过"+day+"天才能存到100块。");

        // 使用break结束循环
        int day = 1;
        double money = 0;
        while (true) {
            money += 2.5;
            if (day % 5 == 0) {
                money -= 6;
                System.out.println("在第" + day + "天花了6元");
            }
            if (money >= 100) {
                System.out.println("至少经过" + day + "天才能存到" + money + "元");
                break;
            } else
                day++;
        }
    }
}
