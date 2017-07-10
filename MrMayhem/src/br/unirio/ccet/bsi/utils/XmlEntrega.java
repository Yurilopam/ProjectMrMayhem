/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import br.unirio.ccet.bsi.model.Entrega;
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
public class XmlEntrega {

    /**
     * Gera o XML de uma entidade
     * @param novaEntrega Parametro corresponde a nova entidade gerada
     */
    public void GerarXml(Entrega novaEntrega) {
        String PATH = Utils.recuperarPath("Entregas")+"\\"+novaEntrega.getCodigoPedido()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novaEntrega);
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
    public Entrega LerXml(String numeroPedido) {
        
        Entrega entregaCadastrada = null;
        String PATH = Utils.recuperarPath("Entregas")+"\\"+numeroPedido;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            entregaCadastrada = (Entrega) decoder.readObject();        
            decoder.close();            
            return entregaCadastrada;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return entregaCadastrada;
    }
    
}
