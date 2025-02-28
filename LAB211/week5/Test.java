/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;

/**
 *
 * @author ADMIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CourseManagement courseManagement = new CourseManagement();
//        OnlineCourse onlineCourse = new OnlineCourse();
//        onlineCourse.inputAll("PRJ302", "Java web", 3, "window", "le cong vo", "note");
//        
//        courseManagement.addOnlineCourse(onlineCourse);
//        courseManagement.showOnlineCourse();
//        
////        courseManagement.deleteOnlineCourse("PRJ302");
//        courseManagement.updateOnlineCourse("PRJ302", "Labjava", 5);
//        courseManagement.showOnlineCourse();
////        LargeNumber largeNumber = new LargeNumber();
////        largeNumber.showLargeNum();
          AirportManagement airportManagement = new AirportManagement();
          Reservation reservation = new Reservation(123456, "Anh Phuong", "012345678901", 1234, "22/2/2022", "MH370", 2, "26/2/2022");
          airportManagement.addReservation(reservation);
          airportManagement.showReservation();
    }
    
}
