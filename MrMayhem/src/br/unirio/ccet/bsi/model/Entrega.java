package br.unirio.ccet.bsi.model;

import br.unirio.ccet.bsi.utils.Enums;

/**
 *
 * @author Yuri Lopam
 */
public class Entrega extends Pedido{

    private String tipoTransacao;
    private String ruaDestinatario;
    private String numeroCasaDestinatario;
    private String bairroDestinatario;
    private String cepDestinatario;
    private String telefoneDestinatario;
    private String observacoes;
    private Enums.Status status;

    public Entrega() {
        super();
    }

    /**
     * @return the tipoTransacao
     */
    public String getTipoTransacao() {
        return tipoTransacao;
    }

    /**
     * @param tipoTransacao the tipoTransacao to set
     */
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
    
    /**
     * @return the ruaDestinatario
     */
    public String getRuaDestinatario() {
        return ruaDestinatario;
    }

    /**
     * @param ruaDestinatario the ruaDestinatario to set
     */
    public void setRuaDestinatario(String ruaDestinatario) {
        this.ruaDestinatario = ruaDestinatario;
    }

    /**
     * @return the numeroCasaDestinatario
     */
    public String getNumeroCasaDestinatario() {
        return numeroCasaDestinatario;
    }

    /**
     * @param numeroCasaDestinatario the numeroCasaDestinatario to set
     */
    public void setNumeroCasaDestinatario(String numeroCasaDestinatario) {
        this.numeroCasaDestinatario = numeroCasaDestinatario;
    }

    /**
     * @return the bairroDestinatario
     */
    public String getBairroDestinatario() {
        return bairroDestinatario;
    }

    /**
     * @param bairroDestinatario the bairroDestinatario to set
     */
    public void setBairroDestinatario(String bairroDestinatario) {
        this.bairroDestinatario = bairroDestinatario;
    }

    /**
     * @return the cepDestinatario
     */
    public String getCepDestinatario() {
        return cepDestinatario;
    }

    /**
     * @param cepDestinatario the cepDestinatario to set
     */
    public void setCepDestinatario(String cepDestinatario) {
        this.cepDestinatario = cepDestinatario;
    }

    /**
     * @return the telefoneDestinatario
     */
    public String getTelefoneDestinatario() {
        return telefoneDestinatario;
    }

    /**
     * @param telefoneDestinatario the telefoneDestinatario to set
     */
    public void setTelefoneDestinatario(String telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
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
     * @return the status
     */
    public Enums.Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Enums.Status status) {
        this.status = status;
    }
    
}
