package com.petproject.motorcycle.controller;

import com.petproject.motorcycle.data.Motorcycle;
import com.petproject.motorcycle.service.MotorcycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {

    private final MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }


    @GetMapping
    public List<Motorcycle> getMotorcycles() {
        return motorcycleService.getAllMotorcycles();
    }

    @PostMapping
    public Motorcycle postMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.save(motorcycle);
    }

    @PutMapping()
    public Motorcycle putMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.update(motorcycle);
    }

    @DeleteMapping
    public void deleteMotorcycle(@RequestBody Motorcycle motorcycle) {
        motorcycleService.delete(motorcycle);
    }

    @GetMapping("/{id}")
    public Optional<Motorcycle> getMotorcycleById(@PathVariable("id") long id) {
        return motorcycleService.getMotorcycleById(id);
    }

}
