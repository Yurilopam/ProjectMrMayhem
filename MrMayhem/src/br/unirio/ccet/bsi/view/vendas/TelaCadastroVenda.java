/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.vendas;

import br.unirio.ccet.bsi.model.FuncionarioLocal;
import br.unirio.ccet.bsi.model.Produto;
import br.unirio.ccet.bsi.utils.Utils;
import br.unirio.ccet.bsi.utils.XmlFuncionario;
import br.unirio.ccet.bsi.utils.XmlProduto;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Yuri Lopam
 */
public class TelaCadastroVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroVenda() {
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

        botoesFormaDePagamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        campoNumeroPedido = new javax.swing.JTextField();
        campoDataPedido = new javax.swing.JFormattedTextField();
        campoCpfComprador = new javax.swing.JFormattedTextField();
        campoDataEntrega = new javax.swing.JFormattedTextField();
        campoCodigoProduto = new javax.swing.JFormattedTextField();
        campoTipoEntrega = new javax.swing.JComboBox<>();
        botaoCadastarFuncionario = new java.awt.Button();
        botaoadicionarALista = new java.awt.Button();
        radioCartaoCredito = new javax.swing.JRadioButton();
        radioDinheiro = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        campoPrecoTotal = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
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
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoQuantidadeProduto = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(2, 86, 112));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoNumeroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroPedidoActionPerformed(evt);
            }
        });

        try {
            campoDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoCpfComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfCompradorActionPerformed(evt);
            }
        });

        try {
            campoDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoCodigoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoTipoEntrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Domicílio", "Em Mãos" }));
        campoTipoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoEntregaActionPerformed(evt);
            }
        });

        botaoCadastarFuncionario.setLabel("Efetuar venda");
        botaoCadastarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastarFuncionarioActionPerformed(evt);
            }
        });

        botaoadicionarALista.setLabel("Adicionar à lista");
        botaoadicionarALista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoadicionarAListaActionPerformed(evt);
            }
        });

        botoesFormaDePagamento.add(radioCartaoCredito);
        radioCartaoCredito.setText("Cartão de crédito");
        radioCartaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCartaoCreditoActionPerformed(evt);
            }
        });

        botoesFormaDePagamento.add(radioDinheiro);
        radioDinheiro.setText("Dinheiro");
        radioDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDinheiroActionPerformed(evt);
            }
        });

        campoPrecoTotal.setEditable(false);
        campoPrecoTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campoPrecoTotal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        campoPrecoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPrecoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPrecoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane2.setViewportView(campoObservacoes);

        jLabel1.setText("Cadastrar Venda");

        jLabel2.setText("Número do Pedido:");

        jLabel3.setText("Preço Total: R$");

        jLabel4.setText("CPF Comprador:");

        jLabel5.setText("Código do produto:");

        jLabel6.setText("Data do Pedido:");

        jLabel7.setText("Data da Entrega:");

        jLabel8.setText("Quantidade do Produto:");

        jLabel10.setText("Observações:");

        jLabel11.setText("Forma de pagamento:");

        jLabel17.setText("Entrega:");

        campoQuantidadeProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(botaoadicionarALista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(radioCartaoCredito)
                                .addGap(18, 18, 18)
                                .addComponent(radioDinheiro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(251, 251, 251)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(16, 16, 16)
                                                .addComponent(campoCpfComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoTipoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoDataPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(campoDataEntrega))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoCadastarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(campoDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(campoNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoCpfComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(campoTipoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(campoQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoadicionarALista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioCartaoCredito)
                        .addComponent(radioDinheiro)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(botaoCadastarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void botaoCadastarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastarFuncionarioActionPerformed
        if (formularioCadastroValidado()) {
            FuncionarioLocal novoFuncionarioLocal = new FuncionarioLocal();
            novoFuncionarioLocal.setNome(campoNumeroPedido.getText());
            novoFuncionarioLocal.setDataNascimento(campoDataPedido.getText());
            novoFuncionarioLocal.setCpf(campoCpfComprador.getText());
            novoFuncionarioLocal.setFuncao(campoTipoEntrega.getSelectedItem().toString());
            XmlFuncionario xml = new XmlFuncionario();
            xml.GerarXml(novoFuncionarioLocal);
            JOptionPane.showMessageDialog(TelaCadastroVenda.this, "Funcionário cadastrado com sucesso!");
            resetarCampos();
        }
    }//GEN-LAST:event_botaoCadastarFuncionarioActionPerformed

    private void campoTipoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoEntregaActionPerformed
        if (campoTipoEntrega.getSelectedItem().toString().equals("Em Mãos")) {
            campoDataEntrega.setEnabled(false);
            campoDataEntrega.setText(null);
            campoDataEntrega.setValue(null);
        } else {
            campoDataEntrega.setEnabled(true);
        }
    }//GEN-LAST:event_campoTipoEntregaActionPerformed

    private void campoCpfCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfCompradorActionPerformed

    private void campoNumeroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroPedidoActionPerformed

    private void botaoadicionarAListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoadicionarAListaActionPerformed
        if (campoCodigoProduto.getValue() != null && !campoCodigoProduto.getValue().toString().equals("") 
                && campoQuantidadeProduto.getValue() != null && !campoCodigoProduto.getValue().toString().equals("") ){
            DefaultTableModel dtmListaProdutos = (DefaultTableModel) jTable1.getModel();
            XmlProduto xml = new XmlProduto();
            File arquivos = new File(Utils.recuperarPath("Produtos"));
            String[] codProdutos = arquivos.list();
            for (String codProduto : codProdutos) {
                Produto dadosProduto = xml.LerXml(codProduto);
                if (dadosProduto.getCodigo().equals(campoCodigoProduto.getText())){
                    Object[] dados = {dadosProduto.getCodigo(), dadosProduto.getNome(), campoQuantidadeProduto.getValue().toString(), dadosProduto.getValor()};
                    dtmListaProdutos.addRow(dados);
                }
            }
            int totalDeLinhas = dtmListaProdutos.getRowCount();
            Double valorTotal = 0.0;
            for (int i = 0; i < totalDeLinhas; i++) {
                String valorDoProdutoEmString = dtmListaProdutos.getValueAt(i, 3).toString();
                String valorDoProdutoEmStringReplaced = valorDoProdutoEmString.replace(",", ".");
                String quantidadeDoProdutoEmString = dtmListaProdutos.getValueAt(i, 2).toString();
                valorTotal += Double.valueOf(valorDoProdutoEmStringReplaced) * Integer.valueOf(quantidadeDoProdutoEmString);
            }
            DecimalFormat df = new DecimalFormat("#0.00"); 
            campoPrecoTotal.setText(df.format(valorTotal));
        } else {
            JOptionPane.showMessageDialog(TelaCadastroVenda.this, "Os campos Código e Quantidade do produto devem ser preenchidos.");
        }
    }//GEN-LAST:event_botaoadicionarAListaActionPerformed

    private void radioCartaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCartaoCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCartaoCreditoActionPerformed

    private void radioDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDinheiroActionPerformed

    private void campoPrecoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoTotalActionPerformed
    }//GEN-LAST:event_campoPrecoTotalActionPerformed

    private boolean formularioCadastroValidado() {
        return !StringUtils.isEmpty(campoNumeroPedido.getText())
                && !StringUtils.isEmpty(campoDataPedido.getText())
                && !StringUtils.isEmpty(campoCpfComprador.getText())
                && !StringUtils.isEmpty(campoTipoEntrega.getSelectedItem().toString());
    }
    
    private void resetarCampos() {
        campoNumeroPedido.setText(null);
        campoDataPedido.setText(null);
        campoCpfComprador.setText(null);
        campoTipoEntrega.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoCadastarFuncionario;
    private java.awt.Button botaoadicionarALista;
    private javax.swing.ButtonGroup botoesFormaDePagamento;
    private javax.swing.JFormattedTextField campoCodigoProduto;
    private javax.swing.JFormattedTextField campoCpfComprador;
    private javax.swing.JFormattedTextField campoDataEntrega;
    private javax.swing.JFormattedTextField campoDataPedido;
    private javax.swing.JTextField campoNumeroPedido;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JFormattedTextField campoPrecoTotal;
    private javax.swing.JFormattedTextField campoQuantidadeProduto;
    private javax.swing.JComboBox<String> campoTipoEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioCartaoCredito;
    private javax.swing.JRadioButton radioDinheiro;
    // End of variables declaration//GEN-END:variables

}