/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class FlightInformation {
    private String flightNumber;
    private int seatNumber;
    private String timePickUp;
     public FlightInformation(String flightNumber, int seatNumber, String timePickUp) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickUp = timePickUp;
    }
    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = 0;
        this.timePickUp = "";
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTimePickUp() {
        return timePickUp;
    }

    public void setTimePickUp(String timePickUp) {
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {
        return "FlightInformation{" + "flightNumber=" + flightNumber + ", seatNumber=" + seatNumber + ", timePickUp=" + timePickUp + '}';
    }
    
}
