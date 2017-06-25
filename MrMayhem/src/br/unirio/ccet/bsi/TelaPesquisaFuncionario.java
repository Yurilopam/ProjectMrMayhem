/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi;

import java.io.File;
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
        botaoPesquisarFuncionarios = new java.awt.Button();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Função"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        botaoPesquisarFuncionarios.setLabel("Pesquisar");
        botaoPesquisarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarFuncionariosActionPerformed(evt);
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
                .addGap(359, 359, 359)
                .addComponent(botaoPesquisarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botaoPesquisarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarFuncionariosActionPerformed
        DefaultTableModel dtmFuncionarios = (DefaultTableModel) jTable1.getModel();
        XmlFuncionarioCadastrado xml = new XmlFuncionarioCadastrado();
        File arquivos = new File("C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\funcionarios");
        String[] cpfsFuncionarios = arquivos.list();
        for (String cpfFuncionario : cpfsFuncionarios){
            FuncionarioLocal dadosFuncionario = xml.LerXmlFuncionarioLocal(cpfFuncionario);
            Object[] dados = {dadosFuncionario.getNome(), dadosFuncionario.getCpf(), dadosFuncionario.getFuncao()};
            dtmFuncionarios.addRow(dados);
        }
        botaoPesquisarFuncionarios.disable();
    }//GEN-LAST:event_botaoPesquisarFuncionariosActionPerformed

    DefaultTableModel dtmProdutos;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoPesquisarFuncionarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
