/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unirio.ccet.bsi;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author LABCCET
 */
public class Utils {
    
    public static String recuperarPath(){ 
        Path path = Paths.get(System.getProperty("user.home"), "Documents", "funcionarios");
        File pastaFuncionarios = new File(path.toString());
        if (!pastaFuncionarios.exists()){
            try {
                pastaFuncionarios.mkdir();
            } catch (SecurityException e){
                System.out.println(e.getMessage());
            } 
        }
        return path.toString();
    }
    
}
