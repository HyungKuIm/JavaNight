package com.oraclejava;

class Emp {
    String ename;
    public void gotoWork() {
        System.out.println(ename + " 출근");
    }

}

class Programmer extends Emp {
    public Programmer(String ename) {
        this.ename = ename;
    }

    public void work() {
        System.out.println(ename + "이 개발합니다.");
    }
}

public class EmpTest {
    public static void main(String[] args) {
//        Emp e = new Emp();
//        System.out.println(e);
        Programmer p = new Programmer("홍길동");
        p.gotoWork();
        p.work();
//        Emp e1 = new Emp("홍길순");
//        System.out.println(e1);
    }
}
