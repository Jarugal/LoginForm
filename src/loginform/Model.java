/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jarga
 */

public class Model {
    
    public boolean login(User user){
        
        boolean result = false;
        
         try{
            String dbServer = "jdbc:mysql://apontejaj.com:3306/Batjargal_2019462?useSSL=false";
            String dbUser = "Batjargal_2019462";
            String dbPassword = "2019462";
            String query = "SELECT * FROM user WHERE username = '"+ user.getUn() +"' AND password = '"+ user.getPw() +"';"; 

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbUser, dbPassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);
                
            //stmt.execute(query);
           
            
            // Loop through the result set
             if(rs.next()){
                result = true;
            }
           
            rs.close();
            stmt.close();
            conn.close();
            
        }   catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         
        return result; 
    
          
    }
}
    

