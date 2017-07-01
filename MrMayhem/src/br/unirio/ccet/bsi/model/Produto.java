package br.unirio.ccet.bsi.model;

public class Produto {
    
    private String nomeProduto;
    private String dataCadastroProduto;
    private String tipoProduto;
    private String descricaoProduto;
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public String getDataCadastroProduto() {
        return dataCadastroProduto;
    }

    public void setDataCadastroProduto(String dataCadastroProduto) {
        this.dataCadastroProduto = dataCadastroProduto;
    }
    
    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
}
