package com.petproject.motorcycle.motorcycleRepository;

import com.petproject.motorcycle.data.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
}
