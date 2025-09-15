package com.example.ridehailingsystem.requests;

import lombok.Data;

@Data
public class RideRequestDto {
        private Long riderId;
        private String pickup;
        private String dropoff;
}
