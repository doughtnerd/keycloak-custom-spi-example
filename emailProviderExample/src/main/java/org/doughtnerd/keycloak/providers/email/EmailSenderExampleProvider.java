package org.doughtnerd.keycloak.providers.email;

import java.util.Map;

import org.jboss.logging.Logger;
import org.keycloak.email.EmailException;
import org.keycloak.email.EmailSenderProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.UserModel;

public class EmailSenderExampleProvider implements EmailSenderProvider {

	
	private static final Logger logger = Logger.getLogger(EmailSenderExampleProvider.class);

    private final KeycloakSession session;

    public EmailSenderExampleProvider(KeycloakSession session) {
    	logger.warn("Created Custom Email Provider");
     
    	this.session = session;
    }

	public void close() {
	}


	public void send(Map<String, String> config, UserModel user, String subject, String textBody, String htmlBody)
			throws EmailException {
		logger.warn("Reached Custom Email Provider");
		
	}
    
    
}
