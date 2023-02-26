package com.petproject.motorcycle.service;

import com.petproject.motorcycle.data.Manufacturer;
import com.petproject.motorcycle.data.ModelType;
import com.petproject.motorcycle.data.Motorcycle;
import com.petproject.motorcycle.motorcycleRepository.MotorcycleRepository;
import com.petproject.motorcycle.testData.MotorcycleTestdataProvider;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MotorcycleServiceTest {

    private final Motorcycle motorcycles = new Motorcycle(Manufacturer.HONDA,
            ModelType.ADVENTURE,
            "CRF1100L Africa Twin - Adventure Sports",
            2023,
            "2-Stroke",
            1084,
            "liquid cooled",
            100,
            "chain",
            18.8,
            false);

    private final MotorcycleTestdataProvider motorcycleTestdataProvider = new MotorcycleTestdataProvider();

    private final Motorcycle motorcycle = motorcycleTestdataProvider.getMotorcycleTestObject();
    MotorcycleRepository motorcycleRepository = mock(MotorcycleRepository.class);
    MotorcycleService motorcycleService = new MotorcycleService(motorcycleRepository);

    @Test
    void getAllMotorcycles() {
        motorcycleService.getAllMotorcycles();

        verify(motorcycleRepository).findAll();
    }

    @Test
    void save() {
        motorcycleService.save(motorcycle);

        verify(motorcycleRepository).save(motorcycle);
    }

    @Test
    void update() {
        motorcycleService.update(motorcycle);

        verify(motorcycleRepository).save(motorcycle);
    }

    @Test
    void delete() {
        motorcycleService.delete(motorcycle);

        verify(motorcycleRepository).delete(motorcycle);
    }

    @Test
    void getMotorcycleById() {
        motorcycleService.getMotorcycleById(1);

        verify(motorcycleRepository).findById(1L);
    }
}