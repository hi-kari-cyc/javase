package shujia25.day13.test;

import java.util.ArrayList;
import java.util.Random;

/*
    获取10个1-20之间的随机数，要求不能重复

 */
public class ListPptTest4 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        do {
            int o = random.nextInt(19) + 1;
            if (!integers.contains(o)) {
                integers.add(o);
            }
        } while (integers.size() < 10);

        for (Integer i : integers) {
            System.out.println(i);
        }
    }
}
