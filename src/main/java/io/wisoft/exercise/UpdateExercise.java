package io.wisoft.exercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExercise {

    public void updateQuestion12() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "UPDATE drama SET drm_opdate = '2013-05-01' WHERE drm_opdate IS NULL";
            pstmt = conn.prepareStatement(query);

            int value = pstmt.executeUpdate();
            conn.commit();

            System.out.println(value + "개가 수정되었습니다.");

        } catch (SQLException sqex) {
            System.out.println("SQLException = " + sqex.getMessage());
            System.out.println("SQLState = " + sqex.getSQLState());
        }
    }

    public void updateQuestion13() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "UPDATE EMPLOYEE\n" +
                    "SET EMP_RCODE = (SELECT ER.EMP_RCODE FROM EMP_ROLE ER WHERE ER.EMP_RNAME = '실장' ), " +
                    "EMP_SAL   = EMP_SAL * 1.2 " +
                    "WHERE EMP_NAME = '김수현'";
            pstmt = conn.prepareStatement(query);

            int value = pstmt.executeUpdate();
            conn.commit();

            System.out.println(value + "개가 수정되었습니다.");

        } catch (SQLException sqex) {
            System.out.println("SQLException = " + sqex.getMessage());
            System.out.println("SQLState = " + sqex.getSQLState());
        }
    }
}
