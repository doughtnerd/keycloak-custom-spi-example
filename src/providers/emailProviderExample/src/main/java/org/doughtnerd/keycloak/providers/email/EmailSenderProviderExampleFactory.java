package org.doughtnerd.keycloak.providers.email;

import java.util.LinkedHashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.keycloak.Config;
import org.keycloak.email.EmailSenderProvider;
import org.keycloak.email.EmailSenderProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ServerInfoAwareProviderFactory;

public class EmailSenderProviderExampleFactory implements EmailSenderProviderFactory, ServerInfoAwareProviderFactory {
	private static final Logger logger = Logger.getLogger(EmailSenderProviderExampleFactory.class);
	
	public EmailSenderProvider create(KeycloakSession session) {
		logger.warn("....Create called....");
		EmailSenderExampleProvider provider = new EmailSenderExampleProvider(session);
		return provider;
	}

	public void init(Config.Scope config) {
	}

	public void postInit(KeycloakSessionFactory factory) {
	}

	public void close() {
	}

	public String getId() {
		return "emailSenderExampleProvider";
	}

	public Map<String, String> getOperationalInfo() {
		Map<String, String> ret = new LinkedHashMap<String, String>();
        ret.put("version", "1.0");
        ret.put("Example 1", "Test");
        ret.put("Example 2", "Test");
        return ret;
	}

}
