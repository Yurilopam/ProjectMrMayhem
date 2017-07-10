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
    
    public Entrega LerXml(String numeroPedido) {
        
        Entrega funcionarioLocalCadastrado = null;
        String PATH = Utils.recuperarPath("Entregas")+"\\"+numeroPedido;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            funcionarioLocalCadastrado = (Entrega) decoder.readObject();        
            decoder.close();            
            return funcionarioLocalCadastrado;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return funcionarioLocalCadastrado;
    }
    
}
