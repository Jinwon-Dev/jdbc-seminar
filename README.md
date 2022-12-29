# jdbc-seminar
WiSoft에서 jdbc 세미나를 진행하면서 학습한 실습 및 과제 코드를 기록합니다.

세미나 내용을 자세히 기록한 정리 내용은 [개인 노션 링크](https://jinwonyoon.notion.site/SQL-63d0f8222dc64152b7ceb34df5f326f1) 에서 볼 수 있습니다.

---

> 개인 정보 보호를 위해 생략된 파일이 있습니다.
- `src/main/java/io/wisoft/seminar/PostgresqlAccess.java`
    ```java
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class PostgresqlAccess {
        private static Connection conn = null;

        public void init() {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        public static Connection setConnection() {
            String url = "사용자 지정 url";
            String username = "사용자 지정 username";
            String password = "사용자 지정 password";

            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return conn;
        }
    }
    ```