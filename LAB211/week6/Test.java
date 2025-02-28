
package week6;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
 

public class Test extends Menu<String>{
    private ContactManagement con;
    public static void main(String[] args) throws ParseException{
        String[] menuOptions = {"Add a contact","Display all contnacts","Delete a contact","exit"};
        Test managementMenu = new Test("Contact Management Program.", menuOptions);
        managementMenu.run();
    }
    public Test(String td, String[] mc) throws ParseException{
        super(td,mc);
        con = new ContactManagement();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
            {
                try {
                    con.addContact();
                } catch (ParseException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;
            case 2:
                con.displayContact();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("invalid choice, please try again");
                break;
        }
    }

    
}
