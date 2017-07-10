package br.unirio.ccet.bsi.model;

import java.io.Serializable;

/**
 *
 * @author yuri
 */
public abstract class Pedido implements Serializable{
    
    private String codigoPedido;
    private String nomeComprador;
    private String cpfComprador;
    private String dataPedido;
    private String dataEntrega;
    
    public Pedido() {

    }

    /**
     * @return the codigoPedido
     */
    public String getCodigoPedido() {
        return codigoPedido;
    }

    /**
     * @param codigoPedido the codigoPedido to set
     */
    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    /**
     * @return the nomeComprador
     */
    public String getNomeComprador() {
        return nomeComprador;
    }

    /**
     * @param nomeComprador the nomeComprador to set
     */
    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    /**
     * @return the cpfComprador
     */
    public String getCpfComprador() {
        return cpfComprador;
    }

    /**
     * @param cpfComprador the cpfComprador to set
     */
    public void setCpfComprador(String cpfComprador) {
        this.cpfComprador = cpfComprador;
    }

    /**
     * @return the dataPedido
     */
    public String getDataPedido() {
        return dataPedido;
    }

    /**
     * @param dataPedido the dataPedido to set
     */
    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    /**
     * @return the dataEntrega
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

}
