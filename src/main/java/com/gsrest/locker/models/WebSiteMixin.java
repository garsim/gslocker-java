package com.gsrest.locker.models;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class WebSiteMixin {
	
	@JsonCreator
    public WebSiteMixin(
    		@JsonProperty("user_name") String user_name,
    		@JsonProperty("user_password") String user_password,
    		@JsonProperty("notes") String notes,
    		@JsonProperty("url") String url
    		) {
		System.out.println("Wont be called");
	}

}
