package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public Connection get_connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sofkaspaceship", "root", "admin");
            if (connection != null) {
                System.out.println("Successful Connection");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
