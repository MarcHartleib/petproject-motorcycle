package com.petproject.motorcycle.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}
