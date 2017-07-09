/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.funcionarios;

import br.unirio.ccet.bsi.model.Funcionario;
import br.unirio.ccet.bsi.utils.Mail;
import br.unirio.ccet.bsi.utils.Pdf;
import br.unirio.ccet.bsi.utils.Utils;
import br.unirio.ccet.bsi.utils.XmlFuncionario;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuri Lopam
 */
public class TelaPesquisaFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisaFuncionario
     */
    public TelaPesquisaFuncionario() {
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
                "Nome", "CTPS", "Função", "Salário", "Data de cadastramento"
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(botaoEncaminharPorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEncaminharPorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        DefaultTableModel dtmFuncionarios = (DefaultTableModel) jTable1.getModel();
        XmlFuncionario xml = new XmlFuncionario();
        File arquivos = new File(Utils.recuperarPath("Funcionarios"));
        String[] cpfsFuncionarios = arquivos.list();
        for (String cpfFuncionario : cpfsFuncionarios){
            Funcionario dadosFuncionario = xml.LerXml(cpfFuncionario);
            Object[] dados = {dadosFuncionario.getNome(), dadosFuncionario.getCtps(), dadosFuncionario.getFuncao(), 
                dadosFuncionario.getSalario(), dadosFuncionario.getDataCadastramento()};
            dtmFuncionarios.addRow(dados);
        }
        botaoPesquisar.setEnabled(false);
        botaoImprimir.setEnabled(true);
        botaoEncaminharPorEmail.setEnabled(true);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoImprimirActionPerformed
        try {
            boolean impresso = jTable1.print();
            if(impresso){
                JOptionPane.showMessageDialog(TelaPesquisaFuncionario.this, "Impressão realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(TelaPesquisaFuncionario.this, "Erro ao realizar impressão!");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(TelaPesquisaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoImprimirActionPerformed

    private void botaoEncaminharPorEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEncaminharPorEmailActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String nomeDoRelatorio = dateFormat.format(date);
        String nomeDoRelatorioPdf = nomeDoRelatorio+"FUNCIONARIO.pdf";
        Pdf pdf = new Pdf(jTable1, nomeDoRelatorioPdf);
        Mail mail = new Mail();
        try {
            mail.enviarEmail("supervisormrmayhem@gmail.com", "1wdvfe@3", "yurilopam@gmail.com", 
                    "Testando Email", "Teste de email do projeto de PCS", nomeDoRelatorioPdf);
        } catch (IOException ex) {
            Logger.getLogger(TelaPesquisaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoEncaminharPorEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoEncaminharPorEmail;
    private java.awt.Button botaoImprimir;
    private java.awt.Button botaoPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
