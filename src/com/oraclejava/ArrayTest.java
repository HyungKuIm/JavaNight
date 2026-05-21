package com.oraclejava;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] a2;
        a2 = new int[] {7,8,9,10,11,12};

        System.arraycopy(a, 0, a2, 3, 3);
        System.out.println(a.length);
        for (int i : a2) System.out.print(i + " ");

        String[] as = {"인디아나 존스", "스파이더맨 홈 커밍", "서울의 봄"};
        String[] as2 = {"명량", "한산"};

        System.out.println("\n" + as.length);
        Arrays.asList(as).forEach(s -> System.out.println(s));

        as = as2;

        System.out.println("\n" + as.length);
        Arrays.asList(as).forEach(System.out::println);

        String[][] nara = {
                {"korea", "china", "japan"},
                {"usa", "uk"},
                {"russia", "iran"}
        };

        for (String[] sArr : nara) {
            System.out.println("sArr.length = " + sArr.length);
            for (String s : sArr) {
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
    }
}
