/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robbieoneill
 */
public class WaitingList {
    DatabaseConnection databaseInstance = new DatabaseConnection();
    
    public void setWaitingListTable(JTable waitingListTable){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String selectClientDetailsQuery=("﻿SELECT "
                + "enquiryID, "
                + "clientFirstname, "
                + "clientLastname, "
                + "enquiryArea, "
                + "enquiryDate "
                + "FROM tbl_enquiry JOIN tbl_client on tbl_enquiry.enquiryClientID = tbl_client.clientID "
                + "WHERE enquiryStatus=?");
        System.out.println(selectClientDetailsQuery);
        try {
            preparedStatement = databaseInstance.createConnection().prepareStatement(selectClientDetailsQuery);
            preparedStatement.setString(1, "WAITING");
            resultSet = preparedStatement.executeQuery();
            DefaultTableModel clientTableModel = (DefaultTableModel)waitingListTable.getModel();
            
            Object[]row;
            
            while (resultSet.next()){
               row = new Object[5];
               row[0] = resultSet.getString(1);
               row[1] = resultSet.getString(2);
               row[2] = resultSet.getString(3);
               row[3] = resultSet.getString(4);
               row[4] = resultSet.getString(5);
               
               
               clientTableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
