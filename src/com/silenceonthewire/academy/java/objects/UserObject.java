package com.silenceonthewire.academy.java.objects;

public class UserObject {
	
	public User user;
	public User.Validate validate;
	
	public String createUser(String name) {
		
		this.user = new User();
		this.user.setName(name);
		return this.user.getName();
		
	}

}
