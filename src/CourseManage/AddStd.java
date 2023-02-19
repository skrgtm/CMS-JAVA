/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManage;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class AddStd extends javax.swing.JFrame {

    /**
     * Creates new form AddStd
     */
    
    user uu = new user();
    public AddStd() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_male);
        bg.add(jRadioButton_female);
        jRadioButton_male.setSelected(true);
        lbl_Ua.setVisible(false);
        lbl_Pa.setVisible(false);
        lbl_P21.setVisible(false);
        lbl_Pmatch1.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_Fname = new javax.swing.JTextField();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jTextField_Lname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_txtarea = new javax.swing.JTextArea();
        button_Cancel = new java.awt.Button();
        button_Add1 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        lbl_Ua = new javax.swing.JLabel();
        jPasswordField_password1 = new javax.swing.JPasswordField();
        lbl_Pa = new javax.swing.JLabel();
        jPasswordField_password2 = new javax.swing.JPasswordField();
        lbl_Pmatch1 = new javax.swing.JLabel();
        lbl_P21 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Swis721 BlkOul BT", 1, 48)); // NOI18N
        jLabel1.setText("New Student");

        jLabel2.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Sex:");

        jLabel6.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Last Name:");

        jTextField_Phone.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jTextField_Fname.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextField_Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FnameActionPerformed(evt);
            }
        });

        jRadioButton_male.setBackground(java.awt.SystemColor.activeCaption);
        jRadioButton_male.setForeground(new java.awt.Color(0, 0, 51));
        jRadioButton_male.setText("Male");

        jRadioButton_female.setBackground(java.awt.SystemColor.activeCaption);
        jRadioButton_female.setForeground(new java.awt.Color(0, 0, 51));
        jRadioButton_female.setText("Female");
        jRadioButton_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_femaleActionPerformed(evt);
            }
        });

        jTextField_Lname.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextField_Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LnameActionPerformed(evt);
            }
        });

        jTextArea_txtarea.setColumns(20);
        jTextArea_txtarea.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jTextArea_txtarea.setRows(5);
        jScrollPane1.setViewportView(jTextArea_txtarea);

        button_Cancel.setBackground(java.awt.Color.lightGray);
        button_Cancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button_Cancel.setForeground(new java.awt.Color(0, 0, 51));
        button_Cancel.setLabel("Exit");
        button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelActionPerformed(evt);
            }
        });

        button_Add1.setBackground(java.awt.Color.lightGray);
        button_Add1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button_Add1.setForeground(new java.awt.Color(0, 0, 51));
        button_Add1.setLabel("Add Student");
        button_Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Add1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Username:");

        jLabel9.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("Humnst777 BT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Confirm password:");

        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        lbl_Ua.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Ua.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ua.setText("username is required");

        jPasswordField_password1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_Pa.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Pa.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Pa.setText("password is required");

        jPasswordField_password2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_password2ActionPerformed(evt);
            }
        });

        lbl_Pmatch1.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Pmatch1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Pmatch1.setText("Passwords dont match ");

        lbl_P21.setBackground(new java.awt.Color(255, 0, 0));
        lbl_P21.setForeground(new java.awt.Color(255, 255, 255));
        lbl_P21.setText("re-write password ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(9, 9, 9)))
                            .addComponent(jLabel9)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton_male)
                                                .addGap(75, 75, 75)
                                                .addComponent(jRadioButton_female))
                                            .addComponent(jPasswordField_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordField_password2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_P21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Ua))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_Pa)
                                        .addGap(226, 226, 226)
                                        .addComponent(lbl_Pmatch1))
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Ua))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl_P21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jPasswordField_password2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Pa)
                    .addComponent(lbl_Pmatch1))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_male)
                    .addComponent(jRadioButton_female))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FnameActionPerformed

    private void jTextField_LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LnameActionPerformed

    private void jRadioButton_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_femaleActionPerformed
     public boolean verifText()
     {
         if(jTextField_Fname.getText().equals("") || jTextField_Lname.getText().equals("") || 
          jTextField_Phone.getText().equals("") || jTextArea_txtarea.getText().equals(""))
             { JOptionPane.showMessageDialog(null, "One Or More Empty Field"); return false;  }
         else{return true;}
        
     }
    private void button_Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Add1ActionPerformed
        lbl_Ua.setVisible(false);
        lbl_Pa.setVisible(false);
        lbl_P21.setVisible(false);
        lbl_Pmatch1.setVisible(false);
       
        
        ///newwwww
        
        
        
        if(jTextField_username.getText().equals("") )
        {
            lbl_Ua.setVisible(true);
        }if(String.valueOf(jPasswordField_password1.getPassword()).equals("") )
        {
            lbl_Pa.setVisible(true);
        }
        if(String.valueOf(jPasswordField_password2.getPassword()).equals(""))
         {
                lbl_P21.setVisible(true);
                lbl_Pmatch1.setVisible(false);
                
         }
        
         
        else
        {
            if( uu.isUserExist1(jTextField_username.getText()))
                 {JOptionPane.showMessageDialog(null, "The username already exists Try with a different username","Register Failed",2);}
            else if(String.valueOf(jPasswordField_password1.getPassword()).equals(String.valueOf(jPasswordField_password2.getPassword()))){
            Connection con = MyConnection.getConnection();
            PreparedStatement ps;
      
            //                    user u1 = new user();
//                    u1.insertUser(username, u1.getMD5Hash(pass2));
String username=jTextField_username.getText();
String pass1 =jPasswordField_password1.getText();
String pass2 =jPasswordField_password2.getText();

String fname = jTextField_Fname.getText();
String lname = jTextField_Lname.getText();
String phone = jTextField_Phone.getText();
String address = jTextArea_txtarea.getText();
String sex = "Male";
if (jRadioButton_female.isSelected()) {
    sex = "Female";
}
if(verifText()){
    student std = new student();
    std.insertUpdateDeleteStudent('i', null, fname, lname, sex, phone, address,username,pass2);
    try{
        manageStudent.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","Phone","Address"}));
        std.Fill_Student_Table(manageStudent.jTable1, "");
    }catch(Exception ex)
    {
        //if the manageStudent not open
        System.out.println(ex.getMessage());
    }
    
}
           
            } else{lbl_Pmatch1.setVisible(true);}
        }
jTextField_username.setText("");
jPasswordField_password1.setText("");
jPasswordField_password2.setText("");
jTextField_Fname.setText("");
jTextField_Lname.setText("");
jTextField_Phone.setText("");
jTextArea_txtarea.setText("");
    }//GEN-LAST:event_button_Add1ActionPerformed

    private void button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_button_CancelActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed

    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jPasswordField_password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_password2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AddStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_Add1;
    private java.awt.Button button_Cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_password1;
    private javax.swing.JPasswordField jPasswordField_password2;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_txtarea;
    private javax.swing.JTextField jTextField_Fname;
    private javax.swing.JTextField jTextField_Lname;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_username;
    private javax.swing.JLabel lbl_P21;
    private javax.swing.JLabel lbl_Pa;
    private javax.swing.JLabel lbl_Pmatch1;
    private javax.swing.JLabel lbl_Ua;
    // End of variables declaration//GEN-END:variables
}
