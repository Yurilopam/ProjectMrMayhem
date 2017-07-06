/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import br.unirio.ccet.bsi.model.FuncionarioLocal;
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

    public void GerarXml(FuncionarioLocal novoFuncionarioLocal) {
        String PATH = Utils.recuperarPath("Funcionarios")+"\\"+novoFuncionarioLocal.getCtps()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novoFuncionarioLocal);
            encoder.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public FuncionarioLocal LerXml(String cpfFuncionarioLocal) {
        
        FuncionarioLocal funcionarioLocalCadastrado = null;
        String PATH = Utils.recuperarPath("Funcionarios")+"\\"+cpfFuncionarioLocal;
        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            funcionarioLocalCadastrado = (FuncionarioLocal) decoder.readObject();        
            decoder.close();            
            return funcionarioLocalCadastrado;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return funcionarioLocalCadastrado;
    }
    
}
