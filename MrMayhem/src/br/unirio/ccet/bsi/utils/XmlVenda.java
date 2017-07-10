/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import br.unirio.ccet.bsi.model.Venda;
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
public class XmlVenda {

    /**
     * Gera o XML de uma entidade
     * @param novaVenda Parametro corresponde a nova entidade gerada
     */
    public void GerarXml(Venda novaVenda) {
        String PATH = Utils.recuperarPath("Vendas")+"\\"+novaVenda.getCodigoPedido()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novaVenda);
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
    public Venda LerXml(String numeroPedido ){
        
        Venda vendaCadastrada = null;
        String PATH = Utils.recuperarPath("Vendas")+"\\"+numeroPedido;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            vendaCadastrada = (Venda) decoder.readObject();        
            decoder.close();            
            return vendaCadastrada;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return vendaCadastrada;
    }
    
}
