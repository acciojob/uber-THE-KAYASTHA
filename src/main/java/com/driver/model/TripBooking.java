package com.driver.model;

import com.driver.model.TripStatus;

import javax.persistence.*;

@Entity
@Table(name="tripbooking")
public class TripBooking{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;

    private String fromLocation;
    private String toLocation;
    private int distanceInKm;

    private int bill;
    private TripStatus status;


    public TripBooking(){

    }

    public TripBooking(int tripBookingId, String fromLocation, String toLocation, int distanceInKm, int bill, TripStatus status) {
        this.tripBookingId = tripBookingId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.bill = bill;
        this.status = status;
    }

    public TripBooking(String fromLocation, String toLocation, int distanceInKm, int bill, TripStatus status) {

        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.bill = bill;
        this.status = status;
    }

    public TripBooking(String fromLocation, String toLocation, int distanceInKm) {

        this.fromLocation=fromLocation;
        this.toLocation=toLocation;
        this.distanceInKm=distanceInKm;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public int getBill() {
        return bill;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public TripStatus getStatus() {
        return status;
    }

    @JoinColumn
    @ManyToOne
    private Driver driver;

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    @JoinColumn
    @ManyToOne
    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
