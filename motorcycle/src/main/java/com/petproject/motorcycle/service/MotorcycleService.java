package com.petproject.motorcycle.service;

import com.petproject.motorcycle.data.Motorcycle;
import com.petproject.motorcycle.motorcycleRepository.MotorcycleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotorcycleService {

    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }


    public List<Motorcycle> getAllMotorcycles() {
        return motorcycleRepository.findAll();
    }

    public void save(Motorcycle motorcycle) {
        motorcycleRepository.save(motorcycle);
    }

    public void update(Motorcycle motorcycle) {
        motorcycleRepository.save(motorcycle);
    }

    public void delete(Motorcycle motorcycle) {
        motorcycleRepository.delete(motorcycle);
    }

    public Optional<Motorcycle> getMotorcycleById(Long id) {
        return motorcycleRepository.findById(id);
    }
}
