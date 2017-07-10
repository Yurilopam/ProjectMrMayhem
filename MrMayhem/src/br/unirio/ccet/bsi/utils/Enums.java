/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

/**
 *
 * @author Yuri Lopam
 */
public class Enums {
    
    /**
     * Enumerado correspondente aos estatus possiveis de um pedido de entrega
     */
    public enum Status{
        PENDENTE("Pendente"),
        ACEITO("Aceito"),
        RECUSADO("Recusado"),
        ENTREGUE("Entregue");
        
        private final String status;
        
        Status(String status){
            this.status = status;
        }

        /**
         * @return the status
         */
        public String getStatus() {
            return status;
        }
        
    }
    
    /**
     * Enumerado correspondente aos tipos de funcionarios da loja
     */
    public enum TiposDeFuncionario{
        SUPERVISOR("Supervisor"),
        ATENDENTE("Atendente"),
        GERENTE("Gerente"),
        ENTREGADOR("Entregador"),
        ALFAIATE("Alfaiate");
        
        private final String tipo;
        
        TiposDeFuncionario(String tipo) {
            this.tipo = tipo;
        }

        /**
         * @return the tipo
         */
        public String getTipo() {
            return tipo;
        }
        
    }
    
    /**
     * Enumerado correspondente aos estatus civis possiveis em um cadastro
     */
    public enum EstadoCivil{
        SOLTEIRO("Solteiro"),
        CASADO("Casado"),
        DIVORCIADO("Divorciado"),
        VIUVO("Viúvo"),
        SEPARADO("Separado");
        
        private final String estadoCivil;
        
        EstadoCivil(String estadoCivil){
            this.estadoCivil = estadoCivil;
        }

        /**
         * @return the estadoCivil
         */
        public String getEstadoCivil() {
            return estadoCivil;
        }
        
    }
    
    /**
     * Enumerado correspondente aos tipos de produtos possiveis 
     */
    public enum TiposDeProduto{
        CINTO("Cinto"),
        MEIA("Meia"),
        SAPATO("Sapato"),
        PALETO("Paletó"),
        COLETE("Colete"),
        BLUSAO("Blusão"),
        CALCA("Calça"),
        SAPATENIS("Sapatênis"),
        GRAVATA("Gravata");
        
        private final String tipo;

        private TiposDeProduto(String tipo) {
            this.tipo = tipo;
        }

        /**
         * @return the tipo
         */
        public String getTipo() {
            return tipo;
        }

    }
    
    /**
     * Enumerado correspondente aos meios de entrega possiveis
     */
    public enum MeiosDeEntrega{
        EM_DOMICILIO("Em Domicílio"),
        EM_MAOS("Em Mãos");
        
        private final String entregas;
        
        private MeiosDeEntrega(String entregas){
            this.entregas = entregas;
        }

        /**
         * @return the entregas
         */
        public String getEntregas() {
            return entregas;
        }
    }
    
    /**
     * Enumerado correspondente as situacoes de alguel que um aluguel pode se encontrar
     */
    public enum SituacoesDoAluguel{
        ATRASADO("Atrasado"),
        DEVOLVIDO("Devolvido"),
        EM_DIA("Em Dia"),
        PENDENTE("Pendente");

        private final String situacoes;
        
        private SituacoesDoAluguel(String situacoes) {
            this.situacoes = situacoes;
        }

        /**
         * @return the situacoes
         */
        public String getSituacoes() {
            return situacoes;
        }
        
    }
    
}
