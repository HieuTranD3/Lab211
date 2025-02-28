/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class ContactManagement {
    private List<Contact> contacts = new ArrayList<>();
    public void addContact()throws ParseException{
        int id = Utils.getIntValue("Enter ID");
        String name = Utils.getValue("Enter Name");
        String firstName = Utils.getValue("Enter First Name");
        String lastName = Utils.getValue("Enter Last Name");
        String group = Utils.getValue("Enter Group");
        String address = Utils.getValue("Enter address ");
        String phone = Utils.getValue("Enter Phone num");
        Contact ct = new Contact(id, name, firstName, lastName, group, address, phone);
        contacts.add(ct);
    }

    
    public void displayContact(){
        for(Contact c: contacts){
            System.out.println(c.toString());
        }
    }
//    public void deleteContact(Contact contact){
//        if(contacts.isEmpty()){
//            System.out.println("Danh sach trong");
//        }else{
//            for(Contact c: contacts){
//                if (c.getId().e) {
//                    contacts.remove(c);
//                }
//            }
//        }
//    }
    

}
