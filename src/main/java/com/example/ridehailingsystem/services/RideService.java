package com.example.ridehailingsystem.services;

import com.example.ridehailingsystem.models.Ride;
import com.example.ridehailingsystem.models.User;

public interface RideService {

    public Ride requestRide(User rider, String pickup, String dropoff);
    public Ride acceptRide(Long rideId, User driver);
    public Ride completeRide(Long rideId);
}
