package email;

import java.io.IOException;
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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEnviarEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private	Email emailConf = new Email();
 
    public ServletEnviarEmail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaEmail fachadaEmail = new FachadaEmail();
		String email = request.getParameter("email");
		String titulo = request.getParameter("titulo");
	    String mensagem = request.getParameter("mensagem");
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
