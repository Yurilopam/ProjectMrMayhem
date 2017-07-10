package br.unirio.ccet.bsi.model;

import br.unirio.ccet.bsi.utils.Enums;

/**
 *
 * @author yuri
 */
public class Funcionario extends Usuario{
    
    private Enums.TiposDeFuncionario funcao;
    
    public Funcionario() {
        super();  
    }

    /**
     * @return the funcao
     */
    public Enums.TiposDeFuncionario getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(Enums.TiposDeFuncionario funcao) {
        this.funcao = funcao;
    }
    
}
