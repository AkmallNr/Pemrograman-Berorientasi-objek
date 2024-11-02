package com.example;

import com.example.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight {
    private String id;
    private List<Passenger> passengers = new ArrayList<Passenger>();
    private String flightType;

    // Konstruktor
    public Flight(String id, String flightType) {
        this.id = id;
        this.flightType = flightType;
    }

    // Metode getter untuk 'id'
    public String getId() {
        return id;
    }

    // Metode untuk mendapatkan daftar penumpang (hanya dapat dibaca)
    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }

    // Metode getter untuk 'flightType'
    public String getFlightType() {
        return flightType;
    }

    // Menambahkan penumpang ke penerbangan berdasarkan jenis penerbangan
    public boolean addPassenger(Passenger passenger) {
        switch (flightType) {
            case "Economy":
                return passengers.add(passenger);
            case "Business":
                if (passenger.isVip()) {
                    return passengers.add(passenger);
                }
                return false;
            default:
                throw new RuntimeException("Unknown type: " + flightType);
        }
    }

    // Menghapus penumpang dari penerbangan berdasarkan jenis penerbangan
    public boolean removePassenger(Passenger passenger) {
        switch (flightType) {
            case "Economy":
                if (!passenger.isVip()) {
                    return passengers.remove(passenger);
                }
                return false;
            case "Business":
                return false;
            default:
                throw new RuntimeException("Unknown type: " + flightType);
        }
    }
}
