package exam_st2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class customs extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    public customs() {
        initComponents();
    }
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3010/java_6_7db","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;
    }
    public void Clear(){
        txtid.setText("");
        txtname.setText("");
        txtgender.setText("");
        txtadd.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(943, 513));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setText("Person DB");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 50, 260, 50);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 230, 90, 30);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 170, 90, 30);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 350, 90, 30);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 290, 90, 30);

        txtname.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(txtname);
        txtname.setBounds(120, 220, 250, 50);

        txtid.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(txtid);
        txtid.setBounds(120, 160, 250, 50);

        txtadd.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(txtadd);
        txtadd.setBounds(120, 340, 250, 50);

        txtgender.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(txtgender);
        txtgender.setBounds(120, 280, 250, 50);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Address"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 10, 530, 380);

        btnupdate.setBackground(new java.awt.Color(51, 153, 255));
        btnupdate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(540, 410, 100, 50);

        btnsave.setBackground(new java.awt.Color(51, 153, 255));
        btnsave.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(420, 410, 100, 50);

        btnexit.setBackground(new java.awt.Color(255, 51, 51));
        btnexit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnexit.setText("Exit");
        getContentPane().add(btnexit);
        btnexit.setBounds(790, 410, 100, 50);

        btndelete.setBackground(new java.awt.Color(51, 153, 255));
        btndelete.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(670, 410, 100, 50);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            int id = Integer.valueOf(txtid.getText());
            sql="DELETE FROM person_db WHERE id=?";
            ps = (PreparedStatement) connection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int row = tbtable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tbtable.getModel();
            model.removeRow(row);
            Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            sql="SELECT * FROM person_db";
            ps = (PreparedStatement) connection().prepareStatement(sql);
            r = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tbtable.getModel();
            while(r.next()){
                Object row[]={
                  r.getInt(1),
                  r.getString(2),
                  r.getString(3),
                  r.getString(4)
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            String name = txtname.getText();
            String gender = txtgender.getText();
            String add = txtadd.getText();
            sql="INSERT INTO person_db (name,gender,address) VALUE(?,?,?)";
            ps = (PreparedStatement) connection().prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2, gender);
            ps.setString(3, add);
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbtable.getModel();
            int id=0;
            for(int i=0;i<tbtable.getRowCount();i++){
                id = Integer.valueOf(tbtable.getValueAt(i, 0).toString());
                id++;
            }
            Object row[]={id,name,gender,add};
            model.addRow(row);
            Clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            int id = Integer.valueOf(txtid.getText());
            String name = txtname.getText();
            String gender = txtgender.getText();
            String add = txtadd.getText();
            sql="UPDATE person_db SET name=?,gender=?,address=? WHERE id=?";
            ps =(PreparedStatement) connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, add);
            ps.setInt(4, id);
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbtable.getModel();
            int row = tbtable.getSelectedRow();
            model.setValueAt(name, row, 1);
            model.setValueAt(gender, row, 2);
            model.setValueAt(add, row, 3);
            Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtid.setText(tbtable.getValueAt(row, 0).toString());
        txtname.setText(tbtable.getValueAt(row, 1).toString());
        txtgender.setText(tbtable.getValueAt(row, 2).toString());
        txtadd.setText(tbtable.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tbtableMouseClicked

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
            java.util.logging.Logger.getLogger(customs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
