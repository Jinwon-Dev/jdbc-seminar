package io.wisoft.seminar;

import java.sql.*;

public class BadJdbcExample {

    public static void main(final String... args) {
        try {
            Connection connection = DriverManager.getConnection("사용자 지정 url", "사용자 지정 username", "사용자 지정 password");
            Statement statement;
            statement = connection.createStatement();

            String query = "SELECT * FROM STUDENT";
            ResultSet resultSet;
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.print("[학번] " + resultSet.getString(1) + " || ");
                System.out.print("[이름] " + resultSet.getString(2) + " || ");
                System.out.println("[생일] " + resultSet.getString(3));
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException sqle) {
            System.err.println("SQLException: " + sqle.getMessage());
            System.err.println("SQLState: " + sqle.getSQLState());
        }
    }

}
