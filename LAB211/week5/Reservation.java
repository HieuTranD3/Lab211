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
public class Reservation extends FlightInformation{
    private int bookingID;
    private String customerName;
    private String phoneNumber;
    private int roomNumber;
    private String bookingDate;

    public Reservation(int bookingID, String customerName, String phoneNumber, int roomNumb, String bookingDate, String flightNumber, int seatNumber, String timePickUp) {
        super(flightNumber, seatNumber, timePickUp);
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
    }
   
    
    public Reservation(){
        super();
        bookingID = 0;
        customerName = "";
        phoneNumber = "";
        roomNumber = 0;
        bookingDate = "";
        
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return super.toString()+"Reservation{" + "bookingID=" + bookingID + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", roomNumber=" + roomNumber + ", bookingDate=" + bookingDate + '}';
    }
    
    
}
