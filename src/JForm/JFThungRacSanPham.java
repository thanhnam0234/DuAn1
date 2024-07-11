/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JForm;

import DA1.from.From_3;
import DA1.main.Main;
import DA1.model.SanPham;
import DA1.service.SanPhamService;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namtr
 */
public class JFThungRacSanPham extends javax.swing.JFrame {

    public static From_3 f3;
    DefaultTableModel tbl = new DefaultTableModel();

    public JFThungRacSanPham(From_3 This) {
        initComponents();
        setLocationRelativeTo(null);
        fillToTable();
        f3 = This ;
        setDefaultCloseOperation(Main.DISPOSE_ON_CLOSE);
    }
    int i = 1;

    public void fillToTable() {
        ArrayList<SanPham> list = new ArrayList<>();
        tbl = (DefaultTableModel) tblThungRacSanPham.getModel();
        tbl.setRowCount(0);
        list = (ArrayList<SanPham>) SanPhamService.DataThungRacSanPham();
        for (SanPham sanPham : list) {
            tbl.addRow(new Object[]{i++, sanPham.getID(), sanPham.getTenSP(), sanPham.getId_NhanVien()});
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tblThungRacSanPham = new javax.swing.JTable();
        btnKhoiPhucSanPhamThungRac = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblThungRacSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Mã", "Tên sản phẩm", "Số lượng"
            }
        )

        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jScrollPane3.setViewportView(tblThungRacSanPham);

    btnKhoiPhucSanPhamThungRac.setText("Khôi phục");
    btnKhoiPhucSanPhamThungRac.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnKhoiPhucSanPhamThungRacActionPerformed(evt);
        }
    });

    jLabel1.setText("KHO LƯU TRỮ");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(309, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(292, 292, 292))
        .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnKhoiPhucSanPhamThungRac))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(17, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnKhoiPhucSanPhamThungRac)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhoiPhucSanPhamThungRacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucSanPhamThungRacActionPerformed
        int i = tblThungRacSanPham.getSelectedRow();
        if (i == -1) {
            // Không có dòng nào được chọn
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn đối tượng khôi phục!");
        } else {
            int id = Integer.parseInt(tblThungRacSanPham.getValueAt(i, 1).toString());
            if (id == -1) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn đối tượng khôi phục!");
            } else {
                SanPhamService.returnItem(id);
                fillToTable();
                // Sử dụng thể hiện của From_3 để làm mới bảng
                f3.fillToTableSanPham();
                f3.fillToComboBox();
            }
        }
    }//GEN-LAST:event_btnKhoiPhucSanPhamThungRacActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JFThungRacSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFThungRacSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFThungRacSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFThungRacSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFThungRacSanPham().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKhoiPhucSanPhamThungRac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblThungRacSanPham;
    // End of variables declaration//GEN-END:variables
}
