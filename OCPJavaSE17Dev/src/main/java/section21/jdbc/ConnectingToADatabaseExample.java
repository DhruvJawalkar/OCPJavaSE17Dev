package section21.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingToADatabaseExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/phonebook_db";
        try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres")) {
            if (conn != null) System.out.println("Connected to the database!");
            else System.out.println("Failed to make connection!");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.err.println(e.getMessage());
        }
    }
}