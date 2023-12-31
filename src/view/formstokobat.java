package view;

import connectionDB.koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formstokobat extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    protected void aktif(){
        tid.setEnabled(true);
        tnama.setEnabled(true);
        tjumlah.setEnabled(true);
        tharga.setEnabled(true);
        
        tid.requestFocus();
    } 
    
    protected void kosong(){
        tid.setText("");
        tnama.setText("");
        tjumlah.setText("");
        tharga.setText("");
    }
    
    protected void datatable(){
    Object [] Baris = {"ID","NAMA","JUMLAH","HARGA SATUAN"};
    tabmode = new DefaultTableModel(null, Baris);
    tabelobat.setModel(tabmode);            
    try {
    String sql = "Select * from tabelobat";
    
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()){
            String a = hasil.getString("id");
            String b = hasil.getString("nama");
            String c = hasil.getString("stok");
            String d = hasil.getString("harga");
            
            String[] data={a,b,c,d};
            tabmode.addRow(data);
        }
    }catch (Exception e){
        }
    }
    
    public formstokobat() {
        initComponents();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelutama = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelobat = new javax.swing.JTable();
        labelid = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        labelnamaobat = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        labeljumlah = new javax.swing.JLabel();
        tjumlah = new javax.swing.JTextField();
        labelharga = new javax.swing.JLabel();
        tharga = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbersih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelutama.setBackground(new java.awt.Color(0, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA PERSEDIAAN OBAT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        tabelobat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelobat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelobat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelobat.setRowHeight(30);
        tabelobat.setRowMargin(2);
        tabelobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelobatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelobat);

        labelid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelid.setText("ID");
        labelid.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });

        labelnamaobat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelnamaobat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelnamaobat.setText("NAMA OBAT");
        labelnamaobat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        labeljumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeljumlah.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeljumlah.setText("JUMLAH");
        labeljumlah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tjumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjumlahActionPerformed(evt);
            }
        });

        labelharga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelharga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelharga.setText("HARGA SATUAN");
        labelharga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tharga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thargaActionPerformed(evt);
            }
        });

        bsimpan.setBackground(new java.awt.Color(204, 204, 204));
        bsimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/save-30-w11.png"))); // NOI18N
        bsimpan.setText("SIMPAN");
        bsimpan.setContentAreaFilled(false);
        bsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsimpan.setOpaque(true);
        bsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bsimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bsimpanMouseExited(evt);
            }
        });
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bubah.setBackground(new java.awt.Color(204, 204, 204));
        bubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/edit-30-w11.png"))); // NOI18N
        bubah.setText("UBAH");
        bubah.setContentAreaFilled(false);
        bubah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bubah.setOpaque(true);
        bubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bubahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bubahMouseExited(evt);
            }
        });
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setBackground(new java.awt.Color(204, 204, 204));
        bhapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/delete-30-w11.png"))); // NOI18N
        bhapus.setText("HAPUS");
        bhapus.setContentAreaFilled(false);
        bhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bhapus.setOpaque(true);
        bhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bhapusMouseExited(evt);
            }
        });
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bbersih.setBackground(new java.awt.Color(204, 204, 204));
        bbersih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bbersih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/clear-30-w11.png"))); // NOI18N
        bbersih.setText("BERSIH");
        bbersih.setContentAreaFilled(false);
        bbersih.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbersih.setOpaque(true);
        bbersih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbersihMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbersihMouseExited(evt);
            }
        });
        bbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbersihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelutamaLayout = new javax.swing.GroupLayout(panelutama);
        panelutama.setLayout(panelutamaLayout);
        panelutamaLayout.setHorizontalGroup(
            panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelutamaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addComponent(labelnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addComponent(labeljumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addComponent(labelid, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addComponent(labelharga, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsimpan)
                            .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(panelutamaLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(bhapus)
                .addGap(76, 76, 76)
                .addComponent(bbersih)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelutamaLayout.setVerticalGroup(
            panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelutamaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labeljumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelharga, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbersih, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelobatMouseClicked
        int bar = tabelobat.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        String b = tabmode.getValueAt (bar, 1).toString();
        String c = tabmode.getValueAt (bar, 2).toString();
        String d = tabmode.getValueAt (bar, 3).toString();

        tid.setText(a);
        tnama.setText(b);
        tjumlah.setText(c);
        tharga.setText(d);
    }//GEN-LAST:event_tabelobatMouseClicked

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void tjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tjumlahActionPerformed

    private void thargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thargaActionPerformed

    private void bsimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsimpanMouseEntered
        bsimpan.setBackground(new Color(0,0,204));
        bsimpan.setForeground(Color.white);
    }//GEN-LAST:event_bsimpanMouseEntered

    private void bsimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsimpanMouseExited
        bsimpan.setBackground(new Color(204,204,204));
        bsimpan.setForeground(Color.black);
    }//GEN-LAST:event_bsimpanMouseExited

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        String sql = "insert into tabelobat values (?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tid.getText());
            stat.setString(2, tnama.getText());
            stat.setString(3, tjumlah.getText());
            stat.setString(4, tharga.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tid.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bubahMouseEntered
        // TODO add your handling code here:
        bubah.setBackground(new Color(0,0,204));
        bubah.setForeground(Color.white);
    }//GEN-LAST:event_bubahMouseEntered

    private void bubahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bubahMouseExited
        // TODO add your handling code here:
        bubah.setBackground(new Color(204,204,204));
        bubah.setForeground(Color.black);
    }//GEN-LAST:event_bubahMouseExited

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "update tabelobat set nama=?,stok=?,harga=? where id=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tnama.getText());
            stat.setString(2, tjumlah.getText());
            stat.setString(3, tharga.getText());

            stat.setString(4, tid.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
            kosong();
            tid.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+e);
        }
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bhapusMouseEntered
        // TODO add your handling code here:
        bhapus.setBackground(Color.red);
        bhapus.setForeground(Color.white);
    }//GEN-LAST:event_bhapusMouseEntered

    private void bhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bhapusMouseExited
        // TODO add your handling code here:
        bhapus.setBackground(new Color(204,204,204));
        bhapus.setForeground(Color.black);
    }//GEN-LAST:event_bhapusMouseExited

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql="delete from tabelobat where id='"+tid.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                tid.requestFocus();
                datatable();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbersihMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbersihMouseEntered
        // TODO add your handling code here:
        bbersih.setBackground(new Color(0,0,204));
        bbersih.setForeground(Color.white);
    }//GEN-LAST:event_bbersihMouseEntered

    private void bbersihMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbersihMouseExited
        // TODO add your handling code here:
        bbersih.setBackground(new Color(204,204,204));
        bbersih.setForeground(Color.black);
    }//GEN-LAST:event_bbersihMouseExited

    private void bbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbersihActionPerformed
        // TODO add your handling code here:
        kosong();
        datatable();
    }//GEN-LAST:event_bbersihActionPerformed

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
            java.util.logging.Logger.getLogger(formstokobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formstokobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formstokobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formstokobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formstokobat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbersih;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelharga;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labeljumlah;
    private javax.swing.JLabel labelnamaobat;
    private javax.swing.JPanel panelutama;
    private javax.swing.JTable tabelobat;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tjumlah;
    private javax.swing.JTextField tnama;
    // End of variables declaration//GEN-END:variables
}
