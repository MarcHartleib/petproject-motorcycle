package com.petproject.motorcycle.controller;

import com.petproject.motorcycle.data.Motorcycle;
import com.petproject.motorcycle.service.MotorcycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void postMotorcycle(@RequestBody String text) {
        System.out.println(text);;
    }

    @PutMapping("/{id}")
    public void putMotorcycle(@PathVariable("id") int id, @RequestBody int number) {
    }

    @DeleteMapping
    public String deleteMotorcycle() {
        return "Delete";
    }
}
