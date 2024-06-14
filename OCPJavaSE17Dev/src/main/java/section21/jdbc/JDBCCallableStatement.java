package section21.jdbc;

import java.sql.*;

public class JDBCCallableStatement {
    public static void main(String[] args) {
        // using stored procedure read_phone_by_name(first_name, phone) (IN, OUT)

        String url = "jdbc:postgresql://localhost/phonebook_db";
        String procedureCall = "{call read_phone_by_name(?, ?)}";

        try(Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
            CallableStatement cs = conn.prepareCall(procedureCall)
        ){
            cs.setString(1, "John");
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.execute();
            String phone = cs.getString(2);

            System.out.println("Phone number for John: " + phone);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
