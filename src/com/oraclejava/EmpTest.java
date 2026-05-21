package com.oraclejava;

class Emp {
    String ename;
    public Emp() {
        this("홍길동");
    }

    public Emp(String ename) {
        this.ename = ename;
    }

    public String toString() {
        return "[EMP : ename = " + ename + "]";
    }
}

public class EmpTest {
    public static void main(String[] args) {
        Emp e = new Emp();
        System.out.println(e);
        Emp e1 = new Emp("홍길순");
        System.out.println(e1);
    }
}
