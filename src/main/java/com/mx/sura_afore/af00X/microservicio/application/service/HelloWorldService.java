package com.mx.sura_afore.af00X.microservicio.application.service;

import com.mx.sura_afore.af00X.microservicio.domain.model.HelloWorldResponse;
import com.mx.sura_afore.af00X.microservicio.domain.model.HelloWorldResponseData;
import com.mx.sura_afore.af00X.microservicio.infrastructure.repository.SystemConnectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloWorldService {

    private final SystemConnectionRepository repository;

    public HelloWorldResponse getGreeting() {
        long count = -1;
        String status;
        try {
            count = repository.count();
            status = "Database connection is active";
        } catch (Exception e) {
            status = "Database connection error: " + e.getMessage();
        }

        HelloWorldResponseData data = new HelloWorldResponseData();
        data.setMessage("Hello World from afsuam-mx-af00X-sa-hello-world API! (table count: " + count + ")");
        data.setStatus(status);

        HelloWorldResponse response = new HelloWorldResponse();
        response.setData(data);

        return response;
    }
}
