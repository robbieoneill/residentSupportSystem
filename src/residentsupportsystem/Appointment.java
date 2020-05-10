/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author robbieoneill
 */
public class Appointment {
    DatabaseConnection databaseInstance = new DatabaseConnection();
    
    
    public String appointmentCount(){
         PreparedStatement preparedStatement;
        ResultSet resultSet;
        String clientCountQuery = ("SELECT COUNT (*) AS appointmentCount FROM tbl_appointment WHERE appointmentStatus = 'BOOKED'");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (clientCountQuery);
            resultSet = preparedStatement.executeQuery();
            String appointmentCount = (resultSet.getString("appointmentCount"));
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
            return appointmentCount;
        } catch (SQLException ex) { 
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return ("Null");
        }
    }


    public void setAppointmentTable(JTable appointmentTable, int caseSelected) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String selectCaseDetailsQuery = ("SELECT appointmentID, appointmentDate, appointmentStartTime, "
                + "appointmentEndTime, appointmentStatus FROM tbl_appointment WHERE appointmentEnquiryID = ?");
        System.out.println(selectCaseDetailsQuery);
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(selectCaseDetailsQuery);
            preparedStatement.setInt(1, caseSelected);
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel) appointmentTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
            DefaultTableModel userTableModel = (DefaultTableModel) appointmentTable.getModel();

            Object[] row;
            while (resultSet.next()) {
                row = new Object[4];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                userTableModel.addRow(row);
            }
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setAvailableAppointmentTable(JTable appointmentTable) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String appointmentData = ("SELECT appointmentID, appointmentDate, appointmentStartTime,"
                + " appointmentEndTime, appointmentStatus, appointmentRoom "
                + "FROM tbl_appointment WHERE appointmentStatus = 'AVAILABLE'");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(appointmentData);
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel) appointmentTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
            DefaultTableModel userTableModel = (DefaultTableModel) appointmentTable.getModel();

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

    public void setMiniAppointmentTable(JTable appointmentTable) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String appointmentData =("SELECT appointmentID, appointmentDate, appointmentStartTime FROM tbl_appointment WHERE appointmentStatus =?");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(appointmentData);
            preparedStatement.setString(1, "AVAILABLE");
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel) appointmentTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
            DefaultTableModel userTableModel = (DefaultTableModel) appointmentTable.getModel();

            Object[] row;
            while (resultSet.next()) {
                row = new Object[3];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                userTableModel.addRow(row);
            }
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    int getAppointmentAutoID() {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getSequentialID = ("SELECT MAX (appointmentID) AS 'appointmentID' FROM tbl_appointment ");
        System.out.println(getSequentialID);
        int sequentialAppointmentIDResult;

        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(getSequentialID);
            resultSet = preparedStatement.executeQuery();
            System.out.println("PREVIOUS APPOINTMENT ID = " + resultSet.getInt("appointmentID"));
            System.out.println("NEXT SEQUENTIAL APPOINTMENT ID = " + resultSet.getInt("appointmentID") + 1);
            sequentialAppointmentIDResult = resultSet.getInt("appointmentID") + 1;
            preparedStatement.close();
            databaseInstance.closeConnection();
            return sequentialAppointmentIDResult;
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public void addAppointment(LocalDate startOfWeekDate, int dayIndex, int userID, int numberOfHours, int startTime, int endTime) {
        PreparedStatement preparedStatement = null;
        System.out.println("APPOINTMENT ENTRY HAS BEEN TRIGGERED");
        String appointmentDate = (startOfWeekDate.plusDays(dayIndex).toString());
        System.out.println("APPOINTMENT DATE: " + appointmentDate);
        int appointmentStartTime = startTime;
        int appointmentEndTime = 0;

        for (int i = 0; i <= numberOfHours; i++) {
            appointmentStartTime = appointmentStartTime + 1;
            appointmentEndTime = appointmentStartTime + 1;

            String addAppointmentQuery = "INSERT INTO tbl_appointment (" +
                "appointmentID," +
                "appointmentDate, " +
                "appointmentStartTime, " +
                "appointmentEndTime, " +
                "appointmentStatus," +
                "appointmentRoom, " +
                "appointmentCaseworkerID) VALUES (?,?,?,?,?,?,?)";
            try {
                preparedStatement = databaseInstance.createConnection().prepareStatement(addAppointmentQuery);
                preparedStatement.setInt(1, getAppointmentAutoID()); 
                preparedStatement.setString(2, appointmentDate);
                preparedStatement.setInt(3, appointmentStartTime);
                preparedStatement.setInt(4, appointmentEndTime);
                preparedStatement.setString(5, "AVAILABLE");
                preparedStatement.setString(6, "");
                preparedStatement.setInt(7, userID);
                databaseInstance.createConnection().close();
                preparedStatement.addBatch();

                System.out.println("APPOINTMENT ADDED");
                preparedStatement.close();
                databaseInstance.closeConnection();


            } catch (SQLException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }



        }
        try {
            preparedStatement.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
    
    
    
    
    
    
    public List setAppointmentDetails(int inquiryID){
        List returnResultSet = new LinkedList();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getEnquiryDataQuery = ("SELECT tbl_appointment.appointmentID, tbl_appointment.appointmentDate,"
                + " tbl_appointment.appointmentStartTime, tbl_appointment.appointmentEndTime,"
                + " tbl_appointment.appointmentNotes, tbl_user.userFirstname, tbl_user.userLastname,"
                + " tbl_appointment.appointmentStatus, tbl_appointment.appointmentAdminID,"
                + "  tbl_enquiry.enquiryClientID FROM tbl_appointment "
                + "JOIN tbl_user ON tbl_appointment.appointmentCaseworkerID = tbl_user.userID JOIN tbl_enquiry "
                + "ON tbl_appointment.appointmentEnquiryID = tbl_enquiry.enquiryID WHERE appointmentID=?");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement (getEnquiryDataQuery);
            preparedStatement.setInt(1,inquiryID);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
               returnResultSet.add(resultSet.getInt("appointmentID"));
               returnResultSet.add(resultSet.getString("appointmentDate"));
               returnResultSet.add(resultSet.getString("appointmentStartTime"));
               returnResultSet.add(resultSet.getString("appointmentEndTime"));
               if (resultSet.getString("appointmentNotes") == null) {
                    returnResultSet.add("");
                } else {

                    returnResultSet.add(resultSet.getString("appointmentNotes"));
                }
               
               returnResultSet.add(resultSet.getString("userFirstname")); 
               returnResultSet.add(resultSet.getString("userLastname"));
               returnResultSet.add(resultSet.getString("appointmentStatus"));
               returnResultSet.add(resultSet.getString("appointmentAdminID"));
               returnResultSet.add(resultSet.getString("enquiryClientID"));
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
    
    
    public void setCaseworkersAppointmentTable(JTable appointmentTable, int userID) {
        System.out.println(userID);
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String selectCaseDetailsQuery = ("SELECT appointmentID, appointmentDate, appointmentStartTime,"
                + " appointmentEndTime, appointmentStatus FROM tbl_appointment WHERE"
                + " appointmentCaseworkerID =? AND appointmentStatus=?");
        System.out.println(selectCaseDetailsQuery);
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(selectCaseDetailsQuery);
            preparedStatement.setInt(1, userID);
            preparedStatement.setString(2, "BOOKED");
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel) appointmentTable.getModel()).setNumRows(0);
            DefaultTableModel userTableModel = (DefaultTableModel) appointmentTable.getModel();
            Object[] row;
            while (resultSet.next()) {
                row = new Object[5];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                row[4] = resultSet.getString(5);
                userTableModel.addRow(row);
            }
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
        getAppointmentsCountByDate - Method will give the appointments count by dates
        
    */
    public TreeMap getAppointmentsCountByDate(){
        TreeMap<String,String> appointmentCountByDate = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getAppointmentsCountByDateQuery = ("SELECT appointmentDate, COUNT(*) as count "+ 
                "FROM tbl_appointment GROUP BY appointmentDate");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(getAppointmentsCountByDateQuery);
            resultSet = preparedStatement.executeQuery();
            appointmentCountByDate = new TreeMap<>();
            while (resultSet.next()) { 
                appointmentCountByDate.put(resultSet.getString(1), resultSet.getString(2));
            }
            resultSet.close();
            preparedStatement.close();
            databaseInstance.closeConnection();
        } catch(SQLException ex){
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointmentCountByDate;
    }


}