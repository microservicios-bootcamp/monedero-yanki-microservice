package com.demo.app.monedero.service;

import com.demo.app.monedero.model.Purse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PurseService {

    Mono<Purse> save(Purse purse);
    Mono<Purse> update(Purse purse, String id);
    Mono<Void> delete(String phoneNumber);
    Flux<Purse> findAll();
    Mono<Purse> findByPhoneNumber(String phoneNumber);
}
