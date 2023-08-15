package shujia25.day11;

import java.util.Random;
/*
    java针对于随机数专门提供了一个类：Random

    构造方法：
        Random() 创建一个新的随机数生成器。
        public Random()
        public Random(long seed)

    成员方法：
        public int nextInt()
        public int nextInt(int n)   返回伪随机的，均匀分布int值介于0(含)和指定值(不包括)

 */

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100+1));


    }
}
