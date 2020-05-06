/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robbieoneill
 */
public class CaseworkerManageCases extends javax.swing.JFrame {

    int userLoggedIn;
    Case caseInstance = new Case();
    Appointment appointmentConnectionInstance = new Appointment();
    /**
     * Creates new form caseworkerManageCases
     */
    public CaseworkerManageCases(int userID) {
        userLoggedIn = userID;
        initComponents();
        
        caseInstance.setCaseTable(caseTablejTable, "ALL CASES");
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowjPanel = new javax.swing.JPanel();
        headerjPanel = new javax.swing.JPanel();
        casesjPanel = new javax.swing.JPanel();
        filterjPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        caseIDjTextField = new javax.swing.JTextField();
        searchjButton = new javax.swing.JButton();
        allCasesjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        appointmentsjPanel = new javax.swing.JPanel();
        clientDetailsjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        casesTablejScrollPane = new javax.swing.JScrollPane();
        caseTablejTable = new javax.swing.JTable();
        detailsjPanel = new javax.swing.JPanel();
        clientDetailsjPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        appointmentTablejScrollPane = new javax.swing.JScrollPane();
        appointmentTablejTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerjPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout headerjPanelLayout = new javax.swing.GroupLayout(headerjPanel);
        headerjPanel.setLayout(headerjPanelLayout);
        headerjPanelLayout.setHorizontalGroup(
            headerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerjPanelLayout.setVerticalGroup(
            headerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        casesjPanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setText("Search Cases");

        jLabel4.setText("Case ID");

        jLabel5.setText("Case Status");

        caseIDjTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                caseIDjTextFieldPropertyChange(evt);
            }
        });

        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        allCasesjButton.setText("All Cases");
        allCasesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allCasesjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filterjPanelLayout = new javax.swing.GroupLayout(filterjPanel);
        filterjPanel.setLayout(filterjPanelLayout);
        filterjPanelLayout.setHorizontalGroup(
            filterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterjPanelLayout.createSequentialGroup()
                .addGroup(filterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filterjPanelLayout.createSequentialGroup()
                        .addGroup(filterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(filterjPanelLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel3))
                            .addGroup(filterjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filterjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(filterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(filterjPanelLayout.createSequentialGroup()
                                .addComponent(searchjButton)
                                .addGap(18, 18, 18)
                                .addComponent(allCasesjButton))
                            .addComponent(caseIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        filterjPanelLayout.setVerticalGroup(
            filterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(caseIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(filterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchjButton)
                    .addComponent(allCasesjButton))
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout casesjPanelLayout = new javax.swing.GroupLayout(casesjPanel);
        casesjPanel.setLayout(casesjPanelLayout);
        casesjPanelLayout.setHorizontalGroup(
            casesjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(casesjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(casesjPanelLayout.createSequentialGroup()
                        .addComponent(backjButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        casesjPanelLayout.setVerticalGroup(
            casesjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backjButton)
                .addGap(12, 12, 12))
        );

        appointmentsjPanel.setBackground(new java.awt.Color(153, 153, 153));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Case Notes");

        javax.swing.GroupLayout clientDetailsjPanelLayout = new javax.swing.GroupLayout(clientDetailsjPanel);
        clientDetailsjPanel.setLayout(clientDetailsjPanelLayout);
        clientDetailsjPanelLayout.setHorizontalGroup(
            clientDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(clientDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientDetailsjPanelLayout.setVerticalGroup(
            clientDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        caseTablejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Firstname", "Lastname", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        caseTablejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseTablejTableMouseClicked(evt);
            }
        });
        casesTablejScrollPane.setViewportView(caseTablejTable);

        javax.swing.GroupLayout appointmentsjPanelLayout = new javax.swing.GroupLayout(appointmentsjPanel);
        appointmentsjPanel.setLayout(appointmentsjPanelLayout);
        appointmentsjPanelLayout.setHorizontalGroup(
            appointmentsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointmentsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(casesTablejScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(clientDetailsjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        appointmentsjPanelLayout.setVerticalGroup(
            appointmentsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(casesTablejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(clientDetailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        detailsjPanel.setBackground(new java.awt.Color(153, 153, 153));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setText("Appointment Notes");

        javax.swing.GroupLayout clientDetailsjPanel1Layout = new javax.swing.GroupLayout(clientDetailsjPanel1);
        clientDetailsjPanel1.setLayout(clientDetailsjPanel1Layout);
        clientDetailsjPanel1Layout.setHorizontalGroup(
            clientDetailsjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(clientDetailsjPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientDetailsjPanel1Layout.setVerticalGroup(
            clientDetailsjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientDetailsjPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        appointmentTablejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Start Date", "End Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentTablejScrollPane.setViewportView(appointmentTablejTable);

        javax.swing.GroupLayout detailsjPanelLayout = new javax.swing.GroupLayout(detailsjPanel);
        detailsjPanel.setLayout(detailsjPanelLayout);
        detailsjPanelLayout.setHorizontalGroup(
            detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientDetailsjPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsjPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(appointmentTablejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        detailsjPanelLayout.setVerticalGroup(
            detailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appointmentTablejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientDetailsjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout windowjPanelLayout = new javax.swing.GroupLayout(windowjPanel);
        windowjPanel.setLayout(windowjPanelLayout);
        windowjPanelLayout.setHorizontalGroup(
            windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowjPanelLayout.createSequentialGroup()
                .addComponent(headerjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(windowjPanelLayout.createSequentialGroup()
                .addComponent(casesjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appointmentsjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(detailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        windowjPanelLayout.setVerticalGroup(
            windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowjPanelLayout.createSequentialGroup()
                .addComponent(headerjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentsjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casesjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailsjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        new CaseworkerDashboard(userLoggedIn).setVisible(true);
        this.dispose();         
        
    }//GEN-LAST:event_backjButtonActionPerformed

    private void caseIDjTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_caseIDjTextFieldPropertyChange
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_caseIDjTextFieldPropertyChange

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        String caseIDEntered = caseIDjTextField.getText();
        caseInstance.setCaseTable(caseTablejTable, caseIDEntered);
        
        // caseIDEntereded will be replaced with the ID value of the selected row within the case table, allowing for the query of data by correct case id (which is a forign key).
        //appointmentConnectionInstance.setAppointmentTable(appointmentTablejTable, caseIDEntered);

// TODO add your handling code here:
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void caseTablejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caseTablejTableMouseClicked
        
        DefaultTableModel userTable = (DefaultTableModel)caseTablejTable.getModel();
        
        int selectedRow = caseTablejTable.getSelectedRow();
        String selectedCasePointer = (userTable.getValueAt(selectedRow, 0).toString());
        int selectedCaseID = Integer.parseInt(selectedCasePointer);
        appointmentConnectionInstance.setAppointmentTable(appointmentTablejTable, selectedCaseID);

        // TODO add your handling code here:
    }//GEN-LAST:event_caseTablejTableMouseClicked

    private void allCasesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allCasesjButtonActionPerformed
        // TODO add your handling code here:
        
        caseInstance.setCaseTable(caseTablejTable, "ALL CASES");
    }//GEN-LAST:event_allCasesjButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allCasesjButton;
    private javax.swing.JScrollPane appointmentTablejScrollPane;
    private javax.swing.JTable appointmentTablejTable;
    private javax.swing.JPanel appointmentsjPanel;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField caseIDjTextField;
    private javax.swing.JTable caseTablejTable;
    private javax.swing.JScrollPane casesTablejScrollPane;
    private javax.swing.JPanel casesjPanel;
    private javax.swing.JPanel clientDetailsjPanel;
    private javax.swing.JPanel clientDetailsjPanel1;
    private javax.swing.JPanel detailsjPanel;
    private javax.swing.JPanel filterjPanel;
    private javax.swing.JPanel headerjPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton searchjButton;
    private javax.swing.JPanel windowjPanel;
    // End of variables declaration//GEN-END:variables
}
