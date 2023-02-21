package com.petproject.motorcycle.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {

    int testNumber = 1;


    @GetMapping
    public String getMotorcycle() {
        return "Get";
    }

    @PostMapping
    public void postMotorcycle(@RequestBody String text) {
        System.out.println(text);;
    }

    @PutMapping
    public void putMotorcycle(@RequestBody int number) {
        System.out.println(testNumber + number);
    }

    @DeleteMapping
    public String deleteMotorcycle() {
        return "Delete";
    }
}
