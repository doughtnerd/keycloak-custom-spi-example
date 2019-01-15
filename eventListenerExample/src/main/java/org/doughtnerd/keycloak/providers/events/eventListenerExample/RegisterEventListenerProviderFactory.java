package org.doughtnerd.keycloak.providers.events.eventListenerExample;

import org.keycloak.Config.Scope;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class RegisterEventListenerProviderFactory implements EventListenerProviderFactory {

	public EventListenerProvider create(KeycloakSession session) {
		return new RegisterEventListenerProvider();
	}

	public void init(Scope config) {
		// TODO Auto-generated method stub
		
	}

	public void postInit(KeycloakSessionFactory factory) {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public String getId() {
		return "registerEventListenerExampleProvider";
	}

}
