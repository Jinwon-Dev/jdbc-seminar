package io.wisoft.seminar;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        Student[] students = new Student[8];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
//        selectStudent();

//        insertStudent();

//        updateStudent(student, students);

        /**
         * 삭제하기
         */
        // DELETE AREA
        StudentDeleteService deleteStudent = new StudentDeleteService();

        System.out.println("학번이 20110401인 학생을 목록에서 제거합니다.");
        deleteStudent.deleteStudentNo("20110401");
        System.out.println();

        // DELETE AREA
        System.out.println("학번이 20110501인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110601인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110701인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110801인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110901인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20111001인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20111101인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20111201인 학생을 목록에서 제거합니다.");

        students[0].setStudentNo("20110501");
        students[1].setStudentNo("20110601");
        students[2].setStudentNo("20110701");
        students[3].setStudentNo("20110801");
        students[4].setStudentNo("20110901");
        students[5].setStudentNo("20111001");
        students[6].setStudentNo("20111101");
        students[7].setStudentNo("20111201");

        deleteStudent.deleteStudentNoMultiBatch(students);
        System.out.println();
    }

    private static void updateStudent(Student student, Student[] students) {
        /**
         * 수정하기
         */
        // UPDATE AREA
        StudentUpdateService updateStudent = new StudentUpdateService();

        System.out.println("학번이 20110401인 학생의 생일을 1990-03-21으로 변경합니다.");
        updateStudent.updateStudentBirthday("20110401", "1990-03-21");
        System.out.println();

        // UPDATE AREA
        System.out.println("학번이 20110401인 학생의 생일을 1990-03-25로 변경합니다.");
        student.setStudentNo("20110401");
        student.setStudentBirthday("1990-03-25");
        updateStudent.updateStudentBirthday(student);
        System.out.println();

        // UPDATE AREA
        System.out.println("학번이 20110501인 학생의 생일을 1990-03-01로 변경합니다.");
        System.out.println("학번이 20110601인 학생의 생일을 1990-04-01로 변경합니다.");
        System.out.println("학번이 20110701인 학생의 생일을 1990-05-01로 변경합니다.");
        System.out.println("학번이 20110801인 학생의 생일을 1990-06-01로 변경합니다.");
        System.out.println("학번이 20110901인 학생의 생일을 1990-07-01로 변경합니다.");
        System.out.println("학번이 20111001인 학생의 생일을 1990-08-01로 변경합니다.");
        System.out.println("학번이 20111101인 학생의 생일을 1990-09-01로 변경합니다.");
        System.out.println("학번이 20111201인 학생의 생일을 1990-10-01로 변경합니다.");

        students[0].setStudentNo("20110501");
        students[0].setStudentBirthday("1990-03-01");

        students[1].setStudentNo("20110601");
        students[1].setStudentBirthday("1990-04-01");

        students[2].setStudentNo("20110701");
        students[2].setStudentBirthday("1990-05-01");

        students[3].setStudentNo("20110801");
        students[3].setStudentBirthday("1990-06-01");

        students[4].setStudentNo("20110901");
        students[4].setStudentBirthday("1990-07-01");

        students[5].setStudentNo("20111001");
        students[5].setStudentBirthday("1990-08-01");

        students[6].setStudentNo("20111101");
        students[6].setStudentBirthday("1990-09-01");

        students[7].setStudentNo("20111201");
        students[7].setStudentBirthday("1990-10-01");

        updateStudent.updateStudentBirthdayMultiBatch(students);
        System.out.println();
    }

    private static void insertStudent() {
        /**
         * 등록하기
         */
        Student student = new Student();
        Student[] students = new Student[8];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        // INSERT AREA
        StudentInsertService insertStudent = new StudentInsertService();
        System.out.println("학번이 20110401이고, 이름이 이순신인 학생을 추가합니디.");
        student.setStudentNo("20110401");
        student.setStudentName("이순신");
        insertStudent.insertStudent(student);
        System.out.println();

        // INSERT AREA
        System.out.println("학번이 20110501이고, 이름이 이율곡인 학생을 추가합니다.");
        System.out.println("학번이 20110601이고, 이름이 이수일인 학생을 추가합니다.");
        System.out.println("학번이 20110701이고, 이름이 심순애인 학생을 추가합니다.");
        System.out.println("학번이 20110801이고, 이름이 임꺽정인 학생을 추가합니다.");

        students[0].setStudentNo("20110501");
        students[0].setStudentName("이율곡");

        students[1].setStudentNo("20110601");
        students[1].setStudentName("이수일");

        students[2].setStudentNo("20110701");
        students[2].setStudentName("심순애");

        students[3].setStudentNo("20110801");
        students[3].setStudentName("임꺽정");

        insertStudent.insertStudentMulti(students);
        System.out.println();

        // INSERT AREA
        System.out.println("학번이 20110901이고, 이름이 이상훈인 학생을 추가합니다.");
        System.out.println("학번이 20111001이고, 이름이 강동희인 학생을 추가합니다.");
        System.out.println("학번이 20111101이고, 이름이 김호성인 학생을 추가합니다.");
        System.out.println("학번이 20111201이고, 이름이 김정준인 학생을 추가합니다.");

        students[0].setStudentNo("20110901");
        students[0].setStudentName("이상훈");

        students[1].setStudentNo("20111001");
        students[1].setStudentName("강동희");

        students[2].setStudentNo("20111101");
        students[2].setStudentName("김호성");

        students[3].setStudentNo("20111201");
        students[3].setStudentName("김정준");

        insertStudent.insertStudentMultiBatch(students);
        System.out.println();
    }

    private static void selectStudent() {
        /**
         * 검색하기
         */
        // SELECT AREA
        StudentSelectService selectStudent = new StudentSelectService();

        System.out.println("전체 학생을 검색합니다.");
        selectStudent.getStudentAll();
        System.out.println();

        // SELECT AREA
        System.out.println("학번 20110101 학생을 검색합니다.");
        String studentNo = "20110101";

        selectStudent.getStudentByNo(studentNo);
        System.out.println();

        // SELECT AREA
        System.out.println("이름 일지매 학생을 검색합니다.");
        String studentName = "일지매";

        selectStudent.getStudentByName(studentName);
        System.out.println();

        // SELECT AREA
        System.out.println("생일 1991-02-28 학생을 검색합니다.");

        Date studentBirthday = Date.valueOf("1991-02-28");

        selectStudent.getStudentByBirthday(studentBirthday);
        System.out.println();
    }
}
