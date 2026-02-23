package com.mx.sura_afore.af00X.microservicio.interfaces.controller;

import com.mx.sura_afore.af00X.microservicio.domain.model.HelloWorldResponse;
import com.mx.sura_afore.af00X.microservicio.application.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController implements HelloWorldApi {

    private final HelloWorldService helloWorldService;

    @Override
    public ResponseEntity<HelloWorldResponse> getHelloWorld() {
        return ResponseEntity.ok(helloWorldService.getGreeting());
    }
}
