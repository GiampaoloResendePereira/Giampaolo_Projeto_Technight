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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author PC
 */
public class Tela_Lista_Encomendas extends javax.swing.JFrame {
    
    
    

    /**
     * Creates new form Tela_Lista_Encomendas
     */
    public Tela_Lista_Encomendas() {
        initComponents();
        // Ao iniciar, atualiza a tabela com os dados do banco de dados
        atualizarTabela(1);
        
    }
    /**
     * Método para obter a conexão com o banco de dados MySQL.
     * 
     * @return A conexão com o banco de dados.
     */
    private void pesquisarTabela(int idEncomenda) {
    String sql = "SELECT e.id_encomenda, e.id_entregador, e.numero_pedido, e.id_statuss " +
                 "FROM encomendas e " +
                 "WHERE e.id_encomenda = ?";

    String sqlEntregador = "SELECT nome, sobrenome " +
                           "FROM entregador " +
                           "WHERE id_entregador = ?";

    String sqlStatus = "SELECT data_entrega, statuss " +
                       "FROM statuss " +
                       "WHERE id_statuss = ?";

    String sqlCalculoFrete = "SELECT cidade_origem, cidade_destino " +
                             "FROM calculo_frete " +
                             "WHERE numero_pedido = ?";

    try (Connection con = DatabaseConnection.getConnection();
         PreparedStatement pst = con.prepareStatement(sql);
         PreparedStatement pstEntregador = con.prepareStatement(sqlEntregador);
         PreparedStatement pstStatus = con.prepareStatement(sqlStatus);
         PreparedStatement pstCalculoFrete = con.prepareStatement(sqlCalculoFrete)) {

        // Consulta na tabela encomendas
        pst.setInt(1, idEncomenda);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idEntregador = rs.getInt("id_entregador");
            int numeroPedido = rs.getInt("numero_pedido");
            int idStatus = rs.getInt("id_statuss");

            // Consulta na tabela entregador
            pstEntregador.setInt(1, idEntregador);
            ResultSet rsEntregador = pstEntregador.executeQuery();
            if (rsEntregador.next()) {
                // Preenche os campos de texto com as informações do entregador
                JTFentregador10.setText(rsEntregador.getString("nome") + " " + rsEntregador.getString("sobrenome"));
            } else {
                JOptionPane.showMessageDialog(this, "Entregador não encontrado com o ID: " + idEntregador);
                return;
            }

            // Consulta na tabela statuss
            pstStatus.setInt(1, idStatus);
            ResultSet rsStatus = pstStatus.executeQuery();
            if (rsStatus.next()) {
                // Preenche os campos de texto com as informações do status
                JTFdata10.setText(rsStatus.getString("data_entrega"));
                JTFstatus10.setText(rsStatus.getString("statuss"));
            } else {
                JOptionPane.showMessageDialog(this, "Status não encontrado com o ID: " + idStatus);
                return;
            }

            // Consulta na tabela calculo_frete
            pstCalculoFrete.setInt(1, numeroPedido);
            ResultSet rsCalculoFrete = pstCalculoFrete.executeQuery();
            if (rsCalculoFrete.next()) {
                // Preenche os campos de texto com as informações do cálculo de frete
                JTFcidadeorigem10.setText(rsCalculoFrete.getString("cidade_origem"));
                JTFcidadedestino10.setText(rsCalculoFrete.getString("cidade_destino"));
            } else {
                JOptionPane.showMessageDialog(this, "Cálculo de frete não encontrado para o número do pedido: " + numeroPedido);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Encomenda não encontrada com o ID: " + idEncomenda);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar informações da encomenda: " + e.getMessage());
    }
}


    
    
