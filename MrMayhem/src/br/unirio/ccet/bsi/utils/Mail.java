/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * usuario: supervisormrmayhem@gmail.com
 * senha: 1wdvfe@3
 * 
 * @author Yuri Lopam 
 */
public class Mail {
    
    public void enviarEmail(String emailRemetente, String senhaRemetente, String emailDestinatario,
            String assuntoEmail, String textoEmail){
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(emailRemetente, senhaRemetente);
                }
            });
        session.setDebug(true);
        try {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(emailRemetente)); //Remetente
            
            Address[] toUser = InternetAddress //Destinatário(s)
                    .parse(emailDestinatario);  
            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(assuntoEmail);//Assunto
            message.setText(textoEmail);
            /**Método para enviar a mensagem criada*/
            Transport.send(message);
            System.out.println("Feito!!!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
