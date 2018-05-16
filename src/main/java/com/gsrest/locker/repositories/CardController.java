package com.gsrest.locker.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gsrest.locker.models.Card;

@RestController
public class CardController {

	@Autowired
	CardRepository cardRepository;
	
	@RequestMapping(method=RequestMethod.GET, value="/cards")
	public Iterable<Card> card() {
        return cardRepository.findAll();
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/cards")
    public String save(@RequestBody Card card) {
        cardRepository.save(card);

        return card.getId();
    }
	
	@RequestMapping(method=RequestMethod.GET, value="/cards/{id}")
    public Card show(@PathVariable String id) {
        return cardRepository.findById(id).get();
    }
	
	@RequestMapping(method=RequestMethod.PUT, value="/cards/{id}")
    public Card update(@PathVariable String id, @RequestBody Card card) {
		//TO-DO: check if it instance of 
		Card card_to_update = cardRepository.findById(id).get();
        if(card.getName() != null)
        	card_to_update.setCard_name(card.getName());
        if(card.getCard_number() != null)
        	card_to_update.setCard_number(card.getCard_number());
        if(card.getCvv() != null)
        	card_to_update.setCvv(card.getCvv());
        if(card.getExpiration_date() != null)
        	card_to_update.setExpiration_date(card.getExpiration_date());
        if(card.getNotes() != null)
        	card_to_update.setNotes(card.getNotes());
        if(card.getPin_code() != null)
        	card_to_update.setPin_code(card.getPin_code());
        cardRepository.save(card_to_update);
        return card_to_update;
    }
	
	@RequestMapping(method=RequestMethod.DELETE, value="/cards/{id}")
    public String delete(@PathVariable String id) {
        Card product = cardRepository.findById(id).get();
        cardRepository.delete(product);

        return "card deleted";
    }
	
	
}
