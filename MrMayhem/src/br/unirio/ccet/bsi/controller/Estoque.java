/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.controller;

/**
 *
 * @author Yuri Lopam
 */
public class Estoque {

    public Estoque() {
    }
    
    public String reduzirQuantidade(String quantidadeAReduzir, String quantidadeAntiga) {
        int numQuantidadeAReduzir = Integer.parseInt(quantidadeAReduzir);
        int numQuantidadeAntiga = Integer.parseInt(quantidadeAntiga);
        int quantidadeRestante = numQuantidadeAntiga - numQuantidadeAReduzir;
        String quantidadeRestateString = String.valueOf(quantidadeRestante);      
        return quantidadeRestateString;
    }
    
}
