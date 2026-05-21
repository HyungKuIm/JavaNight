package com.oraclejava;

/**
 * 사원이 되려면 출근하고, 일하고, 퇴근해야 한다는 규칙, 계약 사항
 * @author HyungKu Im
 */
interface Emp {
    void gotoWork();
    void work();
    void getOffWork();
}

class Programmer implements Emp {
    String ename;

    public Programmer(String ename) {
        this.ename = ename;
    }

    @Override
    public void gotoWork() {
        System.out.println(ename + " 사원이 자전거로 출근합니다.");
    }

    @Override
    public void work() {
        System.out.println(ename + " 사원이 개발합니다.");
    }

    @Override
    public void getOffWork() {
        System.out.println(ename + " 사원이 자전거로 퇴근합니다.");
    }
}

class Designer implements Emp {

    String ename;
    public Designer(String ename) {
        this.ename = ename;
    }

    @Override
    public void gotoWork() {
        System.out.println(ename + " 사원이 지하철로 출근합니다.");
    }

    @Override
    public void work() {
        System.out.println(ename + " 사원이 디자인합니다.");
    }

    @Override
    public void getOffWork() {
        System.out.println(ename + " 사원이 지하철로 퇴근합니다.");
    }
}

public class EmpTest {
    public static void main(String[] args) {
        Emp p = new Programmer("홍길동");
        p.gotoWork();
        p.work();
        p.getOffWork();

        Emp d= new Designer("카리나");
        d.gotoWork();
        d.work();
        d.getOffWork();


    }
}
