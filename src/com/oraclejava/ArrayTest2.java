package com.oraclejava;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] movieArray = {"탑건", "원피스", "멋진 신세계"};

        for (String s : movieArray) {
            System.out.println(s);
        }

        Arrays.sort(movieArray);

        for (String s : movieArray) {
            System.out.println(s);
        }
        Arrays.sort(movieArray, Collections.reverseOrder());
        for (String s : movieArray) {
            System.out.println(s);
        }
    }
}
