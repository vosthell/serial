/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * inicio.java
 *
 * Created on 14-mar-2012, 9:53:40
 */
package seriales;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CKaiser
 */
public class inicio extends javax.swing.JFrame {
    clsSerial objSerial = new clsSerial();
    /** Creates new form inicio */
    public inicio() {
        initComponents();        
               
        clsComboBox oItem = new clsComboBox("A", "7 DIAS");
        cmbTiempo.addItem(oItem); 
        oItem = new clsComboBox("B", "15 DIAS");
        cmbTiempo.addItem(oItem); 
        oItem = new clsComboBox("C", "1 MES");
        cmbTiempo.addItem(oItem); 
        oItem = new clsComboBox("D", "6 MESES");
        cmbTiempo.addItem(oItem); 
        oItem = new clsComboBox("E", "1 AÑO");
        cmbTiempo.addItem(oItem); 
         oItem = new clsComboBox("F", "3 AÑOs");
        cmbTiempo.addItem(oItem); 
         oItem = new clsComboBox("G", "5 AÑOS");
        cmbTiempo.addItem(oItem); 
        
        txtHardDisk.setText(objSerial.getSerialNumber("C"));
        txtHDEncriptado.setText(objSerial.codif(txtHardDisk.getText()));
        txtMainBoard.setText(objSerial.getMotherboardSN());
        txtMBEncriptado.setText(objSerial.codif(txtMainBoard.getText()));       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHardDisk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMainBoard = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHDEncriptado = new javax.swing.JTextField();
        txtMBEncriptado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSerial = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmbTiempo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Goliak - Generador de licencia");
        setResizable(false);

        txtHardDisk.setEditable(false);

        jLabel1.setText("Disco duro:");

        txtMainBoard.setEditable(false);

        jLabel2.setText("Mainboard:");

        txtHDEncriptado.setEditable(false);

        txtMBEncriptado.setEditable(false);

        jLabel3.setText("Licencia serial:");

        txtSerial.setColumns(20);
        txtSerial.setEditable(false);
        txtSerial.setRows(5);
        jScrollPane1.setViewportView(txtSerial);

        jLabel4.setText("Tiempo:");

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Parchar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMainBoard)
                                        .addComponent(txtMBEncriptado, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(txtHDEncriptado)
                                        .addComponent(txtHardDisk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton2))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHardDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHDEncriptado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMBEncriptado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    clsComboBox objCuotaSelect = (clsComboBox)cmbTiempo.getSelectedItem();
    txtSerial.setText(objSerial.codif(objCuotaSelect.getCodigo()) + " - " + objSerial.codif(txtHardDisk.getText())+ " - " +objSerial.codif(txtMainBoard.getText()));
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    clsComboBox objCuotaSelect = (clsComboBox)cmbTiempo.getSelectedItem();
    String codigo1 = objSerial.codif(txtHardDisk.getText());
    String codigo2 = objSerial.codif(objCuotaSelect.getCodigo()) + objSerial.codif(txtMainBoard.getText());  
    boolean exito = objSerial.eliminarRegistro(codigo1, codigo2);
    exito = objSerial.insertarRegistro(codigo1, codigo2);
    if (exito)
    {
        JOptionPane.showMessageDialog(this, "Licencia guardada con éxito!!!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Error al generar licencia!", "Mensaje", JOptionPane.WARNING_MESSAGE);
    }
}//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHDEncriptado;
    private javax.swing.JTextField txtHardDisk;
    private javax.swing.JTextField txtMBEncriptado;
    private javax.swing.JTextField txtMainBoard;
    private javax.swing.JTextArea txtSerial;
    // End of variables declaration//GEN-END:variables
}
