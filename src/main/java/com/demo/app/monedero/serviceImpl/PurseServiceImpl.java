package com.demo.app.monedero.serviceImpl;

import com.demo.app.monedero.model.Purse;
import com.demo.app.monedero.repository.PurseRepository;
import com.demo.app.monedero.service.PurseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class PurseServiceImpl implements PurseService {

    @Autowired
    private PurseRepository purseRepository;

    @Override
    public Mono<Purse> save(Purse purse) {
        return null;
    }

    @Override
    public Mono<Purse> update(Purse purse, String id) {
        return null;
    }

    @Override
    public Mono<Void> delete(String phoneNumber) {
        return null;
    }

    @Override
    public Flux<Purse> findAll() {
        return null;
    }

    @Override
    public Mono<Purse> findByPhoneNumber(String phoneNumber) {
        return purseRepository.getByPhoneNumber(phoneNumber)
                .doOnNext(p -> log.info("Monedero with phonenumber " + p.getPhoneNumber()))
                .flatMap(p -> {
                    return Mono.error(new Throwable("Monedero not exist!!" + p.getPhoneNumber()));
                });
//                .onErrorResume(err -> err.getMessage());

//                .onErrorResume(err -> Mono.just("Error " + err.getMessage()));
    }
}
