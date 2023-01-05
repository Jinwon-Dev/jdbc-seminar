package io.wisoft.seminar;

public class Student {
    private String studentNo;
    private String studentName;
    private String studentBirthday;

    public Student(String studentNo, String studentName, String studentBirthday) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentBirthday = studentBirthday;
    }


    public Student() {
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }
}