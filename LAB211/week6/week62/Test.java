/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week62;

import java.text.ParseException;


public class Test extends Menu<String>{

    private WokerManagement wokerManagement;
    public static void main(String[] args) throws ParseException{
      String[] menuOption = {"Add a Worker.","display"};
      Test managementMenu = new Test("Menu ",menuOption);
      managementMenu.run();
    }

    public Test( String td, String[] mc) {
        super(td, mc);
        wokerManagement = new WokerManagement();
    }
    

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                wokerManagement.addWorker();
                break;
            case 2:
                wokerManagement.displayWorker();
                break;    
            default:
                throw new AssertionError();
        }
    }
    
}
