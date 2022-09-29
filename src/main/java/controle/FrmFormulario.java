/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

import conexao.Conexao; // importar do package a classe
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // para reconhecimento de Jtable
import java.sql.*; // para reconhecimento dos comandos SQL

public class FrmFormulario extends javax.swing.JFrame {

    Conexao con_cliente;
    
    public FrmFormulario() {
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto como instância
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
        tblClientes.setAutoCreateRowSorter(true); // ativa a classificação ordenada da tabela
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_panelazul = new javax.swing.JPanel();
        pnl_painelbranco = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_datanasc = new javax.swing.JLabel();
        lbl_telefone = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        txtNasc = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        scp_tabela = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btn_primeiro = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_registro = new javax.swing.JButton();
        btn_gravar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        lbl_pesquisa = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btn_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMULÁRIO DE CADASTRO");
        setResizable(false);

        pnl_panelazul.setBackground(new java.awt.Color(153, 204, 255));

        pnl_painelbranco.setBackground(new java.awt.Color(255, 255, 255));

        lbl_titulo.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        lbl_titulo.setText("FORMULÁRIO DE CADASTRO");

        lbl_codigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_codigo.setText("Código:");

        lbl_nome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_nome.setText("Nome:");

        lbl_datanasc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_datanasc.setText("Data Nascimento:");

        lbl_telefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_telefone.setText("Telefone:");

        lbl_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_email.setText("Email:");

        tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblClientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data Nascimento", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        tblClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClientesKeyPressed(evt);
            }
        });
        scp_tabela.setViewportView(tblClientes);

        btn_primeiro.setBackground(new java.awt.Color(153, 204, 255));
        btn_primeiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_primeiro.setText("Primeiro");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_anterior.setBackground(new java.awt.Color(153, 204, 255));
        btn_anterior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_proximo.setBackground(new java.awt.Color(153, 204, 255));
        btn_proximo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_proximo.setText("Próximo");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setBackground(new java.awt.Color(153, 204, 255));
        btn_ultimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ultimo.setText("Último");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_registro.setBackground(new java.awt.Color(153, 204, 255));
        btn_registro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registro.setText("Novo Registro");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        btn_gravar.setBackground(new java.awt.Color(153, 204, 255));
        btn_gravar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(153, 204, 255));
        btn_alterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(153, 204, 255));
        btn_excluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        lbl_pesquisa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_pesquisa.setText("Pesquisa por nome do cliente:");

        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyReleased(evt);
            }
        });

        btn_sair.setBackground(new java.awt.Color(153, 204, 255));
        btn_sair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_painelbrancoLayout = new javax.swing.GroupLayout(pnl_painelbranco);
        pnl_painelbranco.setLayout(pnl_painelbrancoLayout);
        pnl_painelbrancoLayout.setHorizontalGroup(
            pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_painelbrancoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_painelbrancoLayout.createSequentialGroup()
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_painelbrancoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                                .addComponent(lbl_datanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_telefone)
                                    .addComponent(lbl_nome)
                                    .addComponent(lbl_email)
                                    .addComponent(lbl_codigo))
                                .addGap(86, 86, 86)
                                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                                .addComponent(lbl_pesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))))
                .addGap(36, 36, 36))
            .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_primeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_proximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ultimo)
                        .addGap(28, 28, 28)
                        .addComponent(btn_registro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_gravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir))
                    .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(scp_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnl_painelbrancoLayout.setVerticalGroup(
            pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_painelbrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_datanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telefone)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_primeiro)
                    .addComponent(btn_anterior)
                    .addComponent(btn_proximo)
                    .addComponent(btn_ultimo)
                    .addComponent(btn_registro)
                    .addComponent(btn_gravar)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir))
                .addGap(23, 23, 23)
                .addComponent(scp_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_painelbrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pesquisa)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btn_sair)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout pnl_panelazulLayout = new javax.swing.GroupLayout(pnl_panelazul);
        pnl_panelazul.setLayout(pnl_panelazulLayout);
        pnl_panelazulLayout.setHorizontalGroup(
            pnl_panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_panelazulLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(pnl_painelbranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pnl_panelazulLayout.setVerticalGroup(
            pnl_panelazulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_panelazulLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(pnl_painelbranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_panelazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
    // evento que sincroniza a grid com o mouse
    int linha_selecionada = tblClientes.getSelectedRow();
    txtCod.setText(tblClientes.getValueAt(linha_selecionada, 0).toString());
    txtNome.setText(tblClientes.getValueAt(linha_selecionada, 1).toString());
    txtNasc.setText(tblClientes.getValueAt(linha_selecionada, 2).toString());
    txtFone.setText(tblClientes.getValueAt(linha_selecionada, 3).toString());
    txtEmail.setText(tblClientes.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblClientesMouseClicked

    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientesKeyPressed
       // evento que sincroniza a grid com a setas do teclado
    int linha_selecionada = tblClientes.getSelectedRow();
    txtCod.setText(tblClientes.getValueAt(linha_selecionada, 0).toString());
    txtNome.setText(tblClientes.getValueAt(linha_selecionada, 1).toString());
    txtNasc.setText(tblClientes.getValueAt(linha_selecionada, 2).toString());
    txtFone.setText(tblClientes.getValueAt(linha_selecionada, 3).toString());
    txtEmail.setText(tblClientes.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblClientesKeyPressed

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: " + erro, "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_primeiroActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
       try {
            con_cliente.resultset.previous();
            mostrar_Dados();
        }catch(SQLException erro){
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o último registro: " + erro, "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
        try {
            con_cliente.resultset.next();
            mostrar_Dados();
        }catch(SQLException erro){
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o último registro: " + erro, "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        try {
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
                   JOptionPane.showMessageDialog(null, "Não foi possível acessar o último registro: " + erro, "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        txtCod.setText(""); // Limpa a caixa de texto em questão
        txtNome.setText("");
        txtNasc.setText("");
        txtFone.setText("");
        txtEmail.setText("");
        txtCod.requestFocus(); // posiciona o cursor neste campo para digitação
    }//GEN-LAST:event_btn_registroActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        String nome = txtNome.getText();
        String data_nasc = txtNasc.getText();
        String telefone = txtFone.getText();
        String email = txtEmail.getText();
        
        try {
            String insert_sql="insert into tbclientes (nome, telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
            con_cliente.executaSQL("select * from tbclientes order by cod");
            preencherTabela();
            
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação : \n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        String nome = txtNome.getText();
        String data_nasc = txtNasc.getText();
        String telefone = txtFone.getText();
        String email = txtEmail.getText();
        String sql;
        String msg="";
        
        try {
            if(txtCod.getText().equals("")){
                sql="insert into tbclientes (nome, telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + ")";
                msg="Gravação de um novo registro";
            }else{
                sql="update tbclientes set nome='" + nome + "',telefone='"+ telefone + "', email= '" + email + "', dt_nasc = '" + data_nasc + "'where cod= " + txtCod.getText();
                msg="Alteração de registro";
                
            }
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from tbclientes order by cod");
            preencherTabela();
            
        } catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação : \n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        String sql="";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão",JOptionPane.YES_NO_OPTION,3);
            if(resposta == 0){
                sql="delete from tbclientes where cod = " + txtCod.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if(excluir ==1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            }catch (SQLException excecao) {
                JOptionPane.showMessageDialog(null, "Erro na exclusão: " + excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void txtpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyReleased
        try{
            String pesquisa = "select * from tbclientes where nome like '" + txtpesquisa.getText()+ "%'";
            con_cliente.executaSQL(pesquisa);
            
            if(con_cliente.resultset.first()){
                preencherTabela();
            }
            else{
                JOptionPane.showMessageDialog(null, "\n Não existe dados com este paramêtro!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n"+errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtpesquisaKeyReleased

public void preencherTabela(){
    tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
    tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
    tblClientes.getColumnModel().getColumn(2).setPreferredWidth(11);
    tblClientes.getColumnModel().getColumn(3).setPreferredWidth(14);
    tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
    
    DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
    modelo.setNumRows(0);
    
    try{
        con_cliente.resultset.beforeFirst();
        while(con_cliente.resultset.next())
            modelo.addRow(new Object[] {
                con_cliente.resultset.getString("cod"),con_cliente.resultset.getString("nome"), con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")
            });
            }
        catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "\n Eerro ao listar dados da tabela!! :\n" + erro, "Mesangem do Programa ", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    


public void posicionarRegistro(){
    try {
        con_cliente.resultset.first(); // posiciona no 1º registro da tabela
        mostrar_Dados(); // chama o método que irá buscar o dado da tabela
    }catch(SQLException erro){
        JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: " +erro, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
    }
}

public void mostrar_Dados(){
    try{
        txtCod.setText(con_cliente.resultset.getString("cod")); // Associar a caixa de texto ao campo cod
        txtNome.setText(con_cliente.resultset.getString("nome")); // Associar a caixa de texto ao campo nome
        txtNasc.setText(con_cliente.resultset.getString("dt_nasc")); // Associar a caixa de texto ao campo data de nascimento
        txtFone.setText(con_cliente.resultset.getString("telefone")); // Associar a caixa de texto ao campo telefone
        txtEmail.setText(con_cliente.resultset.getString("email")); // Associar a caixa de texto ao campo email
    
    }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

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
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_datanasc;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_pesquisa;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_painelbranco;
    private javax.swing.JPanel pnl_panelazul;
    private javax.swing.JScrollPane scp_tabela;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtpesquisa;
    // End of variables declaration//GEN-END:variables
}
