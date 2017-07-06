package br.unirio.ccet.bsi.model;

public class Produto {

    private String nome;
    private String codigo;
    private String dataCadastramento;
    private String tipo;
    private String descricao;
    
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
}
