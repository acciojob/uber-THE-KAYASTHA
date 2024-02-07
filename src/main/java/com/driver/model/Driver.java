package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="driver")
public class Driver{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    private String mobile;
    private String password;

    public Driver(){

    }
    public Driver(int driverId,String mobile,String password){
        this.driverId=driverId;
        this.mobile=mobile;
        this.password=password;
    }
    public Driver(String mobile,String password){
        this.mobile=mobile;
        this.password=password;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public int getDriverId() {
        return driverId;
    }


    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    private Cab cab;

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public Cab getCab() {
        return cab;
    }

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList=new ArrayList<>();

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }
}
