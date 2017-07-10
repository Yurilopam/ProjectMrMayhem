package br.unirio.ccet.bsi.model;

import br.unirio.ccet.bsi.utils.Enums;

public class Produto {

    private String nome;
    private String codigo;
    private String dataCadastramento;
    private Enums.TiposDeProduto tipoProduto;
    private String descricao;
    private String valor;
    private String quantidade;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dataCadastramento
     */
    public String getDataCadastramento() {
        return dataCadastramento;
    }

    /**
     * @param dataCadastramento the dataCadastramento to set
     */
    public void setDataCadastramento(String dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }

    /**
     * @return the tipoProduto
     */
    public Enums.TiposDeProduto getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(Enums.TiposDeProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
}
