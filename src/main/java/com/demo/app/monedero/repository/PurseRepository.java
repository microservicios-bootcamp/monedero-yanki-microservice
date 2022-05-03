package com.demo.app.monedero.repository;

import com.demo.app.monedero.model.Purse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PurseRepository extends ReactiveMongoRepository<Purse, String> {

    public Mono<Purse> getByPhoneNumber(String phoneNumber);
}
