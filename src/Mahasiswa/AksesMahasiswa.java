/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

import Login.Login;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author naran
 */
public class AksesMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form AksesMahasiswa
     */
    GridBagLayout mahasiswa = new GridBagLayout();
    PanelMahasiswa.DataKrs dataKrs;
    PanelMahasiswa.Jadwal jadwal;
    PanelMahasiswa.DataPresensi dataPresensi;
    PanelMahasiswa.RekapPresensi rekapPresensi;
    PanelMahasiswa.DataBaruKrs dataBaruKrs;
    
    public AksesMahasiswa() {
        initComponents();
        
        dataKrs = new PanelMahasiswa.DataKrs();
        jadwal = new PanelMahasiswa.Jadwal();
        dataPresensi = new PanelMahasiswa.DataPresensi();
        rekapPresensi = new PanelMahasiswa.RekapPresensi();
        dataBaruKrs = new PanelMahasiswa.DataBaruKrs();
        
        dataKrs.addNextListener(new nextListener());
        
        Panel.setLayout(mahasiswa);
        Panel.add(dataKrs);
        Panel.add(jadwal);
        Panel.add(dataPresensi);
        Panel.add(rekapPresensi);
        
        dataKrs.setVisible(true);
        jadwal.setVisible(false);
        dataPresensi.setVisible(false);
        rekapPresensi.setVisible(false);
        
        
        
    }

    private class nextListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            dataKrs.setVisible(false);
            dataBaruKrs.setVisible(true);
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

        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logout.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/data presensi.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/krs.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/rekapan.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/jadwal.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, -1));

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setOpaque(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 800, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/aksesMHS.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        dataKrs.setVisible(true);
        jadwal.setVisible(false);
        dataPresensi.setVisible(false);
        rekapPresensi.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        dataKrs.setVisible(false);
        dataPresensi.setVisible(false);
        rekapPresensi.setVisible(false);
        jadwal.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        dataKrs.setVisible(false);
        jadwal.setVisible(false);
        rekapPresensi.setVisible(false);
        dataPresensi.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        dataKrs.setVisible(false);
        jadwal.setVisible(false);
        dataPresensi.setVisible(false);
        rekapPresensi.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(AksesMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AksesMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AksesMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AksesMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AksesMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
