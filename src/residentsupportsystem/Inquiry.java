/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TIT
 */
public class Inquiry {
	DatabaseConnection databaseInstance = new DatabaseConnection();
        
        
        public String inquiryCount(){
         PreparedStatement preparedStatement;
        ResultSet resultSet;
        String clientCountQuery = ("SELECT COUNT (*) AS enquiryCount FROM tbl_enquiry WHERE enquiryStatus != 'CLOSED'");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (clientCountQuery);
            resultSet = preparedStatement.executeQuery();
            String clientCount = (resultSet.getString("enquiryCount"));
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return clientCount;
        } catch (SQLException ex) { 
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return ("Null");
            }
        }
        
        
	public void setEnquiryTable(JTable jTableEnquiryTable) {
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		String selectClientDetailsQuery = (
                        "SELECT " 
                        + "enquiryID, " 
                        + "enquiryAdminID, " 
                        + "enquiryArea, " 
                        + "enquiryStatus " 
                        + "FROM tbl_enquiry");
		System.out.println(selectClientDetailsQuery);
		try {
			preparedStatement = databaseInstance.createConnection().prepareStatement(selectClientDetailsQuery);
			resultSet = preparedStatement.executeQuery();
			DefaultTableModel enquiryTableModel = (DefaultTableModel) jTableEnquiryTable.getModel();
			Object[] row;
			while (resultSet.next()) {
				row = new Object[4];
				row[0] = resultSet.getString(1);
				row[1] = resultSet.getString(2);
				row[2] = resultSet.getString(3);
				row[3] = resultSet.getString(4);

				enquiryTableModel.addRow(row);
                                resultSet.close();
                                preparedStatement.close();
                                databaseInstance.closeConnection();
			}
		}
		catch(SQLException ex) {
			Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
        
        public Boolean insertEnquiry (String enquiryID, String enquiryAdminID, String enquiryClientID,
                 String enquiryArea, String enquiryStatus, String enquiryNotes, String enquiryDate){
            
            PreparedStatement preparedStatement;
            
            String insertEnquirySQL = "INSERT INTO tbl_enquiry"
                    + "(enquiryID,"
                    + "enquiryAdminID,"
                    + "enquiryClientID,"
                    + "enquiryArea,"
                    + "enquiryStatus,"
                    + "enquiryNotes,"
                    + "enquiryDate)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            try {
                preparedStatement = databaseInstance.createConnection().prepareStatement(insertEnquirySQL);
                preparedStatement.setString(1, enquiryID);
                preparedStatement.setString(2, enquiryAdminID);
                preparedStatement.setString(3, enquiryClientID);
                preparedStatement.setString(4, enquiryArea);
                preparedStatement.setString(5, enquiryStatus);
                preparedStatement.setString(6, enquiryNotes);
                preparedStatement.setString(7, enquiryDate);
                
                if (preparedStatement.executeUpdate()>0){
                    //resultSet.close();
                    preparedStatement.close();
                    databaseInstance.closeConnection();
                    return true;
                }
                else {
                    //resultSet.close();
                    preparedStatement.close();
                    databaseInstance.closeConnection();
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Inquiry.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
            
        }
    
        
        
        public void setUserSelectedClientEnquiryTable (JTable enquiryTable, int clientID){
            System.out.println("CLIENT ID SELECTED: "+clientID);
            PreparedStatement preparedStatement;
		ResultSet resultSet;
		String selectClientDetailsQuery = ("SELECT "
                        + "tbl_enquiry.enquiryID, "
                        + "tbl_enquiry.enquiryAdminID, "
                        + "tbl_enquiry.enquiryArea, "
                        + "tbl_enquiry.enquiryStatus "
                        + "FROM tbl_enquiry "
                        + "JOIN tbl_client "
                        + "ON tbl_enquiry.enquiryClientID = tbl_client.clientID "
                        + "WHERE tbl_client.clientID =?");
		System.out.println(selectClientDetailsQuery);
		try {
			preparedStatement = databaseInstance.createConnection().prepareStatement(selectClientDetailsQuery);
                        preparedStatement.setInt(1, clientID);
			resultSet = preparedStatement.executeQuery();
			DefaultTableModel enquiryTableModel = (DefaultTableModel) enquiryTable.getModel();
			Object[] row;
			while (resultSet.next()) {
				row = new Object[4];
				row[0] = resultSet.getString(1);
				row[1] = resultSet.getString(2);
				row[2] = resultSet.getString(3);
				row[3] = resultSet.getString(4);

				enquiryTableModel.addRow(row);
                                resultSet.close();
                                preparedStatement.close();
                                databaseInstance.closeConnection();
			}
		}
		catch(SQLException ex) {
			Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
		}
        }

        public List setEnquiryDetails(int inquiryID){
        List returnResultSet = new LinkedList();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getEnquiryDataQuery = ("SELECT tbl_enquiry.enquiryID, tbl_client.clientID, tbl_enquiry.enquiryArea,"
                + " tbl_client.clientFirstname, tbl_client.clientLastname, tbl_enquiry.enquiryNotes, tbl_enquiry.enquiryDate"
                + " FROM tbl_enquiry JOIN tbl_client ON tbl_enquiry.enquiryClientID = tbl_client.clientID WHERE enquiryID = ?");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (getEnquiryDataQuery);
            preparedStatement.setInt(1,inquiryID);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
               returnResultSet.add(resultSet.getInt("enquiryID"));
               returnResultSet.add(resultSet.getInt("clientID"));
               returnResultSet.add(resultSet.getString("enquiryArea"));
               returnResultSet.add(resultSet.getString("clientFirstname"));
               returnResultSet.add(resultSet.getString("clientLastname")); 
               returnResultSet.add(resultSet.getString("enquiryNotes"));
               returnResultSet.add(resultSet.getString("enquiryDate"));
               resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return returnResultSet;
            }    
        
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        System.out.println(getEnquiryDataQuery);
        return returnResultSet;
        
    }
        
        
        
        public List setEnquiryDetailArea(int enquiryID) {
        List returnResultSet = new LinkedList();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getEnquiryQuery = ("SELECT enquiryID, enquiryAdminID, enquiryClientID, enquiryArea, enquiryStatus, enquiryDate, enquiryNotes FROM tbl_enquiry WHERE enquiryID = ?");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(getEnquiryQuery);
            preparedStatement.setInt(1, enquiryID);
            System.out.println(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                returnResultSet.add(resultSet.getString("enquiryID"));
                returnResultSet.add(resultSet.getString("enquiryAdminID"));
                returnResultSet.add(resultSet.getString("enquiryClientID"));
                returnResultSet.add(resultSet.getString("enquiryArea"));
                returnResultSet.add(resultSet.getString("enquiryStatus"));
                returnResultSet.add(resultSet.getString("enquiryDate"));    
                if (resultSet.getString("enquiryNotes") == null) {
                    returnResultSet.add("");
                } else {
                    returnResultSet.add(resultSet.getString("enquiryNotes"));
                }
                
                resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return returnResultSet;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(getEnquiryQuery);
        return returnResultSet;

    }
        
        
    int getAutoEnquiryID(){
       PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getSequentialID = ("SELECT MAX (enquiryID) AS 'enquiryID' FROM tbl_enquiry");
        System.out.println(getSequentialID);
        int sequentialUserIDResult;
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (getSequentialID);
            resultSet = preparedStatement.executeQuery();
            System.out.println ("PREVIOUS ENQUIRY ID = "+ resultSet.getInt("enquiryID"));
            System.out.println ("NEXT ENQUIRY ID = "+ (resultSet.getInt("enquiryID")+1));
            sequentialUserIDResult = (resultSet.getInt("enquiryID")+1);
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return sequentialUserIDResult;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
   }
        
        
        
}