/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motoconnect;

/**
 *
 * @author grpereira
 */
public class Tela_Login extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Login
     */
    public Tela_Login() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JBTcadastrar1 = new javax.swing.JButton();
        JBTentrar1 = new javax.swing.JButton();
        JBTesqueceusenha1 = new javax.swing.JButton();
        JPFsenha1 = new javax.swing.JPasswordField();
        JTFnomedousuario1 = new javax.swing.JTextField();
        JLsenha1 = new javax.swing.JLabel();
        JLnomedousuario1 = new javax.swing.JLabel();
        JBTadministrador1 = new javax.swing.JButton();
        JBTsair1 = new javax.swing.JButton();
        JBTatendente1 = new javax.swing.JButton();
        JBTentregador1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        JBTcadastrar1.setBackground(new java.awt.Color(255, 51, 51));
        JBTcadastrar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTcadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        JBTcadastrar1.setText("CADASTRAR");
        JBTcadastrar1.setPreferredSize(new java.awt.Dimension(115, 25));

        JBTentrar1.setBackground(new java.awt.Color(255, 51, 51));
        JBTentrar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTentrar1.setForeground(new java.awt.Color(255, 255, 255));
        JBTentrar1.setText("ENTRAR");
        JBTentrar1.setPreferredSize(new java.awt.Dimension(115, 25));
        JBTentrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTentrar1ActionPerformed(evt);
            }
        });

        JBTesqueceusenha1.setBackground(new java.awt.Color(0, 51, 204));
        JBTesqueceusenha1.setForeground(new java.awt.Color(255, 255, 255));
        JBTesqueceusenha1.setText("Esqueceu a senha ?");

        JPFsenha1.setText("jPasswordField1");

        JLsenha1.setForeground(new java.awt.Color(255, 255, 255));
        JLsenha1.setText("Senha:");

        JLnomedousuario1.setForeground(new java.awt.Color(255, 255, 255));
        JLnomedousuario1.setText("Nome do usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(JBTcadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(JBTentrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLnomedousuario1)
                            .addComponent(JLsenha1)
                            .addComponent(JPFsenha1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(JTFnomedousuario1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(JBTesqueceusenha1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(JLnomedousuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFnomedousuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLsenha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPFsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(JBTesqueceusenha1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTcadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTentrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        JBTadministrador1.setBackground(new java.awt.Color(0, 102, 204));
        JBTadministrador1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTadministrador1.setForeground(new java.awt.Color(255, 255, 255));
        JBTadministrador1.setText("Administrador");
        JBTadministrador1.setPreferredSize(new java.awt.Dimension(115, 25));

        JBTsair1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTsair1.setText("SAIR");
        JBTsair1.setPreferredSize(new java.awt.Dimension(70, 30));

        JBTatendente1.setBackground(new java.awt.Color(0, 102, 204));
        JBTatendente1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTatendente1.setForeground(new java.awt.Color(255, 255, 255));
        JBTatendente1.setText("Atendente");
        JBTatendente1.setMaximumSize(new java.awt.Dimension(115, 25));
        JBTatendente1.setPreferredSize(new java.awt.Dimension(115, 25));

        JBTentregador1.setBackground(new java.awt.Color(0, 102, 204));
        JBTentregador1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTentregador1.setForeground(new java.awt.Color(255, 255, 255));
        JBTentregador1.setText("Entregador");
        JBTentregador1.setMaximumSize(new java.awt.Dimension(115, 25));
        JBTentregador1.setPreferredSize(new java.awt.Dimension(115, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBTadministrador1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(JBTatendente1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(JBTentregador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(JBTsair1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(JBTadministrador1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353)
                .addComponent(JBTatendente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBTsair1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTentregador1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTentrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTentrar1ActionPerformed
        // TODO add your handling code here:
        Tela_Login.this.dispose();
        Tela_Menu JBTentrar1 = new Tela_Menu();
        JBTentrar1.setVisible(true);
    }//GEN-LAST:event_JBTentrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTadministrador1;
    private javax.swing.JButton JBTatendente1;
    private javax.swing.JButton JBTcadastrar1;
    private javax.swing.JButton JBTentrar1;
    private javax.swing.JButton JBTentregador1;
    private javax.swing.JButton JBTesqueceusenha1;
    private javax.swing.JButton JBTsair1;
    private javax.swing.JLabel JLnomedousuario1;
    private javax.swing.JLabel JLsenha1;
    private javax.swing.JPasswordField JPFsenha1;
    private javax.swing.JTextField JTFnomedousuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
