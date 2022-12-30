package io.wisoft.homework.week3;

import io.wisoft.seminar.PostgresqlAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSelectService {

    public void getEmployeeAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("[관계자 코드] " + rs.getString(1) + " || ");
                System.out.print("[관계자 이름] " + rs.getString(2) + " || ");
                System.out.print("[관계자 관리자] " + rs.getString(3) + " || ");
                System.out.print("[관계자 급여] " + rs.getInt(4) + " || ");
                System.out.println("[직급 코드] " + rs.getString(5));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

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

    public void getEmployeeByCode(String code) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE EMP_CODE = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, code);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[관게자 코드] " + rs.getString(1) + " || ");
                System.out.print("[관계자 이름] " + rs.getString(2) + " || ");
                System.out.print("[관계자 관리자] " + rs.getString(3) + " || ");
                System.out.print("[관계자 급여] " + rs.getInt(4) + " || ");
                System.out.println("[직급 코드] " + rs.getString(5));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

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

    public void getEmployeeByName(String name) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE EMP_NAME = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[관계자 코드] " + rs.getString(1) + " || ");
                System.out.print("[관계자 이름] " + rs.getString(2) + " || ");
                System.out.print("[관계자 관리자] " + rs.getString(3) + " || ");
                System.out.print("[관게자 급여] " + rs.getInt(4) + " || ");
                System.out.println("[직급 코드] " + rs.getString(5));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

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

    public void getEmployeeByMgt(String mgt) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE EMP_MGT = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, mgt);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[관계자 코드] " + rs.getString(1) + " || ");
                System.out.print("[관계자 이름] " + rs.getString(2) + " || ");
                System.out.print("[관계자 관리자] " + rs.getString(3) + " || ");
                System.out.print("[관게자 급여] " + rs.getInt(4) + " || ");
                System.out.println("[직급 코드] " + rs.getString(5));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

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

    public void getEmployeeBySal(int sal) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE EMP_SAL <= ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, sal);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[관계자 코드] " + rs.getString(1) + " || ");
                System.out.print("[관계자 이름] " + rs.getString(2) + " || ");
                System.out.print("[관계자 관리자] " + rs.getString(3) + " || ");
                System.out.print("[관게자 급여] " + rs.getInt(4) + " || ");
                System.out.println("[직급 코드] " + rs.getString(5));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

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

    public void getEmployeeByRcode(String rCode) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE EMP_RCODE = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, rCode);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[관계자 코드] " + rs.getString(1) + " || ");
                System.out.print("[관계자 이름] " + rs.getString(2) + " || ");
                System.out.print("[관계자 관리자] " + rs.getString(3) + " || ");
                System.out.print("[관게자 급여] " + rs.getInt(4) + " || ");
                System.out.println("[직급 코드] " + rs.getString(5));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

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
