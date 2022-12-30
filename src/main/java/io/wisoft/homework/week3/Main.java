package io.wisoft.homework.week3;

public class Main {

    public static void main(String[] args) {
        EmployeeSelectService selectEmployee = new EmployeeSelectService();

        System.out.println("전체 관계자를 검색합니다.");
        selectEmployee.getEmployeeAll();
        System.out.println();

        System.out.println("관계자 코드가 E101인 관계자를 검색합니다.");
        String code = "E101";

        selectEmployee.getEmployeeByCode(code);
        System.out.println();

        System.out.println("관계자 이름이 소년시대인 관계자를 검색합니다.");
        String name = "소년시대";

        selectEmployee.getEmployeeByName(name);
        System.out.println();

        System.out.println("관계자 관리자 코드가 E902인 관계자를 검색합니다.");
        String mgt = "E902";

        selectEmployee.getEmployeeByMgt(mgt);
        System.out.println();

        System.out.println("관계자 급여가 5000원 이하인 관계자를 검색합니다.");
        int sal = 5000;

        selectEmployee.getEmployeeBySal(sal);
        System.out.println();

        System.out.println("직급 코드가 R004인 관계자를 검색합니다.");
        String rCode = "R004";

        selectEmployee.getEmployeeByRcode(rCode);
        System.out.println();
    }
}
