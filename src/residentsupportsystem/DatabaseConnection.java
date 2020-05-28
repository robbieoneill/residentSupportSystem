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
//EVERYONE SHOULD KEEP THEIR FILEPATH TO THE DATABASE HERE
//Sohaib - C://SOHAIB//Uni//Sem4//SoftwareEngineeringPractice//residentSupportSystem//rssDB.db
//Robbie - //Users//robbieoneill//Documents//GitHub//residentSupportSystem//rssDB.db
//Luke -  
//Rajan - 



public class DatabaseConnection {
    private Connection databaseConnection;
    
    public Connection createConnection() {
        databaseConnection = null;
        try {
            String database = "jdbc:sqlite:" + "//Users//robbieoneill//Documents//GitHub//residentSupportSystem//rssDB.db"; // NOTE TO MARKER --  THIS IS THE FILEPATH YOU NEED TO CHANGE
            databaseConnection = DriverManager.getConnection(database);
        
        } catch (SQLException ex) {
            System.out.println("FAILED TO CONNECT");
            System.out.println(ex.getMessage());
            Logger.getLogger(DatabaseConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return databaseConnection;
    }
    
    //Method will close the database connection
     public void closeConnection() {
        try {
            databaseConnection.close();
        } // end try
        catch (SQLException ex) {
            System.out.println("FAILED TO CLOSE");
            System.out.println(ex.getMessage());
        }
     }
}