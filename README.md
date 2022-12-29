# jdbc-seminar
WiSoft���� jdbc ���̳��� �����ϸ鼭 �н��� �ǽ� �� ���� �ڵ带 ����մϴ�.

���̳� ������ �ڼ��� ����� ���� ������ [���� ��� ��ũ](https://jinwonyoon.notion.site/SQL-63d0f8222dc64152b7ceb34df5f326f1) ���� �� �� �ֽ��ϴ�.

---

> ���� ���� ��ȣ�� ���� ������ ������ �ֽ��ϴ�.
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
            String url = "����� ���� url";
            String username = "����� ���� username";
            String password = "����� ���� password";

            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return conn;
        }
    }
    ```