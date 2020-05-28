/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;

/**
 *
 * @author TIT
 */
public class CaseworkerDashboard extends javax.swing.JFrame {
    int userLoggedIn;
    User adminDashboardUserInstance = new User();
    Client adminDashboardClientInstance = new Client();
    /**
     * Creates new form AdminDashboard
     */
    public CaseworkerDashboard(int userID) {
        userLoggedIn = userID;
        initComponents();
        int clientCountValue = adminDashboardClientInstance.getClientCount();
        int caseworkerCountValue = adminDashboardUserInstance.getCaseworkerCount();
        clientCountjLabel.setText(String.valueOf(clientCountValue));
        caseworkerCountjLabel.setText(String.valueOf(caseworkerCountValue));
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
        navigationjPanel = new javax.swing.JPanel();
        manageWorkingHoursjButton = new javax.swing.JButton();
        logOutjButton = new javax.swing.JButton();
        manageProfilejButton = new javax.swing.JButton();
        manageAppointmentsjButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        clientCountjPanel = new javax.swing.JPanel();
        clientCountHeaderjLabel = new javax.swing.JLabel();
        clientCountjLabel = new javax.swing.JLabel();
        caseworkerCountjPanel = new javax.swing.JPanel();
        caseworkerCountHeaderjLabel = new javax.swing.JLabel();
        caseworkerCountjLabel = new javax.swing.JLabel();
        appointmentCountjPanel = new javax.swing.JPanel();
        appointmentCountHeaderjLabel = new javax.swing.JLabel();
        appointmentCountjLabel = new javax.swing.JLabel();
        activeCasesCountjPanel = new javax.swing.JPanel();
        activeCasesCountHeaderjLabel = new javax.swing.JLabel();
        activeCasesCountjLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        windowjPanel.setBackground(new java.awt.Color(113, 128, 147));

        navigationjPanel.setBackground(new java.awt.Color(47, 54, 64));

        manageWorkingHoursjButton.setText("Manage Work Hours");
        manageWorkingHoursjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWorkingHoursjButtonActionPerformed(evt);
            }
        });

        logOutjButton.setText("Log Out");
        logOutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutjButtonActionPerformed(evt);
            }
        });

        manageProfilejButton.setText("Your Profile");
        manageProfilejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProfilejButtonActionPerformed(evt);
            }
        });

        manageAppointmentsjButton1.setText("Your Appointments");
        manageAppointmentsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAppointmentsjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigationjPanelLayout = new javax.swing.GroupLayout(navigationjPanel);
        navigationjPanel.setLayout(navigationjPanelLayout);
        navigationjPanelLayout.setHorizontalGroup(
            navigationjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageProfilejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageWorkingHoursjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
            .addComponent(manageAppointmentsjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigationjPanelLayout.setVerticalGroup(
            navigationjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationjPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(manageAppointmentsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(manageWorkingHoursjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageProfilejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logOutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );

        jPanel3.setBackground(new java.awt.Color(47, 54, 64));

        clientCountjPanel.setBackground(new java.awt.Color(204, 204, 204));
        clientCountjPanel.setPreferredSize(new java.awt.Dimension(175, 40));

        clientCountHeaderjLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clientCountHeaderjLabel.setText("Your Clients");

        clientCountjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        clientCountjLabel.setText("Null");

        javax.swing.GroupLayout clientCountjPanelLayout = new javax.swing.GroupLayout(clientCountjPanel);
        clientCountjPanel.setLayout(clientCountjPanelLayout);
        clientCountjPanelLayout.setHorizontalGroup(
            clientCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientCountjPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(clientCountjLabel)
                .addContainerGap(67, Short.MAX_VALUE))
            .addComponent(clientCountHeaderjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientCountjPanelLayout.setVerticalGroup(
            clientCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientCountjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientCountHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clientCountjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        caseworkerCountjPanel.setBackground(new java.awt.Color(204, 204, 204));
        caseworkerCountjPanel.setPreferredSize(new java.awt.Dimension(175, 40));

        caseworkerCountHeaderjLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        caseworkerCountHeaderjLabel.setText("Your Active Cases");

        caseworkerCountjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        caseworkerCountjLabel.setText("Null");

        javax.swing.GroupLayout caseworkerCountjPanelLayout = new javax.swing.GroupLayout(caseworkerCountjPanel);
        caseworkerCountjPanel.setLayout(caseworkerCountjPanelLayout);
        caseworkerCountjPanelLayout.setHorizontalGroup(
            caseworkerCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(caseworkerCountHeaderjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(caseworkerCountjPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(caseworkerCountjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        caseworkerCountjPanelLayout.setVerticalGroup(
            caseworkerCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caseworkerCountjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caseworkerCountHeaderjLabel)
                .addGap(18, 18, 18)
                .addComponent(caseworkerCountjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        appointmentCountjPanel.setBackground(new java.awt.Color(204, 204, 204));
        appointmentCountjPanel.setPreferredSize(new java.awt.Dimension(175, 40));

        appointmentCountHeaderjLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        appointmentCountHeaderjLabel.setText("Appointments");

        appointmentCountjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        appointmentCountjLabel.setText("67");

        javax.swing.GroupLayout appointmentCountjPanelLayout = new javax.swing.GroupLayout(appointmentCountjPanel);
        appointmentCountjPanel.setLayout(appointmentCountjPanelLayout);
        appointmentCountjPanelLayout.setHorizontalGroup(
            appointmentCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appointmentCountHeaderjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(appointmentCountjPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(appointmentCountjLabel)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        appointmentCountjPanelLayout.setVerticalGroup(
            appointmentCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentCountjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appointmentCountHeaderjLabel)
                .addGap(18, 18, 18)
                .addComponent(appointmentCountjLabel)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        activeCasesCountjPanel.setBackground(new java.awt.Color(204, 204, 204));
        activeCasesCountjPanel.setPreferredSize(new java.awt.Dimension(175, 40));

        activeCasesCountHeaderjLabel.setText("Next Appointment");

        activeCasesCountjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        activeCasesCountjLabel.setText("Monday");

        javax.swing.GroupLayout activeCasesCountjPanelLayout = new javax.swing.GroupLayout(activeCasesCountjPanel);
        activeCasesCountjPanel.setLayout(activeCasesCountjPanelLayout);
        activeCasesCountjPanelLayout.setHorizontalGroup(
            activeCasesCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(activeCasesCountHeaderjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activeCasesCountjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activeCasesCountjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        activeCasesCountjPanelLayout.setVerticalGroup(
            activeCasesCountjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeCasesCountjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activeCasesCountHeaderjLabel)
                .addGap(18, 18, 18)
                .addComponent(activeCasesCountjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(clientCountjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(caseworkerCountjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(appointmentCountjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(activeCasesCountjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(activeCasesCountjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(appointmentCountjPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(caseworkerCountjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(clientCountjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Caseworker Dashboard, Welcome ");

        javax.swing.GroupLayout windowjPanelLayout = new javax.swing.GroupLayout(windowjPanel);
        windowjPanel.setLayout(windowjPanelLayout);
        windowjPanelLayout.setHorizontalGroup(
            windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowjPanelLayout.createSequentialGroup()
                .addComponent(navigationjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(windowjPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(windowjPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        windowjPanelLayout.setVerticalGroup(
            windowjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(windowjPanelLayout.createSequentialGroup()
                .addComponent(navigationjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(windowjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutjButtonActionPerformed
        Login caseworkerDashboardLogin = new Login();
        caseworkerDashboardLogin.setVisible(true);
        caseworkerDashboardLogin.pack();
        caseworkerDashboardLogin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logOutjButtonActionPerformed

    private void manageProfilejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProfilejButtonActionPerformed
        new AllUsersManageDetails(userLoggedIn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageProfilejButtonActionPerformed

    private void manageWorkingHoursjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWorkingHoursjButtonActionPerformed
        new CaseworkerManageWorkingTime(userLoggedIn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageWorkingHoursjButtonActionPerformed

    private void manageAppointmentsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAppointmentsjButton1ActionPerformed
        new CaseworkerManageAppointments(userLoggedIn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageAppointmentsjButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeCasesCountHeaderjLabel;
    private javax.swing.JLabel activeCasesCountjLabel;
    private javax.swing.JPanel activeCasesCountjPanel;
    private javax.swing.JLabel appointmentCountHeaderjLabel;
    private javax.swing.JLabel appointmentCountjLabel;
    private javax.swing.JPanel appointmentCountjPanel;
    private javax.swing.JLabel caseworkerCountHeaderjLabel;
    private javax.swing.JLabel caseworkerCountjLabel;
    private javax.swing.JPanel caseworkerCountjPanel;
    private javax.swing.JLabel clientCountHeaderjLabel;
    private javax.swing.JLabel clientCountjLabel;
    private javax.swing.JPanel clientCountjPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logOutjButton;
    private javax.swing.JButton manageAppointmentsjButton1;
    private javax.swing.JButton manageProfilejButton;
    private javax.swing.JButton manageWorkingHoursjButton;
    private javax.swing.JPanel navigationjPanel;
    private javax.swing.JPanel windowjPanel;
    // End of variables declaration//GEN-END:variables
}
