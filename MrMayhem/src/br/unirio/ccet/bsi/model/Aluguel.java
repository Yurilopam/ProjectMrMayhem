package br.unirio.ccet.bsi.model;

import br.unirio.ccet.bsi.utils.Enums;

/**
 *
 * @author Yuri Lopam
 */
public class Aluguel extends Pedido{

    private String observacoes;
    private String precoTotal;
    private String formaPagamento;
    private String vendedor;
    private String dataDevolucao;
    private Enums.SituacoesDoAluguel situacao;

    public Aluguel() {
        super();
    }
    
    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the precoTotal
     */
    public String getPrecoTotal() {
        return precoTotal;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(String precoTotal) {
        this.precoTotal = precoTotal;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the situacao
     */
    public Enums.SituacoesDoAluguel getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(Enums.SituacoesDoAluguel situacao) {
        this.situacao = situacao;
    }

}
