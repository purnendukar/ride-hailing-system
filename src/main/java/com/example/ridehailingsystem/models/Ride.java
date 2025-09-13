package com.example.ridehailingsystem.models;

import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

public class Ride extends  BaseModel{

    @ManyToOne
    private User rider;

    @ManyToOne
    private User driver;

    @Enumerated
    private RideStatus status;

    private String pickup;
    private String dropoff;
    private double fare;
}
