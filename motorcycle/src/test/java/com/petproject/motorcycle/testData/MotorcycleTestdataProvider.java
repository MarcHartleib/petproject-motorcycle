package com.petproject.motorcycle.testData;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petproject.motorcycle.data.Motorcycle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MotorcycleTestdataProvider {

    private final String file = "src/test/resources/motorcycle.json";

    public MotorcycleTestdataProvider() {
    }

    public String getRequestBody() {
        try {
            return new String(Files.readAllBytes(Paths.get(file)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Motorcycle getMotorcycleTestObject() {
        try {
            return new ObjectMapper().readValue(Files.readAllBytes(Paths.get(file)), Motorcycle.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
