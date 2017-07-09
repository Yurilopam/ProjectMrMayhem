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
        if (idUsuario.equals("gerente") && senhaUsuario.equals("1234")) {
            return true;
        } else if (idUsuario.equals("supervisor") && senhaUsuario.equals("1234")){
            return true;
        } else if (idUsuario.equals("atendente") && senhaUsuario.equals("1234")) {
            return true;
        } else if (idUsuario.equals("entregador") && senhaUsuario.equals("1234")) {
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
