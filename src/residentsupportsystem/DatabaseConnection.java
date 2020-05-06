/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author robbieoneill
 */
public class DatabaseConnection {
    
    private Connection databaseConnection;
    
    public Connection createConnection(){
        
        databaseConnection = null;
        try {
            //EVERYONE SHOULD KEEP THEIR FILEPATH TO THE DATABASE HERE
            
            String database = "jdbc:sqlite:"+"//Users//robbieoneill//Documents//GitHub//residentSupportSystem//rssDB.db";
            databaseConnection = DriverManager.getConnection(database);
            System.out.println("CONNECTION TO "+database+" HAS BEEN ESTABLISHED.");
            
        } catch (SQLException ex) {
            System.out.println("FAILED TO CONNECT");        	
            System.out.println(ex.getMessage());
            Logger.getLogger(DatabaseConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return databaseConnection;
    }
    
     /**
     * Method will close the database connection
     *
     */
    public void close() {
        try {
            databaseConnection.close();
        } // end try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // end catch
    } // end method close
      
}


