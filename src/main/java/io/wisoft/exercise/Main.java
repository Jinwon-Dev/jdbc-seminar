package io.wisoft.exercise;

public class Main {

    public static void main(String[] args) {
        SelectExercise selectExercise = new SelectExercise();
        UpdateExercise updateExercise = new UpdateExercise();
        InsertExercise insertExercise = new InsertExercise();

        System.out.println("HNU Entertainment의 부서 코드, 이름, 위치를 검색합니다.");
        selectExercise.getQuestion1();
        System.out.println();

        System.out.println("HNU Entertainment의 연예관계자 코드, 이름, 관리자, 급여를 검색합니다.");
        selectExercise.getQuestion2();
        System.out.println();

        System.out.println("HNU Entertainment(HNU-E)에서 제작한 드라마의 코드와 이름을 검색합니다.");
        selectExercise.getQuestion3();
        System.out.println();

        System.out.println("드라마 방영사가 KBC이거나 SBC인 드라마를 검색합니다.");
        selectExercise.getQuestion4();
        System.out.println();

        System.out.println("드라마 제작사를 검색합니다. 단, 중복된 값이 있으면 제거합니다.");
        selectExercise.getQuestion5();
        System.out.println();

        System.out.println("연예관계자들의 급여의 총합과 평균 급여액을 계산합니다.");
        selectExercise.getQuestion6();
        System.out.println();

        System.out.println("방영일자가 아직 확정되지 않은 드라마의 이름을 검색합니다.");
        selectExercise.getQuestion7();
        System.out.println();

        System.out.println("연예관계자에 대해 연예관계자의 이름과 직속 상사의 이름을 검색합니다.");
        selectExercise.getQuestion8();
        System.out.println();

        System.out.println("연예관계자에 대해 이름과 급여를 출력하고, 급여의 내림차순으로 정렬합니다. 단, 동일 급여일 때는 이름의 오름차순으로 정렬합니다.");
        selectExercise.getQuestion9();
        System.out.println();

        System.out.println("모든 연예관계자를 직급별로 그룹화하고, 평균 급여액이 5000 이상인 직급에 대해 연예 관계자의 직급, 평균 급여액, 최소 급여액, 최대 급여액을 검색합니다.");
        selectExercise.getQuestion10();
        System.out.println();

        System.out.println("모든 연예관계자의 평균 급여액보다 많은 급여를 받는 연예관계자의 이름과 급여를 검색합니다.");
        selectExercise.getQuestion11();
        System.out.println();

        System.out.println("방영일자가 확정되지 않은 드라마의 방영일자를 2013-05-01로 변경합니다.");
        updateExercise.updateQuestion12();
        System.out.println();

        System.out.println("연예관계자 김수현 씨를 대리에서 실장으로 승진시키고, 급여가 20% 증가된 값으로 변경합니다.");
        updateExercise.updateQuestion13();
        System.out.println();

        System.out.println("우리 회사에 한 명의 임원을 등록합니다. 코드는 E903, 이름은 손진현, 관리자는 E901, 급여는 4000입니다.");
        insertExercise.insertQuestion14();
        System.out.println();

        System.out.println("배우와 가수를 겸업하는 연예관계자의 이름을 검색합니다.");
        selectExercise.getQuestion15();
        System.out.println();

        System.out.println("모든 연예관계자 중 직급이 엔터테이너가 아닌 연예관계자의 이름을 검색합니다.");
        selectExercise.getQuestion16();
        System.out.println();
    }
}
