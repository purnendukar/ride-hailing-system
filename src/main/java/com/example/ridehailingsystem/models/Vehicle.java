package com.example.ridehailingsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Vehicle extends BaseModel{
    private String licensePlate;

    @Enumerated
    private VehicleType type;

    @OneToOne
    private User driver;
}
