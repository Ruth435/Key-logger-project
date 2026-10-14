
package Objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author petri.m01
 */
public class DBLogs {
    
    private String url = "jdbc:ucanaccess://Key-Logger.accdb";
    private Connection conn = null;
    
    public DBLogs() // Establishes a connection to the database or throws an error
    {
        try
        {
            conn = DriverManager.getConnection(url); // Tries to establish a connection using the connection string
            System.out.println("Connection Successful");
        }
        catch(SQLException e) // Throws SQLException if connection cannot be established.
        {
            System.out.println("Connection Unsuccessful");
        }
    }
    
    public ResultSet queryDatabase(String sql) throws SQLException //Sends and receives SELECT queries between DB and Java
    {
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet set = stmt.executeQuery(); // Executes the query received from paramater
        return set;
    }
    
    public void updateQuery(String sql) throws SQLException //Updates the DB using queries in Java
    {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
    }
    
}
