package shujia25.day13.test;

import java.util.ArrayList;

/*
        集合的嵌套遍历

 */
public class ListPptTest3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> classes = new ArrayList<>();

        ArrayList<Integer> class25 = new ArrayList<>();

        class25.add(1);
        class25.add(2);
        class25.add(3);
        class25.add(4);

        classes.add(class25);

        for (ArrayList<Integer> c : classes) {
            for (Integer n : c) {
                System.out.println(n);
            }
        }
    }
}
