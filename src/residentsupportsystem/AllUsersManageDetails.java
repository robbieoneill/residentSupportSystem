/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robbieoneill
 */
public class AllUsersManageDetails extends javax.swing.JFrame {

    /**
     * Creates new form AdminManageUsers
     */
    int userLoggedIn;
    User user = new User();
    public AllUsersManageDetails(int userID) {
    userLoggedIn = userID; 
       
     initComponents();
        manageDetailsjLabel.setText("Manage Details for: "+Integer.toString(userLoggedIn));
        
         List resultSetArrayList = user.setUserDetails(userLoggedIn);
         userFirstnamejTextField.setText(resultSetArrayList.get(1).toString());
         userMiddlenamejTextField.setText(resultSetArrayList.get(2).toString());
         userLastnamejTextField.setText(resultSetArrayList.get(3).toString());
         userDOBjTextField.setText(resultSetArrayList.get(5).toString());
         userEmailjTextField.setText(resultSetArrayList.get(9).toString());
         userTeljTextField.setText(resultSetArrayList.get(10).toString());
         userMobjTextField.setText(resultSetArrayList.get(10).toString());
         userAddr1jTextField.setText(resultSetArrayList.get(13).toString());
         userAddr2jTextField.setText(resultSetArrayList.get(14).toString());
         userPostcodejTextField.setText(resultSetArrayList.get(15).toString());
         switch (resultSetArrayList.get(4).toString()) {
            case "Male":
                userGenderjComboBox.setSelectedItem("Male");
                break;
            case "Female":
                userGenderjComboBox.setSelectedItem("Female");
                break;
             case "Other":
                userGenderjComboBox.setSelectedItem("Other");
                break;
            default:
                userGenderjComboBox.setSelectedItem("User Gender:");
                break;
        }
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
        jPanel2 = new javax.swing.JPanel();
        userFirstnamejLabel1 = new javax.swing.JLabel();
        userMiddlenamejLabel1 = new javax.swing.JLabel();
        userLastnamejLabel1 = new javax.swing.JLabel();
        userLastnamejTextField = new javax.swing.JTextField();
        userMiddlenamejTextField = new javax.swing.JTextField();
        userFirstnamejTextField = new javax.swing.JTextField();
        userGenderjLabel = new javax.swing.JLabel();
        userGenderjComboBox = new javax.swing.JComboBox<>();
        userDOBjLabel = new javax.swing.JLabel();
        userDOBjTextField = new javax.swing.JTextField();
        personalDetailsjLabel = new javax.swing.JLabel();
        contactDetailsjPanel = new javax.swing.JPanel();
        userEmailjLabel = new javax.swing.JLabel();
        userTeljLabel = new javax.swing.JLabel();
        userEmailjTextField = new javax.swing.JTextField();
        userTeljTextField = new javax.swing.JTextField();
        userMobjLabel = new javax.swing.JLabel();
        userMobjTextField = new javax.swing.JTextField();
        contactDetailsjLabel = new javax.swing.JLabel();
        homeDetailsjPanel = new javax.swing.JPanel();
        userAddr1jLabel = new javax.swing.JLabel();
        userAddr1jTextField = new javax.swing.JTextField();
        userAddr2jLabel = new javax.swing.JLabel();
        userAddr2jTextField = new javax.swing.JTextField();
        userPostcodejLabel = new javax.swing.JLabel();
        userPostcodejTextField = new javax.swing.JTextField();
        homeDetailsjLabel = new javax.swing.JLabel();
        headerjPanel = new javax.swing.JPanel();
        manageDetailsjLabel = new javax.swing.JLabel();
        saveChangesjButton = new javax.swing.JButton();
        clearFieldsjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        windowjPanel.setBackground(new java.awt.Color(113, 128, 147));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        userFirstnamejLabel1.setText("Firstname");

        userMiddlenamejLabel1.setText("Middlename");

        userLastnamejLabel1.setText("Lastname");

        userLastnamejTextField.setBackground(new java.awt.Color(220, 221, 225));

        userMiddlenamejTextField.setBackground(new java.awt.Color(220, 221, 225));

        userFirstnamejTextField.setBackground(new java.awt.Color(220, 221, 225));

        userGenderjLabel.setText("Gender");

        userGenderjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Gender:", "Male", "Female", "Other" }));

        userDOBjLabel.setText("DOB");

        userDOBjTextField.setBackground(new java.awt.Color(220, 221, 225));

        personalDetailsjLabel.setText("Personal Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userDOBjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userGenderjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userLastnamejLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userFirstnamejLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userMiddlenamejLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userGenderjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userLastnamejTextField)
                                .addComponent(userMiddlenamejTextField)
                                .addComponent(userFirstnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userDOBjTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(personalDetailsjLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalDetailsjLabel)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFirstnamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userFirstnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userMiddlenamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userMiddlenamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLastnamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLastnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userGenderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userGenderjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userDOBjLabel)
                    .addComponent(userDOBjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contactDetailsjPanel.setBackground(new java.awt.Color(255, 255, 255));

        userEmailjLabel.setText("Email");

        userTeljLabel.setText("Telephone");

        userEmailjTextField.setBackground(new java.awt.Color(220, 221, 225));

        userTeljTextField.setBackground(new java.awt.Color(220, 221, 225));

        userMobjLabel.setText("Mobile");

        userMobjTextField.setBackground(new java.awt.Color(220, 221, 225));

        contactDetailsjLabel.setText("Contact Details");

        javax.swing.GroupLayout contactDetailsjPanelLayout = new javax.swing.GroupLayout(contactDetailsjPanel);
        contactDetailsjPanel.setLayout(contactDetailsjPanelLayout);
        contactDetailsjPanelLayout.setHorizontalGroup(
            contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactDetailsjPanelLayout.createSequentialGroup()
                        .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(userMobjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userTeljLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(userEmailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userMobjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userTeljTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(userEmailjTextField, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(contactDetailsjLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contactDetailsjPanelLayout.setVerticalGroup(
            contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactDetailsjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEmailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTeljLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userMobjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userMobjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        homeDetailsjPanel.setBackground(new java.awt.Color(255, 255, 255));

        userAddr1jLabel.setText("Addr 1");

        userAddr1jTextField.setBackground(new java.awt.Color(220, 221, 225));
        userAddr1jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddr1jTextFieldActionPerformed(evt);
            }
        });

        userAddr2jLabel.setText("Addr 2");

        userAddr2jTextField.setBackground(new java.awt.Color(220, 221, 225));

        userPostcodejLabel.setText("Postcode");

        userPostcodejTextField.setBackground(new java.awt.Color(220, 221, 225));
        userPostcodejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPostcodejTextFieldActionPerformed(evt);
            }
        });

        homeDetailsjLabel.setText("Home Details");

        javax.swing.GroupLayout homeDetailsjPanelLayout = new javax.swing.GroupLayout(homeDetailsjPanel);
        homeDetailsjPanel.setLayout(homeDetailsjPanelLayout);
        homeDetailsjPanelLayout.setHorizontalGroup(
            homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(userPostcodejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userAddr2jLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userAddr1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userPostcodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userAddr2jTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(userAddr1jTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(homeDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeDetailsjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeDetailsjPanelLayout.setVerticalGroup(
            homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeDetailsjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAddr1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userAddr1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAddr2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userAddr2jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPostcodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPostcodejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        headerjPanel.setBackground(new java.awt.Color(47, 54, 64));

        manageDetailsjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        manageDetailsjLabel.setForeground(new java.awt.Color(220, 221, 225));
        manageDetailsjLabel.setText("Manage Details: ");

        javax.swing.GroupLayout headerjPanelLayout = new javax.swing.GroupLayout(headerjPanel);
        headerjPanel.setLayout(headerjPanelLayout);
        headerjPanelLayout.setHorizontalGroup(
            headerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageDetailsjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerjPanelLayout.setVerticalGroup(
            headerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageDetailsjLabel)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        saveChangesjButton.setForeground(new java.awt.Color(39, 60, 117));
        saveChangesjButton.setText("Save Changes");
        saveChangesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesjButtonActionPerformed(evt);
            }
        });

        clearFieldsjButton.setForeground(new java.awt.Color(194, 54, 22));
        clearFieldsjButton.setText("Clear Feilds");
        clearFieldsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsjButtonActionPerformed(evt);
            }
        });

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout windowjPanelLayout = new javax.swing.GroupLayout(windowjPanel);
        windowjPanel.setLayout(windowjPanelLayout);
        windowjPanelLayout.setHorizontalGroup(
            windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(windowjPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backjButton)
                    .addGroup(windowjPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(windowjPanelLayout.createSequentialGroup()
                                .addComponent(contactDetailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(homeDetailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(windowjPanelLayout.createSequentialGroup()
                                .addComponent(clearFieldsjButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveChangesjButton)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        windowjPanelLayout.setVerticalGroup(
            windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowjPanelLayout.createSequentialGroup()
                .addComponent(headerjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(windowjPanelLayout.createSequentialGroup()
                        .addGroup(windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(homeDetailsjPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactDetailsjPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveChangesjButton)
                            .addComponent(clearFieldsjButton))))
                .addGap(18, 18, 18)
                .addComponent(backjButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(windowjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(windowjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userAddr1jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddr1jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userAddr1jTextFieldActionPerformed

    private void userPostcodejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPostcodejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPostcodejTextFieldActionPerformed

    private void clearFieldsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsjButtonActionPerformed
        userFirstnamejTextField.setText("");
        userMiddlenamejTextField.setText("");
        userLastnamejTextField.setText("");
        userDOBjTextField.setText("");
        userEmailjTextField.setText("");
        userMobjTextField.setText("");
        userTeljTextField.setText("");
        userAddr1jTextField.setText("");
        userAddr2jTextField.setText("");
        userPostcodejTextField.setText("");
        userGenderjComboBox.setSelectedItem("User Gender:");
    }//GEN-LAST:event_clearFieldsjButtonActionPerformed

    private void saveChangesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesjButtonActionPerformed
        String userID = Integer.toString(userLoggedIn);
        String userFirstname = userFirstnamejTextField.getText();
        String userMiddlename = userMiddlenamejTextField.getText();
        String userLastname = userLastnamejTextField.getText();
        String userDOB = userDOBjTextField.getText();
        String userEmail = userEmailjTextField.getText();
        String userMob = userMobjTextField.getText();
        String userTel = userTeljTextField.getText();
        String userAddr1 = userAddr1jTextField.getText();
        String userAddr2 = userAddr2jTextField.getText();
        String userPostcode = userPostcodejTextField.getText();
        
        
        if (userGenderjComboBox.getSelectedItem().equals("Client Gender:")){
          JOptionPane.showMessageDialog(rootPane,"Please Select Gender","Warning", 2);
        }
        else if( 
                userFirstname.trim().equals("") ||
                userLastname.trim().equals("") ||
                userDOB.trim().equals("") ||
                userEmail.trim().equals("") ||
                userTel.trim().equals("") ||
                userMob.trim().equals("") ||
                userAddr1.trim().equals("") ||
                userPostcode.trim().equals("")
                ){
            JOptionPane.showMessageDialog(rootPane,"Please Ensure All Required User Details are Entered","Warning", 2);
        }
        else{
           if(user.updateUserDetails(
                userID,
                userFirstname,
                userMiddlename,
                userLastname,
                userGenderjComboBox.getSelectedItem().toString(),
                userDOB,
                userEmail,
                userTel,
                userMob,
                userAddr1,
                userAddr2,
                userPostcode
            )){
                System.out.println("DATABASE UPDATED");
            }
            else{
                System.out.println("DATABASE NOT UPDATED");
            } 
        }
        
    }//GEN-LAST:event_saveChangesjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        new AdminDashboard(userLoggedIn).setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_backjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton clearFieldsjButton;
    private javax.swing.JLabel contactDetailsjLabel;
    private javax.swing.JPanel contactDetailsjPanel;
    private javax.swing.JPanel headerjPanel;
    private javax.swing.JLabel homeDetailsjLabel;
    private javax.swing.JPanel homeDetailsjPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel manageDetailsjLabel;
    private javax.swing.JLabel personalDetailsjLabel;
    private javax.swing.JButton saveChangesjButton;
    private javax.swing.JLabel userAddr1jLabel;
    private javax.swing.JTextField userAddr1jTextField;
    private javax.swing.JLabel userAddr2jLabel;
    private javax.swing.JTextField userAddr2jTextField;
    private javax.swing.JLabel userDOBjLabel;
    private javax.swing.JTextField userDOBjTextField;
    private javax.swing.JLabel userEmailjLabel;
    private javax.swing.JTextField userEmailjTextField;
    private javax.swing.JLabel userFirstnamejLabel1;
    private javax.swing.JTextField userFirstnamejTextField;
    private javax.swing.JComboBox<String> userGenderjComboBox;
    private javax.swing.JLabel userGenderjLabel;
    private javax.swing.JLabel userLastnamejLabel1;
    private javax.swing.JTextField userLastnamejTextField;
    private javax.swing.JLabel userMiddlenamejLabel1;
    private javax.swing.JTextField userMiddlenamejTextField;
    private javax.swing.JLabel userMobjLabel;
    private javax.swing.JTextField userMobjTextField;
    private javax.swing.JLabel userPostcodejLabel;
    private javax.swing.JTextField userPostcodejTextField;
    private javax.swing.JLabel userTeljLabel;
    private javax.swing.JTextField userTeljTextField;
    private javax.swing.JPanel windowjPanel;
    // End of variables declaration//GEN-END:variables
}
