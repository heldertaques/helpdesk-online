package email;

import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarEmail {
	public void enviarEmail(String email, String titulo, String mensagem){
		FachadaEmail fachadaEmail = new FachadaEmail();
		Email emailConf = new Email();
	    try {
			emailConf = fachadaEmail.pegarConfigEmail();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		prop.put("mail.transport.protocol", emailConf.getProtocol()); 
        prop.put("mail.smtp.host", emailConf.getHost());
        prop.put("mail.smtp.starttls.enable",emailConf.getStarttls());
        prop.put("mail.smtp.auth", emailConf.getAuthent());
        prop.put("mail.smtp.port", emailConf.getPort());
        
        Authenticator aut = new Authenticator() {
        	public PasswordAuthentication getPasswordAuthentication() {
        		Email emailConf = new Email();
        		FachadaEmail fachadaEmail = new FachadaEmail();
    			try {
					emailConf = fachadaEmail.pegarConfigEmail();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
        		String username = emailConf.getMailUser();
    			String password = emailConf.getPasswd();
    			return new PasswordAuthentication(username, password);
    		}
		};
        
        Session session = Session.getDefaultInstance(prop, aut);
        
        Message msg = new MimeMessage(session);
        
       try {
    	   msg.setFrom(new InternetAddress(emailConf.getMailUser()));
	
    	   msg.setRecipient(Message.RecipientType.TO,new InternetAddress(email));
    	   msg.setSentDate(new java.util.Date());
    	   msg.setSubject(titulo);
  
		
       String mensagemFormatada = "<HTML>";
       mensagemFormatada += mensagem;
       mensagemFormatada += "</HTML>";
       
	   msg.setText(mensagemFormatada);
	   msg.setContent(mensagemFormatada, "text/html");

	   Transport.send(msg);
	   
       } catch (AddressException e) {
			e.printStackTrace();
	   } catch (MessagingException e) {
			e.printStackTrace();
	   }

	}

}
