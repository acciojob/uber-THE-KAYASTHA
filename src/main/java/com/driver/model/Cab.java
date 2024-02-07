package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name="Cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int perKmRate;

    private boolean available;

    public Cab(){

    }

    public Cab(int id,int perKmRate,boolean available){
        this.id=id;
        this.perKmRate=perKmRate;
        this.available=available;
    }
    public Cab(int perKmRate,boolean available){
        this.perKmRate=perKmRate;
        this.available=available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public int getId() {
        return id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }


    @JoinColumn
    @OneToOne
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}