package com.silenceonthewire.academy.java.exceptions;

import com.silenceonthewire.academy.java.interfaces.SiteActionable;

public class Site implements SiteActionable {
	
	@Override
	public void connect() {
		System.out.println(redirectToSite());
		
	}

	@Override
	public void disconnect() {
		System.out.println(redirectToGoogle());
	}

}
