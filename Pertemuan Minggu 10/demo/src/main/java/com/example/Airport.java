package com.example;

public class Airport {
    public static void main(String[] args) {
        // Membuat penerbangan dengan jenis "Economy" dan "Business"
        Flight economyFlight = new Flight("1", "Economy");
        // Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");
        // Flight businessFlight = new Flight("2", "Business");

        // Membuat penumpang dengan status VIP dan non-VIP
        Passenger james = new Passenger("James", true);
        Passenger mike = new Passenger("Mike", false);

        // Menambahkan dan menghapus penumpang dari penerbangan
        businessFlight.addPassenger(james);      // Menambahkan James ke penerbangan Business
        businessFlight.removePassenger(james);   // Menghapus James dari penerbangan Business
        businessFlight.addPassenger(mike);       // Menambahkan Mike ke penerbangan Business (gagal karena Mike bukan VIP)
        economyFlight.addPassenger(mike);        // Menambahkan Mike ke penerbangan Economy

        // Menampilkan daftar penumpang penerbangan Business
        System.out.println("Business flight passengers list:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }

        // Menampilkan daftar penumpang penerbangan Economy
        System.out.println("Economy flight passengers list:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }
}
