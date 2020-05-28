/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author TIT
 */
public class WorkHours {
    DatabaseConnection databaseInstance = new DatabaseConnection();
    
    
    public LocalDate startOfNextConsecutiveWeek(){
        LocalDate date = LocalDate.now(); //TODAY (INTERNATIONAL TIME ZONE, BASED ON LOGIC OF DEVICE CURRENT LOCATION)
        System.out.println("NEXT CONSECUTUVE WEEK START -- MONDAY -- "+ date.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        System.out.println("PREVIOUS LOGICAL WEEK START -- MONDAY -- "+date.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
        return (date.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
    }
    
    public void setWorkHistoryTable(JTable workHistoryTable, int userID) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String appointmentData = ("SELECT appointmentDate, appointmentStartTime, appointmentEndTime FROM tbl_appointment where appointmentCaseworkerID =?");
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(appointmentData);
            preparedStatement.setInt(1, userID);
            resultSet = preparedStatement.executeQuery();
            ((DefaultTableModel) workHistoryTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
            DefaultTableModel userTableModel = (DefaultTableModel) workHistoryTable.getModel();

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
    
    
    
    
}
