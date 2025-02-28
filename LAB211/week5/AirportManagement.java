/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class AirportManagement {
    private List<Reservation> reservations = new ArrayList<>();
    public boolean addReservation(Reservation c){
        reservations.add(c);
//         // Check Booking ID (Must be 6-digit)
//        if (String.valueOf(bookingID).length() != 6) {
//            System.out.println("Error: Booking ID must be 6 digits.");
//            return false;
//        }
//
//        // Validate Customer Name (Only alphabets and spaces)
//        if (!customerName.matches("^[a-zA-Z ]+$")) {
//            System.out.println("Error: Customer name must contain only letters and spaces.");
//            return false;
//        }
//
//        // Validate Phone Number (Must be 12-digit numeric)
//        if (!phoneNumber.matches("\\d{12}")) {
//            System.out.println("Error: Phone number must be exactly 12 digits.");
//            return false;
//        }
//
//        // Validate Room Number (Must be 4-digit)
//        if (String.valueOf(roomNumber).length() != 4) {
//            System.out.println("Error: Room number must be 4 digits.");
//            return false;
//        }
        return true;
    }
    public void showReservation(){
        for(Reservation oc : reservations){
            System.out.println(oc.toString());
        }
    }
}
