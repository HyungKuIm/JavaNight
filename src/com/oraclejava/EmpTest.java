package com.oraclejava;

abstract class Emp {
    private String empno;
    private String ename;

    public void gotoWork() {
        System.out.println(ename + " 출근합니다.");
    }

    abstract void work();

    public void getOffWork() {
        System.out.println(ename + " 퇴근합니다.");
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}

class Programmer extends Emp {

    @Override
    void work() {
        System.out.println(getEname() + "이(가) 개발을 합니다");
    }
}

class Designer extends Emp {
    @Override
    void work() {
        System.out.println(getEname() + "이(가) 디자인을 합니다.");
    }
}

public class EmpTest {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setEmpno("1111");
        p.setEname("홍길동");
        p.gotoWork();
        p.work();
        p.getOffWork();
        Designer d = new Designer();
        d.setEmpno("2222");
        d.setEname("홍길순");
        d.gotoWork();
        d.work();
        d.getOffWork();

    }
}
