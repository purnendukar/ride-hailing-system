package com.example.ridehailingsystem.controllers;

import com.example.ridehailingsystem.models.Ride;
import com.example.ridehailingsystem.models.User;
import com.example.ridehailingsystem.requests.RideRequestDto;
import com.example.ridehailingsystem.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping("/request")
    public Ride requestRide(@RequestBody RideRequestDto dto) {
        User rider = new User(); // In real app, fetch from DB/Auth
        rider.setId(dto.getRiderId());
        return rideService.requestRide(rider, dto.getPickup(), dto.getDropoff());
    }

    @PostMapping("/{rideId}/accept")
    public Ride acceptRide(@PathVariable Long rideId, @RequestParam Long driverId) {
        User driver = new User(); // fetch from DB
        driver.setId(driverId);
        return rideService.acceptRide(rideId, driver);
    }

    @PostMapping("/{rideId}/complete")
    public Ride completeRide(@PathVariable Long rideId) {
        return rideService.completeRide(rideId);
    }
}
