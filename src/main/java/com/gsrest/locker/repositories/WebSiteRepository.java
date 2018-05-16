package com.gsrest.locker.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gsrest.locker.models.WebSite;

public interface WebSiteRepository extends CrudRepository<WebSite, String> {
/*
	public List<WebSite> getAllWebSites();
	public WebSite getWebSite(String id);
	public void updateCard(WebSite ws);
	public void deleteCard(WebSite ws);
*/

	@Override
	Optional<WebSite> findById(String id);
	//WebSite findOne(String id);
	
	@Override
	void delete(WebSite deleted);
	
}
