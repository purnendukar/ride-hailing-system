package com.example.ridehailingsystem.repositories;

import com.example.ridehailingsystem.models.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
