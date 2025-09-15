package com.example.ridehailingsystem.repositories;

import com.example.ridehailingsystem.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
