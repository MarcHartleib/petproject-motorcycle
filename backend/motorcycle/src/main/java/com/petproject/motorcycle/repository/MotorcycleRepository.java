package com.petproject.motorcycle.repository;

import com.petproject.motorcycle.data.Manufacturer;
import com.petproject.motorcycle.data.ModelType;
import com.petproject.motorcycle.data.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {

    List<Motorcycle> findByHorsepowerLessThanEqualAndManufacturer(int horsepower, Manufacturer manufacturer);

    List<Motorcycle> findByIsUsedIsFalse();

    List<Motorcycle> findByManufacturerAndModelTypeAndIsUsedIsFalse(Manufacturer manufacturer, ModelType modelType);

}
