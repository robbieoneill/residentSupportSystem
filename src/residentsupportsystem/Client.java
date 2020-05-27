/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author robbieoneill
 */
public class Client {
    DatabaseConnection databaseInstance = new DatabaseConnection();
    
    public String clientCount(){
         PreparedStatement preparedStatement;
        ResultSet resultSet;
        String clientCountQuery = ("SELECT COUNT (*) AS clientCount FROM tbl_client");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (clientCountQuery);
            resultSet = preparedStatement.executeQuery();
            String clientCount = (resultSet.getString("clientCount"));
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return clientCount;
        } catch (SQLException ex) { 
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return ("Null");
        }
        
            
            
            
    }
    
    public boolean insertClient(
            String clientID,
            String clientFirstname,
            String clientMiddlename,
            String clientLastname,
            String clientGender,
            String clientDOB,
            String clientEmail,
            String clientTelNumber,
            String clientMobNumber,
            String clientAddr1,
            String clientAddr2,
            String clientPostcode,
            String clientNotes){
        
        PreparedStatement preparedStatement;
        ResultSet resutlSet;
        
        String insertClientQuery = "INSERT INTO tbl_client ("
                + "clientID,"
                + "clientFirstname,"
                + "clientMiddlename,"
                + "clientLastname,"
                + "clientGender,"
                + "clientDOB,"
                + "clientEmail,"
                + "clientTelNumber,"
                + "clientMobNumber,"
                + "clientAddr1,"
                + "clientAddr2,"
                + "clientPostcode,"
                + "clientNotes)"
                + "VALUES ("
                + "?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (insertClientQuery);
            
            preparedStatement.setString(1,clientID);
            preparedStatement.setString(2,clientFirstname);
            preparedStatement.setString(3,clientMiddlename);
            preparedStatement.setString(4,clientLastname);
            preparedStatement.setString(5,clientGender);
            preparedStatement.setString(6,clientDOB);
            preparedStatement.setString(7,clientEmail);
            preparedStatement.setString(8,clientTelNumber);
            preparedStatement.setString(9,clientMobNumber);
            preparedStatement.setString(10,clientAddr1);
            preparedStatement.setString(11,clientAddr2);
            preparedStatement.setString(12,clientPostcode);
            preparedStatement.setString(13,clientNotes);
            
            if(preparedStatement.executeUpdate()>0){
                 //resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return true;
            }
            else{
                //resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    
    
    public void setClientTable(JTable clientTable){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String selectClientDetailsQuery = ("SELECT "
                + "clientID, "
                + "clientFirstname, "
                + "clientLastname, "
                + "clientDOB, "
                + "clientTelNumber, "
                + "clientMobNumber,"
                + "clientPostcode "
                + "FROM tbl_client");
        System.out.println(selectClientDetailsQuery);
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (selectClientDetailsQuery);
            resultSet = preparedStatement.executeQuery();
            DefaultTableModel clientTableModel = (DefaultTableModel)clientTable.getModel();
            
            Object[]row;
            
            while (resultSet.next()){
               row = new Object[7];
               row[0] = resultSet.getString(1);
               row[1] = resultSet.getString(2);
               row[2] = resultSet.getString(3);
               row[3] = resultSet.getString(4);
               row[4] = resultSet.getString(5);
               row[5] = resultSet.getString(6);
               row[6] = resultSet.getString(7);
               
               clientTableModel.addRow(row);
            }
                resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    int getClientCount(){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String clientCountQuery = ("SELECT COUNT(*) AS clientCount FROM tbl_client");
        System.out.println(clientCountQuery);
        int clientCountQueryResult;
        
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (clientCountQuery);
            resultSet = preparedStatement.executeQuery();
            clientCountQueryResult = resultSet.getInt("clientCount");
            System.out.println("CLIENT COUNT: "+clientCountQueryResult);
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return clientCountQueryResult;
            
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
    
    
    public List setClientDetails(int clientID){
        List returnResultSet = new LinkedList();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getClientDataQuery = ("SELECT * FROM tbl_client WHERE clientID = ?");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (getClientDataQuery);
            preparedStatement.setInt(1,clientID);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                returnResultSet.add(resultSet.getInt("clientID"));
                returnResultSet.add(resultSet.getString("clientFirstname"));
                if (resultSet.getString("clientMiddlename") == null){
                    returnResultSet.add("");
                }
                else {returnResultSet.add(resultSet.getString("clientMiddlename"));
                }
                returnResultSet.add(resultSet.getString("clientLastname"));
                returnResultSet.add(resultSet.getString("clientGender"));
                returnResultSet.add(resultSet.getString("clientDOB"));
                returnResultSet.add(resultSet.getString("clientEmail"));
                returnResultSet.add(resultSet.getString("clientTelNumber"));
                returnResultSet.add(resultSet.getString("clientMobNumber"));
                returnResultSet.add(resultSet.getString("clientAddr1"));     
                if (resultSet.getString("clientAddr2") == null){
                    returnResultSet.add("");
                } 
                else {returnResultSet.add(resultSet.getString("clientAddr2"));
                }          
                returnResultSet.add(resultSet.getString("clientPostcode"));
                 if (resultSet.getString("clientNotes") == null){
                    returnResultSet.add("");
                 } 
                 else {returnResultSet.add(resultSet.getString("clientNotes"));
                 }
                resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return returnResultSet;
            }    
        
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        System.out.println(getClientDataQuery);
        return returnResultSet;
        
    }
    
    
    public void setSearchedClientTable(JTable clientTable, String clientIDSelected){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String clientIDQuery=("SELECT clientID, clientFirstname, clientLastname FROM tbl_client WHERE clientID=?");
        try{
           preparedStatement = databaseInstance.createConnection().prepareStatement (clientIDQuery);
           preparedStatement.setString(1, clientIDSelected);
           resultSet = preparedStatement.executeQuery();
           ((DefaultTableModel)clientTable.getModel()).setNumRows(0);
           DefaultTableModel clientTableModel = (DefaultTableModel)clientTable.getModel();
           
           Object []row;
           while(resultSet.next()){
               row = new Object [3];
               row [0] = resultSet.getString(1);
               row [1] = resultSet.getString(2);
               row [2] = resultSet.getString(3);
               clientTableModel.addRow(row);
           }
           resultSet.close();
           preparedStatement.close();
           databaseInstance.closeConnection();
            
        }catch(SQLException a){
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, a);
        }
        
    }
    
   int getAutoClientID(){
       PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getSequentialID = ("SELECT MAX (clientID) AS 'clientID' FROM tbl_client");
        System.out.println(getSequentialID);
        int sequentialUserIDResult;
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (getSequentialID);
            resultSet = preparedStatement.executeQuery();
            System.out.println ("PREVIOUS CLIENT ID = "+ resultSet.getInt("clientID"));
            System.out.println ("NEXT CLIENT ID = "+ (resultSet.getInt("clientID")+1));
            sequentialUserIDResult = (resultSet.getInt("clientID")+1);
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return sequentialUserIDResult;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
   }
   
   boolean deleteClient(String clientID){
       PreparedStatement preparedStatement;
       String deleteSql = "DELETE FROM tbl_client WHERE clientid =?";
       System.out.println("CLIENT ID TO BE DELETED: "+clientID);
       try{
           preparedStatement = databaseInstance.createConnection().prepareStatement(deleteSql);
           preparedStatement.setString(1, clientID);
           preparedStatement.execute();
           //resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
           return true;
       } catch(SQLException e){
           Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
   }
    
    
    
}
