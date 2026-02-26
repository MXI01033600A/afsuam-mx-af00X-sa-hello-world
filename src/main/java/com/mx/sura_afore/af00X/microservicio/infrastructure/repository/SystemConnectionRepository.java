package com.mx.sura_afore.af00X.microservicio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemConnectionRepository extends JpaRepository<SystemValidationEntity, Long> {
}
