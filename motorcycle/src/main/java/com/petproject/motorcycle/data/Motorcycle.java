package com.petproject.motorcycle.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "Motorcycles")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Manufacturer manufacturer;
    private ModelType modelType;
    private String name;
    private int productionYear;
    private String engine;
    private int displacement;
    private String cooling;
    private int horsepower;
    private String drive;
    private double fuelCapacity;
    private boolean isUsed;

    public Motorcycle(Manufacturer manufacturer,
                      ModelType modelType,
                      String name,
                      int productionYear,
                      String engine,
                      int displacement,
                      String cooling,
                      int horsepower,
                      String drive,
                      double fuelCapacity,
                      boolean isUsed) {
        this.manufacturer = manufacturer;
        this.modelType = modelType;
        this.name = name;
        this.productionYear = productionYear;
        this.engine = engine;
        this.displacement = displacement;
        this.cooling = cooling;
        this.horsepower = horsepower;
        this.drive = drive;
        this.fuelCapacity = fuelCapacity;
        this.isUsed = isUsed;
    }
}
