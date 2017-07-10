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
 * usuarios: gerentemrmayhem@gmail.com, supervisormrmayhem@gmail.com, entregadormrmayhem@gmail.com
 * senha: 1wdvfe@3
 * 
 * @author Yuri Lopam 
 */
public class Mail {
    
    /**
     * Metodo utilizado para enviar um email com anexo para determinados usuarios.
     * @param emailRemetente Parametro correspondente ao email do remetente
     * @param senhaRemetente Parametro correspondente a senha do email do remetente
     * @param emailDestinatario Parametro correspondente ao email do destinatario
     * @param assuntoEmail Parametro correspondente ao assunto do email
     * @param textoEmail Parametro correspondente ao texto no corpo do email
     * @param arquivo Parametro correspondente ao arquivo que sera anexado ao email
     * @throws IOException É a classe base para as exceções jogadas ao acessar informações usando fluxos, arquivos e diretórios.
     */
    public void enviarEmailComAnexo(String emailRemetente, String senhaRemetente, String emailDestinatario,
            String assuntoEmail, String textoEmail, String arquivo) throws IOException{
        
        /**
         * Carrega as propriedades para enviar o email
         */
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        /**
         * Inicia uma sessão para autenticar o email e a senha
         */
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(emailRemetente, senhaRemetente);
                }
            });
        
        session.setDebug(true);
        try {
            //Cria a mensagem
            Message message = new MimeMessage(session);
            //Adiciona o email do remetente
            message.setFrom(new InternetAddress(emailRemetente));
            //Adiciona os emails dos destinatarios 
            Address[] toUser = InternetAddress.parse(emailDestinatario);  
            message.setRecipients(Message.RecipientType.TO, toUser);
            //Separa o corpo da mensagem
            MimeBodyPart mbpMensagem = new MimeBodyPart();
            //Adiciona o corpo da mensagem
            mbpMensagem.setText(textoEmail);
            //Cria uma segunda parte para o corpo da mensagem
            Multipart mp = new MimeMultipart();
            //Adiciona o corpo que contem o texto da mensagem 
            mp.addBodyPart(mbpMensagem);
            //O caminho do anexo que sera enviado.
            InputStream is = new FileInputStream(Utils.recuperarPath("Relatorios")+"\\"+arquivo);
            //Adicionando o anexo na mensagem
            MimeBodyPart mbpAnexo = new MimeBodyPart();
            mbpAnexo.setDataHandler(new DataHandler(new ByteArrayDataSource(is, "application/pdf")));		
            mbpAnexo.setFileName(arquivo);
            mp.addBodyPart(mbpAnexo);
            //Adiciona o assunto do email
            message.setSubject(assuntoEmail);
            //Seta o conteudo do email
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
        /**
         * Carrega as propriedades para enviar o email
         */
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        /**
         * Inicia uma sessão para autenticar o email e a senha
         */
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(emailRemetente, senhaRemetente);
                }
            });
        
        session.setDebug(true);
        try {
            //Cria a mensagem
            Message message = new MimeMessage(session);
            //Adiciona o email do remetente
            message.setFrom(new InternetAddress(emailRemetente));
            //Adiciona os emails dos destinatarios 
            Address[] toUser = InternetAddress.parse(emailDestinatario);  
            message.setRecipients(Message.RecipientType.TO, toUser);
            //Adiciona o assunto do email
            message.setSubject(assuntoEmail);
            //Adiciona o corpo da mensagem
            message.setText(textoEmail);
            //Método para enviar a mensagem criada
            Transport.send(message);
            System.out.println("Feito!!!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
