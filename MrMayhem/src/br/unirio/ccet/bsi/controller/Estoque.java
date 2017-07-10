/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.controller;

import br.unirio.ccet.bsi.model.Produto;
import br.unirio.ccet.bsi.utils.Utils;
import br.unirio.ccet.bsi.utils.XmlProduto;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuri Lopam
 */
public class Estoque {

    public Estoque() {
    }
    /**
     * Calcula a quantidade do produto a ser reduzida no estoque
     * @param quantidadeAReduzir Parametro correspondente a quanto deve reduzir no estoque
     * @param quantidadeAntiga Parametro correspondente ao quanto tem no estoque
     * @return O restante da quantidade do produto em String
     */
    public String reduzirQuantidade(String quantidadeAReduzir, String quantidadeAntiga) {
        int numQuantidadeAReduzir = Integer.parseInt(quantidadeAReduzir);
        int numQuantidadeAntiga = Integer.parseInt(quantidadeAntiga);
        int quantidadeRestante = numQuantidadeAntiga - numQuantidadeAReduzir;
        String quantidadeRestateString = String.valueOf(quantidadeRestante);      
        return quantidadeRestateString;
    }
    
    /**
     * Faz a redução da quantidade em estoque dos produtos na lista de venda
     * @param jTable1 Parametro correspondente a tabela da lista de venda
     */
    public void controleDaQuantidadeDoProduto(JTable jTable1) {
        Produto produtoAtualizado = new Produto();
        XmlProduto xmlProduto = new XmlProduto();
        File arquivos = new File(Utils.recuperarPath("Produtos"));
        String[] codProdutos = arquivos.list();
        for (String codProduto : codProdutos) {
            Produto dadosProduto = xmlProduto.LerXml(codProduto);
            String codigoDoProduto;
            String quantidadeDoProdutoNaLista;
            DefaultTableModel dtmListaProdutos = (DefaultTableModel) jTable1.getModel();
            int totalDeLinhas = dtmListaProdutos.getRowCount();
            for (int i = 0; i < totalDeLinhas; i++) {
                codigoDoProduto = dtmListaProdutos.getValueAt(i, 0).toString();
                quantidadeDoProdutoNaLista = dtmListaProdutos.getValueAt(i, 2).toString();
                if (dadosProduto.getCodigo().equals(codigoDoProduto)){
                    produtoAtualizado.setCodigo(dadosProduto.getCodigo());
                    produtoAtualizado.setDataCadastramento(dadosProduto.getDataCadastramento());
                    produtoAtualizado.setDescricao(dadosProduto.getDescricao());
                    produtoAtualizado.setNome(dadosProduto.getNome());
                    produtoAtualizado.setQuantidade(reduzirQuantidade(quantidadeDoProdutoNaLista, dadosProduto.getQuantidade()));
                    produtoAtualizado.setTipoProduto(dadosProduto.getTipoProduto());
                    produtoAtualizado.setValor(dadosProduto.getValor());
                    xmlProduto.GerarXml(produtoAtualizado);
                }
            }       
        }
    }
    
}
