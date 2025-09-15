package com.example.ridehailingsystem.services;

import com.example.ridehailingsystem.models.Ride;
import com.example.ridehailingsystem.models.RideStatus;
import com.example.ridehailingsystem.models.User;
import com.example.ridehailingsystem.repositories.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements  RideService{
    @Autowired
    private RideRepository rideRepository;

    public Ride requestRide(User rider, String pickup, String dropoff) {
        Ride ride = new Ride();
        ride.setRider(rider);
        ride.setPickup(pickup);
        ride.setDropoff(dropoff);
        ride.setStatus(RideStatus.REQUESTED);
        return rideRepository.save(ride);
    }

    public Ride acceptRide(Long rideId, User driver) {
        Ride ride = rideRepository.findById(rideId)
                .orElseThrow(() -> new RuntimeException("Ride not found"));
        ride.setDriver(driver);
        ride.setStatus(RideStatus.ACCEPTED);
        return rideRepository.save(ride);
    }

    public Ride completeRide(Long rideId) {
        Ride ride = rideRepository.findById(rideId)
                .orElseThrow(() -> new RuntimeException("Ride not found"));
        ride.setStatus(RideStatus.COMPLETED);
        // fare calculation logic can go here
        return rideRepository.save(ride);
    }
}
