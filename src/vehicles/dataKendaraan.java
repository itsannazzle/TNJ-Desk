/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static karyawan.dataKaryawan.tabelkaryawan;
import login.Dashboard;

/**
 *
 * @author Anna Karenina
 */
public class dataKendaraan extends javax.swing.JFrame {

   Connection c = getConnection();
   DefaultTableModel mode = new DefaultTableModel();
    SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy");
    public dataKendaraan() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        dataKendaraan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\back.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\add.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\edit.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jTextField1.setRequestFocusEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 90, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\minim.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\close.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\nav bar kendaraan.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1310, 620));

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\delete.png")); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel5.setText("Search here...");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 70, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\cetak.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\Selena Gomes\\A\\TNJ\\Company App\\Bahan\\refresh.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Connection getConnection(){
        Connection con;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tnj", "root", "");
            return con;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Dashboard d = new Dashboard();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        addKendaraan add = new addKendaraan();
        add.setVisible(true);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
                try{ int i = jTable1.getSelectedRow();
                        TableModel mode = jTable1.getModel();
            
                        editKendaraan edit = new editKendaraan();
                        edit.setVisible(true);
                        edit.jComboBox3.setSelectedItem(mode.getValueAt(i, 0).toString());
                        edit.jComboBox2.setSelectedItem(mode.getValueAt(i, 1).toString());
                        edit.jTextField2.setText(mode.getValueAt(i,3).toString());
                        edit.jTextField3.setText(mode.getValueAt(i, 2).toString());
                        edit.jTextField5.setText(mode.getValueAt(i, 4).toString());
                        edit.jTextField8.setText(mode.getValueAt(i, 5).toString());
                        edit.jTextField9.setText(mode.getValueAt(i, 6).toString());
                        edit.jTextField10.setText(mode.getValueAt(i, 7).toString());
                        edit.jTextArea2.setText(mode.getValueAt(i,8).toString());
                        java.util.Date dt = date.parse((String)mode.getValueAt(i, 9));
                        java.util.Date dt2 = date.parse((String)mode.getValueAt(i, 10));
                        edit.jDateChooser1.setDate(dt);
                        edit.jDateChooser2.setDate(dt2);
            
                    } catch(Exception e){
            
                    }
    }//GEN-LAST:event_jLabel9MouseClicked
    public void dataKendaraan(){
        Object [] header = {"Jenis kendaraan","Status","No.kendaraan","No.polisi","Merk","Bahan bakar","No.seri","No.pajak","Deskripsi","Tanggal beli","Servis rutin"
    };
        DefaultTableModel model = new DefaultTableModel(null,header);
        jTable1.setModel(model);
        try{
            Connection c = getConnection();
            PreparedStatement ps = c.prepareStatement("select * from kendaraan order by merk asc");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                String c1 = rs.getString("jk");
                String c2 = rs.getString("stat");
                String c3 = rs.getString("no_ken");
                String c4 = rs.getString("no_pol");
                String c4a = rs.getString("merk");
                String c5 = rs.getString("bb");
                String c6 = rs.getString("no_seri");
                String c7 = rs.getString("no_pajak");
                String c8 = rs.getString("desk");
                String c9 = rs.getString("tgl_beli");
                String c10 = rs.getString("servis_rutin");
                String[] data = {c1,c2,c3,c4,c4a,c5,c6,c7,c8,c9,c10};
                model.addRow(data);
            }
        } catch( Exception e){
                }   
     }
    public static void AddRowToJTable(Object[] dataRow)
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(dataRow);
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        Object [] header = {"Jenis kendaraan","Status","No.kendaraan","No.polisi","Merk","Bahan bakar","No.seri","No.pajak","Deskripsi","Tanggal beli","Servis rutin"
                    };
                DefaultTableModel model = new DefaultTableModel(null,header);
                jTable1.setModel(model);
                try{
                        Connection c = getConnection();
                        PreparedStatement ps = c.prepareStatement("select * from kendaraan where concat(jk,stat,no_ken,no_pol,merk,bb,no_seri,no_pajak,desk,tgl_beli,servis_rutin) like '%"+jTextField1.getText()+"%'");
                        ResultSet rs = ps.executeQuery();
                        while (rs.next()){
                                 String c1 = rs.getString("jk");
                                String c2 = rs.getString("stat");
                                String c3 = rs.getString("no_ken");
                                String c4 = rs.getString("no_pol");
                                String c4a = rs.getString("merk");
                                String c5 = rs.getString("bb");
                                String c6 = rs.getString("no_seri");
                                String c7 = rs.getString("no_pajak");
                                String c8 = rs.getString("desk");
                                String c9 = rs.getString("tgl_beli");
                                String c10 = rs.getString("servis_rutin");
                                String[] data = {c1,c2,c3,c4,c4a,c5,c6,c7,c8,c9,c10};
                                model.addRow(data);
                            }
                    } catch( Exception e){
            
                    }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel mode = jTable1.getModel();
            
        try {
            int yn = JOptionPane.showConfirmDialog(null, "Yakin menghapus data ?", "Hapus data", JOptionPane.YES_NO_OPTION);
            if (yn == 0){
                PreparedStatement ps = c.prepareStatement("delete from kendaraan where no_ken='"+mode.getValueAt(i, 2).toString()+"'");
                ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data terhapus");
               dataKendaraan();
            } else {
                
            }
            
        } catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dataKendaraan();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(dataKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataKendaraan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
