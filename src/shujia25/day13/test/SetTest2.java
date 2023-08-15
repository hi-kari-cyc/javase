package shujia25.day13.test;

import java.util.HashSet;
import java.util.Random;

/*
        编写一个程序，获取10个1至20的随机数，要求随机数不能重复

 */
public class SetTest2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();

        do {
            int i = random.nextInt(20) + 1;
            set.add(i);
        } while (set.size() < 10);
        System.out.println(set);
    }
}
