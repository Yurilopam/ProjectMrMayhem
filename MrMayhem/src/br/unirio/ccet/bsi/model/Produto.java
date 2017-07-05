package br.unirio.ccet.bsi.model;

public class Produto {
    
    private String nomeProduto;
    private String idProduto;
    private String dataCadastroProduto;
    private String tipoProduto;
    private String descricaoProduto;
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the idProduto
     */
    public String getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
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
