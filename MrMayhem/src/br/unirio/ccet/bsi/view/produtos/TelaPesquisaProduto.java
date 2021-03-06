/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.produtos;

import br.unirio.ccet.bsi.controller.Login;
import br.unirio.ccet.bsi.model.Produto;
import br.unirio.ccet.bsi.utils.Utils;
import br.unirio.ccet.bsi.utils.XmlProduto;
import br.unirio.ccet.bsi.view.envios.TelaEnvioRelatorio;
import java.awt.print.PrinterException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuri Lopam
 */
public class TelaPesquisaProduto extends javax.swing.JInternalFrame {

    private final JDesktopPane desktop;

    /**
     * Creates new form TelaPesquisaFuncionario
     */
    public TelaPesquisaProduto(JDesktopPane desktop) {
        initComponents();
        this.desktop = desktop;
        if (!Login.getIdUsuario().equals("supervisor")){
            botaoEncaminharPorEmail.setVisible(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoPesquisar = new java.awt.Button();
        botaoImprimir = new java.awt.Button();
        botaoEncaminharPorEmail = new java.awt.Button();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade em estoque", "Tipo", "Data de cadastramento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botaoPesquisar.setLabel("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoImprimir.setEnabled(false);
        botaoImprimir.setLabel("Imprimir");
        botaoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoImprimirActionPerformed(evt);
            }
        });

        botaoEncaminharPorEmail.setEnabled(false);
        botaoEncaminharPorEmail.setLabel("Encaminhar por e-mail");
        botaoEncaminharPorEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEncaminharPorEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(botaoEncaminharPorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEncaminharPorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        DefaultTableModel dtmProdutos = (DefaultTableModel) jTable1.getModel();
        XmlProduto xml = new XmlProduto();
        File arquivos = new File(Utils.recuperarPath("Produtos"));
        if (arquivos.list().length == 0){
            JOptionPane.showMessageDialog(TelaPesquisaProduto.this, "Não existem registros!");
        } else {
            String[] codProdutos = arquivos.list();
            for (String codProduto : codProdutos){
                Produto dadosProduto = xml.LerXml(codProduto);
                Object[] dados = {dadosProduto.getCodigo(), dadosProduto.getNome(), dadosProduto.getQuantidade(),
                    dadosProduto.getTipoProduto(), dadosProduto.getDataCadastramento()};
                dtmProdutos.addRow(dados);
            }
            botaoPesquisar.setEnabled(false);
            botaoImprimir.setEnabled(true);
            botaoEncaminharPorEmail.setEnabled(true);
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoImprimirActionPerformed
        try {
            boolean impresso = jTable1.print();
            if(impresso){
                JOptionPane.showMessageDialog(TelaPesquisaProduto.this, "Impressão realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(TelaPesquisaProduto.this, "Erro ao realizar impressão!");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(TelaPesquisaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoImprimirActionPerformed

    private void botaoEncaminharPorEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEncaminharPorEmailActionPerformed
        TelaEnvioRelatorio telaEnvioRelatorioFuncionario = new TelaEnvioRelatorio(jTable1);
        desktop.add(telaEnvioRelatorioFuncionario);
        telaEnvioRelatorioFuncionario.setVisible(true);
    }//GEN-LAST:event_botaoEncaminharPorEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoEncaminharPorEmail;
    private java.awt.Button botaoImprimir;
    private java.awt.Button botaoPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
