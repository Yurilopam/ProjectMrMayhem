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
    /**
     * Método que autentica os usuarios que podem logar no sistema
     * @param idUsuario Parametro correspondente ao identificador do usuario
     * @param senhaUsuario Parametro correspondente a senha do usuario
     * @return Verdadeiro caso o usuario tenha permissao ou falso caso contrario
     */
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
