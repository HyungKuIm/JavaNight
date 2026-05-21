package com.oraclejava;

/**
 * 사원이 되려면 출근하고, 일하고, 퇴근해야 한다는 규칙, 계약 사항
 * @author HyungKu Im
 */
interface Emp {

    void work();

}

class Programmer implements Emp {

    @Override
    public void work() {
        System.out.println("프로그래머가 개발을 합니다");
    }
}

class Designer implements Emp {


    @Override
    public void work() {
        System.out.println("디자이너가 디자인을 합니다.");
    }
}

class Salesman implements Emp {
    @Override
    public void work() {
        System.out.println("영업 사원이 영업을 합니다.");
    }
}

public class EmpTest {
    public static void main(String[] args) {
        Emp[] emps = new Emp[3];
        emps[0] = new Programmer();
        emps[1] = new Designer();
        emps[2] = new Salesman();

        for (Emp e : emps)
        {
            e.work();
        }


    }
}
