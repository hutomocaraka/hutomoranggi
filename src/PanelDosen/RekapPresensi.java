/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelDosen;

/**
 *
 * @author naran
 */
public class RekapPresensi extends javax.swing.JPanel {

    /**
     * Creates new form RekapPresensi
     */
    public RekapPresensi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("AXIS Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Rekap Presensi");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 19, -1, -1));

        jLabel2.setText("Tanggal");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 68, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 68, -1, -1));

        jLabel4.setText("Mata Kuliah");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 71, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PBO 2", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 68, 146, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "NIM", "Nama", "Dosen", "Materi", "1", "2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, 760, 90));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}