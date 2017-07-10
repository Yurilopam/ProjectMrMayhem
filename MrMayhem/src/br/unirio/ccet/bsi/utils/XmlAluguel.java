/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import br.unirio.ccet.bsi.model.Aluguel;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Yuri Lopam
 */
public class XmlAluguel {
    
    /**
     * Gera o XML de uma entidade
     * @param novoAluguel Parametro corresponde a nova entidade gerada
     */
    public void GerarXml(Aluguel novoAluguel) {
        String PATH = Utils.recuperarPath("Alugueis")+"\\"+novoAluguel.getCodigoPedido()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novoAluguel);
            encoder.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Recupera a entidade lida de um XML
     * @param numeroPedido Parametro correspondente ao nome do arquivo que sera lido
     * @return A entidade 
     */
    public Aluguel LerXml(String numeroPedido){
        
        Aluguel aluguelCadastrado = null;
        String PATH = Utils.recuperarPath("Alugueis")+"\\"+numeroPedido;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            aluguelCadastrado = (Aluguel) decoder.readObject();        
            decoder.close();            
            return aluguelCadastrado;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return aluguelCadastrado;
    }
    
}
