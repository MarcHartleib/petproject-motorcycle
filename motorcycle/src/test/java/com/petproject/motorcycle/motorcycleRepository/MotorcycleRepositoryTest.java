package com.petproject.motorcycle.motorcycleRepository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MotorcycleRepositoryTest {

    @Test
    void findByHorsepowerLessThanEqualAndManufacturer() {

    }

    @Test
    void findByUsedIsFalse() {
    }

    @Test
    void findByManufacturerAndModelTypeAndUsedIsFalse() {
    }
}