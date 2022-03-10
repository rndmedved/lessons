package lessons.jdbc;
import java.sql.*;
public class Solution {
    public static void main (String ... args){
        String jdbcUrl =
                "jdbc:sqlite:src/lessons/jdbc/testUsers.db";

        try
        {
            //Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection(jdbcUrl);
            String sql = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()){
                String name = result.getString("name");
                String phone = result.getString("phone");
                System.out.println(name + " | " + phone);
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
