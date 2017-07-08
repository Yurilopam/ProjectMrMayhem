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

    public void GerarXml(Venda novaVenda) {
        String PATH = Utils.recuperarPath("Vendas")+"\\"+novaVenda.getNumeroPedido()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novaVenda);
            encoder.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Venda LerXml(String numeroPedido ){
        
        Venda funcionarioLocalCadastrado = null;
        String PATH = Utils.recuperarPath("Vendas")+"\\"+numeroPedido;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            funcionarioLocalCadastrado = (Venda) decoder.readObject();        
            decoder.close();            
            return funcionarioLocalCadastrado;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return funcionarioLocalCadastrado;
    }
    
}
