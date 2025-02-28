/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;
import java.util.List;


public class CourseManagement {
    private List<OnlineCourse> onlineCourse = new ArrayList<>();
    private List<OfflineCourse> offlineCourses = new ArrayList<>();
    public boolean addOnlineCourse(OnlineCourse oc){
        // kiem tra xem co trung khong
        // return false;
        onlineCourse.add(oc);
        return true;
    }
    public boolean addOfflineCourse(OfflineCourse ofc){
        offlineCourses.add(ofc);
        return true;
    }
    public boolean deleteOfflineCourse(String idCourse){
        for (OfflineCourse c: offlineCourses) {  
            if(c.getCourseID().equals(idCourse)){
                offlineCourses.remove(c);
                return true;
            }
        }
        return false;
    }
    public boolean deleteOnlineCourse(String idCourse){
        for (OnlineCourse c: onlineCourse) {  
            if(c.getCourseID().equals(idCourse)){
                onlineCourse.remove(c);
                return true;
            }
        }
        return false;
    }
    public boolean updateOnlineCourse(String idCourse, String newName, int stc){
        for(OnlineCourse c: onlineCourse){
            if (c.getCourseID().equals(idCourse)) {
                c.setCourseName(newName);
                c.setCredits(stc);
                return true;
            }
        }
        return false;
    }
    public boolean updateOfflineCourse(String idCourse, String newName, int stc){
        for(OfflineCourse c: offlineCourses){
            if (c.getCourseID().equals(idCourse)) {
                c.setCourseName(newName);
                c.setCredits(stc);
                return true;
            }
        }
        return false;
    }
    //in ra online course
    public void showOnlineCourse(){
        for(OnlineCourse oc : onlineCourse){
            System.out.println(oc.toString());
        }
    }
}
