/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rasit
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection()throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "Madhura@0716");
    }
    
public static DBConnection getinstance() throws ClassNotFoundException,SQLException{
if(dBConnection ==null){
    dBConnection = new DBConnection();
}

return dBConnection;
} 

public Connection getconnection(){
    return connection;
}
    
}
/**
 *
 * @author rasit
 */

