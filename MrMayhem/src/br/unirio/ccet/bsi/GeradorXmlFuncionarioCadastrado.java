/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Yuri Lopam
 */
public class GeradorXmlFuncionarioCadastrado {
    
    public void GerarXmlFuncionarioLocal(FuncionarioLocal novoFuncionarioLocal) {
        //TODO criar um path genérico 
        String PATH = "C:\\Users\\Yuri Lopam\\Documents\\GitHub\\ProjectMrMayhem\\MrMayhem\\"+novoFuncionarioLocal.getNome()+".xml";
        
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));
            encoder.writeObject(novoFuncionarioLocal);
            encoder.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    
}
