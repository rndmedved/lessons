package lessons.jdbc;
import java.sql.*;
import java.util.Scanner;

public class UseBD {
    public static void main (String ... args){
        UseBD program = new UseBD();
        program.open();
        program.insert();
        program.close();
    }

    Connection connection;

    void open(){
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:testUsers.db");
            System.out.println("Connection was successful!");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String name = scanner.nextLine();
        System.out.println("Enter user phone : ");
        String phone = scanner.nextLine();

        String query = "INSERT INTO users(name, phone) " +
                "VALUES ('" + name + "','" +phone + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("rows added");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void close(){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
