package br.unirio.ccet.bsi.model;

/**
 *
 * @author yuri
 */
public class Funcionario extends Usuario{
    
    private String funcao;
    
    public Funcionario() {
        super();  
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public void realizarVenda() {
        
    }
    
    public void realizarAluguel() {
        
    }
    
    public void manterCliente() {
        
    }
    
    public void adicionarReservaExpressa() {
        
    }
    
    public void visualizarFuncionario() {
        
    }
    
}
