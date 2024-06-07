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
public class Tela_Informacoes_Atendente extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Informacoes_Atendente
     */
    public Tela_Informacoes_Atendente() {
        initComponents();
    }
    
    // Define os detalhes de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/moto_connect";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPNfundo4 = new javax.swing.JPanel();
        JPNcadastrodeatendente4 = new javax.swing.JPanel();
        JLBcadastrodeatendente4 = new javax.swing.JLabel();
        JPNinformacoesdoatendente4 = new javax.swing.JPanel();
        JLBinformacoesdoatendente4 = new javax.swing.JLabel();
        JPNazulclaro4 = new javax.swing.JPanel();
        JTFnome4 = new javax.swing.JTextField();
        JTFcep4 = new javax.swing.JTextField();
        JTFbairro4 = new javax.swing.JTextField();
        JTFcpf4 = new javax.swing.JTextField();
        JTFsobrenome4 = new javax.swing.JTextField();
        JTFsenha4 = new javax.swing.JTextField();
        JTFestado4 = new javax.swing.JTextField();
        JTFrua4 = new javax.swing.JTextField();
        JTFcidade4 = new javax.swing.JTextField();
        JTFtelefone4 = new javax.swing.JTextField();
        JLBnome4 = new javax.swing.JLabel();
        JLBsobrenome4 = new javax.swing.JLabel();
        JLBcep4 = new javax.swing.JLabel();
        JLBestado4 = new javax.swing.JLabel();
        JLBbairro4 = new javax.swing.JLabel();
        JLBcpf4 = new javax.swing.JLabel();
        JLBcidade4 = new javax.swing.JLabel();
        JLBtelefone4 = new javax.swing.JLabel();
        JLBrua4 = new javax.swing.JLabel();
        JLBsenha4 = new javax.swing.JLabel();
        JBTcancelar4 = new javax.swing.JButton();
        JBTsalvar4 = new javax.swing.JButton();
        JLBmotoconnect4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNfundo4.setBackground(new java.awt.Color(0, 51, 204));
        JPNfundo4.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNcadastrodeatendente4.setBackground(new java.awt.Color(0, 102, 255));

        JLBcadastrodeatendente4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBcadastrodeatendente4.setForeground(new java.awt.Color(255, 255, 255));
        JLBcadastrodeatendente4.setText("Cadastro de Atendente");

        javax.swing.GroupLayout JPNcadastrodeatendente4Layout = new javax.swing.GroupLayout(JPNcadastrodeatendente4);
        JPNcadastrodeatendente4.setLayout(JPNcadastrodeatendente4Layout);
        JPNcadastrodeatendente4Layout.setHorizontalGroup(
            JPNcadastrodeatendente4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNcadastrodeatendente4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(JLBcadastrodeatendente4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPNcadastrodeatendente4Layout.setVerticalGroup(
            JPNcadastrodeatendente4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNcadastrodeatendente4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(JLBcadastrodeatendente4)
                .addGap(18, 18, 18))
        );

        JPNinformacoesdoatendente4.setBackground(new java.awt.Color(0, 102, 255));

        JLBinformacoesdoatendente4.setBackground(new java.awt.Color(0, 102, 255));
        JLBinformacoesdoatendente4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBinformacoesdoatendente4.setForeground(new java.awt.Color(255, 255, 255));
        JLBinformacoesdoatendente4.setText("Informações do atendente");

        javax.swing.GroupLayout JPNinformacoesdoatendente4Layout = new javax.swing.GroupLayout(JPNinformacoesdoatendente4);
        JPNinformacoesdoatendente4.setLayout(JPNinformacoesdoatendente4Layout);
        JPNinformacoesdoatendente4Layout.setHorizontalGroup(
            JPNinformacoesdoatendente4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNinformacoesdoatendente4Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(JLBinformacoesdoatendente4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        JPNinformacoesdoatendente4Layout.setVerticalGroup(
            JPNinformacoesdoatendente4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNinformacoesdoatendente4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBinformacoesdoatendente4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        JPNazulclaro4.setBackground(new java.awt.Color(0, 102, 255));

        JTFnome4.setBackground(new java.awt.Color(204, 204, 204));

        JTFcep4.setBackground(new java.awt.Color(204, 204, 204));

        JTFbairro4.setBackground(new java.awt.Color(204, 204, 204));

        JTFcpf4.setBackground(new java.awt.Color(204, 204, 204));

        JTFsobrenome4.setBackground(new java.awt.Color(204, 204, 204));

        JTFsenha4.setBackground(new java.awt.Color(204, 204, 204));

        JTFestado4.setBackground(new java.awt.Color(204, 204, 204));

        JTFrua4.setBackground(new java.awt.Color(204, 204, 204));

        JTFcidade4.setBackground(new java.awt.Color(204, 204, 204));

        JTFtelefone4.setBackground(new java.awt.Color(204, 204, 204));

        JLBnome4.setForeground(new java.awt.Color(255, 255, 255));
        JLBnome4.setText("Nome:");

        JLBsobrenome4.setForeground(new java.awt.Color(255, 255, 255));
        JLBsobrenome4.setText("Sobrenome:");

        JLBcep4.setForeground(new java.awt.Color(255, 255, 255));
        JLBcep4.setText("CEP:");

        JLBestado4.setForeground(new java.awt.Color(255, 255, 255));
        JLBestado4.setText("Estado:");

        JLBbairro4.setForeground(new java.awt.Color(255, 255, 255));
        JLBbairro4.setText("Bairro:");

        JLBcpf4.setForeground(new java.awt.Color(255, 255, 255));
        JLBcpf4.setText("CPF:");

        JLBcidade4.setForeground(new java.awt.Color(255, 255, 255));
        JLBcidade4.setText("Cidade:");

        JLBtelefone4.setForeground(new java.awt.Color(255, 255, 255));
        JLBtelefone4.setText("Telefone:");

        JLBrua4.setForeground(new java.awt.Color(255, 255, 255));
        JLBrua4.setText("Rua:");

        JLBsenha4.setForeground(new java.awt.Color(255, 255, 255));
        JLBsenha4.setText("Senha:");

        javax.swing.GroupLayout JPNazulclaro4Layout = new javax.swing.GroupLayout(JPNazulclaro4);
        JPNazulclaro4.setLayout(JPNazulclaro4Layout);
        JPNazulclaro4Layout.setHorizontalGroup(
            JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNazulclaro4Layout.createSequentialGroup()
                        .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFcep4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(JTFbairro4))
                            .addComponent(JLBcep4)
                            .addComponent(JLBbairro4))
                        .addGap(50, 50, 50)
                        .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFrua4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(JTFestado4))
                            .addComponent(JLBestado4)
                            .addComponent(JLBrua4))
                        .addGap(48, 48, 48)
                        .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBcidade4)
                            .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFcidade4, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(JTFtelefone4))
                            .addComponent(JLBtelefone4)))
                    .addGroup(JPNazulclaro4Layout.createSequentialGroup()
                        .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFnome4)
                            .addGroup(JPNazulclaro4Layout.createSequentialGroup()
                                .addComponent(JTFcpf4)
                                .addGap(1, 1, 1))
                            .addComponent(JLBnome4)
                            .addComponent(JLBcpf4))
                        .addGap(49, 49, 49)
                        .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBsenha4)
                            .addComponent(JLBsobrenome4)
                            .addComponent(JTFsobrenome4)
                            .addComponent(JTFsenha4))))
                .addGap(29, 29, 29))
        );
        JPNazulclaro4Layout.setVerticalGroup(
            JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBnome4)
                    .addComponent(JLBsobrenome4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFsobrenome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBcep4)
                    .addComponent(JLBestado4)
                    .addComponent(JLBcidade4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcep4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFestado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcidade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBbairro4)
                    .addComponent(JLBtelefone4)
                    .addComponent(JLBrua4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFbairro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFrua4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFtelefone4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBcpf4)
                    .addComponent(JLBsenha4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcpf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFsenha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        JBTcancelar4.setBackground(new java.awt.Color(255, 51, 51));
        JBTcancelar4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTcancelar4.setForeground(new java.awt.Color(255, 255, 255));
        JBTcancelar4.setText("CANCELAR");
        JBTcancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcancelar4ActionPerformed(evt);
            }
        });

        JBTsalvar4.setBackground(new java.awt.Color(255, 51, 51));
        JBTsalvar4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTsalvar4.setForeground(new java.awt.Color(255, 255, 255));
        JBTsalvar4.setText("SALVAR");
        JBTsalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTsalvar4ActionPerformed(evt);
            }
        });

        JLBmotoconnect4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\MotoConnect_Projeto\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\motoqueiro.png")); // NOI18N

        javax.swing.GroupLayout JPNfundo4Layout = new javax.swing.GroupLayout(JPNfundo4);
        JPNfundo4.setLayout(JPNfundo4Layout);
        JPNfundo4Layout.setHorizontalGroup(
            JPNfundo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(JPNfundo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo4Layout.createSequentialGroup()
                        .addComponent(JPNcadastrodeatendente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo4Layout.createSequentialGroup()
                        .addComponent(JLBmotoconnect4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(JPNfundo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNfundo4Layout.createSequentialGroup()
                        .addComponent(JBTcancelar4)
                        .addGap(441, 441, 441)
                        .addComponent(JBTsalvar4)
                        .addGap(61, 61, 61))
                    .addGroup(JPNfundo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPNfundo4Layout.createSequentialGroup()
                            .addComponent(JPNazulclaro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo4Layout.createSequentialGroup()
                            .addComponent(JPNinformacoesdoatendente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)))))
        );
        JPNfundo4Layout.setVerticalGroup(
            JPNfundo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JPNinformacoesdoatendente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPNfundo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNfundo4Layout.createSequentialGroup()
                        .addComponent(JLBmotoconnect4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPNcadastrodeatendente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPNazulclaro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(JPNfundo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTsalvar4)
                    .addComponent(JBTcancelar4))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNfundo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNfundo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTcancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcancelar4ActionPerformed
        // TODO add your handling code here:
        Tela_Informacoes_Atendente.this.dispose();
        Tela_Cadastro_Funcionario JBTcancelar4 = new Tela_Cadastro_Funcionario();
        JBTcancelar4.setVisible(true);
    }//GEN-LAST:event_JBTcancelar4ActionPerformed

    private void JBTsalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTsalvar4ActionPerformed
        // Obtenha os dados dos campos de texto
        String nome = JTFnome4.getText();
        String sobrenome = JTFsobrenome4.getText();
        String cep = JTFcep4.getText();
        String estado = JTFestado4.getText();
        String cidade = JTFcidade4.getText();
        String bairro = JTFbairro4.getText();
        String rua = JTFrua4.getText();
        String telefone = JTFtelefone4.getText();
        String cpf = JTFcpf4.getText();
        String senha = JTFsenha4.getText();

        // Insira os dados no banco de dados
        try {
            // Estabeleça a conexão
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Crie a declaração SQL
            String sql = "INSERT INTO atendente (nome, sobrenome, cep, estado, cidade, bairro, rua, telefone, cpf, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            // Configure os parâmetros da declaração SQL
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, sobrenome);
            preparedStatement.setString(3, cep);
            preparedStatement.setString(4, estado);
            preparedStatement.setString(5, cidade);
            preparedStatement.setString(6, bairro);
            preparedStatement.setString(7, rua);
            preparedStatement.setString(8, telefone);
            preparedStatement.setString(9, cpf);
            preparedStatement.setString(10, senha);
            
            // Execute a declaração SQL
            preparedStatement.executeUpdate();
            
            // Feche a conexão
            preparedStatement.close();
            con.close();
            
            // Exiba uma mensagem de sucesso
            javax.swing.JOptionPane.showMessageDialog(this, "Atendente cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao cadastrar atendente: " + e.getMessage());
        }

        Tela_Informacoes_Atendente.this.dispose();
        Tela_Menu JBTsalvar4 = new Tela_Menu();
        JBTsalvar4.setVisible(true);
                                             
    }//GEN-LAST:event_JBTsalvar4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Informacoes_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Informacoes_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Informacoes_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Informacoes_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Informacoes_Atendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTcancelar4;
    private javax.swing.JButton JBTsalvar4;
    private javax.swing.JLabel JLBbairro4;
    private javax.swing.JLabel JLBcadastrodeatendente4;
    private javax.swing.JLabel JLBcep4;
    private javax.swing.JLabel JLBcidade4;
    private javax.swing.JLabel JLBcpf4;
    private javax.swing.JLabel JLBestado4;
    private javax.swing.JLabel JLBinformacoesdoatendente4;
    private javax.swing.JLabel JLBmotoconnect4;
    private javax.swing.JLabel JLBnome4;
    private javax.swing.JLabel JLBrua4;
    private javax.swing.JLabel JLBsenha4;
    private javax.swing.JLabel JLBsobrenome4;
    private javax.swing.JLabel JLBtelefone4;
    private javax.swing.JPanel JPNazulclaro4;
    private javax.swing.JPanel JPNcadastrodeatendente4;
    private javax.swing.JPanel JPNfundo4;
    private javax.swing.JPanel JPNinformacoesdoatendente4;
    private javax.swing.JTextField JTFbairro4;
    private javax.swing.JTextField JTFcep4;
    private javax.swing.JTextField JTFcidade4;
    private javax.swing.JTextField JTFcpf4;
    private javax.swing.JTextField JTFestado4;
    private javax.swing.JTextField JTFnome4;
    private javax.swing.JTextField JTFrua4;
    private javax.swing.JTextField JTFsenha4;
    private javax.swing.JTextField JTFsobrenome4;
    private javax.swing.JTextField JTFtelefone4;
    // End of variables declaration//GEN-END:variables
}
