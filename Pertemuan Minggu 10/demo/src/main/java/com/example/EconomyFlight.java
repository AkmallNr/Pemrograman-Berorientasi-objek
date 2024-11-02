//package com.example;
//
//
//public class EconomyFlight extends Flight {
//
//    // Konstruktor untuk menginisialisasi kelas EconomyFlight
//    public EconomyFlight(String id) {
//        super(id);
//    }
//
//    // Implementasi metode untuk menambahkan penumpang
//    @Override
//    public boolean addPassenger(Passenger passenger) {
//        return passengers.add(passenger);
//    }
//
//    // Implementasi metode untuk menghapus penumpang
//    @Override
//    public boolean removePassenger(Passenger passenger) {
//        // Hanya non-VIP yang bisa dihapus
//        if (!passenger.isVip()) {
//            return passengers.remove(passenger);
//        }
//        return false;  // VIP tidak dapat dihapus
//    }
//}
