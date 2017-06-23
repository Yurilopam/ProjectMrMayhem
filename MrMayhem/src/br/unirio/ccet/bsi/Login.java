/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi;

import java.awt.event.WindowEvent;

/**
 *
 * @author Yuri Lopam
 */
public class Login {
    
    public static boolean autenticar(String idUsuario, String senhaUsuario) {
        if (idUsuario.equals("admin") && senhaUsuario.equals("admin")) {
            return true;
        } else if (idUsuario.equals("001") && senhaUsuario.equals("pudim")) {
            return true;
        }
        return false;
    }
    
}