    private Connection getDatabaseConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/crud"; // URL do banco de dados
            String username = "root"; // Nome de usuário do MySQL
            String password = ""; // Senha do MySQL
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }

    /**
     * Constrói um modelo de tabela a partir de um ResultSet.
     * 
     * @param rs O ResultSet contendo os dados a serem exibidos na tabela.
     * @return O DefaultTableModel construído com os dados do ResultSet.
     * @throws SQLException
     */
    private DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
    // Definindo os nomes das colunas da tabela
    String[] columnNames = {"Numero da encomenda", "Cidade origem", "Nome completo", "Cidade destino", "Data e hora", "Status"};
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(columnNames);

    // Preenchendo o modelo com os dados do ResultSet
    while (rs.next()) {
        // Recuperando os dados do ResultSet para cada coluna
        int idEncomenda = rs.getInt("id_encomenda");
        String cidadeOrigem = rs.getString("cidade_origem");
        String nomeCompleto = rs.getString("nome") + " " + rs.getString("sobrenome");
        String cidadeDestino = rs.getString("cidade_destino");
        String dataHora = rs.getString("data_entrega");
        String status = rs.getString("statuss");

        // Criando um array de objetos com os dados da linha
        Object[] rowData = {idEncomenda, cidadeOrigem, nomeCompleto, cidadeDestino, dataHora, status};
        
        // Adicionando a linha ao modelo da tabela
        model.addRow(rowData);
    }
    return model;
}


    /**
     * Atualiza a tabela de encomendas com os dados do banco de dados.
     */
    private void atualizarTabela(int idEncomenda) {
    // Consultas SQL para buscar informações da encomenda
    String sqlEncomenda = "SELECT e.id_encomenda, e.id_entregador, e.numero_pedido, e.id_statuss " +
                          "FROM encomendas e " +
                          "WHERE e.id_encomenda = ?";

    String sqlEntregador = "SELECT nome, sobrenome " +
                           "FROM entregador " +
                           "WHERE id_entregador = ?";

    String sqlStatus = "SELECT data_entrega, statuss " +
                       "FROM statuss " +
                       "WHERE id_statuss = ?";

    String sqlCalculoFrete = "SELECT cidade_origem, cidade_destino " +
                             "FROM calculo_frete " +
                             "WHERE numero_pedido = ?";

    try (Connection conexao = getDatabaseConnection();
         PreparedStatement pstEncomenda = conexao.prepareStatement(sqlEncomenda);
         PreparedStatement pstEntregador = conexao.prepareStatement(sqlEntregador);
         PreparedStatement pstStatus = conexao.prepareStatement(sqlStatus);
         PreparedStatement pstCalculoFrete = conexao.prepareStatement(sqlCalculoFrete)) {

        // Consulta na tabela encomendas
        pstEncomenda.setInt(1, idEncomenda);
        ResultSet rsEncomenda = pstEncomenda.executeQuery();
        if (rsEncomenda.next()) {
            int idEntregador = rsEncomenda.getInt("id_entregador");
            int numeroPedido = rsEncomenda.getInt("numero_pedido");
            int idStatus = rsEncomenda.getInt("id_statuss");

            // Consulta na tabela entregador
            pstEntregador.setInt(1, idEntregador);
            ResultSet rsEntregador = pstEntregador.executeQuery();
            if (rsEntregador.next()) {
                String nomeEntregador = rsEntregador.getString("nome");
                String sobrenomeEntregador = rsEntregador.getString("sobrenome");

                // Consulta na tabela statuss
                pstStatus.setInt(1, idStatus);
                ResultSet rsStatus = pstStatus.executeQuery();
                if (rsStatus.next()) {
                    String dataEntrega = rsStatus.getString("data_entrega");
                    String status = rsStatus.getString("statuss");

                    // Consulta na tabela calculo_frete
                    pstCalculoFrete.setInt(1, numeroPedido);
                    ResultSet rsCalculoFrete = pstCalculoFrete.executeQuery();
                    if (rsCalculoFrete.next()) {
                        String cidadeOrigem = rsCalculoFrete.getString("cidade_origem");
                        String cidadeDestino = rsCalculoFrete.getString("cidade_destino");

                        // Preenche os campos da tabela com os dados obtidos
                        JTFentregador10.setText(nomeEntregador + " " + sobrenomeEntregador);
                        JTFdata10.setText(dataEntrega);
                        JTFstatus10.setText(status);
                        JTFcidadeorigem10.setText(cidadeOrigem);
                        JTFcidadedestino10.setText(cidadeDestino);

                    } else {
                        JOptionPane.showMessageDialog(null, "Cálculo de frete não encontrado para o número de pedido: " + numeroPedido);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Status não encontrado para o ID: " + idStatus);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Entregador não encontrado para o ID: " + idEntregador);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Encomenda não encontrada para o ID: " + idEncomenda);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " + e.getMessage());
    }
}


    /**
     * Limpa os campos de texto na interface gráfica.
     */
    private void limparCampos() {
    JTFnumero10.setText("");
    JTFcidadeorigem10.setText("");
    JTFcidadedestino10.setText("");
    JTFstatus10.setText("");
    JTFentregador10.setText("");
    JTFdata10.setText("");
}

    
    
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPNfundo10 = new javax.swing.JPanel();
        JPNlista10 = new javax.swing.JPanel();
        JLBlista10 = new javax.swing.JLabel();
        JSPtabela10 = new javax.swing.JScrollPane();
        JTBtabela10 = new javax.swing.JTable();
        JTBatualizar10 = new javax.swing.JButton();
        JTBvoltar10 = new javax.swing.JButton();
        JPNtabelaencomenda10 = new javax.swing.JPanel();
        JLBtabelaencomenda10 = new javax.swing.JLabel();
        JLBmotoconnect10 = new javax.swing.JLabel();
        JTFnumero10 = new javax.swing.JTextField();
        JTFdata10 = new javax.swing.JTextField();
        JTFstatus10 = new javax.swing.JTextField();
        JLBnumero10 = new javax.swing.JLabel();
        JLBdata10 = new javax.swing.JLabel();
        JLBstatus10 = new javax.swing.JLabel();
        JTBexcluir10 = new javax.swing.JButton();
        JTFcidadedestino10 = new javax.swing.JTextField();
        JTFentregador10 = new javax.swing.JTextField();
        JTFcidadeorigem10 = new javax.swing.JTextField();
        JLBcidadeorigem10 = new javax.swing.JLabel();
        JLBentregador10 = new javax.swing.JLabel();
        JLBcidadedestino10 = new javax.swing.JLabel();
        JBTeditar10 = new javax.swing.JButton();
        JBTpesquisar10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNfundo10.setBackground(new java.awt.Color(0, 0, 204));
        JPNfundo10.setPreferredSize(new java.awt.Dimension(1000, 600));

        JPNlista10.setBackground(new java.awt.Color(0, 102, 255));
        JPNlista10.setPreferredSize(new java.awt.Dimension(844, 30));

        JLBlista10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBlista10.setForeground(new java.awt.Color(255, 255, 255));
        JLBlista10.setText("Lista de encomendas");

        javax.swing.GroupLayout JPNlista10Layout = new javax.swing.GroupLayout(JPNlista10);
        JPNlista10.setLayout(JPNlista10Layout);
        JPNlista10Layout.setHorizontalGroup(
            JPNlista10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNlista10Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(JLBlista10)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        JPNlista10Layout.setVerticalGroup(
            JPNlista10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNlista10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBlista10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JTBtabela10.setBackground(new java.awt.Color(255, 51, 51));
        JTBtabela10.setForeground(new java.awt.Color(255, 255, 255));
        JTBtabela10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero da encomenda", "Cidade origem", "Nome completo", "Cidade destino", "Data e hora", "Status"
            }
        ));
        JTBtabela10.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTBtabela10AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JSPtabela10.setViewportView(JTBtabela10);

        JTBatualizar10.setBackground(new java.awt.Color(255, 51, 51));
        JTBatualizar10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTBatualizar10.setForeground(new java.awt.Color(255, 255, 255));
        JTBatualizar10.setText("ATUALIZAR ");
        JTBatualizar10.setMaximumSize(new java.awt.Dimension(106, 25));
        JTBatualizar10.setPreferredSize(new java.awt.Dimension(106, 25));
        JTBatualizar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBatualizar10ActionPerformed(evt);
            }
        });

        JTBvoltar10.setBackground(new java.awt.Color(255, 51, 51));
        JTBvoltar10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTBvoltar10.setForeground(new java.awt.Color(255, 255, 255));
        JTBvoltar10.setText("VOLTAR");
        JTBvoltar10.setMaximumSize(new java.awt.Dimension(106, 25));
        JTBvoltar10.setPreferredSize(new java.awt.Dimension(106, 25));
        JTBvoltar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBvoltar10ActionPerformed(evt);
            }
        });

        JPNtabelaencomenda10.setBackground(new java.awt.Color(255, 0, 51));

        JLBtabelaencomenda10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLBtabelaencomenda10.setForeground(new java.awt.Color(255, 255, 255));
        JLBtabelaencomenda10.setText("Tabela encomendas");

        javax.swing.GroupLayout JPNtabelaencomenda10Layout = new javax.swing.GroupLayout(JPNtabelaencomenda10);
        JPNtabelaencomenda10.setLayout(JPNtabelaencomenda10Layout);
        JPNtabelaencomenda10Layout.setHorizontalGroup(
            JPNtabelaencomenda10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNtabelaencomenda10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBtabelaencomenda10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPNtabelaencomenda10Layout.setVerticalGroup(
            JPNtabelaencomenda10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNtabelaencomenda10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBtabelaencomenda10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JLBmotoconnect10.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\MotoConnect_Projeto\\Giampaolo_Projeto_Technight\\MotoConnect\\src\\main\\java\\imagem_login\\motoqueiro.png")); // NOI18N

        JTFnumero10.setBackground(new java.awt.Color(204, 204, 204));

        JTFdata10.setBackground(new java.awt.Color(204, 204, 204));

        JTFstatus10.setBackground(new java.awt.Color(204, 204, 204));

        JLBnumero10.setForeground(new java.awt.Color(255, 255, 255));
        JLBnumero10.setText("Numero da encomenda:");

        JLBdata10.setForeground(new java.awt.Color(255, 255, 255));
        JLBdata10.setText("Data e hora:");

        JLBstatus10.setForeground(new java.awt.Color(255, 255, 255));
        JLBstatus10.setText("Status:");

        JTBexcluir10.setBackground(new java.awt.Color(255, 51, 51));
        JTBexcluir10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTBexcluir10.setForeground(new java.awt.Color(255, 255, 255));
        JTBexcluir10.setText("EXCLUIR");
        JTBexcluir10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBexcluir10ActionPerformed(evt);
            }
        });

        JTFcidadedestino10.setBackground(new java.awt.Color(204, 204, 204));

        JTFentregador10.setBackground(new java.awt.Color(204, 204, 204));

        JTFcidadeorigem10.setBackground(new java.awt.Color(204, 204, 204));

        JLBcidadeorigem10.setForeground(new java.awt.Color(255, 255, 255));
        JLBcidadeorigem10.setText("Cidade de origem:");

        JLBentregador10.setForeground(new java.awt.Color(255, 255, 255));
        JLBentregador10.setText("Entregador:");

        JLBcidadedestino10.setForeground(new java.awt.Color(255, 255, 255));
        JLBcidadedestino10.setText("Cidade de destino:");

        JBTeditar10.setBackground(new java.awt.Color(255, 51, 51));
        JBTeditar10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTeditar10.setForeground(new java.awt.Color(255, 255, 255));
        JBTeditar10.setText("EDITAR");
        JBTeditar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTeditar10ActionPerformed(evt);
            }
        });

        JBTpesquisar10.setBackground(new java.awt.Color(255, 51, 51));
        JBTpesquisar10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBTpesquisar10.setForeground(new java.awt.Color(255, 255, 255));
        JBTpesquisar10.setText("PESQUISAR");
        JBTpesquisar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTpesquisar10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNfundo10Layout = new javax.swing.GroupLayout(JPNfundo10);
        JPNfundo10.setLayout(JPNfundo10Layout);
        JPNfundo10Layout.setHorizontalGroup(
            JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNfundo10Layout.createSequentialGroup()
                        .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPNfundo10Layout.createSequentialGroup()
                                .addComponent(JTBatualizar10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTBexcluir10)
                                .addGap(18, 18, 18)
                                .addComponent(JBTeditar10)
                                .addGap(18, 18, 18)
                                .addComponent(JBTpesquisar10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTBvoltar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JPNtabelaencomenda10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPNfundo10Layout.createSequentialGroup()
                                .addComponent(JLBmotoconnect10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JPNlista10, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JSPtabela10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(173, 173, 173))
                    .addGroup(JPNfundo10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLBnumero10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFnumero10))
                        .addGap(33, 33, 33)
                        .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBcidadeorigem10)
                            .addComponent(JTFentregador10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBentregador10)
                            .addComponent(JTFcidadeorigem10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBcidadedestino10)
                            .addComponent(JTFcidadedestino10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBdata10)
                            .addComponent(JTFdata10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFstatus10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBstatus10))
                        .addGap(192, 192, 192))))
        );
        JPNfundo10Layout.setVerticalGroup(
            JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNfundo10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPNlista10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBmotoconnect10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(JPNtabelaencomenda10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JSPtabela10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBnumero10)
                    .addComponent(JLBdata10)
                    .addComponent(JLBstatus10)
                    .addComponent(JLBcidadeorigem10)
                    .addComponent(JLBentregador10)
                    .addComponent(JLBcidadedestino10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnumero10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFdata10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFstatus10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcidadedestino10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFentregador10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcidadeorigem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(JPNfundo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTBatualizar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTBvoltar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTBexcluir10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTeditar10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTpesquisar10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNfundo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNfundo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTBvoltar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBvoltar10ActionPerformed
        // Fecha a janela atual
        Tela_Lista_Encomendas.this.dispose();
        // Abre a tela do menu principal
        Tela_Menu telaMenu = new Tela_Menu();
        telaMenu.setVisible(true);
    }//GEN-LAST:event_JTBvoltar10ActionPerformed

    private void JTBtabela10AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTBtabela10AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JTBtabela10AncestorAdded

    private void JTBatualizar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBatualizar10ActionPerformed
    // Exemplo de chamada para atualizar a tabela com informações da encomenda de ID 1
    atualizarTabela(1);

    }//GEN-LAST:event_JTBatualizar10ActionPerformed

    private void JTBexcluir10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBexcluir10ActionPerformed
    // Obtém o número do pedido digitado
    String numeroPedidoStr = JTFnumero10.getText().trim();

    // Verifica se o campo do número do pedido não está vazio
    if (!numeroPedidoStr.isEmpty()) {
        int numeroPedido = Integer.parseInt(numeroPedidoStr);
        // Confirmação para excluir o pedido
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o pedido " + numeroPedido + "?");

        // Se o usuário confirmar a exclusão
        if (confirmacao == JOptionPane.YES_OPTION) {
            try (Connection conexao = getDatabaseConnection()) {
                // Query SQL para deletar a encomenda
                String sqlDelete = "DELETE FROM encomendas WHERE id_encomenda = ?";
                try (PreparedStatement statement = conexao.prepareStatement(sqlDelete)) {
                    // Define o parâmetro da query
                    statement.setInt(1, numeroPedido);
                    // Executa a query de deleção
                    int rowsDeleted = statement.executeUpdate();

                    // Verifica se a deleção foi bem sucedida
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(null, "Pedido excluído com sucesso!");
                        limparCampos(); // Limpa os campos de texto
                        // Exemplo de chamada para atualizar a tabela com informações da encomenda de ID 1
                        atualizarTabela(1);

                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao excluir pedido.");
                    }
                }
            } catch (NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir pedido: " + ex.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Digite um número de pedido para excluir.");
    }
    }//GEN-LAST:event_JTBexcluir10ActionPerformed

    private void JBTeditar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTeditar10ActionPerformed
       // Obtém o número do pedido digitado
    String numeroPedidoStr = JTFnumero10.getText().trim();

    // Verifica se o campo do número do pedido não está vazio
    if (!numeroPedidoStr.isEmpty()) {
        try {
            int numeroPedido = Integer.parseInt(numeroPedidoStr);

            // Query SQL para buscar os dados da encomenda pelo número do pedido
            String sqlSelect = "SELECT cidade_origem, cidade_destino, statuss FROM encomendas WHERE id_encomenda = ?";
            
            try (Connection conexao = getDatabaseConnection();
                 PreparedStatement statement = conexao.prepareStatement(sqlSelect)) {
                
                // Define o parâmetro da query
                statement.setInt(1, numeroPedido);
                
                // Executa a query de seleção
                try (ResultSet rs = statement.executeQuery()) {
                    // Verifica se encontrou resultados
                    if (rs.next()) {
                        // Preenche os campos de texto com os dados da encomenda
                        JTFcidadeorigem10.setText(rs.getString("cidade_origem"));
                        JTFcidadedestino10.setText(rs.getString("cidade_destino"));
                        JTFstatus10.setText(rs.getString("statuss"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Encomenda não encontrada.");
                        limparCampos(); // Limpa os campos de texto se a encomenda não for encontrada
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar encomenda: " + ex.getMessage());
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Número de pedido inválido.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Digite um número de pedido para editar.");
    }

    }//GEN-LAST:event_JBTeditar10ActionPerformed

    private void JBTpesquisar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTpesquisar10ActionPerformed
       try {
        // Obtém o ID da encomenda a partir do campo de texto JTFidEncomenda
        int idEncomenda = Integer.parseInt(JTFidEncomenda.getText().trim());

        // Chama o método para pesquisar e preencher os campos com base no ID da encomenda
        pesquisarTabela(idEncomenda);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Digite um número válido para o ID da encomenda.");
    }
    }//GEN-LAST:event_JBTpesquisar10ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Lista_Encomendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Lista_Encomendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Lista_Encomendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Lista_Encomendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Lista_Encomendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTeditar10;
    private javax.swing.JButton JBTpesquisar10;
    private javax.swing.JLabel JLBcidadedestino10;
    private javax.swing.JLabel JLBcidadeorigem10;
    private javax.swing.JLabel JLBdata10;
    private javax.swing.JLabel JLBentregador10;
    private javax.swing.JLabel JLBlista10;
    private javax.swing.JLabel JLBmotoconnect10;
    private javax.swing.JLabel JLBnumero10;
    private javax.swing.JLabel JLBstatus10;
    private javax.swing.JLabel JLBtabelaencomenda10;
    private javax.swing.JPanel JPNfundo10;
    private javax.swing.JPanel JPNlista10;
    private javax.swing.JPanel JPNtabelaencomenda10;
    private javax.swing.JScrollPane JSPtabela10;
    private javax.swing.JButton JTBatualizar10;
    private javax.swing.JButton JTBexcluir10;
    private javax.swing.JTable JTBtabela10;
    private javax.swing.JButton JTBvoltar10;
    private javax.swing.JTextField JTFcidadedestino10;
    private javax.swing.JTextField JTFcidadeorigem10;
    private javax.swing.JTextField JTFdata10;
    private javax.swing.JTextField JTFentregador10;
    private javax.swing.JTextField JTFnumero10;
    private javax.swing.JTextField JTFstatus10;
    // End of variables declaration//GEN-END:variables
}
