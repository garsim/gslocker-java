package com.gsrest.locker.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "websites")
public class WebSite {
	
	@Id
	public String id;
	
	public String user_name;
	public String user_password;
	public String url;
	public String notes;
	
	public WebSite() {
        super();
    }
 
	
	WebSite(String user_name, String user_password, String url, String notes){
		this.user_name = user_name;
		this.user_password = user_password;
		this.url = url;
		this.notes = notes;
	}
	
	//getters
	public String getId() {
		 return id;
	 }
	public String getUser_name() {
		return user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public String getUrl() {
		return url;
	}
	public String getNotes() {
		return notes;
	}
	
	//setters
	public void setUser_name (String user_name) {
		this.user_name = user_name;
	}
	public void setUser_password (String user_password) {
		this.user_password = user_password;
	}
	public void setUrl (String url) {
		this.url = url;
	}
	public void setNotes (String notes) {
		this.notes = notes;
	}
	
}
