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

/**
 *
 * @author PC
 */
public class Tela_Cadastro_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Cadastro_Cliente
     */
    public Tela_Cadastro_Cliente() {
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

        jPanel1 = new javax.swing.JPanel();
        JPNcadastrodecliente8 = new javax.swing.JPanel();
        JLBcadastrodecliente8 = new javax.swing.JLabel();
        JPNinformacoesdocliente8 = new javax.swing.JPanel();
        JLBinformacoesdocliente8 = new javax.swing.JLabel();
        JPNfundoazulclaro8 = new javax.swing.JPanel();
        JTFnomecompleto8 = new javax.swing.JTextField();
        JTFcep8 = new javax.swing.JTextField();
        JTFbairro8 = new javax.swing.JTextField();
        JTFemail8 = new javax.swing.JTextField();
        JTFcpf8 = new javax.swing.JTextField();
        JTFtelefone8 = new javax.swing.JTextField();
        JTFestado8 = new javax.swing.JTextField();
        JTFrua8 = new javax.swing.JTextField();
        JTFcidade8 = new javax.swing.JTextField();
        JTFnumero8 = new javax.swing.JTextField();
        JLBnomecompleto8 = new javax.swing.JLabel();
        JLBcep8 = new javax.swing.JLabel();
        JLBbairro8 = new javax.swing.JLabel();
        JLBemail8 = new javax.swing.JLabel();
        JLBcpf8 = new javax.swing.JLabel();
        JLBestado8 = new javax.swing.JLabel();
        JLBrua8 = new javax.swing.JLabel();
        JLBtelefone8 = new javax.swing.JLabel();
        JLBcidade8 = new javax.swing.JLabel();
        JLBnumero8 = new javax.swing.JLabel();
        JBTcancelar8 = new javax.swing.JButton();
        JBTcontinuar8 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        JBTpesquisar8 = new javax.swing.JButton();
        JLBpesquisar8 = new javax.swing.JLabel();
        JLBmotoconnect8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNcadastrodecliente8.setBackground(new java.awt.Color(0, 102, 255));
        JPNcadastrodecliente8.setPreferredSize(new java.awt.Dimension(163, 50));

        JLBcadastrodecliente8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBcadastrodecliente8.setForeground(new java.awt.Color(255, 255, 255));
        JLBcadastrodecliente8.setText("Cadastro do Cliente");

        javax.swing.GroupLayout JPNcadastrodecliente8Layout = new javax.swing.GroupLayout(JPNcadastrodecliente8);
        JPNcadastrodecliente8.setLayout(JPNcadastrodecliente8Layout);
        JPNcadastrodecliente8Layout.setHorizontalGroup(
            JPNcadastrodecliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNcadastrodecliente8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(JLBcadastrodecliente8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        JPNcadastrodecliente8Layout.setVerticalGroup(
            JPNcadastrodecliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNcadastrodecliente8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JLBcadastrodecliente8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        JPNinformacoesdocliente8.setBackground(new java.awt.Color(0, 102, 255));
        JPNinformacoesdocliente8.setPreferredSize(new java.awt.Dimension(844, 30));

        JLBinformacoesdocliente8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBinformacoesdocliente8.setForeground(new java.awt.Color(255, 255, 255));
        JLBinformacoesdocliente8.setText("Informações do cliente");

        javax.swing.GroupLayout JPNinformacoesdocliente8Layout = new javax.swing.GroupLayout(JPNinformacoesdocliente8);
        JPNinformacoesdocliente8.setLayout(JPNinformacoesdocliente8Layout);
        JPNinformacoesdocliente8Layout.setHorizontalGroup(
            JPNinformacoesdocliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNinformacoesdocliente8Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(JLBinformacoesdocliente8)
                .addGap(259, 259, 259))
        );
        JPNinformacoesdocliente8Layout.setVerticalGroup(
            JPNinformacoesdocliente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNinformacoesdocliente8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBinformacoesdocliente8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        JPNfundoazulclaro8.setBackground(new java.awt.Color(0, 102, 255));

        JTFnomecompleto8.setBackground(new java.awt.Color(204, 204, 204));
        JTFnomecompleto8.setText(" João Silva");

        JTFcep8.setBackground(new java.awt.Color(204, 204, 204));
        JTFcep8.setText("12345678");

        JTFbairro8.setBackground(new java.awt.Color(204, 204, 204));
        JTFbairro8.setText(" Jardim da Penha");
        JTFbairro8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFbairro8ActionPerformed(evt);
            }
        });

        JTFemail8.setBackground(new java.awt.Color(204, 204, 204));
        JTFemail8.setText(" joaosl1234@email.com");

        JTFcpf8.setBackground(new java.awt.Color(204, 204, 204));
        JTFcpf8.setText("123.456.789-00");

        JTFtelefone8.setBackground(new java.awt.Color(204, 204, 204));
        JTFtelefone8.setText(" (27)123456789");
        JTFtelefone8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFtelefone8ActionPerformed(evt);
            }
        });

        JTFestado8.setBackground(new java.awt.Color(204, 204, 204));
        JTFestado8.setText("ES");

        JTFrua8.setBackground(new java.awt.Color(204, 204, 204));
        JTFrua8.setText("Rua das Flores");

        JTFcidade8.setBackground(new java.awt.Color(204, 204, 204));
        JTFcidade8.setText("Vitória");

        JTFnumero8.setBackground(new java.awt.Color(204, 204, 204));
        JTFnumero8.setText("12");

        JLBnomecompleto8.setForeground(new java.awt.Color(255, 255, 255));
        JLBnomecompleto8.setText("Nome Completo:");

        JLBcep8.setForeground(new java.awt.Color(255, 255, 255));
        JLBcep8.setText("CEP de origem:");

        JLBbairro8.setForeground(new java.awt.Color(255, 255, 255));
        JLBbairro8.setText("Bairro:");

        JLBemail8.setForeground(new java.awt.Color(255, 255, 255));
        JLBemail8.setText("E-Mail:");

        JLBcpf8.setForeground(new java.awt.Color(255, 255, 255));
        JLBcpf8.setText("CPF:");

        JLBestado8.setForeground(new java.awt.Color(255, 255, 255));
        JLBestado8.setText("Estado:");

        JLBrua8.setForeground(new java.awt.Color(255, 255, 255));
        JLBrua8.setText("Rua:");

        JLBtelefone8.setForeground(new java.awt.Color(255, 255, 255));
        JLBtelefone8.setText("Telefone:");

        JLBcidade8.setForeground(new java.awt.Color(255, 255, 255));
        JLBcidade8.setText("Cidade:");

        JLBnumero8.setForeground(new java.awt.Color(255, 255, 255));
        JLBnumero8.setText("Numero:");

        javax.swing.GroupLayout JPNfundoazulclaro8Layout = new javax.swing.GroupLayout(JPNfundoazulclaro8);
        JPNfundoazulclaro8.setLayout(JPNfundoazulclaro8Layout);
        JPNfundoazulclaro8Layout.setHorizontalGroup(
            JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundoazulclaro8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPNfundoazulclaro8Layout.createSequentialGroup()
                        .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFemail8, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBemail8))
                        .addGap(18, 18, 18)
                        .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBtelefone8)
                            .addComponent(JTFtelefone8, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                    .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPNfundoazulclaro8Layout.createSequentialGroup()
                            .addComponent(JTFnomecompleto8, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(JTFcpf8, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPNfundoazulclaro8Layout.createSequentialGroup()
                            .addComponent(JLBnomecompleto8)
                            .addGap(232, 232, 232)
                            .addComponent(JLBcpf8))
                        .addComponent(JLBbairro8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPNfundoazulclaro8Layout.createSequentialGroup()
                            .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFcep8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(JTFbairro8))
                                .addComponent(JLBcep8))
                            .addGap(18, 18, 18)
                            .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLBestado8)
                                .addComponent(JLBrua8)
                                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFestado8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(JTFrua8)))
                            .addGap(18, 18, 18)
                            .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFnumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFcidade8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLBnumero8)
                                .addComponent(JLBcidade8)))))
                .addGap(27, 27, 27))
        );
        JPNfundoazulclaro8Layout.setVerticalGroup(
            JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundoazulclaro8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBnomecompleto8)
                    .addComponent(JLBcpf8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnomecompleto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcpf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBcep8)
                    .addComponent(JLBestado8)
                    .addComponent(JLBcidade8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcep8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFestado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcidade8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBbairro8)
                    .addComponent(JLBrua8)
                    .addComponent(JLBnumero8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFbairro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFrua8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnumero8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBemail8)
                    .addComponent(JLBtelefone8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundoazulclaro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFemail8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFtelefone8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        JBTcancelar8.setBackground(new java.awt.Color(255, 51, 51));
        JBTcancelar8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTcancelar8.setForeground(new java.awt.Color(255, 255, 255));
        JBTcancelar8.setText("CANCELAR");
        JBTcancelar8.setMaximumSize(new java.awt.Dimension(106, 25));
        JBTcancelar8.setPreferredSize(new java.awt.Dimension(106, 25));
        JBTcancelar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcancelar8ActionPerformed(evt);
            }
        });

        JBTcontinuar8.setBackground(new java.awt.Color(255, 51, 51));
        JBTcontinuar8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTcontinuar8.setForeground(new java.awt.Color(255, 255, 255));
        JBTcontinuar8.setText("CONTINUAR");
        JBTcontinuar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcontinuar8ActionPerformed(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jTextField11.setText("CPF: 123.456.789-00");

        JBTpesquisar8.setBackground(new java.awt.Color(255, 51, 51));
        JBTpesquisar8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTpesquisar8.setForeground(new java.awt.Color(255, 255, 255));
        JBTpesquisar8.setText("PESQUISAR");
        JBTpesquisar8.setMaximumSize(new java.awt.Dimension(106, 25));
        JBTpesquisar8.setPreferredSize(new java.awt.Dimension(106, 25));
        JBTpesquisar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTpesquisar8ActionPerformed(evt);
            }
        });

        JLBpesquisar8.setForeground(new java.awt.Color(255, 255, 255));
        JLBpesquisar8.setText("Pesquisa Cliente:");

        JLBmotoconnect8.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\MotoConnect_Projeto\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\motoqueiro.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(JLBpesquisar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JPNcadastrodecliente8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(JLBmotoconnect8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JBTcancelar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBTcontinuar8))
                    .addComponent(JPNinformacoesdocliente8, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPNfundoazulclaro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(248, 248, 248))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(JBTpesquisar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(JPNinformacoesdocliente8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPNfundoazulclaro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTcancelar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTcontinuar8))
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(JLBmotoconnect8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPNcadastrodecliente8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(JLBpesquisar8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBTpesquisar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFtelefone8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFtelefone8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFtelefone8ActionPerformed

    private void JBTcancelar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcancelar8ActionPerformed
        // TODO add your handling code here:
        Tela_Cadastro_Cliente.this.dispose();
        Tela_Menu JBTcancelar8 = new Tela_Menu();
        JBTcancelar8.setVisible(true);
    }//GEN-LAST:event_JBTcancelar8ActionPerformed

    private void JBTcontinuar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcontinuar8ActionPerformed
        // Obtenha os dados dos campos de texto
        String nomecompleto8 = JTFnomecompleto8.getText();
        String cpf8 = JTFcpf8.getText();
        String cep8 = JTFcep8.getText();
        String estado8 = JTFestado8.getText();
        String cidade8 = JTFcidade8.getText();
        String bairro8 = JTFbairro8.getText();
        String rua8 = JTFrua8.getText();
        String nunero8 = JTFnumero8.getText();
        String email8 = JTFemail8.getText();
        String telefone8 = JTFtelefone8.getText();
        
        // Insira os dados no banco de dados
        try {
            // Estabeleça a conexão
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Crie a declaração SQL
            String sql = "INSERT INTO atendente (nomecompleto, cpf, cep, estado, cidade, bairro, rua, nunero, email, telefone8) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            // Configure os parâmetros da declaração SQL
            preparedStatement.setString(1, nomecompleto8);
            preparedStatement.setString(2, cpf8);
            preparedStatement.setString(3, cep8);
            preparedStatement.setString(4, estado8);
            preparedStatement.setString(5, cidade8);
            preparedStatement.setString(6, bairro8);
            preparedStatement.setString(7, rua8);
            preparedStatement.setString(8, nunero8);
            preparedStatement.setString(9, email8);
            preparedStatement.setString(10, telefone8);
            
            // Execute a declaração SQL
            preparedStatement.executeUpdate();
            
            // Feche a conexão
            preparedStatement.close();
            con.close();
            
            // Exiba uma mensagem de sucesso
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente: " + e.getMessage());
        }
        
        Tela_Cadastro_Cliente.this.dispose();
        Tela_Informacoes_Destinatario JBTcontinuar8 = new Tela_Informacoes_Destinatario();
        JBTcontinuar8.setVisible(true);
    }//GEN-LAST:event_JBTcontinuar8ActionPerformed

    private void JTFbairro8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFbairro8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFbairro8ActionPerformed

    private void JBTpesquisar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTpesquisar8ActionPerformed
        // Obtenha o CPF do campo de texto
    String cpf8 = JTFcpf8.getText();

    // Verifique se o CPF foi informado
    if (cpf8.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, insira um CPF.");
        return;
    }

    // Busque os dados do cliente no banco de dados
    try {
        // Estabeleça a conexão
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        // Crie a declaração SQL
        String sql = "SELECT nomecompleto, cep, estado, cidade, bairro, rua, nunero, email, telefone FROM cliente WHERE cpf = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        // Configure o parâmetro da declaração SQL
        preparedStatement.setString(1, cpf8);

        // Execute a consulta
        ResultSet res = preparedStatement.executeQuery();

        // Verifique se o cliente foi encontrado
        if (res.next()) {
            // Preencha os campos com os dados do cliente
            JTFnomecompleto8.setText(res.getString("nomecompleto"));
            JTFcep8.setText(res.getString("cep"));
            JTFestado8.setText(res.getString("estado"));
            JTFcidade8.setText(res.getString("cidade"));
            JTFbairro8.setText(res.getString("bairro"));
            JTFrua8.setText(res.getString("rua"));
            JTFnumero8.setText(res.getString("nunero"));
            JTFemail8.setText(res.getString("email"));
            JTFtelefone8.setText(res.getString("telefone"));
        } else {
            // Exiba uma mensagem se o cliente não for encontrado
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
        }

        // Feche a conexão
        res.close();
        preparedStatement.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao buscar cliente: " + e.getMessage());
    }
    }//GEN-LAST:event_JBTpesquisar8ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTcancelar8;
    private javax.swing.JButton JBTcontinuar8;
    private javax.swing.JButton JBTpesquisar8;
    private javax.swing.JLabel JLBbairro8;
    private javax.swing.JLabel JLBcadastrodecliente8;
    private javax.swing.JLabel JLBcep8;
    private javax.swing.JLabel JLBcidade8;
    private javax.swing.JLabel JLBcpf8;
    private javax.swing.JLabel JLBemail8;
    private javax.swing.JLabel JLBestado8;
    private javax.swing.JLabel JLBinformacoesdocliente8;
    private javax.swing.JLabel JLBmotoconnect8;
    private javax.swing.JLabel JLBnomecompleto8;
    private javax.swing.JLabel JLBnumero8;
    private javax.swing.JLabel JLBpesquisar8;
    private javax.swing.JLabel JLBrua8;
    private javax.swing.JLabel JLBtelefone8;
    private javax.swing.JPanel JPNcadastrodecliente8;
    private javax.swing.JPanel JPNfundoazulclaro8;
    private javax.swing.JPanel JPNinformacoesdocliente8;
    private javax.swing.JTextField JTFbairro8;
    private javax.swing.JTextField JTFcep8;
    private javax.swing.JTextField JTFcidade8;
    private javax.swing.JTextField JTFcpf8;
    private javax.swing.JTextField JTFemail8;
    private javax.swing.JTextField JTFestado8;
    private javax.swing.JTextField JTFnomecompleto8;
    private javax.swing.JTextField JTFnumero8;
    private javax.swing.JTextField JTFrua8;
    private javax.swing.JTextField JTFtelefone8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField11;
    // End of variables declaration//GEN-END:variables
}
