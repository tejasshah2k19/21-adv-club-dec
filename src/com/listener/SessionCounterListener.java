package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounterListener implements HttpSessionListener {

	int userCounter = 0;

	public void sessionCreated(HttpSessionEvent event) {
		userCounter++;
		System.out.println("User IN + " + userCounter);
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		userCounter--;
		System.out.println("User OUT + " + userCounter);

	}

}
