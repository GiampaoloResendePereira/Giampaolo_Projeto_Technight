/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motoconnect;

/**
 *
 * @author PC
 */
import javax.swing.*;

public class Tela_Observacoes_Comentarioes extends javax.swing.JFrame {
    

    /**
     * Creates new form Tela_Observacoes_Comentarioes
     */
    public Tela_Observacoes_Comentarioes() {
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

        JPNfundo12 = new javax.swing.JPanel();
        JPNobservacoesecomentarios12 = new javax.swing.JPanel();
        JLBobservacoesecomentarios12 = new javax.swing.JLabel();
        JLBmotoconnect12 = new javax.swing.JLabel();
        JBTvoltar12 = new javax.swing.JButton();
        JPNazulclaro12 = new javax.swing.JPanel();
        JLBadministrador12 = new javax.swing.JLabel();
        JTFadministrador12 = new javax.swing.JTextField();
        JLBassunto12 = new javax.swing.JLabel();
        JSPassunto12 = new javax.swing.JScrollPane();
        JTAobservacoes12 = new javax.swing.JTextArea();
        JTBsalvar12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNfundo12.setBackground(new java.awt.Color(0, 51, 204));
        JPNfundo12.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNobservacoesecomentarios12.setBackground(new java.awt.Color(0, 102, 255));
        JPNobservacoesecomentarios12.setPreferredSize(new java.awt.Dimension(844, 30));

        JLBobservacoesecomentarios12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBobservacoesecomentarios12.setForeground(new java.awt.Color(255, 255, 255));
        JLBobservacoesecomentarios12.setText("Observações e comentarios ");

        javax.swing.GroupLayout JPNobservacoesecomentarios12Layout = new javax.swing.GroupLayout(JPNobservacoesecomentarios12);
        JPNobservacoesecomentarios12.setLayout(JPNobservacoesecomentarios12Layout);
        JPNobservacoesecomentarios12Layout.setHorizontalGroup(
            JPNobservacoesecomentarios12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNobservacoesecomentarios12Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(JLBobservacoesecomentarios12)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        JPNobservacoesecomentarios12Layout.setVerticalGroup(
            JPNobservacoesecomentarios12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNobservacoesecomentarios12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBobservacoesecomentarios12)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JLBmotoconnect12.setIcon(new javax.swing.ImageIcon("D:\\Users\\grpereira\\Desktop\\Giampaolo_Projeto_TechNight\\Giampaolo_Projeto_Technight\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\motoqueiro.png")); // NOI18N

        JBTvoltar12.setBackground(new java.awt.Color(255, 51, 51));
        JBTvoltar12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTvoltar12.setForeground(new java.awt.Color(255, 255, 255));
        JBTvoltar12.setText("VOLTAR");
        JBTvoltar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTvoltar12ActionPerformed(evt);
            }
        });

        JPNazulclaro12.setBackground(new java.awt.Color(0, 102, 255));

        JLBadministrador12.setForeground(new java.awt.Color(255, 255, 255));
        JLBadministrador12.setText("Administrador:");

        JTFadministrador12.setBackground(new java.awt.Color(0, 102, 255));
        JTFadministrador12.setForeground(new java.awt.Color(255, 255, 255));
        JTFadministrador12.setText(" Giampaolo Resende");
        JTFadministrador12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFadministrador12ActionPerformed(evt);
            }
        });

        JLBassunto12.setBackground(new java.awt.Color(0, 102, 255));
        JLBassunto12.setForeground(new java.awt.Color(255, 255, 255));
        JLBassunto12.setText("Assunto:");

        JTAobservacoes12.setBackground(new java.awt.Color(0, 102, 255));
        JTAobservacoes12.setColumns(20);
        JTAobservacoes12.setForeground(new java.awt.Color(255, 255, 255));
        JTAobservacoes12.setRows(5);
        JTAobservacoes12.setText("Restrição de Tamanho no Baú do Motoboy\n\nGostaríamos de informar que há uma restrição de tamanho para as encomendas que podem ser transportadas pelos nossos motoboys. \nPor favor, considere as dimensões máximas de 50 cm de comprimento, 40 cm de largura e 30 cm de altura para garantir uma entrega segura \ne eficiente.\nAgradecemos pela compreensão e colaboração.");
        JTAobservacoes12.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTAobservacoes12AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JSPassunto12.setViewportView(JTAobservacoes12);

        javax.swing.GroupLayout JPNazulclaro12Layout = new javax.swing.GroupLayout(JPNazulclaro12);
        JPNazulclaro12.setLayout(JPNazulclaro12Layout);
        JPNazulclaro12Layout.setHorizontalGroup(
            JPNazulclaro12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(JPNazulclaro12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBadministrador12)
                    .addComponent(JLBassunto12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JSPassunto12, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(JTFadministrador12))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        JPNazulclaro12Layout.setVerticalGroup(
            JPNazulclaro12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JPNazulclaro12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBadministrador12)
                    .addComponent(JTFadministrador12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBassunto12)
                    .addComponent(JSPassunto12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        JTBsalvar12.setBackground(new java.awt.Color(255, 51, 51));
        JTBsalvar12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTBsalvar12.setForeground(new java.awt.Color(255, 255, 255));
        JTBsalvar12.setText("SALVAR");
        JTBsalvar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBsalvar12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNfundo12Layout = new javax.swing.GroupLayout(JPNfundo12);
        JPNfundo12.setLayout(JPNfundo12Layout);
        JPNfundo12Layout.setHorizontalGroup(
            JPNfundo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo12Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(JPNfundo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPNfundo12Layout.createSequentialGroup()
                        .addComponent(JTBsalvar12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBTvoltar12))
                    .addComponent(JPNazulclaro12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPNfundo12Layout.createSequentialGroup()
                        .addComponent(JLBmotoconnect12, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPNobservacoesecomentarios12, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        JPNfundo12Layout.setVerticalGroup(
            JPNfundo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(JPNfundo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBmotoconnect12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPNobservacoesecomentarios12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(JPNazulclaro12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(JPNfundo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTvoltar12)
                    .addComponent(JTBsalvar12))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNfundo12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPNfundo12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTAobservacoes12AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTAobservacoes12AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JTAobservacoes12AncestorAdded

    private void JBTvoltar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTvoltar12ActionPerformed
        Tela_Observacoes_Comentarioes.this.dispose();
        Tela_Menu JBTvoltar12 = new Tela_Menu();
        JBTvoltar12.setVisible(true);
    }//GEN-LAST:event_JBTvoltar12ActionPerformed

    private void JTFadministrador12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFadministrador12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFadministrador12ActionPerformed

    private void JTBsalvar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBsalvar12ActionPerformed
        
        
        
    }//GEN-LAST:event_JTBsalvar12ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Observacoes_Comentarioes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Observacoes_Comentarioes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Observacoes_Comentarioes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Observacoes_Comentarioes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Observacoes_Comentarioes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTvoltar12;
    private javax.swing.JLabel JLBadministrador12;
    private javax.swing.JLabel JLBassunto12;
    private javax.swing.JLabel JLBmotoconnect12;
    private javax.swing.JLabel JLBobservacoesecomentarios12;
    private javax.swing.JPanel JPNazulclaro12;
    private javax.swing.JPanel JPNfundo12;
    private javax.swing.JPanel JPNobservacoesecomentarios12;
    private javax.swing.JScrollPane JSPassunto12;
    private javax.swing.JTextArea JTAobservacoes12;
    private javax.swing.JButton JTBsalvar12;
    private javax.swing.JTextField JTFadministrador12;
    // End of variables declaration//GEN-END:variables
}
