/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author ADMIN
 */
public class OnlineCourse extends Course{
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        super();
        platform = "";
        instructor = "";
        note = "";
    }
    
    public void inputAll(String id, String cn, int cr,String pf, String ins, String nt){
        super.inputAll(id, cn, cr);
        platform = pf;
        instructor = ins;
        note = nt;

    }
    @Override
    public String toString() {
        return super.toString() + "OnlineCourse{" + "platform=" + platform + ", instructor=" + instructor + ", note=" + note + '}';
    }
    
}
