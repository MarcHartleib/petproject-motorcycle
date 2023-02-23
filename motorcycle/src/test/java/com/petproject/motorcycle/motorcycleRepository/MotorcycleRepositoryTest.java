package com.petproject.motorcycle.motorcycleRepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petproject.motorcycle.data.Manufacturer;
import com.petproject.motorcycle.data.ModelType;
import com.petproject.motorcycle.data.Motorcycle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@DataJpaTest
class MotorcycleRepositoryTest {

    private final String jsonFile = "src/test/resources/motorcycle.json";
    private final String requestBody = new String(Files.readAllBytes(Paths.get(jsonFile)));
    private final Motorcycle motorcycle = new ObjectMapper().readValue(requestBody, Motorcycle.class);
    @Autowired
    MotorcycleRepository motorcycleRepository;

    MotorcycleRepositoryTest() throws IOException {
    }

    @BeforeEach
    void before() {
        motorcycleRepository.save(motorcycle);
    }

    @AfterEach
    void after() {
        motorcycleRepository.delete(motorcycle);
    }

    @Test
    void findByHorsepowerLessThanEqualAndManufacturer() {
        int horsepower = 101;
        Manufacturer manufacturer = Manufacturer.HONDA;

        List<Motorcycle> motorcycles = motorcycleRepository.
                findByHorsepowerLessThanEqualAndManufacturer(horsepower, manufacturer);

        assertFalse(motorcycles.isEmpty());
    }

    @Test
    void findByUsedIsFalse() {
        List<Motorcycle> motorcycles = motorcycleRepository.findByIsUsedIsFalse();
        assertFalse(motorcycles.isEmpty());
    }

    @Test
    void findByManufacturerAndModelTypeAndUsedIsFalse() {
        Manufacturer manufacturer = Manufacturer.HONDA;
        ModelType modelType = ModelType.ADVENTURE;

        List<Motorcycle> motorcycles = motorcycleRepository
                .findByManufacturerAndModelTypeAndIsUsedIsFalse(manufacturer, modelType);

        assertFalse(motorcycles.isEmpty());
    }
}