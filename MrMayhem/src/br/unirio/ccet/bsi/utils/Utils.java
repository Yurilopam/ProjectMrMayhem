/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unirio.ccet.bsi.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Yuri Lopam
 */
public class Utils {
    
    /**
     * Este metodo recupera o caminho baseado na entidade recebida
     * @param nomeEntidade Variavel recebida para gerar o nome da pasta que sera criada
     * @return o caminho da pasta onde o arquivo sera gravado
     */
    public static String recuperarPath(String nomeEntidade){ 
        Path path = Paths.get(System.getProperty("user.home"), "Documents", "MrMayhem", nomeEntidade);
        if (!Files.exists(path)){
            try {
                Files.createDirectories(path);
            } catch (IOException e){
                System.out.println(e.getMessage());
            } 
        }
        return path.toString();
    }
    
}
