/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;


public class Course {
    protected String courseID;
    protected String courseName;
    protected int credits;
    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" + "courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits + '}';
    }
      

    public Course() {
        courseID = "";
        courseName = "";
        credits = 0;
    }
    public void inputAll(String id, String cn, int cr)
    { 
      courseID = id;
      courseName = cn;
      credits = cr; 
    }   
    
}
