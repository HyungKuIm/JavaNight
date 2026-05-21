package com.oraclejava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class OjieConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("Consumer: " + s);
    }
}

public class ForEachTest {
    public static void main(String[] args) {
        String[] myArr = {"스파이더맨", "파프롬홈"};

        List<String> myList = Arrays.asList(myArr);
        myList.forEach(s -> System.out.println(s));
        System.out.println("========");
        myList.forEach(System.out::println);
        System.out.println("========");
        myList.forEach(new OjieConsumer());
    }
}
