/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motoconnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        JLBmotoconnect1 = new javax.swing.JLabel();
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

        JPFsenha1.setBackground(new java.awt.Color(204, 204, 204));

        JTFnomedousuario1.setBackground(new java.awt.Color(204, 204, 204));
        JTFnomedousuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomedousuario1ActionPerformed(evt);
            }
        });

        JLsenha1.setForeground(new java.awt.Color(255, 255, 255));
        JLsenha1.setText("Senha:");

        JLnomedousuario1.setForeground(new java.awt.Color(255, 255, 255));
        JLnomedousuario1.setText("Nome do usuario:");

        JLBmotoconnect1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\MotoConnect_Projeto\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\motoqueiro.png")); // NOI18N

        javax.swing.GroupLayout JPNazulclaro1Layout = new javax.swing.GroupLayout(JPNazulclaro1);
        JPNazulclaro1.setLayout(JPNazulclaro1Layout);
        JPNazulclaro1Layout.setHorizontalGroup(
            JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                .addGroup(JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLsenha1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLnomedousuario1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFnomedousuario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPNazulclaro1Layout.createSequentialGroup()
                                    .addComponent(JBTcadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBTentrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JPFsenha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(JLBmotoconnect1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPNazulclaro1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(JBTesqueceusenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        JPNazulclaro1Layout.setVerticalGroup(
            JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulclaro1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JLBmotoconnect1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(JLnomedousuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFnomedousuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLsenha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPFsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(JBTesqueceusenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(JPNazulclaro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTcadastrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBTentrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        JBTadministrador1.setBackground(new java.awt.Color(0, 102, 204));
        JBTadministrador1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTadministrador1.setForeground(new java.awt.Color(255, 255, 255));
        JBTadministrador1.setText("Administrador");
        JBTadministrador1.setPreferredSize(new java.awt.Dimension(115, 25));
        JBTadministrador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTadministrador1ActionPerformed(evt);
            }
        });

        JBLsair1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBLsair1.setForeground(new java.awt.Color(255, 255, 255));
        JBLsair1.setText("SAIR");

        JBTsair1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTsair1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\MotoConnect_Projeto\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\Sair.png")); // NOI18N
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
        JBTatendente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTatendente1ActionPerformed(evt);
            }
        });

        JBTentregador1.setBackground(new java.awt.Color(0, 102, 204));
        JBTentregador1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTentregador1.setForeground(new java.awt.Color(255, 255, 255));
        JBTentregador1.setText("Entregador");
        JBTentregador1.setMaximumSize(new java.awt.Dimension(115, 25));
        JBTentregador1.setPreferredSize(new java.awt.Dimension(115, 25));
        JBTentregador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTentregador1ActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(JPNazulclaro1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addGroup(JPNazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulescuro1Layout.createSequentialGroup()
                        .addComponent(JBTsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulescuro1Layout.createSequentialGroup()
                        .addComponent(JBLsair1)
                        .addGap(61, 61, 61))))
        );
        JPNazulescuro1Layout.setVerticalGroup(
            JPNazulescuro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulescuro1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JBTadministrador1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(JBTatendente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLBou1)
                .addGap(18, 18, 18)
                .addComponent(JBTentregador1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(JPNazulescuro1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JPNazulclaro1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulescuro1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBLsair1)
                .addGap(38, 38, 38))
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
        String username = JTFnomedousuario1.getText();
        String password = new String(JPFsenha1.getPassword());

        try {
            // Carrega o driver do MySQL e conecta ao banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");

            // Consulta SQL para verificar o nome de usuário e a senha
            String sql = "SELECT * FROM login WHERE nome_do_usuario = ? AND senha = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            // Verifica se a consulta retornou algum resultado
            if (rs.next()) {
                // Nome de usuário e senha corretos, abrir o menu
                Tela_Login.this.dispose();
                Tela_Menu telaMenu = new Tela_Menu();
                telaMenu.setVisible(true);
            } else {
                // Nome de usuário ou senha incorretos
               JOptionPane.showMessageDialog(this, "Nome de usuário ou senha inválidos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
               JTFnomedousuario1.requestFocus();
            }

            // Fecha a conexão com o banco de dados
            conn.close();
            } catch (SQLException | ClassNotFoundException e) {
            // Exibe uma mensagem de erro em caso de exceção
            JOptionPane.showMessageDialog(this, "Erro ao verificar credenciais: " + e.getMessage(), "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
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
        // Solicita o nome de usuário do administrador
        String adminUsername = JOptionPane.showInputDialog(this, "Digite o nome de usuário do administrador:", "Autenticação", JOptionPane.PLAIN_MESSAGE);
    
        // Solicita a senha do administrador
        String adminPassword = JOptionPane.showInputDialog(this, "Digite a senha do administrador:", "Autenticação", JOptionPane.PLAIN_MESSAGE);
    
        if (adminUsername == null || adminPassword == null) {
            // O usuário cancelou a entrada de nome de usuário ou senha
            return;
        }
    
        try {
            // Carrega o driver do MySQL e conecta ao banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
        
            // Consulta SQL para verificar o nome de usuário e a senha
            String sql = "SELECT * FROM login WHERE nome_do_usuario = ? AND senha = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, adminUsername);
            pst.setString(2, adminPassword);
        
            ResultSet rs = pst.executeQuery();
        
            // Verifica se a consulta retornou algum resultado
            if (rs.next()) {
                // Nome de usuário e senha corretos, abrir a tela de cadastro
                Tela_Login.this.dispose();
                Tela_Cadastro_Funcionario telaCadastro = new Tela_Cadastro_Funcionario();
                telaCadastro.setVisible(true);
            } else {
                // Nome de usuário ou senha incorretos
                JOptionPane.showMessageDialog(this, "Nome de usuário ou senha do administrador incorretos.", "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
            }
        
            // Fecha a conexão com o banco de dados
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            // Exibe uma mensagem de erro em caso de exceção
            JOptionPane.showMessageDialog(this, "Erro ao verificar credenciais: " + e.getMessage(), "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBTcadastrar1ActionPerformed

    private void JBTadministrador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTadministrador1ActionPerformed
        // Adicione a lógica para o login de administrador
        String username = JTFnomedousuario1.getText();
        String password = new String(JPFsenha1.getPassword());
    
        if (username.equals("admin") && password.equals("admin123")) {
            Tela_Login.this.dispose();
            Tela_Menu telaAdmin = new Tela_Menu();
            telaAdmin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nome de usuário ou senha inválidos para administrador.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            JTFnomedousuario1.requestFocus();
        }
    }//GEN-LAST:event_JBTadministrador1ActionPerformed

    private void JBTatendente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTatendente1ActionPerformed
        // Adicione a lógica para o login de atendente
        String username = JTFnomedousuario1.getText();
        String password = new String(JPFsenha1.getPassword());
    
        if (username.equals("atendente") && password.equals("atendente123")) {
            Tela_Login.this.dispose();
            Tela_Menu telaAtendente = new Tela_Menu();
            telaAtendente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nome de usuário ou senha inválidos para atendente.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            JTFnomedousuario1.requestFocus();
        }
    }//GEN-LAST:event_JBTatendente1ActionPerformed

    private void JTFnomedousuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomedousuario1ActionPerformed
       
    }//GEN-LAST:event_JTFnomedousuario1ActionPerformed

    private void JBTentregador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTentregador1ActionPerformed
        // Adicione a lógica para o login de entregador
        String username = JTFnomedousuario1.getText();
        String password = new String(JPFsenha1.getPassword());
    
        if (username.equals("entregador") && password.equals("entregador123")) {
            Tela_Login.this.dispose();
            Tela_Menu telaEntregador = new Tela_Menu();
            telaEntregador.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nome de usuário ou senha inválidos para entregador.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            JTFnomedousuario1.requestFocus();
        }
    }//GEN-LAST:event_JBTentregador1ActionPerformed

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
    private javax.swing.JLabel JBLsair1;
    private javax.swing.JButton JBTadministrador1;
    private javax.swing.JButton JBTatendente1;
    private javax.swing.JButton JBTcadastrar1;
    private javax.swing.JButton JBTentrar1;
    private javax.swing.JButton JBTentregador1;
    private javax.swing.JButton JBTesqueceusenha1;
    private javax.swing.JButton JBTsair1;
    private javax.swing.JLabel JLBmotoconnect1;
    private javax.swing.JLabel JLBou1;
    private javax.swing.JLabel JLnomedousuario1;
    private javax.swing.JLabel JLsenha1;
    private javax.swing.JPasswordField JPFsenha1;
    private javax.swing.JPanel JPNazulclaro1;
    private javax.swing.JPanel JPNazulescuro1;
    private javax.swing.JTextField JTFnomedousuario1;
    // End of variables declaration//GEN-END:variables
}
