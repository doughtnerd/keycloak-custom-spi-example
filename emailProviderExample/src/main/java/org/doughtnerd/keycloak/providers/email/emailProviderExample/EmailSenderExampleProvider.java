package org.doughtnerd.keycloak.providers.email.emailProviderExample;

import org.jboss.logging.Logger;
import org.keycloak.email.EmailException;
import org.keycloak.email.EmailSenderProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class EmailSenderExampleProvider implements EmailSenderProvider {

	
	private static final Logger logger = Logger.getLogger(EmailSenderExampleProvider.class);

    private final KeycloakSession session;

    public EmailSenderExampleProvider(KeycloakSession session) {
    	logger.warn("Created Custom Email Provider");
     
    	this.session = session;
    }

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void send(RealmModel realm, UserModel user, String subject, String textBody, String htmlBody) throws EmailException {
		// TODO Auto-generated method stub
		logger.warn("Reached Custom Email Provider");
		
	}
    
    
}
