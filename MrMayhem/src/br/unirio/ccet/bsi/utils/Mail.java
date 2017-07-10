/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

/**
 * usuario: supervisormrmayhem@gmail.com
 * senha: 1wdvfe@3
 * 
 * @author Yuri Lopam 
 */
public class Mail {
    
    public void enviarEmailComAnexo(String emailRemetente, String senhaRemetente, String emailDestinatario,
            String assuntoEmail, String textoEmail, String arquivo) throws IOException{
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(emailRemetente, senhaRemetente);
                }
            });
        
        session.setDebug(true);
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailRemetente));
            Address[] toUser = InternetAddress.parse(emailDestinatario);  
            message.setRecipients(Message.RecipientType.TO, toUser);

            MimeBodyPart mbpMensagem = new MimeBodyPart();
            mbpMensagem.setText(textoEmail);
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbpMensagem);
            //imagem que sera enviada em anexo, ta no mesmo diretorio da classe.
            InputStream is = new FileInputStream(Utils.recuperarPath("Relatorios")+"\\"+arquivo);
            //setando o anexo
            MimeBodyPart mbpAnexo = new MimeBodyPart();
            mbpAnexo.setDataHandler(new DataHandler(new ByteArrayDataSource(is, "application/pdf")));		
            mbpAnexo.setFileName(arquivo);
            System.out.println(mbpAnexo.getDataHandler());
            mp.addBodyPart(mbpAnexo);
            //assunto do email
            message.setSubject(assuntoEmail);
            //seleciona o conteudo
            message.setContent(mp);
            //Método para enviar a mensagem criada
            Transport.send(message);
            System.out.println("Feito!!!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void enviarEmail(String emailRemetente, String senhaRemetente, String emailDestinatario,
            String assuntoEmail, String textoEmail) throws IOException{
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(emailRemetente, senhaRemetente);
                }
            });
        
        session.setDebug(true);
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailRemetente));
            Address[] toUser = InternetAddress.parse(emailDestinatario);  
            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(assuntoEmail);
            message.setText(textoEmail);
            //Método para enviar a mensagem criada
            Transport.send(message);
            System.out.println("Feito!!!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
