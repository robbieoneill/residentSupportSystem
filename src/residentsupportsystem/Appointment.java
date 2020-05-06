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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robbieoneill
 */
public class Appointment {
    DatabaseConnection appointmentConnectionInstance = new DatabaseConnection();
    
    
    public void setAppointmentTable(JTable appointmentTable, int caseSelected){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String selectCaseDetailsQuery = ("SELECT appointmentID, appointmentDate, appointmentStartTime, appointmentEndTime, appointmentStatus FROM tbl_appointment WHERE appointmentCaseID = ?");
        System.out.println(selectCaseDetailsQuery);
        try {
            preparedStatement = appointmentConnectionInstance.createConnection().prepareStatement(selectCaseDetailsQuery);
            preparedStatement.setInt(1, caseSelected);
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel)appointmentTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
            DefaultTableModel userTableModel = (DefaultTableModel)appointmentTable.getModel();
            
            Object[]row;
            while (resultSet.next()){
                row = new Object[4];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                userTableModel.addRow(row);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// END OF setAppointmentTable

    public void  setAvailableAppointmentTable (JTable appointmentTable){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String appointmentData = ("SELECT appointmentID, appointmentDate, appointmentStartTime, appointmentEndTime, appointmentStatus, appointmentRoom FROM tbl_appointment WHERE appointmentStatus = 'AVAILABLE'");
        try {
            preparedStatement = appointmentConnectionInstance.createConnection().prepareStatement(appointmentData);
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel)appointmentTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
            DefaultTableModel userTableModel = (DefaultTableModel)appointmentTable.getModel();
            
            Object[]row;
            while (resultSet.next()){
                row = new Object [6];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                row[2] = resultSet.getString(5);
                row[3] = resultSet.getString(6);
                userTableModel.addRow(row);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void  setMiniAppointmentTable (JTable appointmentTable){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String appointmentData = ("SELECT appointmentID, appointmentDate, appointmentStartTime FROM tbl_appointment WHERE appointmentStatus = 'AVAILABLE'");
        try {
            preparedStatement = appointmentConnectionInstance.createConnection().prepareStatement(appointmentData);
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel)appointmentTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
            DefaultTableModel userTableModel = (DefaultTableModel)appointmentTable.getModel();
            
            Object[]row;
            while (resultSet.next()){
                row = new Object [3];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                userTableModel.addRow(row);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    int getAppointmentAutoID(){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String getSequentialID = ("SELECT MAX (appointmentID) AS 'appointmentID' FROM tbl_appointment ");
        System.out.println(getSequentialID);
        int sequentialAppointmentIDResult;
        
        try {
            preparedStatement = appointmentConnectionInstance.createConnection().prepareStatement (getSequentialID);
            resultSet = preparedStatement.executeQuery();
            System.out.println ("PREVIOUS APPOINTMENT ID = "+ resultSet.getInt("appointmentID"));
            System.out.println ("NEXT SEQUENTIAL APPOINTMENT ID = "+ resultSet.getInt("appointmentID")+1);
            sequentialAppointmentIDResult = resultSet.getInt("appointmentID")+1;
            
            return sequentialAppointmentIDResult;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public void addAppointment(LocalDate startOfWeekDate, int dayIndex, int userID, int numberOfHours, int startTime, int endTime){
        PreparedStatement preparedStatement = null;
        System.out.println("APPOINTMENT ENTRY HAS BEEN TRIGGERED");
        String appointmentDate = (startOfWeekDate.plusDays(dayIndex).toString());
        System.out.println("APPOINTMENT DATE: "+appointmentDate);
        int appointmentStartTime = startTime;
        int appointmentEndTime = 0;
        
        for (int i = 0; i <= numberOfHours; i++) {
            appointmentStartTime = appointmentStartTime+1;
            appointmentEndTime = appointmentStartTime+1;
            System.out.println("APPOINTMENT CACL START: "+appointmentStartTime);
            System.out.println("APPOINTMENT CACL END: "+appointmentEndTime);
            
            String addAppointmentQuery = "INSERT INTO tbl_appointment ("
                    + "appointmentID,"
                    + "appointmentDate, "
                    + "appointmentStartTime, "
                    + "appointmentEndTime, "
                    + "appointmentStatus,"
                    + "appointmentRoom, "
                    + "appointmentCaseworkerID) VALUES (?,?,?,?,?,?,?)";
            try {
                preparedStatement = appointmentConnectionInstance.createConnection().prepareStatement (addAppointmentQuery);
                preparedStatement.setInt(1,getAppointmentAutoID()); // THIS IS WHERE WE COULD CALL AUTO GENERTATE ID
                preparedStatement.setString(2,appointmentDate);
                preparedStatement.setInt(3,appointmentStartTime);
                preparedStatement.setInt(4,appointmentEndTime);
                preparedStatement.setString(5, "AVAILABLE");
                preparedStatement.setString(6, "RED ROOM");
                preparedStatement.setInt(7, userID);
                appointmentConnectionInstance.createConnection().close();
                preparedStatement.addBatch();
                
                System.out.println("APPOINTMENT ADDED");
                
            
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

            
    
    
}