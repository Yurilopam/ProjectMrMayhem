/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.controller;

/**
 *
 * @author Yuri Lopam
 */
public class Login {
    
    private static String idUsuario;
    
    public static boolean autenticar(String idUsuario, String senhaUsuario) {
        Login.idUsuario = idUsuario;
        if (idUsuario.equals("admin") && senhaUsuario.equals("admin")) {
            return true;
        } else if (idUsuario.equals("001") && senhaUsuario.equals("pudim")) {
            return true;
        }
        return false;
    }

    /**
     * @return the idUsuario
     */
    public static String getIdUsuario() {
        return idUsuario;
    }
    
}
