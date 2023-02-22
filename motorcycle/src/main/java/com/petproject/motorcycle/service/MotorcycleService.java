package com.petproject.motorcycle.service;

import com.petproject.motorcycle.data.Motorcycle;
import com.petproject.motorcycle.motorcycleRepository.MotorcycleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleService {

    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }


    public List<Motorcycle> getAllMotorcycles() {
        return motorcycleRepository.findAll();
    }
}
