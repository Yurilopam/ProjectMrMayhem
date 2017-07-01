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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Yuri Lopam
 */
public class Xml {    

    public void GerarXml(Object object) {
        try {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(Utils.recuperarPath())));
            encoder.writeObject(object);
            encoder.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Object LerXml(String fileName) {
        Object object = null;        
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(Utils.recuperarPath())));
            object = decoder.readObject();        
            decoder.close();            
            return object;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return object;
    }

}
