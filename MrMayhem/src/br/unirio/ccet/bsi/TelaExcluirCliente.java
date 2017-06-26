/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;
import java.io.File;

/**
 *
 * @author Yuri Lopam
 */
public class TelaExcluirCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaExcluirCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        campoNomeFuncionario = new javax.swing.JTextField();
        campoDataNascimentoFuncionario = new javax.swing.JFormattedTextField();
        campoNacionalidadeFuncionario = new javax.swing.JTextField();
        campoEmailFuncionario = new javax.swing.JTextField();
        campoCpfFuncionario = new javax.swing.JFormattedTextField();
        campoRgFuncionario = new javax.swing.JFormattedTextField();
        campoEstadoCivilFuncionario = new javax.swing.JComboBox<>();
        campoTelefoneFuncionario = new javax.swing.JFormattedTextField();
        campoRuaFuncionario = new javax.swing.JTextField();
        campoNumeroFuncionario = new javax.swing.JFormattedTextField();
        campoBairroFuncionario = new javax.swing.JTextField();
        campoCepFuncionario = new javax.swing.JFormattedTextField();
        campoFuncaoFuncionario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        botaoPesquisarFuncionario = new java.awt.Button();
        botaoExcluirFuncionario2 = new java.awt.Button();

        setBackground(new java.awt.Color(2, 86, 112));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        try {
            campoDataNascimentoFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfFuncionarioActionPerformed(evt);
            }
        });

        try {
            campoRgFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoRgFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRgFuncionarioActionPerformed(evt);
            }
        });

        campoEstadoCivilFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTEIRO(A)", "CASADO(A)", "DIVORCIADO(A)", "VIÚVO(A)", "SEPARADO(A)" }));

        try {
            campoTelefoneFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoRuaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRuaFuncionarioActionPerformed(evt);
            }
        });

        campoNumeroFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        campoBairroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairroFuncionarioActionPerformed(evt);
            }
        });

        try {
            campoCepFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCepFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCepFuncionarioActionPerformed(evt);
            }
        });

        campoFuncaoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DINHEIRO", "CARTÃO" }));

        jLabel1.setText("Dados Pessoais");

        jLabel2.setText("Nome:");

        jLabel3.setText("Nacionalidade:");

        jLabel4.setText("Número CPF:");

        jLabel5.setText("Estado Civil:");

        jLabel6.setText("Data de nascimento:");

        jLabel7.setText("E-mail:");

        jLabel8.setText("Número RG:");

        jLabel10.setText("Endereço");

        jLabel11.setText("Rua:");

        jLabel12.setText("Número:");

        jLabel13.setText("Bairro:");

        jLabel14.setText("CEP:");

        jLabel16.setText("Dados de pagamento");

        jLabel17.setText("Método de pagamento");

        jLabel21.setText("Telefone:");

        jCheckBox1.setText("Receber notificações?");

        botaoPesquisarFuncionario.setLabel("Pesquisar");
        botaoPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarFuncionarioActionPerformed(evt);
            }
        });

        botaoExcluirFuncionario2.setEnabled(false);
        botaoExcluirFuncionario2.setLabel("Excluir");
        botaoExcluirFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirFuncionario2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoRuaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(14, 14, 14)
                                    .addComponent(campoEstadoCivilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoCpfFuncionario)
                                            .addGap(19, 19, 19)
                                            .addComponent(botaoPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoNacionalidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(141, 141, 141)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(43, 43, 43)
                                            .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25)
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(campoEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator3)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExcluirFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(campoCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNacionalidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campoEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(campoRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoEstadoCivilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(campoTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoRuaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(campoNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(campoBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(campoCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campoFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(botaoExcluirFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfFuncionarioActionPerformed

    private void campoRgFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRgFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRgFuncionarioActionPerformed

    private void campoRuaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRuaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRuaFuncionarioActionPerformed

    private void campoBairroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairroFuncionarioActionPerformed

    private void campoCepFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCepFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCepFuncionarioActionPerformed

    private void botaoPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarFuncionarioActionPerformed
        XmlFuncionarioCadastrado xml = new XmlFuncionarioCadastrado();
        File arquivos = new File("C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\funcionarios");
        File[] cpfsFuncionarios = arquivos.listFiles();
        for (File cpfFuncionario : cpfsFuncionarios){
            if(cpfFuncionario.getName().equals(campoCpfFuncionario.getText()+".xml")){
                FuncionarioLocal dadosFuncionario = xml.LerXmlFuncionarioLocal(cpfFuncionario.getName());
                campoNomeFuncionario.setText(dadosFuncionario.getNome());
                campoDataNascimentoFuncionario.setText(dadosFuncionario.getDataNascimento());
                campoNacionalidadeFuncionario.setText(dadosFuncionario.getNacionalidade());
                campoEmailFuncionario.setText(dadosFuncionario.getEmail());
                campoCpfFuncionario.setText(dadosFuncionario.getCpf());
                campoRgFuncionario.setText(dadosFuncionario.getRg());
                campoEstadoCivilFuncionario.setSelectedIndex(recuperarEstadoCivil(dadosFuncionario));
                campoTelefoneFuncionario.setText(dadosFuncionario.getTelefone());
                campoRuaFuncionario.setText(dadosFuncionario.getRua());
                campoNumeroFuncionario.setText(dadosFuncionario.getNumero());
                campoBairroFuncionario.setText(dadosFuncionario.getBairro());
                campoCepFuncionario.setText(dadosFuncionario.getCep());
                campoNomeFuncionario.setEditable(true);
                campoEmailFuncionario.setEditable(true);
                campoTelefoneFuncionario.setEditable(true);
                campoRuaFuncionario.setEditable(true);
                campoNumeroFuncionario.setEditable(true);
                campoBairroFuncionario.setEditable(true);
                campoCepFuncionario.setEditable(true);
                botaoExcluirFuncionario.setEnabled(true);
            }
        }
    }//GEN-LAST:event_botaoPesquisarFuncionarioActionPerformed

    private void botaoExcluirFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirFuncionario2ActionPerformed
        File funcionarioAExcluir = new File("C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\clientes\\"+campoCpfFuncionario.getText()+".xml");
            if(funcionarioAExcluir.delete()){
                JOptionPane.showMessageDialog(TelaExcluirCliente.this, "O Cliente foi excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(TelaExcluirCliente.this, "Falha na operação de exclusão!");
            }
            resetarCampos();
    }//GEN-LAST:event_botaoExcluirFuncionario2ActionPerformed

    private int recuperarEstadoCivil(FuncionarioLocal dadosFuncionario) {
        switch(dadosFuncionario.getEstadoCivil()){
            case "SOLTEIRO(A)":
                return 0;
            case "CASADO(A)":
                return 1;
            case "DIVORCIADO(A)":
                return 2;
            case "VIÚVO(A)": 
                return 3;
            case "SEPARADO(A)":
                return 4;
        } return -1;
    }
    
    private boolean formularioAlteracaoFuncionarioValidado() {
        return !StringUtils.isEmpty(campoNomeFuncionario.getText())
                && !StringUtils.isEmpty(campoDataNascimentoFuncionario.getText())
                && !StringUtils.isEmpty(campoNacionalidadeFuncionario.getText())
                && !StringUtils.isEmpty(campoEmailFuncionario.getText())
                && !StringUtils.isEmpty(campoCpfFuncionario.getText())
                && !StringUtils.isEmpty(campoRgFuncionario.getText())
                && !StringUtils.isEmpty(campoEstadoCivilFuncionario.getSelectedItem().toString())
                && !StringUtils.isEmpty(campoTelefoneFuncionario.getText())
                && !StringUtils.isEmpty(campoRuaFuncionario.getText())
                && !StringUtils.isEmpty(campoNumeroFuncionario.getText())
                && !StringUtils.isEmpty(campoBairroFuncionario.getText())
                && !StringUtils.isEmpty(campoCepFuncionario.getText())
                && !StringUtils.isEmpty(campoFuncaoFuncionario.getSelectedItem().toString());
    }
    
    private void resetarCampos() {
        campoNomeFuncionario.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoExcluirFuncionario;
    private java.awt.Button botaoExcluirFuncionario1;
    private java.awt.Button botaoExcluirFuncionario2;
    private java.awt.Button botaoPesquisarFuncionario;
    private javax.swing.JTextField campoBairroFuncionario;
    private javax.swing.JFormattedTextField campoCepFuncionario;
    private javax.swing.JFormattedTextField campoCpfFuncionario;
    private javax.swing.JFormattedTextField campoDataNascimentoFuncionario;
    private javax.swing.JTextField campoEmailFuncionario;
    private javax.swing.JComboBox<String> campoEstadoCivilFuncionario;
    private javax.swing.JComboBox<String> campoFuncaoFuncionario;
    private javax.swing.JTextField campoNacionalidadeFuncionario;
    private javax.swing.JTextField campoNomeFuncionario;
    private javax.swing.JFormattedTextField campoNumeroFuncionario;
    private javax.swing.JFormattedTextField campoRgFuncionario;
    private javax.swing.JTextField campoRuaFuncionario;
    private javax.swing.JFormattedTextField campoTelefoneFuncionario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
