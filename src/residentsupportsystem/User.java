/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
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
public class User {
    DatabaseConnection databaseInstance = new DatabaseConnection();
    
    
    
    
    public String caseworkerCount(){
         PreparedStatement preparedStatement;
        ResultSet resultSet;
        String clientCountQuery = ("SELECT COUNT (*) AS userCount FROM tbl_user WHERE userType = 'Case Worker'");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (clientCountQuery);
            resultSet = preparedStatement.executeQuery();
            String clientCount = (resultSet.getString("userCount"));
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return clientCount;
        } catch (SQLException ex) { 
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return ("Null");
        }
    }
    

    public boolean insertUser(String userID, String userFirstname,
        String userMiddlename, String userLastname, String userGender,
        String userDOB, String userType, String userUsername,
        String userPassword, String userEmail, String userTelephone,
        String userMobile, String userWorkTel, String userAddr1,
        String userAddr2, String userPostcode, String userNotes) {

        PreparedStatement preparedStatement;
        ResultSet resutlSet;
        String insertUserQuery = "INSERT INTO tbl_user " +
            "(userID," +
            "userFirstname," +
            "userLastname," +
            "userMiddlename," +
            "userGender," +
            "userDOB," +
            "userType," +
            "userUsername," +
            "userPassword," +
            "userEmail," +
            "userTelNumber," +
            "userMobNumber," +
            "userWorkNumber," +
            "userAddr1," +
            "userAddr2," +
            "userPostcode," +
            "userNotes)" +
            "VALUES (" +
            "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(insertUserQuery);
            preparedStatement.setString(1, userID);
            preparedStatement.setString(2, userFirstname);
            preparedStatement.setString(3, userLastname);
            preparedStatement.setString(4, userMiddlename);
            preparedStatement.setString(5, userGender);
            preparedStatement.setString(6, userDOB);
            preparedStatement.setString(7, userType);
            preparedStatement.setString(8, userUsername);
            preparedStatement.setString(9, userPassword);
            preparedStatement.setString(10, userEmail);
            preparedStatement.setString(11, userTelephone);
            preparedStatement.setString(12, userMobile);
            preparedStatement.setString(13, userWorkTel);
            preparedStatement.setString(14, userAddr1);
            preparedStatement.setString(15, userAddr2);
            preparedStatement.setString(16, userPostcode);
            preparedStatement.setString(17, userNotes);

            if (preparedStatement.executeUpdate() > 0) {
                //resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return true;
            } else {
                //resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public void setUserTable(JTable userTable) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String selectUserDetailsQuery = ("SELECT " +
            "userID, " +
            "userFirstname, " +
            "userLastname, " +
            "userType, " +
            "userGender, " +
            "userEmail " +
            "FROM tbl_user");
        System.out.println(selectUserDetailsQuery);
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(selectUserDetailsQuery);
            resultSet = preparedStatement.executeQuery();
            DefaultTableModel userTableModel = (DefaultTableModel) userTable.getModel();

            Object[] row;
            while (resultSet.next()) {
                row = new Object[6];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                row[4] = resultSet.getString(5);
                row[5] = resultSet.getString(6);
                userTableModel.addRow(row);

            }
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    int getCaseworkerCount() {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String caseworkerCountQuery = ("SELECT COUNT(*) AS caseworkerCount FROM tbl_user WHERE userType = 'Case Worker'");
        System.out.println(caseworkerCountQuery);
        int caseworkerCountQueryResult;

        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(caseworkerCountQuery);
            resultSet = preparedStatement.executeQuery();
            caseworkerCountQueryResult = resultSet.getInt("caseworkerCount");
            System.out.println("CASEWORKER COUNT: " + caseworkerCountQueryResult);
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return caseworkerCountQueryResult;

        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    int getUserAutoID() {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getSequentialID = ("SELECT MAX (userID) AS 'userID' FROM tbl_user ");
        System.out.println(getSequentialID);
        int sequentialUserIDResult;

        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(getSequentialID);
            resultSet = preparedStatement.executeQuery();
            System.out.println("PREVIOUS USER ID = " + resultSet.getInt("userID"));
            System.out.println("NEXT SEQUENTIAL USER ID = " + (resultSet.getInt("userID") + 1));
            sequentialUserIDResult = (resultSet.getInt("userID") + 1);
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return sequentialUserIDResult;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public List setUserDetails(int userID) {
        List returnResultSet = new LinkedList();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getUserDataQuery = ("SELECT * FROM tbl_user WHERE userID = ?");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(getUserDataQuery);
            preparedStatement.setInt(1, userID);
            System.out.println(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                returnResultSet.add(resultSet.getInt("userID"));
                returnResultSet.add(resultSet.getString("userFirstname"));
                if (resultSet.getString("userMiddlename") == null) {
                    returnResultSet.add("");
                } else {

                    returnResultSet.add(resultSet.getString("userMiddlename"));
                }
                returnResultSet.add(resultSet.getString("userLastname"));
                returnResultSet.add(resultSet.getString("userGender"));
                returnResultSet.add(resultSet.getString("userDOB"));
                returnResultSet.add(resultSet.getString("userType"));
                returnResultSet.add(resultSet.getString("userUsername"));
                returnResultSet.add(resultSet.getString("userPassword"));
                returnResultSet.add(resultSet.getString("userEmail"));
                returnResultSet.add(resultSet.getString("userTelNumber"));
                returnResultSet.add(resultSet.getString("userMobNumber"));
                returnResultSet.add(resultSet.getString("userWorkNumber"));
                returnResultSet.add(resultSet.getString("userAddr1"));
                if (resultSet.getString("userAddr2") == null) {
                    returnResultSet.add("");
                } else {
                    returnResultSet.add(resultSet.getString("userAddr2"));
                }
                returnResultSet.add(resultSet.getString("userPostcode"));
                if (resultSet.getString("userNotes") == null) {
                    returnResultSet.add("");
                } else {
                    returnResultSet.add(resultSet.getString("userNotes"));
                }
                resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return returnResultSet;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(getUserDataQuery);
        return returnResultSet;

    }

    public boolean updateUserDetails(String userID, String userFirstname,
        String userMiddlename, String userLastname, String userGender,
        String userDOB, String userEmail, String userTel, String userMob,
        String userAddr1, String userAddr2, String userPostcode) {

        PreparedStatement preparedStatement;
        String updateUserSQL = "UPDATE tbl_user " +
            "SET userFirstname = ?, " +
            "userMiddlename = ?," +
            "userLastname = ?," +
            "userGender = ?," +
            "userDOB = ?," +
            "userEmail = ?," +
            "userTelNumber = ?," +
            "userMobNumber = ?," +
            "userAddr1 = ?," +
            "userAddr2 = ?," +
            "userPostcode = ? " +
            "WHERE userID = ?";
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(updateUserSQL);
            preparedStatement.setString(1, userFirstname);
            preparedStatement.setString(2, userMiddlename);
            preparedStatement.setString(3, userLastname);
            preparedStatement.setString(4, userGender);
            preparedStatement.setString(5, userDOB);
            preparedStatement.setString(6, userEmail);
            preparedStatement.setString(7, userTel);
            preparedStatement.setString(8, userMob);
            preparedStatement.setString(9, userAddr1);
            preparedStatement.setString(10, userAddr2);
            preparedStatement.setString(11, userPostcode);
            preparedStatement.setString(12, userID);
            if (preparedStatement.executeUpdate() > 0) {
                //resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return true;
            } else {
                //resultSet.close();
                preparedStatement.close();
                databaseInstance.closeConnection();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
    boolean deleteUser(String userID){
       PreparedStatement preparedStatement;
       String deleteSql = "DELETE FROM tbl_user WHERE userID =?";
       System.out.println("USER ID TO BE DELETED: "+userID);
       try{
           preparedStatement = databaseInstance.createConnection().prepareStatement(deleteSql);
           preparedStatement.setString(1, userID);
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