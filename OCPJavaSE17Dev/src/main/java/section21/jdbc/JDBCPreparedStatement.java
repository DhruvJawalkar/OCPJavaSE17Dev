package section21.jdbc;

import java.sql.*;

public class JDBCPreparedStatement {
    public static void main(String[] args) {
        /*
        String url = "jdbc:postgresql://localhost/phonebook_db";
        String query = "SELECT * FROM contacts";
        try(Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
        ) {
            while(rs.next()){
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");

                System.out.println(id + ". first_name="+firstName + " last_name="+lastName);
            }
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.err.println(e.getMessage());
        }
         */

        String url = "jdbc:postgresql://localhost/phonebook_db";
        String insertQuery = "INSERT INTO contacts (first_name, last_name, email, gender, ip_address) VALUES (?, ?, ?, ?, ?)";
        try(Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
            PreparedStatement ps = conn.prepareStatement(insertQuery)
        ){
            ps.setString(1, "John");
            ps.setString(2, "Wayne");
            ps.setString(3, "johnwayne@gmail.com");
            ps.setString(4, "Male");
            ps.setString(5, "127.0.0.1");

            int affectedRows = ps.executeUpdate();
            if(affectedRows > 0){
                System.out.println("A new record was inserted successfully!");
            }
            else{
                System.out.println("No record was inserted.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
