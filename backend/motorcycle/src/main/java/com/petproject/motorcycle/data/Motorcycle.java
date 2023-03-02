package com.petproject.motorcycle.data;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "Motorcycles")
public class Motorcycle {
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private Manufacturer manufacturer;
    @Enumerated(EnumType.STRING)
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


    public Motorcycle() {
    }

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

    public long getId() {
        return id;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getEngine() {
        return engine;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getCooling() {
        return cooling;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getDrive() {
        return drive;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return id == that.id && productionYear == that.productionYear && displacement == that.displacement && horsepower == that.horsepower && Double.compare(that.fuelCapacity, fuelCapacity) == 0 && isUsed == that.isUsed && manufacturer == that.manufacturer && modelType == that.modelType && Objects.equals(name, that.name) && Objects.equals(engine, that.engine) && Objects.equals(cooling, that.cooling) && Objects.equals(drive, that.drive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, modelType, name, productionYear, engine, displacement, cooling, horsepower, drive, fuelCapacity, isUsed);
    }
}
