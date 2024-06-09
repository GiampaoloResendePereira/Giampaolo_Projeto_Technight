/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motoconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Tela_Informacoes_Entregador extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Informacoes_Entregador
     */
    public Tela_Informacoes_Entregador() {
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

        JPNfundo5 = new javax.swing.JPanel();
        JPNazulclaro5 = new javax.swing.JPanel();
        JTFnome5 = new javax.swing.JTextField();
        JTFestado5 = new javax.swing.JTextField();
        JTFcep5 = new javax.swing.JTextField();
        JTFcpf5 = new javax.swing.JTextField();
        JTFsobrenome5 = new javax.swing.JTextField();
        JTFdocumentodamoto5 = new javax.swing.JTextField();
        JTFsenha5 = new javax.swing.JTextField();
        JTFrua5 = new javax.swing.JTextField();
        JTFbairro5 = new javax.swing.JTextField();
        JTFtelefone5 = new javax.swing.JTextField();
        JLBnome5 = new javax.swing.JLabel();
        JLBsobrenome5 = new javax.swing.JLabel();
        JLBcep5 = new javax.swing.JLabel();
        JLBestado5 = new javax.swing.JLabel();
        JLBbairro5 = new javax.swing.JLabel();
        JLBcpf5 = new javax.swing.JLabel();
        JLBcidade5 = new javax.swing.JLabel();
        JLBnumero5 = new javax.swing.JLabel();
        JLBrua5 = new javax.swing.JLabel();
        JLBsenha5 = new javax.swing.JLabel();
        JTFcidade5 = new javax.swing.JTextField();
        JLBdocumentodamoto5 = new javax.swing.JLabel();
        JPNimagemdecnh5 = new javax.swing.JPanel();
        JTFimagemcnh5 = new javax.swing.JTextField();
        JLBimagemdecnh5 = new javax.swing.JLabel();
        JPNcadastrodeentregador5 = new javax.swing.JPanel();
        JLBcadastrodeentregador5 = new javax.swing.JLabel();
        JPNinformacoesdoentregador5 = new javax.swing.JPanel();
        JLBinformacoesdoentregador5 = new javax.swing.JLabel();
        JBTcancelar5 = new javax.swing.JButton();
        JBTsalvar5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNfundo5.setBackground(new java.awt.Color(0, 51, 204));
        JPNfundo5.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNazulclaro5.setBackground(new java.awt.Color(0, 102, 255));

        JTFnome5.setBackground(new java.awt.Color(204, 204, 204));

        JTFestado5.setBackground(new java.awt.Color(204, 204, 204));

        JTFcep5.setBackground(new java.awt.Color(204, 204, 204));

        JTFcpf5.setBackground(new java.awt.Color(204, 204, 204));

        JTFsobrenome5.setBackground(new java.awt.Color(204, 204, 204));

        JTFdocumentodamoto5.setBackground(new java.awt.Color(204, 204, 204));

        JTFsenha5.setBackground(new java.awt.Color(204, 204, 204));

        JTFrua5.setBackground(new java.awt.Color(204, 204, 204));

        JTFbairro5.setBackground(new java.awt.Color(204, 204, 204));

        JTFtelefone5.setBackground(new java.awt.Color(204, 204, 204));

        JLBnome5.setForeground(new java.awt.Color(255, 255, 255));
        JLBnome5.setText("Nome:");

        JLBsobrenome5.setForeground(new java.awt.Color(255, 255, 255));
        JLBsobrenome5.setText("Sobrenome:");

        JLBcep5.setForeground(new java.awt.Color(255, 255, 255));
        JLBcep5.setText("CEP:");

        JLBestado5.setForeground(new java.awt.Color(255, 255, 255));
        JLBestado5.setText("Estado:");

        JLBbairro5.setForeground(new java.awt.Color(255, 255, 255));
        JLBbairro5.setText("Bairro:");

        JLBcpf5.setForeground(new java.awt.Color(255, 255, 255));
        JLBcpf5.setText("CPF:");

        JLBcidade5.setForeground(new java.awt.Color(255, 255, 255));
        JLBcidade5.setText("Cidade:");

        JLBnumero5.setForeground(new java.awt.Color(255, 255, 255));
        JLBnumero5.setText("Telefone:");

        JLBrua5.setForeground(new java.awt.Color(255, 255, 255));
        JLBrua5.setText("Rua:");

        JLBsenha5.setForeground(new java.awt.Color(255, 255, 255));
        JLBsenha5.setText("Senha:");

        JTFcidade5.setBackground(new java.awt.Color(204, 204, 204));

        JLBdocumentodamoto5.setForeground(new java.awt.Color(255, 255, 255));
        JLBdocumentodamoto5.setText("Documento da moto:");

        JPNimagemdecnh5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout JPNimagemdecnh5Layout = new javax.swing.GroupLayout(JPNimagemdecnh5);
        JPNimagemdecnh5.setLayout(JPNimagemdecnh5Layout);
        JPNimagemdecnh5Layout.setHorizontalGroup(
            JPNimagemdecnh5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNimagemdecnh5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFimagemcnh5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPNimagemdecnh5Layout.setVerticalGroup(
            JPNimagemdecnh5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNimagemdecnh5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFimagemcnh5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        JLBimagemdecnh5.setForeground(new java.awt.Color(255, 255, 255));
        JLBimagemdecnh5.setText("Imagem de CNH:");

        javax.swing.GroupLayout JPNazulclaro5Layout = new javax.swing.GroupLayout(JPNazulclaro5);
        JPNazulclaro5.setLayout(JPNazulclaro5Layout);
        JPNazulclaro5Layout.setHorizontalGroup(
            JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                                .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNazulclaro5Layout.createSequentialGroup()
                                        .addComponent(JTFcpf5)
                                        .addGap(244, 244, 244))
                                    .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                                        .addComponent(JTFcep5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JTFestado5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JLBrua5)
                                                .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JLBdocumentodamoto5)
                                                    .addComponent(JTFdocumentodamoto5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                    .addComponent(JTFrua5))))
                                        .addGap(51, 51, 51))
                                    .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLBcpf5)
                                            .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                                                .addComponent(JLBcep5)
                                                .addGap(170, 170, 170)
                                                .addComponent(JLBestado5))
                                            .addComponent(JLBbairro5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFcidade5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFsenha5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLBnumero5)
                                    .addComponent(JTFtelefone5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLBsenha5)
                                    .addComponent(JLBcidade5)))
                            .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JPNimagemdecnh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(33, 33, 33))
                    .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBsobrenome5)
                            .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTFsobrenome5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                                .addComponent(JTFnome5, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFbairro5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBnome5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLBimagemdecnh5)
                        .addGap(125, 125, 125))))
        );
        JPNazulclaro5Layout.setVerticalGroup(
            JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBnome5)
                    .addComponent(JLBimagemdecnh5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNazulclaro5Layout.createSequentialGroup()
                        .addComponent(JTFnome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(JLBsobrenome5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFsobrenome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBcidade5)
                            .addComponent(JLBestado5)
                            .addComponent(JLBcep5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFcep5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFestado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFcidade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBrua5)
                            .addComponent(JLBbairro5)
                            .addComponent(JLBnumero5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFbairro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFrua5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFtelefone5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBcpf5)
                            .addComponent(JLBsenha5)
                            .addComponent(JLBdocumentodamoto5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPNazulclaro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFcpf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFdocumentodamoto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFsenha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JPNimagemdecnh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        JPNcadastrodeentregador5.setBackground(new java.awt.Color(0, 102, 255));

        JLBcadastrodeentregador5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBcadastrodeentregador5.setForeground(new java.awt.Color(255, 255, 255));
        JLBcadastrodeentregador5.setText("Cadastro de Entregafor");

        javax.swing.GroupLayout JPNcadastrodeentregador5Layout = new javax.swing.GroupLayout(JPNcadastrodeentregador5);
        JPNcadastrodeentregador5.setLayout(JPNcadastrodeentregador5Layout);
        JPNcadastrodeentregador5Layout.setHorizontalGroup(
            JPNcadastrodeentregador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNcadastrodeentregador5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JLBcadastrodeentregador5)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        JPNcadastrodeentregador5Layout.setVerticalGroup(
            JPNcadastrodeentregador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNcadastrodeentregador5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JLBcadastrodeentregador5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        JPNinformacoesdoentregador5.setBackground(new java.awt.Color(0, 102, 255));
        JPNinformacoesdoentregador5.setForeground(new java.awt.Color(255, 255, 255));

        JLBinformacoesdoentregador5.setBackground(new java.awt.Color(0, 102, 255));
        JLBinformacoesdoentregador5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBinformacoesdoentregador5.setForeground(new java.awt.Color(255, 255, 255));
        JLBinformacoesdoentregador5.setText("Informações do Entregador");

        javax.swing.GroupLayout JPNinformacoesdoentregador5Layout = new javax.swing.GroupLayout(JPNinformacoesdoentregador5);
        JPNinformacoesdoentregador5.setLayout(JPNinformacoesdoentregador5Layout);
        JPNinformacoesdoentregador5Layout.setHorizontalGroup(
            JPNinformacoesdoentregador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNinformacoesdoentregador5Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(JLBinformacoesdoentregador5)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        JPNinformacoesdoentregador5Layout.setVerticalGroup(
            JPNinformacoesdoentregador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNinformacoesdoentregador5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBinformacoesdoentregador5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JBTcancelar5.setBackground(new java.awt.Color(255, 51, 51));
        JBTcancelar5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTcancelar5.setForeground(new java.awt.Color(255, 255, 255));
        JBTcancelar5.setText("CANCELAR");
        JBTcancelar5.setMaximumSize(new java.awt.Dimension(106, 25));
        JBTcancelar5.setPreferredSize(new java.awt.Dimension(106, 25));
        JBTcancelar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcancelar5ActionPerformed(evt);
            }
        });

        JBTsalvar5.setBackground(new java.awt.Color(255, 51, 51));
        JBTsalvar5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTsalvar5.setForeground(new java.awt.Color(255, 255, 255));
        JBTsalvar5.setText("SALVAR");
        JBTsalvar5.setMaximumSize(new java.awt.Dimension(106, 25));
        JBTsalvar5.setPreferredSize(new java.awt.Dimension(106, 25));
        JBTsalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTsalvar5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONTINUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNfundo5Layout = new javax.swing.GroupLayout(JPNfundo5);
        JPNfundo5.setLayout(JPNfundo5Layout);
        JPNfundo5Layout.setHorizontalGroup(
            JPNfundo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo5Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(JPNfundo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo5Layout.createSequentialGroup()
                        .addComponent(JPNcadastrodeentregador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNfundo5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGroup(JPNfundo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPNinformacoesdoentregador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPNfundo5Layout.createSequentialGroup()
                        .addComponent(JBTcancelar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBTsalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1))
                    .addComponent(JPNazulclaro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        JPNfundo5Layout.setVerticalGroup(
            JPNfundo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(JPNinformacoesdoentregador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPNfundo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPNfundo5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPNcadastrodeentregador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPNazulclaro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(JPNfundo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTsalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTcancelar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNfundo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPNfundo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTcancelar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcancelar5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Você voltara para tela de menu");
        
        Tela_Informacoes_Entregador.this.dispose();
        Tela_Menu JBTcancelar5 = new Tela_Menu();
        JBTcancelar5.setVisible(true);
    }//GEN-LAST:event_JBTcancelar5ActionPerformed

    private void JBTsalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTsalvar5ActionPerformed
        try {
            String text1 = JTFnome5.getText();
                //(!text.matches("\\d*"))
                 if (!text1.matches("[a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙãõÃÕâêîôûÂÊÎÔÛäëïöüÄËÏÖÜçÇ ]*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas letras.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFnome5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                 
                String text2 = JTFsobrenome5.getText();
                //(!text.matches("\\d*"))
                 if (!text2.matches("[a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙãõÃÕâêîôûÂÊÎÔÛäëïöüÄËÏÖÜçÇ ]*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas letras.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFsobrenome5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                 
                 String text3 = JTFcep5.getText();
                //
                 if (!text3.matches("\\d*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas número.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFcep5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                
                String text4 = JTFestado5.getText();
                //(!text.matches("\\d*"))
                 if (!text4.matches("[a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙãõÃÕâêîôûÂÊÎÔÛäëïöüÄËÏÖÜçÇ ]*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas letras.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFestado5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                
                 String text5 = JTFcidade5.getText();
                //(!text.matches("\\d*"))
                 if (!text5.matches("[a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙãõÃÕâêîôûÂÊÎÔÛäëïöüÄËÏÖÜçÇ ]*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas letras.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFcidade5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                 
                 String text6 = JTFbairro5.getText();
                //(!text.matches("\\d*"))
                 if (!text6.matches("[a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙãõÃÕâêîôûÂÊÎÔÛäëïöüÄËÏÖÜçÇ ]*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas letras.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFbairro5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                 
                 String text7 = JTFrua5.getText();
                //(!text.matches("\\d*"))
                 if (!text7.matches("[a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙãõÃÕâêîôûÂÊÎÔÛäëïöüÄËÏÖÜçÇ ]*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas letras.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFrua5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                 
                 String text8 = JTFtelefone5.getText();
                //
                 if (!text8.matches("\\d*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas número.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFtelefone5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                 
                 String text9 = JTFcpf5.getText();
                //
                 if (!text9.matches("\\d*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas número.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFcpf5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                 
                 String text11 = JTFdocumentodamoto5.getText();
                //
                 if (!text11.matches("\\d*"))  { // Verifica se o texto contém apenas letras
                    JOptionPane.showMessageDialog(null,
                                                  "Por favor, insira apenas número.",
                                                  "Entrada Inválida",
                                                  JOptionPane.ERROR_MESSAGE);
                    JTFdocumentodamoto5.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","");
            java.sql.Statement st = com.createStatement();

            st.executeUpdate ("INSERT INTO entregador (nome, sobrenome, cep, estado, cidade, bairro, rua, telefone, cpf, senha, documento_moto, imagem_cnh) VALUES("
                    +this.JTFnome5.getText()+","
                    +this.JTFsobrenome5.getText()+","
                    +this.JTFcep5.getText()+","
                    +this.JTFestado5.getText()+","
                    +this.JTFcidade5.getText()+","
                    +this.JTFbairro5.getText()+","
                    +this.JTFrua5.getText()+","
                    +this.JTFtelefone5.getText()+","
                    +this.JTFcpf5.getText()+","
                    +this.JTFsenha5.getText()+","
                    +this.JTFdocumentodamoto5.getText()+","
                    +this.JTFimagemcnh5.getText()+")");

            JOptionPane.showMessageDialog(null, "Informações enviadas");

            com.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar informações: " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_JBTsalvar5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela_Informacoes_Entregador.this.dispose();
        Tela_Menu JBTcontinuar5 = new Tela_Menu();
        JBTcontinuar5.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Informacoes_Entregador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Informacoes_Entregador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Informacoes_Entregador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Informacoes_Entregador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Informacoes_Entregador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTcancelar5;
    private javax.swing.JButton JBTsalvar5;
    private javax.swing.JLabel JLBbairro5;
    private javax.swing.JLabel JLBcadastrodeentregador5;
    private javax.swing.JLabel JLBcep5;
    private javax.swing.JLabel JLBcidade5;
    private javax.swing.JLabel JLBcpf5;
    private javax.swing.JLabel JLBdocumentodamoto5;
    private javax.swing.JLabel JLBestado5;
    private javax.swing.JLabel JLBimagemdecnh5;
    private javax.swing.JLabel JLBinformacoesdoentregador5;
    private javax.swing.JLabel JLBnome5;
    private javax.swing.JLabel JLBnumero5;
    private javax.swing.JLabel JLBrua5;
    private javax.swing.JLabel JLBsenha5;
    private javax.swing.JLabel JLBsobrenome5;
    private javax.swing.JPanel JPNazulclaro5;
    private javax.swing.JPanel JPNcadastrodeentregador5;
    private javax.swing.JPanel JPNfundo5;
    private javax.swing.JPanel JPNimagemdecnh5;
    private javax.swing.JPanel JPNinformacoesdoentregador5;
    private javax.swing.JButton JTBcontinuar4;
    private javax.swing.JButton JTBcontinuar5;
    private javax.swing.JTextField JTFbairro5;
    private javax.swing.JTextField JTFcep5;
    private javax.swing.JTextField JTFcidade5;
    private javax.swing.JTextField JTFcpf5;
    private javax.swing.JTextField JTFdocumentodamoto5;
    private javax.swing.JTextField JTFestado5;
    private javax.swing.JTextField JTFimagemcnh5;
    private javax.swing.JTextField JTFnome5;
    private javax.swing.JTextField JTFrua5;
    private javax.swing.JTextField JTFsenha5;
    private javax.swing.JTextField JTFsobrenome5;
    private javax.swing.JTextField JTFtelefone5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
