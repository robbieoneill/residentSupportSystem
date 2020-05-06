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
public class Case {

    DatabaseConnection databaseInstance = new DatabaseConnection();

    public void setCaseTable(JTable caseTable, String caseIDEntered) {
        System.out.println("CASE ID ENTERED: " + caseIDEntered);
        if (caseIDEntered.equals("ALL CASES")) {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            String selectCaseDetailsQuery = ("SELECT tbl_case.caseID, tbl_client.clientFirstname, tbl_client.clientLastname, tbl_case.caseStatus FROM tbl_case JOIN tbl_client ON tbl_case.caseClientID = tbl_client.clientID");
            System.out.println(selectCaseDetailsQuery);
            try {
                preparedStatement = databaseInstance.createConnection().prepareStatement(selectCaseDetailsQuery);
                resultSet = preparedStatement.executeQuery();
                ((DefaultTableModel) caseTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
                DefaultTableModel userTableModel = (DefaultTableModel) caseTable.getModel();
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
        } else {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            String selectCaseDetailsQuery = ("SELECT tbl_case.caseID, tbl_client.clientFirstname, tbl_client.clientLastname, tbl_case.caseStatus FROM tbl_case JOIN tbl_client ON tbl_case.caseClientID = tbl_client.clientID WHERE caseID = ?");
            System.out.println(selectCaseDetailsQuery);
            try {
                preparedStatement = databaseInstance.createConnection().prepareStatement(selectCaseDetailsQuery);
                preparedStatement.setString(1, caseIDEntered);
                resultSet = preparedStatement.executeQuery();
                ((DefaultTableModel) caseTable.getModel()).setNumRows(0); // RESET TABLE TO ALLOW REFRESH
                DefaultTableModel userTableModel = (DefaultTableModel) caseTable.getModel();
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
    }
}