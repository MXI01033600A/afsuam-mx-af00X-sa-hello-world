package com.mx.sura_afore.af00X.microservicio.infrastructure.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "system_validation")
@Data
public class SystemValidationEntity {
    @Id
    private Long id;
    private String description;
}
