/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motoconnect;


import javax.swing.JOptionPane;


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

        JPNazulescuro1 = new javax.swing.JPanel();
        JPNazulclaro1 = new javax.swing.JPanel();
        JBTcadastrar1 = new javax.swing.JButton();
        JBTentrar1 = new javax.swing.JButton();
        JBTesqueceusenha1 = new javax.swing.JButton();
        JPFsenha1 = new javax.swing.JPasswordField();
        JTFnomedousuario1 = new javax.swing.JTextField();
        JLsenha1 = new javax.swing.JLabel();
        JLnomedousuario1 = new javax.swing.JLabel();
        JBLmotoconnect1 = new javax.swing.JLabel();
        JBTadministrador1 = new javax.swing.JButton();
        JBLsair1 = new javax.swing.JLabel();
        JBTsair1 = new javax.swing.JButton();
        JBTatendente1 = new javax.swing.JButton();
        JBTentregador1 = new javax.swing.JButton();
        JLBou1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNazulescuro1.setBackground(new java.awt.Color(0, 51, 204));
        JPNazulescuro1.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNazulclaro1.setBackground(new java.awt.Color(0, 102, 255));
        JPNazulclaro1.setPreferredSize(new java.awt.Dimension(500, 375));

        JBTcadastrar1.setBackground(new java.awt.Color(255, 51, 51));
        JBTcadastrar1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JBTcadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        JBTcadastrar1.setText("CADASTRAR");
        JBTcadastrar1.setPreferredSize(new java.awt.Dimension(115, 25));
        JBTcadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcadastrar1ActionPerformed(evt);
            }
        });

        JBTentrar1.setBackground(new java.awt.Color(255, 51, 51));
        JBTentrar1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
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
        JBTesqueceusenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTesqueceusenha1ActionPerformed(evt);
            }
        });

        JPFsenha1.setText("jPasswordField1");

        JLsenha1.setForeground(new java.awt.Color(255, 255, 255));
        JLsenha1.setText("Senha:");

        JLnomedousuario1.setForeground(new java.awt.Color(255, 255, 255));
        JLnomedousuario1.setText("Nome do usuario:");

        javax.swing.GroupLayout JPNazulclaro1Layout = new javax.swing.GroupLayout(JPNazulclaro1);
        JPNazulclaro1.setLayout(JPNazulclaro1Layout);
        JPNazulclaro1Layout.setHorizontalGroup(
            JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(JBTesqueceusenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                .addGroup(JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                                .addComponent(JBTcadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBTentrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPNazulclaro1Layout.createSequentialGroup()
                                .addGroup(JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JPFsenha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLsenha1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLnomedousuario1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFnomedousuario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(74, 74, 74))
                    .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(JBLmotoconnect1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPNazulclaro1Layout.setVerticalGroup(
            JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulclaro1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(JBLmotoconnect1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(JLnomedousuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFnomedousuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLsenha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPFsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(JBTesqueceusenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTcadastrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBTentrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        JBTadministrador1.setBackground(new java.awt.Color(0, 102, 204));
        JBTadministrador1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTadministrador1.setForeground(new java.awt.Color(255, 255, 255));
        JBTadministrador1.setText("Administrador");
        JBTadministrador1.setPreferredSize(new java.awt.Dimension(115, 25));

        JBTsair1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTsair1.setContentAreaFilled(false);
        JBTsair1.setPreferredSize(new java.awt.Dimension(70, 30));
        JBTsair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTsair1ActionPerformed(evt);
            }
        });

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

        JLBou1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBou1.setForeground(new java.awt.Color(255, 255, 255));
        JLBou1.setText("ou");

        javax.swing.GroupLayout JPNazulescuro1Layout = new javax.swing.GroupLayout(JPNazulescuro1);
        JPNazulescuro1.setLayout(JPNazulescuro1Layout);
        JPNazulescuro1Layout.setHorizontalGroup(
            JPNazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulescuro1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(JPNazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBTentregador1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTadministrador1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTatendente1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPNazulescuro1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(JLBou1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(JPNazulclaro1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addGroup(JPNazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBLsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        JPNazulescuro1Layout.setVerticalGroup(
            JPNazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulescuro1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JBTadministrador1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTatendente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLBou1)
                .addGap(18, 18, 18)
                .addComponent(JBTentregador1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulescuro1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPNazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBTsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
            .addGroup(JPNazulescuro1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(JPNazulclaro1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNazulescuro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPNazulescuro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTentrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTentrar1ActionPerformed
        // TODO add your handling code here:
        Tela_Login.this.dispose();
        Tela_Menu JBTentrar1 = new Tela_Menu();
        JBTentrar1.setVisible(true);
    }//GEN-LAST:event_JBTentrar1ActionPerformed

    private void JBTsair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTsair1ActionPerformed
    
    // Fechar a aplicação quando o botão for pressionado
    System.exit(0);
    }//GEN-LAST:event_JBTsair1ActionPerformed

    private void JBTesqueceusenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTesqueceusenha1ActionPerformed
  
    // Exibir uma mensagem de aviso ao usuário
    JOptionPane.showMessageDialog(this, "Um email de recuperação foi enviado para o seu endereço de email cadastrado.", "Recuperação de Senha", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JBTesqueceusenha1ActionPerformed

    private void JBTcadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcadastrar1ActionPerformed
        // TODO add your handling code here:
        Tela_Login.this.dispose();
        Tela_Cadastro_Funcionario JBTcadastrar1 = new Tela_Cadastro_Funcionario();
        JBTcadastrar1.setVisible(true);
    }//GEN-LAST:event_JBTcadastrar1ActionPerformed

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
    private javax.swing.JLabel JBLmotoconnect1;
    private javax.swing.JLabel JBLsair1;
    private javax.swing.JButton JBTadministrador1;
    private javax.swing.JButton JBTatendente1;
    private javax.swing.JButton JBTcadastrar1;
    private javax.swing.JButton JBTentrar1;
    private javax.swing.JButton JBTentregador1;
    private javax.swing.JButton JBTesqueceusenha1;
    private javax.swing.JButton JBTsair1;
    private javax.swing.JLabel JLBou1;
    private javax.swing.JLabel JLnomedousuario1;
    private javax.swing.JLabel JLsenha1;
    private javax.swing.JPasswordField JPFsenha1;
    private javax.swing.JPanel JPNazulclaro1;
    private javax.swing.JPanel JPNazulescuro1;
    private javax.swing.JTextField JTFnomedousuario1;
    // End of variables declaration//GEN-END:variables
}
