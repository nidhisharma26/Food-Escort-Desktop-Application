
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    public registerform() {
        initComponents();
        this.setLocationRelativeTo(null);
        submit.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register = new javax.swing.JPanel();
        reg = new javax.swing.JLabel();
        close_reg = new javax.swing.JLabel();
        min_reg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        options_reg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mob_txt = new javax.swing.JTextField();
        user_reg = new javax.swing.JTextField();
        retype_pass = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        get_otp = new javax.swing.JButton();
        gotologin = new javax.swing.JLabel();
        pass_reg = new javax.swing.JPasswordField();
        address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        register.setBackground(new java.awt.Color(248, 148, 11));

        reg.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));
        reg.setText("Regiteration Form");

        close_reg.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        close_reg.setForeground(new java.awt.Color(255, 255, 255));
        close_reg.setText("x");
        close_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_regMouseClicked(evt);
            }
        });

        min_reg.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        min_reg.setForeground(new java.awt.Color(255, 255, 255));
        min_reg.setText("-");
        min_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                min_regMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(min_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        options_reg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        options_reg.setForeground(new java.awt.Color(255, 255, 255));
        options_reg.setText("Address :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile No. :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Retype Password :");

        mob_txt.setBackground(new java.awt.Color(108, 122, 137));
        mob_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mob_txt.setForeground(new java.awt.Color(228, 241, 254));
        mob_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mob_txtActionPerformed(evt);
            }
        });
        mob_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mob_txtKeyPressed(evt);
            }
        });

        user_reg.setBackground(new java.awt.Color(108, 122, 137));
        user_reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_reg.setForeground(new java.awt.Color(228, 241, 254));

        retype_pass.setBackground(new java.awt.Color(108, 122, 137));
        retype_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        retype_pass.setForeground(new java.awt.Color(228, 241, 254));
        retype_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                retype_passKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                retype_passKeyReleased(evt);
            }
        });

        submit.setBackground(new java.awt.Color(34, 167, 240));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        get_otp.setBackground(new java.awt.Color(242, 38, 19));
        get_otp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        get_otp.setForeground(new java.awt.Color(255, 255, 255));
        get_otp.setText("Generate OTP ");
        get_otp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                get_otpActionPerformed(evt);
            }
        });
        get_otp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                get_otpKeyPressed(evt);
            }
        });

        gotologin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gotologin.setForeground(new java.awt.Color(255, 255, 255));
        gotologin.setText("Click here to Login");
        gotologin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotologinMouseClicked(evt);
            }
        });

        pass_reg.setBackground(new java.awt.Color(108, 122, 137));
        pass_reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass_reg.setForeground(new java.awt.Color(228, 241, 254));

        address.setBackground(new java.awt.Color(108, 122, 137));
        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(228, 241, 254));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(options_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mob_txt)
                                    .addComponent(retype_pass)
                                    .addComponent(pass_reg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(get_otp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gotologin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(273, Short.MAX_VALUE)
                    .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(105, 105, 105)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(pass_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mob_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(retype_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(options_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(get_otp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gotologin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(639, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void min_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_regMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_min_regMouseClicked

    private void close_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_regMouseClicked
       
       // close();
//        food_escort fe=new food_escort();
//        fe.setVisible(true);
food_escort fe=new food_escort();
    fe.setVisible(true);
    fe.pack();
    fe.setLocationRelativeTo(null);
    fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
    }//GEN-LAST:event_close_regMouseClicked

    private void get_otpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_otpActionPerformed
       
        Random r=new Random();
        int x=r.nextInt(3000);
        
         JOptionPane.showMessageDialog(null, "Your OTP is "+x);
        String out;
        out=JOptionPane.showInputDialog("Enter OTP : ");
        int a=Integer.parseInt(out);
        if(a==x){
            JOptionPane.showMessageDialog(null, "correct OTP");
            submit.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect OTP");
        }
        
        
        
        
    }//GEN-LAST:event_get_otpActionPerformed

    private void gotologinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotologinMouseClicked
        
     loginForm lf=new loginForm();
    lf.setVisible(true);
    lf.pack();
    lf.setLocationRelativeTo(null);
    lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
    
    }//GEN-LAST:event_gotologinMouseClicked

    private void mob_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mob_txtActionPerformed
        
      
        
    }//GEN-LAST:event_mob_txtActionPerformed

    private void mob_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mob_txtKeyPressed
          String mobile = mob_txt.getText();
          char c = evt.getKeyChar();
        if (mobile.length() >= 10) {
            JOptionPane.showMessageDialog(null, "Not More Than 10");

            java.awt.Toolkit.getDefaultToolkit().beep();

        }

        

        if (Character.isLetter(c)) {
            JOptionPane.showMessageDialog(null, "Should not be character");
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_mob_txtKeyPressed

    private void retype_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retype_passKeyPressed
        int k = evt.getKeyCode();
        if (k == KeyEvent.VK_BACK_SPACE) {
            if (pass_reg.getText().equals("enter Password")) {
                evt.consume();
                Toolkit.getDefaultToolkit();
            }
        }
    }//GEN-LAST:event_retype_passKeyPressed

    private void retype_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retype_passKeyReleased
//         if (pass_reg.getText().equals("")) {
//            pass_reg.setText("enter password");
//            pass_reg.setForeground(Color.gray);
//            pass_reg.setEchoChar((char) 0);
//        }
        String str1 = pass_reg.getText();
        String str2 = retype_pass.getText();
        if (str1.length() >= str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                   JOptionPane.showMessageDialog(null, "Not Matched");
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
//                } else {
//                    jLabel36.setText(null);
//                }
            }
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Password");
        }
    }//GEN-LAST:event_retype_passKeyReleased
    
    
    
    private void get_otpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_get_otpKeyPressed
//        Random r=new Random();
//        int x=r.nextInt(3000);
//        
//         JOptionPane.showMessageDialog(null, "Your OTP is"+x);
//        String out;
//        out=JOptionPane.showInputDialog("Enter OTP : ");
//        if(out.equals(x)){
//            reg_button.setEnabled(true);
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Incorrect OTP");
//        }
        
        
    }//GEN-LAST:event_get_otpKeyPressed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
