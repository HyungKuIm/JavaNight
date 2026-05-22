package com.oraclejava;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Person)obj).name);
    }
}

public class ObjectTest {
    public static void main(String[] args) {
        Person p1 = new Person("도라에몽");
        Person p2 = new Person("도라에몽");

        //객체명@hashCode를 16진수로 변환한 값 출력
        System.out.println(p1);
        System.out.println(p2);

        //hashCode 값 출력(int형으로 출력)
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        //hashCode를 16진수로 출력
        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(Integer.toHexString(p2.hashCode()));

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        // new String()은 보통 불필요
        String s1 = new String("abc");
        String s2 = new String("abc");

        // new String()이 아닌 문자열 생성은 값이 같으면 "문자열 상수 풀"에서 공유
        String s3 = "abc";
        String s4 = "abc";

        System.out.println("s1.equals(s2) ==> " + s1.equals(s2));
        System.out.println("s1 == s2 ==> " + (s1 == s2));

        System.out.println("s3.equals(s4) ==> " + s3.equals(s4));
        System.out.println("s3 == s3 ==> " + (s3 == s4));

        // 결론 보통 String은 .equals로 비교하는 것을 추천
    }
}
