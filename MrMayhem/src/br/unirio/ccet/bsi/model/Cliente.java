package br.unirio.ccet.bsi.model;

/**
 *
 * @author Yuri Lopam
 */
public class Cliente extends Usuario{
    
    private String receberNotificacoes;
    private String infoAdicional;
    
    public Cliente() {
        
        super();
        
    }

    /**
     * @return the receberNotificacoes
     */
    public String getReceberNotificacoes() {
        return receberNotificacoes;
    }

    /**
     * @param receberNotificacoes the receberNotificacoes to set
     */
    public void setReceberNotificacoes(String receberNotificacoes) {
        this.receberNotificacoes = receberNotificacoes;
    }

    /**
     * @return the infoAdicional
     */
    public String getInfoAdicional() {
        return infoAdicional;
    }

    /**
     * @param infoAdicional the infoAdicional to set
     */
    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

}