String user= user_reg.getText();
String pass=pass_reg.getText();
String retype=retype_pass.getText();
String mob=mob_txt.getText();
String add=address.getText();
if(user.equals(null)||pass.equals(null)||retype.equals(null)||mob.equals(null)||add.equals(null)){
    if(user.trim().equals(null)){
        JOptionPane.showMessageDialog(null, "Fill UserName");
//        evt.consume();
            Toolkit.getDefaultToolkit().beep();
    }
    else if(pass.trim().equals(null)){
         JOptionPane.showMessageDialog(null, "Enter Password");
          Toolkit.getDefaultToolkit().beep();
    }
    else if(retype.trim().equals(null)){
         JOptionPane.showMessageDialog(null, "Enter the filed Retype Password");
          Toolkit.getDefaultToolkit().beep();
    }
    
    else if(mob.trim().equals(null)){
         JOptionPane.showMessageDialog(null, "Enter Mobile Number");
          Toolkit.getDefaultToolkit().beep();
    }
    else if(add.trim().equals(null)){
         JOptionPane.showMessageDialog(null, "Enter your Address");
          Toolkit.getDefaultToolkit().beep();
    }
    
}
else{
    try{
       Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_escort","root","1234");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("insert into food_escort(username,password,retype,mobile,address) values('" + user + "','" + pass + "','" + retype + "','" + mob + "','" + add + "')");
         JOptionPane.showMessageDialog(null, "data inserted");
    }catch(Exception e){
        System.out.println(e);
    }
}

       
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressKeyPressed
 
        
    
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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel close_reg;
    private javax.swing.JButton get_otp;
    private javax.swing.JLabel gotologin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel min_reg;
    private javax.swing.JTextField mob_txt;
    private javax.swing.JLabel options_reg;
    private javax.swing.JPasswordField pass_reg;
    private javax.swing.JLabel reg;
    private javax.swing.JPanel register;
    private javax.swing.JPasswordField retype_pass;
    private javax.swing.JButton submit;
    private javax.swing.JTextField user_reg;
    // End of variables declaration//GEN-END:variables

//      public void close() {
//         WindowEvent closeWindow=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
//         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
//        
//    }
}
