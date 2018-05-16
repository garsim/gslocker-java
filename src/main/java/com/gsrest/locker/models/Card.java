package com.gsrest.locker.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cards")
public class Card {

	@Id
	public String id;
	
	public String card_name;
	public String cvv;
	public String card_number;
	public String expiration_date;
	public String pin_code;
	public String notes;
	
	public Card() {
        super();
    }
 
	
	 Card(String card_name, String notes, String pin_code, String expiration_date, String cvv, String card_number){
		 this.card_name = card_name;
		 this.card_number = card_number;
		 this.cvv = cvv;
		 this.expiration_date = expiration_date;
		 this.pin_code = pin_code;
		 this.notes = notes;
	 }
	
	//getters
	 public String getId() {
		 return id;
	 }
	public String getName() {
		return card_name;
	}
	public String getCard_number() {
		return card_number;
	}
	public String getCvv() {
		return cvv;
	}
	public String getExpiration_date() {
		return notes;
	}
	public String getPin_code() {
		return pin_code;
	}
	public String getNotes() {
		return notes;
	}
	
	
	
	//setters
	public void setCard_name (String card_name) {
		this.card_name = card_name;
	}
	public void setCard_number (String card_number) {
		this.card_number = card_number;
	}
	public void setCvv (String cvv) {
		this.cvv = cvv;
	}
	public void setExpiration_date (String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public void setPin_code (String pin_code) {
		this.pin_code = pin_code;
	}
	public void setNotes (String notes) {
		this.notes = notes;
	}
}
