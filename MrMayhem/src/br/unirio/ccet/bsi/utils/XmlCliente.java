/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import br.unirio.ccet.bsi.model.Cliente;
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
public class XmlCliente {    

    /**
     * Gera o XML de uma entidade
     * @param novoCliente Parametro corresponde a nova entidade gerada
     */
    public void GerarXml(Cliente novoCliente) {
        String PATH = Utils.recuperarPath("Clientes")+"\\"+novoCliente.getCpf()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novoCliente);
            encoder.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Recupera a entidade lida de um XML
     * @param cpfCliente Parametro correspondente ao nome do arquivo que sera lido
     * @return A entidade 
     */
    public Cliente LerXml(String cpfCliente) {
        
        Cliente clienteCadastrado = null;
        String PATH = Utils.recuperarPath("Clientes")+"\\"+cpfCliente;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            clienteCadastrado = (Cliente) decoder.readObject();        
            decoder.close();            
            return clienteCadastrado;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return clienteCadastrado;
    }
    
}
