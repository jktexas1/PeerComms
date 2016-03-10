/**
 *
 * @author Jacob Kapusta
 */

import java.awt.Color;
import java.io.IOException;
import javax.swing.border.Border;
import javax.swing.BorderFactory;



public class gui extends javax.swing.JFrame {

    
    public gui() {
        Border border = BorderFactory.createEtchedBorder(Color.lightGray, Color.black);
        
        this.getContentPane().setBackground(new Color(73,108,142));
        
        initComponents();
        serverTextField.setBackground(Color.black);
        serverTextField.setForeground(Color.white);
        serverTextField.setBorder(border);
        
        portTextField.setBackground(Color.black);
        portTextField.setForeground(Color.white);
        portTextField.setBorder(border);
        
        usernameTextField.setBackground(Color.black);
        usernameTextField.setForeground(Color.white);
        usernameTextField.setBorder(border);
        
        userlist.setBackground(Color.black);
        userlist.setForeground(Color.white);
        userlist.setBorder(border);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenu1 = new javax.swing.JMenu();
        jRadioButton1 = new javax.swing.JRadioButton();
        serverTextField = new javax.swing.JTextField();
        portTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        serverLabel = new javax.swing.JLabel();
        portLable = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userlist = new javax.swing.JList();
        connectionButton = new javax.swing.JButton();
        muteMicrophoneButton = new javax.swing.JRadioButton();
        pushToTalkButton = new javax.swing.JRadioButton();
        startServerButton = new javax.swing.JButton();
        muteSoundButton = new javax.swing.JRadioButton();
        Menu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jRadioButton1.setText("Mute Sound");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PeerComms");
        setBackground(new java.awt.Color(204, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        serverTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverTextFieldActionPerformed(evt);
            }
        });

        portTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portTextFieldActionPerformed(evt);
            }
        });

        serverLabel.setText("Server");

        portLable.setText("Port No.");

        usernameLabel.setText("Username");

        userlist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        userlist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userlist.setValueIsAdjusting(true);
        jScrollPane1.setViewportView(userlist);

        connectionButton.setText("Connect");
        connectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectionButtonActionPerformed(evt);
            }
        });

        muteMicrophoneButton.setText("Mute Mic");
        muteMicrophoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteMicrophoneButtonActionPerformed(evt);
            }
        });

        pushToTalkButton.setText("PTT");
        pushToTalkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushToTalkButtonActionPerformed(evt);
            }
        });

        startServerButton.setText("Start");
        startServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startServerButtonActionPerformed(evt);
            }
        });

        muteSoundButton.setText("Mute Sound");
        muteSoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteSoundButtonActionPerformed(evt);
            }
        });

        jMenu2.setText("Settings");

        jMenuItem1.setText("User Settings");
        jMenu2.add(jMenuItem1);

        Menu.add(jMenu2);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serverTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(serverLabel)
                            .addComponent(portLable))
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pushToTalkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(muteMicrophoneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(muteSoundButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startServerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(connectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serverLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLable))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muteMicrophoneButton)
                    .addComponent(pushToTalkButton)
                    .addComponent(connectionButton)
                    .addComponent(startServerButton)
                    .addComponent(muteSoundButton))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pushToTalkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushToTalkButtonActionPerformed
        
    }//GEN-LAST:event_pushToTalkButtonActionPerformed

    private void muteMicrophoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteMicrophoneButtonActionPerformed
        
    }//GEN-LAST:event_muteMicrophoneButtonActionPerformed

    private void connectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectionButtonActionPerformed
        client clnt = new client(usernameTextField.getText(), serverTextField.getText(), portTextField.getText());
        Thread clientthread = new Thread(clnt);
        clientthread.start();
    }//GEN-LAST:event_connectionButtonActionPerformed

    private void startServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startServerButtonActionPerformed
        server svr = new server(portTextField.getText());
        Thread serverthread = new Thread(svr);
        serverthread.start();
        
        client clnt = new client(usernameTextField.getText(), "localhost", portTextField.getText());
        Thread clientthread = new Thread(clnt);
        clientthread.start();
    }//GEN-LAST:event_startServerButtonActionPerformed

    private void serverTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverTextFieldActionPerformed

    private void portTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portTextFieldActionPerformed

    private void muteSoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteSoundButtonActionPerformed
        
    }//GEN-LAST:event_muteSoundButtonActionPerformed
    public static gui GUI;
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI = new gui();
                GUI.setVisible(true);
                //new gui().setVisible(true);
            }
        });
    }
    
    public boolean SoundMuted(){
        return GUI.muteSoundButton.isSelected();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton connectionButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton muteMicrophoneButton;
    private javax.swing.JRadioButton muteSoundButton;
    private javax.swing.JLabel portLable;
    private javax.swing.JTextField portTextField;
    private javax.swing.JRadioButton pushToTalkButton;
    private javax.swing.JLabel serverLabel;
    private javax.swing.JTextField serverTextField;
    private javax.swing.JButton startServerButton;
    private javax.swing.JList userlist;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
