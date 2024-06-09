/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motoconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Tela_Alertas extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Alertas
     */
    public Tela_Alertas() {
        initComponents();
    }
    
    private void salvarAlertas(String alertas) {
        String url = "jdbc:mysql://localhost/mysql";
        String usuario = "root";
        String senha = "";
        
        try (Connection con = DriverManager.getConnection(url, usuario, senha)) {
            String sql = "INSERT INTO alertas (alertas) VALUES (?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, alertas);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
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

        JPNfundo13 = new javax.swing.JPanel();
        JPNalertas13 = new javax.swing.JPanel();
        JLBalertas13 = new javax.swing.JLabel();
        JLBmotoconnect13 = new javax.swing.JLabel();
        JBTvoltar13 = new javax.swing.JButton();
        JPNazulclaro13 = new javax.swing.JPanel();
        JLBcargo13 = new javax.swing.JLabel();
        JTFcargo13 = new javax.swing.JTextField();
        JLBassunto13 = new javax.swing.JLabel();
        JSPassunto13 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JLBnomecompleto13 = new javax.swing.JLabel();
        JTFnomecompleto13 = new javax.swing.JTextField();
        JTBsalvar13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNfundo13.setBackground(new java.awt.Color(0, 51, 204));
        JPNfundo13.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNalertas13.setBackground(new java.awt.Color(0, 102, 255));
        JPNalertas13.setPreferredSize(new java.awt.Dimension(844, 30));

        JLBalertas13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBalertas13.setForeground(new java.awt.Color(255, 255, 255));
        JLBalertas13.setText("Alertas");

        javax.swing.GroupLayout JPNalertas13Layout = new javax.swing.GroupLayout(JPNalertas13);
        JPNalertas13.setLayout(JPNalertas13Layout);
        JPNalertas13Layout.setHorizontalGroup(
            JPNalertas13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNalertas13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLBalertas13)
                .addGap(301, 301, 301))
        );
        JPNalertas13Layout.setVerticalGroup(
            JPNalertas13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNalertas13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBalertas13)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JLBmotoconnect13.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\MotoConnect_Projeto\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\motoqueiro.png")); // NOI18N

        JBTvoltar13.setBackground(new java.awt.Color(255, 51, 51));
        JBTvoltar13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTvoltar13.setForeground(new java.awt.Color(255, 255, 255));
        JBTvoltar13.setText("VOLTAR");
        JBTvoltar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTvoltar13ActionPerformed(evt);
            }
        });

        JPNazulclaro13.setBackground(new java.awt.Color(0, 102, 255));

        JLBcargo13.setForeground(new java.awt.Color(255, 255, 255));
        JLBcargo13.setText("Cargo:");

        JTFcargo13.setBackground(new java.awt.Color(0, 102, 255));
        JTFcargo13.setForeground(new java.awt.Color(255, 255, 255));
        JTFcargo13.setText("Atendente");
        JTFcargo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcargo13ActionPerformed(evt);
            }
        });

        JLBassunto13.setBackground(new java.awt.Color(0, 102, 255));
        JLBassunto13.setForeground(new java.awt.Color(255, 255, 255));
        JLBassunto13.setText("Assunto:");

        jTextArea1.setBackground(new java.awt.Color(0, 102, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Segunda ponte fechada, por favor procurar rota alternativa.");
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JSPassunto13.setViewportView(jTextArea1);

        JLBnomecompleto13.setForeground(new java.awt.Color(255, 255, 255));
        JLBnomecompleto13.setText("Nome Completo:");

        JTFnomecompleto13.setBackground(new java.awt.Color(0, 102, 255));
        JTFnomecompleto13.setForeground(new java.awt.Color(255, 255, 255));
        JTFnomecompleto13.setText("Gabriel Resende");
        JTFnomecompleto13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomecompleto13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNazulclaro13Layout = new javax.swing.GroupLayout(JPNazulclaro13);
        JPNazulclaro13.setLayout(JPNazulclaro13Layout);
        JPNazulclaro13Layout.setHorizontalGroup(
            JPNazulclaro13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(JPNazulclaro13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBcargo13)
                    .addComponent(JLBassunto13)
                    .addComponent(JLBnomecompleto13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JSPassunto13, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(JTFcargo13)
                    .addComponent(JTFnomecompleto13))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        JPNazulclaro13Layout.setVerticalGroup(
            JPNazulclaro13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JPNazulclaro13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBcargo13)
                    .addComponent(JTFcargo13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(JPNazulclaro13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnomecompleto13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBnomecompleto13))
                .addGap(18, 18, 18)
                .addGroup(JPNazulclaro13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBassunto13)
                    .addComponent(JSPassunto13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        JTBsalvar13.setBackground(new java.awt.Color(255, 51, 51));
        JTBsalvar13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTBsalvar13.setForeground(new java.awt.Color(255, 255, 255));
        JTBsalvar13.setText("SALVAR");
        JTBsalvar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBsalvar13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNfundo13Layout = new javax.swing.GroupLayout(JPNfundo13);
        JPNfundo13.setLayout(JPNfundo13Layout);
        JPNfundo13Layout.setHorizontalGroup(
            JPNfundo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo13Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(JPNfundo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPNfundo13Layout.createSequentialGroup()
                        .addComponent(JTBsalvar13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBTvoltar13))
                    .addComponent(JPNazulclaro13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPNfundo13Layout.createSequentialGroup()
                        .addComponent(JLBmotoconnect13, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPNalertas13, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        JPNfundo13Layout.setVerticalGroup(
            JPNfundo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo13Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(JPNfundo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBmotoconnect13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPNalertas13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(JPNazulclaro13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(JPNfundo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTvoltar13)
                    .addComponent(JTBsalvar13))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNfundo13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPNfundo13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1AncestorAdded

    private void JBTvoltar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTvoltar13ActionPerformed
        Tela_Alertas.this.dispose();
        Tela_Menu JBTvoltar13 = new Tela_Menu();
        JBTvoltar13.setVisible(true);
    }//GEN-LAST:event_JBTvoltar13ActionPerformed

    private void JTFcargo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcargo13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcargo13ActionPerformed

    private void JTFnomecompleto13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomecompleto13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnomecompleto13ActionPerformed

    private void JTBsalvar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBsalvar13ActionPerformed
        String alertas = jTextArea1.getText(); // Obtém o texto do JTextArea
        salvarAlertas(alertas); // Chama o método para salvar no banco de dados
    }//GEN-LAST:event_JTBsalvar13ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Alertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Alertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Alertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Alertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Alertas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTvoltar13;
    private javax.swing.JLabel JLBalertas13;
    private javax.swing.JLabel JLBassunto13;
    private javax.swing.JLabel JLBcargo13;
    private javax.swing.JLabel JLBmotoconnect13;
    private javax.swing.JLabel JLBnomecompleto13;
    private javax.swing.JPanel JPNalertas13;
    private javax.swing.JPanel JPNazulclaro13;
    private javax.swing.JPanel JPNfundo13;
    private javax.swing.JScrollPane JSPassunto13;
    private javax.swing.JButton JTBsalvar13;
    private javax.swing.JTextField JTFcargo13;
    private javax.swing.JTextField JTFnomecompleto13;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
