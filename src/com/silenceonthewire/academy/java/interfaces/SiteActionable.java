package com.silenceonthewire.academy.java.interfaces;

public interface SiteActionable {
	
	String url = "https://silenceonthewire.com";
	
	final static String redirectUrl = "https://google.com";
	
	void connect();
	
	void disconnect();
	
	default String redirectToGoogle() {
		return redirectUrl;
		
	}
	
	default String redirectToSite() {
		return url;
	}

}
