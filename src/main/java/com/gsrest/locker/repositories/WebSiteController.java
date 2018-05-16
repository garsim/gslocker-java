package com.gsrest.locker.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gsrest.locker.models.Card;
import com.gsrest.locker.models.WebSite;

@RestController
public class WebSiteController {
	
	@Autowired
	WebSiteRepository websiteRepository;
	
	@RequestMapping(method=RequestMethod.GET, value="/websites")
	public Iterable<WebSite> website() {
        return websiteRepository.findAll();
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/websites")
    public String save(@RequestBody WebSite website) {
		websiteRepository.save(website);

        return website.getId();
    }

	@RequestMapping(method=RequestMethod.GET, value="/websites/{id}")
    public WebSite show(@PathVariable String id) {
        return websiteRepository.findById(id).get();
    }
	
	@RequestMapping(method=RequestMethod.PUT, value="/websites/{id}")
    public WebSite update(@PathVariable String id, @RequestBody WebSite website) {
		WebSite ws_to_update = websiteRepository.findById(id).get();
        if(website.getNotes() != null)
        	ws_to_update.setNotes(website.getNotes());
        if(website.getUrl() != null)
        	ws_to_update.setUrl(website.getUrl());
        if(website.getUser_name() != null)
        	ws_to_update.setUser_name(website.getUser_name());
        if(website.getUser_password() != null)
        	ws_to_update.setUser_password(website.getUser_password());
        
        websiteRepository.save(ws_to_update);
        return ws_to_update;
    }
	
	@RequestMapping(method=RequestMethod.DELETE, value="/websites/{id}")
    public String delete(@PathVariable String id) {
		WebSite website = websiteRepository.findById(id).get();
        websiteRepository.delete(website);

        return "website deleted";
    }

}
