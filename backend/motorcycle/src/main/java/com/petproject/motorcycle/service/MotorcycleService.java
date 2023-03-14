package com.petproject.motorcycle.service;

import com.petproject.motorcycle.data.Motorcycle;
import com.petproject.motorcycle.repository.MotorcycleRepository;
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

    public Motorcycle save(Motorcycle motorcycle) {
        return motorcycleRepository.save(motorcycle);
    }

    public Motorcycle update(Motorcycle motorcycle) {
        return motorcycleRepository.save(motorcycle);
    }

    public void delete(Motorcycle motorcycle) {
        motorcycleRepository.delete(motorcycle);
    }

    public Optional<Motorcycle> getMotorcycleById(long id) {
        return motorcycleRepository.findById(id);
    }
}
