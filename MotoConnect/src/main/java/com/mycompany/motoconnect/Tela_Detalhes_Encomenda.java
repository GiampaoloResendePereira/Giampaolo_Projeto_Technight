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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Tela_Detalhes_Encomenda extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Detalhes_Encomenda
     */
    public Tela_Detalhes_Encomenda() {
        initComponents();
        
    }
    
    private void pesquisarCliente(int idCliente) {
    // URL de conexão com o banco de dados
    String url = "jdbc:mysql://localhost:3306/crud";
    
    // Credenciais de acesso ao banco de dados
    String usuario = "root";
    String senha = "";

    // Consultas SQL para buscar informações do cliente, destinatário e cálculo de frete
    String sqlCliente = "SELECT * FROM cliente WHERE id_cliente = ?";
    String sqlDestinatario = "SELECT * FROM destinatario WHERE id_destinatario = ?";
    String sqlCalculoFrete = "SELECT * FROM calculo_frete WHERE numero_pedido = ?";

    try (Connection con = DriverManager.getConnection(url, usuario, senha);
         PreparedStatement pstCliente = con.prepareStatement(sqlCliente);
         PreparedStatement pstDestinatario = con.prepareStatement(sqlDestinatario);
         PreparedStatement pstCalculoFrete = con.prepareStatement(sqlCalculoFrete)) {

        // Consulta na tabela cliente
        pstCliente.setInt(1, idCliente);
        try (ResultSet rsCliente = pstCliente.executeQuery()) {
            if (rsCliente.next()) {
                // Preenche os campos de texto com as informações do cliente
                JTFnomecompleto11.setText(rsCliente.getString("nome_cliente"));
                JTFcpf11.setText(rsCliente.getString("cpf_cliente"));
                JTFenderecocompleto11.setText(
                    rsCliente.getString("rua_cliente") + ", " +
                    rsCliente.getString("numero_cliente") + ", " +
                    rsCliente.getString("bairro_cliente") + ", " +
                    rsCliente.getString("cidade_cliente") + " - " +
                    rsCliente.getString("estado_cliente") + ", " +
                    rsCliente.getString("cep_cliente")
                );
                JTFtelefone11.setText(rsCliente.getString("telefone_cliente"));
                JTFemail11.setText(rsCliente.getString("email_cliente"));
            } else {
                // Mostra uma mensagem de erro se o cliente não for encontrado
                JOptionPane.showMessageDialog(this, "Cliente não encontrado com o ID: " + idCliente);
                return;
            }
        }

        // Consulta na tabela destinatario
        pstDestinatario.setInt(1, idCliente);
        try (ResultSet rsDestinatario = pstDestinatario.executeQuery()) {
            if (rsDestinatario.next()) {
                // Preenche os campos de texto com as informações do destinatário
                JTFnomedestinatario11.setText(rsDestinatario.getString("destinatario"));
                JTFtelefonedestinatario11.setText(rsDestinatario.getString("telefone_destinatario"));
                JTFenderecodestinatario11.setText(
                    rsDestinatario.getString("rua_destinatario") + ", " +
                    rsDestinatario.getString("numero_destinatario") + ", " +
                    rsDestinatario.getString("bairro_destinatario") + ", " +
                    rsDestinatario.getString("cidade_destinatario") + " - " +
                    rsDestinatario.getString("estado_destinatario") + ", " +
                    rsDestinatario.getString("cep_destinatario")
                );
                JTFcarga11.setText(rsDestinatario.getString("opcao_selecionada"));
            } else {
                // Mostra uma mensagem de erro se o destinatário não for encontrado
                JOptionPane.showMessageDialog(this, "Destinatário não encontrado com o ID: " + idCliente);
                return;
            }
        }

        // Consulta na tabela calculo_frete
        pstCalculoFrete.setInt(1, idCliente);
        try (ResultSet rsCalculoFrete = pstCalculoFrete.executeQuery()) {
            if (rsCalculoFrete.next()) {
                // Preenche os campos de texto com as informações do cálculo de frete
                JTFpeso11.setText(rsCalculoFrete.getString("peso"));
                JTFcidadeorigem11.setText(rsCalculoFrete.getString("cidade_origem"));
                JTFcidadedestino11.setText(rsCalculoFrete.getString("cidade_destino"));
                JTFvalor11.setText(rsCalculoFrete.getString("valor"));
            } else {
                // Mostra uma mensagem de erro se o cálculo de frete não for encontrado
                JOptionPane.showMessageDialog(this, "Cálculo de frete não encontrado com o ID: " + idCliente);
            }
        }

    } catch (SQLException e) {
        // Mostra uma mensagem de erro se ocorrer um problema ao acessar o banco de dados
        System.out.println("Erro ao buscar informações: " + e.getMessage());
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

        JPNfundo11 = new javax.swing.JPanel();
        JPNdetalhesdeencomenda11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JLBmotoconnect11 = new javax.swing.JLabel();
        JLBnomecompleto11 = new javax.swing.JLabel();
        JLBcep11 = new javax.swing.JLabel();
        JLBenderecocompleto11 = new javax.swing.JLabel();
        JLBtelefone11 = new javax.swing.JLabel();
        JLBemail11 = new javax.swing.JLabel();
        JLBnumerodopedido11 = new javax.swing.JLabel();
        JLBpeso11 = new javax.swing.JLabel();
        JLBvalor11 = new javax.swing.JLabel();
        JLBcarga11 = new javax.swing.JLabel();
        JLBdestinatario11 = new javax.swing.JLabel();
        JLBtelefonedestinatario11 = new javax.swing.JLabel();
        JLBenderecodestinatario11 = new javax.swing.JLabel();
        JPNcliente11 = new javax.swing.JPanel();
        JLBcliente11 = new javax.swing.JLabel();
        JPNmercadoria11 = new javax.swing.JPanel();
        JLBmercadoria11 = new javax.swing.JLabel();
        JPNdestinatario11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        JTFnomecompleto11 = new javax.swing.JTextField();
        JTFcpf11 = new javax.swing.JTextField();
        JTFtelefone11 = new javax.swing.JTextField();
        JTFenderecocompleto11 = new javax.swing.JTextField();
        JTFemail11 = new javax.swing.JTextField();
        JTFcidadeorigem11 = new javax.swing.JTextField();
        JTFpeso11 = new javax.swing.JTextField();
        JTFvalor11 = new javax.swing.JTextField();
        JTFcarga11 = new javax.swing.JTextField();
        JTFnomedestinatario11 = new javax.swing.JTextField();
        JTFtelefonedestinatario11 = new javax.swing.JTextField();
        JTFenderecodestinatario11 = new javax.swing.JTextField();
        JBTvoltar11 = new javax.swing.JButton();
        JBTpesquisar11 = new javax.swing.JButton();
        JBTmenu11 = new javax.swing.JButton();
        JTFnumeroPedido11 = new javax.swing.JTextField();
        JLBcpf11 = new javax.swing.JLabel();
        JLBcidadedestino11 = new javax.swing.JLabel();
        JTFcidadedestino11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNfundo11.setBackground(new java.awt.Color(0, 51, 204));
        JPNfundo11.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNdetalhesdeencomenda11.setBackground(new java.awt.Color(0, 102, 255));
        JPNdetalhesdeencomenda11.setPreferredSize(new java.awt.Dimension(844, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Detalhes da encomenda");

        javax.swing.GroupLayout JPNdetalhesdeencomenda11Layout = new javax.swing.GroupLayout(JPNdetalhesdeencomenda11);
        JPNdetalhesdeencomenda11.setLayout(JPNdetalhesdeencomenda11Layout);
        JPNdetalhesdeencomenda11Layout.setHorizontalGroup(
            JPNdetalhesdeencomenda11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNdetalhesdeencomenda11Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPNdetalhesdeencomenda11Layout.setVerticalGroup(
            JPNdetalhesdeencomenda11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNdetalhesdeencomenda11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JLBmotoconnect11.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\MotoConnect_Projeto\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\motoqueiro.png")); // NOI18N

        JLBnomecompleto11.setForeground(new java.awt.Color(255, 255, 255));
        JLBnomecompleto11.setText("Nome completo:");

        JLBcep11.setForeground(new java.awt.Color(255, 255, 255));
        JLBcep11.setText("CPF:");

        JLBenderecocompleto11.setForeground(new java.awt.Color(255, 255, 255));
        JLBenderecocompleto11.setText("Endereço completo:");

        JLBtelefone11.setForeground(new java.awt.Color(255, 255, 255));
        JLBtelefone11.setText("Telefone:");

        JLBemail11.setForeground(new java.awt.Color(255, 255, 255));
        JLBemail11.setText("E-Mail:");

        JLBnumerodopedido11.setForeground(new java.awt.Color(255, 255, 255));
        JLBnumerodopedido11.setText("Cidade de origem");

        JLBpeso11.setForeground(new java.awt.Color(255, 255, 255));
        JLBpeso11.setText("Peso Mercadoria:");

        JLBvalor11.setForeground(new java.awt.Color(255, 255, 255));
        JLBvalor11.setText("Valor do frete:");

        JLBcarga11.setForeground(new java.awt.Color(255, 255, 255));
        JLBcarga11.setText("Tipo de carga:");

        JLBdestinatario11.setForeground(new java.awt.Color(255, 255, 255));
        JLBdestinatario11.setText("Nome destinatario:");

        JLBtelefonedestinatario11.setForeground(new java.awt.Color(255, 255, 255));
        JLBtelefonedestinatario11.setText("Telefone destinatario:");

        JLBenderecodestinatario11.setForeground(new java.awt.Color(255, 255, 255));
        JLBenderecodestinatario11.setText("Endereço completo:");

        JPNcliente11.setBackground(new java.awt.Color(0, 102, 255));

        JLBcliente11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBcliente11.setForeground(new java.awt.Color(255, 255, 255));
        JLBcliente11.setText("Cliente");

        javax.swing.GroupLayout JPNcliente11Layout = new javax.swing.GroupLayout(JPNcliente11);
        JPNcliente11.setLayout(JPNcliente11Layout);
        JPNcliente11Layout.setHorizontalGroup(
            JPNcliente11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNcliente11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLBcliente11)
                .addContainerGap())
        );
        JPNcliente11Layout.setVerticalGroup(
            JPNcliente11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNcliente11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLBcliente11)
                .addContainerGap())
        );

        JPNmercadoria11.setBackground(new java.awt.Color(0, 102, 255));

        JLBmercadoria11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBmercadoria11.setForeground(new java.awt.Color(255, 255, 255));
        JLBmercadoria11.setText("Mercadoria");

        javax.swing.GroupLayout JPNmercadoria11Layout = new javax.swing.GroupLayout(JPNmercadoria11);
        JPNmercadoria11.setLayout(JPNmercadoria11Layout);
        JPNmercadoria11Layout.setHorizontalGroup(
            JPNmercadoria11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNmercadoria11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBmercadoria11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPNmercadoria11Layout.setVerticalGroup(
            JPNmercadoria11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNmercadoria11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLBmercadoria11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPNdestinatario11.setBackground(new java.awt.Color(0, 102, 255));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Destinatario");

        javax.swing.GroupLayout JPNdestinatario11Layout = new javax.swing.GroupLayout(JPNdestinatario11);
        JPNdestinatario11.setLayout(JPNdestinatario11Layout);
        JPNdestinatario11Layout.setHorizontalGroup(
            JPNdestinatario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNdestinatario11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPNdestinatario11Layout.setVerticalGroup(
            JPNdestinatario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNdestinatario11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTFnomecompleto11.setBackground(new java.awt.Color(204, 204, 204));
        JTFnomecompleto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomecompleto11ActionPerformed(evt);
            }
        });

        JTFcpf11.setBackground(new java.awt.Color(204, 204, 204));
        JTFcpf11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcpf11ActionPerformed(evt);
            }
        });

        JTFtelefone11.setBackground(new java.awt.Color(204, 204, 204));
        JTFtelefone11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFtelefone11ActionPerformed(evt);
            }
        });

        JTFenderecocompleto11.setBackground(new java.awt.Color(204, 204, 204));
        JTFenderecocompleto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFenderecocompleto11ActionPerformed(evt);
            }
        });

        JTFemail11.setBackground(new java.awt.Color(204, 204, 204));
        JTFemail11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFemail11ActionPerformed(evt);
            }
        });

        JTFcidadeorigem11.setBackground(new java.awt.Color(204, 204, 204));
        JTFcidadeorigem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcidadeorigem11ActionPerformed(evt);
            }
        });

        JTFpeso11.setBackground(new java.awt.Color(204, 204, 204));
        JTFpeso11.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTFpeso11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFpeso11ActionPerformed(evt);
            }
        });

        JTFvalor11.setBackground(new java.awt.Color(204, 204, 204));
        JTFvalor11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFvalor11ActionPerformed(evt);
            }
        });

        JTFcarga11.setBackground(new java.awt.Color(204, 204, 204));
        JTFcarga11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcarga11ActionPerformed(evt);
            }
        });

        JTFnomedestinatario11.setBackground(new java.awt.Color(204, 204, 204));
        JTFnomedestinatario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomedestinatario11ActionPerformed(evt);
            }
        });

        JTFtelefonedestinatario11.setBackground(new java.awt.Color(204, 204, 204));
        JTFtelefonedestinatario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFtelefonedestinatario11ActionPerformed(evt);
            }
        });

        JTFenderecodestinatario11.setBackground(new java.awt.Color(204, 204, 204));
        JTFenderecodestinatario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFenderecodestinatario11ActionPerformed(evt);
            }
        });

        JBTvoltar11.setBackground(new java.awt.Color(255, 51, 51));
        JBTvoltar11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTvoltar11.setForeground(new java.awt.Color(255, 255, 255));
        JBTvoltar11.setText("VOLTAR");
        JBTvoltar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTvoltar11ActionPerformed(evt);
            }
        });

        JBTpesquisar11.setBackground(new java.awt.Color(255, 51, 51));
        JBTpesquisar11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTpesquisar11.setForeground(new java.awt.Color(255, 255, 255));
        JBTpesquisar11.setText("PESQUISAR");
        JBTpesquisar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTpesquisar11ActionPerformed(evt);
            }
        });

        JBTmenu11.setBackground(new java.awt.Color(255, 51, 51));
        JBTmenu11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTmenu11.setForeground(new java.awt.Color(255, 255, 255));
        JBTmenu11.setText("MENU");
        JBTmenu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTmenu11ActionPerformed(evt);
            }
        });

        JTFnumeroPedido11.setBackground(new java.awt.Color(204, 204, 204));

        JLBcpf11.setForeground(new java.awt.Color(255, 255, 255));
        JLBcpf11.setText("Numero pedido:");

        JLBcidadedestino11.setForeground(new java.awt.Color(255, 255, 255));
        JLBcidadedestino11.setText("Cidade de destino:");

        JTFcidadedestino11.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout JPNfundo11Layout = new javax.swing.GroupLayout(JPNfundo11);
        JPNfundo11.setLayout(JPNfundo11Layout);
        JPNfundo11Layout.setHorizontalGroup(
            JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(JLBmotoconnect11, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNfundo11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPNdetalhesdeencomenda11, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(JPNfundo11Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(JLBcpf11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFnumeroPedido11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(JPNfundo11Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNfundo11Layout.createSequentialGroup()
                        .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPNfundo11Layout.createSequentialGroup()
                                    .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLBnomecompleto11)
                                        .addComponent(JLBcep11))
                                    .addGap(28, 28, 28)
                                    .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTFcpf11, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                        .addComponent(JTFnomecompleto11)))
                                .addGroup(JPNfundo11Layout.createSequentialGroup()
                                    .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JPNfundo11Layout.createSequentialGroup()
                                            .addComponent(JLBcidadedestino11)
                                            .addGap(18, 18, 18)
                                            .addComponent(JTFcidadedestino11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(JPNfundo11Layout.createSequentialGroup()
                                            .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(JPNfundo11Layout.createSequentialGroup()
                                                    .addComponent(JPNcliente11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(52, 52, 52))
                                                .addComponent(JLBvalor11, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(12, 12, 12)
                                            .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(JTFcarga11)
                                                .addComponent(JTFvalor11, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)))
                                        .addGroup(JPNfundo11Layout.createSequentialGroup()
                                            .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JLBenderecocompleto11)
                                                .addComponent(JLBtelefone11)
                                                .addComponent(JLBemail11)
                                                .addComponent(JLBpeso11)
                                                .addComponent(JLBnumerodopedido11))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JTFcidadeorigem11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTFpeso11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTFemail11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTFtelefone11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTFenderecocompleto11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(JBTmenu11))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(JPNfundo11Layout.createSequentialGroup()
                                .addComponent(JLBcarga11)
                                .addGap(377, 377, 377)))
                        .addGap(18, 18, 18)
                        .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPNdestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPNfundo11Layout.createSequentialGroup()
                                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBenderecodestinatario11)
                                    .addComponent(JLBdestinatario11)
                                    .addComponent(JLBtelefonedestinatario11))
                                .addGap(18, 18, 18)
                                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JTFtelefonedestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTFnomedestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTFenderecodestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JBTvoltar11)))
                            .addComponent(JBTpesquisar11)))
                    .addComponent(JPNmercadoria11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        JPNfundo11Layout.setVerticalGroup(
            JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBmotoconnect11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPNfundo11Layout.createSequentialGroup()
                        .addComponent(JPNdetalhesdeencomenda11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFnumeroPedido11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBcpf11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBTpesquisar11)))
                .addGap(17, 17, 17)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPNcliente11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPNdestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBnomecompleto11)
                    .addComponent(JLBdestinatario11)
                    .addComponent(JTFnomecompleto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnomedestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBcep11)
                    .addComponent(JLBtelefonedestinatario11)
                    .addComponent(JTFcpf11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFtelefonedestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBenderecocompleto11)
                    .addComponent(JLBenderecodestinatario11)
                    .addComponent(JTFenderecocompleto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFenderecodestinatario11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBtelefone11)
                    .addComponent(JTFtelefone11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBemail11)
                    .addComponent(JTFemail11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(JPNmercadoria11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBpeso11)
                    .addComponent(JTFpeso11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBnumerodopedido11)
                    .addComponent(JTFcidadeorigem11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcidadedestino11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBcidadedestino11))
                .addGap(9, 9, 9)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFvalor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBvalor11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcarga11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBcarga11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPNfundo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTvoltar11)
                    .addComponent(JBTmenu11))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPNfundo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPNfundo11, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTvoltar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTvoltar11ActionPerformed
        Tela_Detalhes_Encomenda.this.dispose();
        Tela_Menu JBTvoltar11 = new Tela_Menu();
        JBTvoltar11.setVisible(true);
    }//GEN-LAST:event_JBTvoltar11ActionPerformed

    private void JBTmenu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTmenu11ActionPerformed
        Tela_Detalhes_Encomenda.this.dispose();
        Tela_Menu JBTmenu11 = new Tela_Menu();
        JBTmenu11.setVisible(true);
    }//GEN-LAST:event_JBTmenu11ActionPerformed

    private void JBTpesquisar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTpesquisar11ActionPerformed
      // Obtém o ID do cliente do campo de texto JTFnumeroPedido11 e converte para inteiro
    int idCliente = Integer.parseInt(JTFnumeroPedido11.getText());
    
    // Chama a função para pesquisar o cliente baseado no ID fornecido
    pesquisarCliente(idCliente);
    }//GEN-LAST:event_JBTpesquisar11ActionPerformed

    private void JTFnomecompleto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomecompleto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnomecompleto11ActionPerformed

    private void JTFcpf11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcpf11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcpf11ActionPerformed

    private void JTFenderecocompleto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFenderecocompleto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFenderecocompleto11ActionPerformed

    private void JTFtelefone11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFtelefone11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFtelefone11ActionPerformed

    private void JTFemail11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFemail11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFemail11ActionPerformed

    private void JTFcidadeorigem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcidadeorigem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcidadeorigem11ActionPerformed

    private void JTFpeso11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFpeso11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFpeso11ActionPerformed

    private void JTFvalor11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFvalor11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFvalor11ActionPerformed

    private void JTFcarga11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcarga11ActionPerformed
        
    }//GEN-LAST:event_JTFcarga11ActionPerformed

    private void JTFnomedestinatario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomedestinatario11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnomedestinatario11ActionPerformed

    private void JTFtelefonedestinatario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFtelefonedestinatario11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFtelefonedestinatario11ActionPerformed

    private void JTFenderecodestinatario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFenderecodestinatario11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFenderecodestinatario11ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Detalhes_Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Detalhes_Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Detalhes_Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Detalhes_Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Detalhes_Encomenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTmenu11;
    private javax.swing.JButton JBTpesquisar11;
    private javax.swing.JButton JBTvoltar11;
    private javax.swing.JLabel JLBcarga11;
    private javax.swing.JLabel JLBcep11;
    private javax.swing.JLabel JLBcidadedestino11;
    private javax.swing.JLabel JLBcliente11;
    private javax.swing.JLabel JLBcpf11;
    private javax.swing.JLabel JLBdestinatario11;
    private javax.swing.JLabel JLBemail11;
    private javax.swing.JLabel JLBenderecocompleto11;
    private javax.swing.JLabel JLBenderecodestinatario11;
    private javax.swing.JLabel JLBmercadoria11;
    private javax.swing.JLabel JLBmotoconnect11;
    private javax.swing.JLabel JLBnomecompleto11;
    private javax.swing.JLabel JLBnumerodopedido11;
    private javax.swing.JLabel JLBpeso11;
    private javax.swing.JLabel JLBtelefone11;
    private javax.swing.JLabel JLBtelefonedestinatario11;
    private javax.swing.JLabel JLBvalor11;
    private javax.swing.JPanel JPNcliente11;
    private javax.swing.JPanel JPNdestinatario11;
    private javax.swing.JPanel JPNdetalhesdeencomenda11;
    private javax.swing.JPanel JPNfundo11;
    private javax.swing.JPanel JPNmercadoria11;
    private javax.swing.JTextField JTFcarga11;
    private javax.swing.JTextField JTFcidadedestino11;
    private javax.swing.JTextField JTFcidadeorigem11;
    private javax.swing.JTextField JTFcpf11;
    private javax.swing.JTextField JTFemail11;
    private javax.swing.JTextField JTFenderecocompleto11;
    private javax.swing.JTextField JTFenderecodestinatario11;
    private javax.swing.JTextField JTFnomecompleto11;
    private javax.swing.JTextField JTFnomedestinatario11;
    private javax.swing.JTextField JTFnumeroPedido11;
    private javax.swing.JTextField JTFpeso11;
    private javax.swing.JTextField JTFtelefone11;
    private javax.swing.JTextField JTFtelefonedestinatario11;
    private javax.swing.JTextField JTFvalor11;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    // End of variables declaration//GEN-END:variables
}
