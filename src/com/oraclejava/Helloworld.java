package com.oraclejava;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("안녕하세요!!");
        Scanner scan = new Scanner(System.in);
        System.out.println("당신의 이름은?");
        String name = scan.nextLine();
        System.out.println("당신의 이름은 " + name);
    }
}
