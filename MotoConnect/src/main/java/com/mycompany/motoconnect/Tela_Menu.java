/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motoconnect;

/**
 *
 * @author PC
 */
public class Tela_Menu extends javax.swing.JFrame {

    /**
     * Creates new form MotoConnect_Menu
     */
    public Tela_Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        JBTsair2 = new javax.swing.JButton();
        JBTcadastrodefubcionario2 = new javax.swing.JButton();
        JBTregistrocalculodefrete2 = new javax.swing.JButton();
        JBTobservacoesecomentarios2 = new javax.swing.JButton();
        JBTalertas2 = new javax.swing.JButton();
        JBTcadastrodecliente2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBTsair2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JBTsair2.setText("SAIR");
        JBTsair2.setPreferredSize(new java.awt.Dimension(70, 30));
        JBTsair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTsair2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBTsair2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, -1, -1));

        JBTcadastrodefubcionario2.setText("Cadastro defuncionario");
        JBTcadastrodefubcionario2.setMaximumSize(new java.awt.Dimension(50, 50));
        JBTcadastrodefubcionario2.setMinimumSize(new java.awt.Dimension(0, 0));
        JBTcadastrodefubcionario2.setPreferredSize(new java.awt.Dimension(50, 50));
        JBTcadastrodefubcionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcadastrodefubcionario2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBTcadastrodefubcionario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 75, 75));

        JBTregistrocalculodefrete2.setText("Registro de calculo frete");
        JBTregistrocalculodefrete2.setMaximumSize(new java.awt.Dimension(50, 50));
        JBTregistrocalculodefrete2.setMinimumSize(new java.awt.Dimension(50, 50));
        JBTregistrocalculodefrete2.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(JBTregistrocalculodefrete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 74, 75));

        JBTobservacoesecomentarios2.setText("Observações e comentaros");
        jPanel1.add(JBTobservacoesecomentarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 73, 75));

        JBTalertas2.setText("Alertas");
        jPanel1.add(JBTalertas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, 73));

        JBTcadastrodecliente2.setText("Cadastro de cliente");
        jPanel1.add(JBTcadastrodecliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 71, 75));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTsair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTsair2ActionPerformed
        // TODO add your handling code here:
        Tela_Menu.this.dispose();
        Tela_Login JBTsair2 = new Tela_Login();
        JBTsair2.setVisible(true);
    }//GEN-LAST:event_JBTsair2ActionPerformed

    private void JBTcadastrodefubcionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcadastrodefubcionario2ActionPerformed
        // TODO add your handling code here:
        Tela_Menu.this.dispose();
        Tela_Cadastro_Funcionario JBTcadastrodefuncionario2 = new Tela_Cadastro_Funcionario();
        JBTcadastrodefuncionario2.setVisible(true);
    }//GEN-LAST:event_JBTcadastrodefubcionario2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTalertas2;
    private javax.swing.JButton JBTcadastrodecliente2;
    private javax.swing.JButton JBTcadastrodefubcionario2;
    private javax.swing.JButton JBTobservacoesecomentarios2;
    private javax.swing.JButton JBTregistrocalculodefrete2;
    private javax.swing.JButton JBTsair2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
