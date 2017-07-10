/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import br.unirio.ccet.bsi.model.Funcionario;
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
public class XmlFuncionario {    

    /**
     * Gera o XML de uma entidade
     * @param novoFuncionario Parametro corresponde a nova entidade gerada
     */
    public void GerarXml(Funcionario novoFuncionario) {
        String PATH = Utils.recuperarPath("Funcionarios")+"\\"+novoFuncionario.getCtps()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novoFuncionario);
            encoder.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Recupera a entidade lida de um XML
     * @param cpfFuncionario Parametro correspondente ao nome do arquivo que sera lido
     * @return A entidade 
     */
    public Funcionario LerXml(String cpfFuncionario) {
        
        Funcionario funcionarioCadastrado = null;
        String PATH = Utils.recuperarPath("Funcionarios")+"\\"+cpfFuncionario;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            funcionarioCadastrado = (Funcionario) decoder.readObject();        
            decoder.close();            
            return funcionarioCadastrado;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return funcionarioCadastrado;
    }
    
}
