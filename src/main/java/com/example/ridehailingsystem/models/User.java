package com.example.ridehailingsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class User extends  BaseModel{

    private String name;
    private String phoneNumber;

    @Enumerated
    private UserType type;
}
