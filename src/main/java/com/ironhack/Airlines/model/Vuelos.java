package com.ironhack.Airlines.model;

import javax.persistence.*;

@Entity
@Table (name="vuelos")
public class Vuelos {

    @Id
    private String flight_number;
    private String aircraft;
    private long mileage;

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
}


