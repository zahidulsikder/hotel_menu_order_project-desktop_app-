
package koreghorproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbCon {
    
     private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/koreghor";
    private String user = "root";// my sql er defult user name.
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    
    //create connection system to database(mysql) and neatbeans.
    public Connection getCon() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, password); 
       // System.out.println("Okay");
        return con;
        
    }
    
    
    
    
    
}
