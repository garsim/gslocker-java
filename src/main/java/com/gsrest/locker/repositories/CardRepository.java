package com.gsrest.locker.repositories;


import com.gsrest.locker.models.Card;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, String> {

	@Override
    Optional<Card> findById(String id);
	//Card findOne(String id);

    @Override
    void delete(Card deleted);
	
}
