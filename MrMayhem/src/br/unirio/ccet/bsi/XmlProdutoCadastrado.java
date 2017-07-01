/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Yuri Lopam
 */
public class XmlProdutoCadastrado {    
    
    public void GerarXmlProduto(Produto novoProduto) {
            //TODO criar um path genérico
        String PATH = "C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\produtos\\"+novoProduto.getNomeProduto()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novoProduto);
            encoder.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Produto LerXmlProduto(String nomeProduto) {
        
        Produto produtoCadastrado = null;
        String PATH = "C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\produtos\\"+nomeProduto;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            produtoCadastrado = (Produto) decoder.readObject();        
            decoder.close();            
            return produtoCadastrado;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        return produtoCadastrado;
    }
}
