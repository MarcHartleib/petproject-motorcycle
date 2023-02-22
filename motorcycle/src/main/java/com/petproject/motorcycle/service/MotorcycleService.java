package com.petproject.motorcycle.service;

import com.petproject.motorcycle.motorcycleRepository.MotorcycleRepository;
import org.springframework.stereotype.Service;

@Service
public class MotorcycleService {

    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }
    

}
