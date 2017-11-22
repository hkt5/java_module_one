package com.silenceonthewire.academy.java.exceptions;

import com.silenceonthewire.academy.java.interfaces.SiteActionable;

public class WebSite {

	public static void main (String [] args) {
        SiteActionable site = new Site ();
        site.connect();
        site.disconnect();
    }
	
}
