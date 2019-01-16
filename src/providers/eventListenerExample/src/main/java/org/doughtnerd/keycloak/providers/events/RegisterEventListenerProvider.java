package org.doughtnerd.keycloak.providers.events;


import org.jboss.logging.Logger;
import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventType;
import org.keycloak.events.admin.AdminEvent;

public class RegisterEventListenerProvider implements EventListenerProvider {
	
	
	private static final Logger logger = Logger.getLogger(RegisterEventListenerProvider.class);
	
	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void onEvent(Event event) {
		logger.info("Called onEvent...");
		if (event.getType().equals(EventType.REGISTER)) {
        	logger.info("Caught Registration Event.... Do what you like from here.");
        }
	}

	public void onEvent(AdminEvent event, boolean includeRepresentation) {
		// TODO Auto-generated method stub
		
	}

}
