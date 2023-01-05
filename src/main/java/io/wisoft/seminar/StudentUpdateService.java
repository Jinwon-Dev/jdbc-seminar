package io.wisoft.seminar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdateService {

    public void updateStudentBirthday(String no, String birthday) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE STUDENT SET BIRTHDAY = ? WHERE NO = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, birthday);
            pstmt.setString(2, no);

            int retValue = pstmt.executeUpdate();
            conn.commit();

            System.out.println(retValue + "건의 사항이 처리되었습니다");
        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // overloading
    public void updateStudentBirthday(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE STUDENT SET BIRTHDAY = ? WHERE NO = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, student.getStudentBirthday());
            pstmt.setString(2, student.getStudentNo());

            int retValue = pstmt.executeUpdate();
            conn.commit();

            System.out.println(retValue + "건의 사항이 처리되었습니다.");
        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void updateStudentBirthdayMultiBatch(Student[] students) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE STUDENT SET BIRTHDAY = ? WHERE NO = ?";
            pstmt = conn.prepareStatement(query);

            for (int i = 0; i < students.length; i++) {
                if (students[i].getStudentNo() == null && students[i].getStudentBirthday() == null) break;

                pstmt.setString(1, students[i].getStudentBirthday());
                pstmt.setString(2, students[i].getStudentNo());

                pstmt.addBatch();
                pstmt.clearParameters();
            }

            int[] retValue = pstmt.executeBatch();
            conn.commit();
            System.out.println(retValue.length + "건의 사항이 처리되었습니다.");
        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
