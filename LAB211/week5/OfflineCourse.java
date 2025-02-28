/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class OfflineCourse extends Course{
    private String begin;
    private String end;
    private String campus;

    public OfflineCourse() {
        this.begin = "";
        this.end = "";
        this.campus = "";
    }
    public void inputAll(String cd, String cn, int cr,String begin, String end, String campus){
        super.inputAll(cd, cn, cr);
    }

    @Override
    public String toString() {
        return super.toString() + "OfflineCourse{" + "begin=" + begin + ", end=" + end + ", campus=" + campus + '}';
    }
    
}
