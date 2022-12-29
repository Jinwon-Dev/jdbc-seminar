package io.wisoft.seminar;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        // SELECT AREA
        StudentSelectService selectStudent = new StudentSelectService();

        System.out.println("전체 학생을 검색합니다.");
        selectStudent.getStudentAll();
        System.out.println();

        System.out.println("학번 20110101 학생을 검색합니다.");
        String studentNo = "20110101";

        selectStudent.getStudentByNo(studentNo);
        System.out.println();

        System.out.println("이름 일지매 학생을 검색합니다.");
        String studentName = "일지매";

        selectStudent.getStudentByName(studentName);
        System.out.println();

        System.out.println("생일 1991-02-28 학생을 검색합니다.");

        Date studentBirthday = Date.valueOf("1991-02-28");

        selectStudent.getStudentByBirthday(studentBirthday);
        System.out.println();
    }
}
