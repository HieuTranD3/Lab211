
package week62;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class WokerManagement {
    private List<Worker> workers = new ArrayList<>();
    
    public void addWorker() {
    String id = Utils.getValue("Enter ID: ");
    
    // Check if the ID already exists
    for (Worker w : workers) {
        if (w.getId().equals(id)) {
            System.out.println("Worker ID must be unique.");
            return;
        }
    }
    String name = Utils.getValue("Enter Name: ");

    int age;
    while (true) {
        age = Utils.getIntValue("Enter Age (18-50): ");
        if (age < 18 || age > 50) {
            System.out.println("Invalid age! Age must be between 18 and 50.");
        } else {
            break;
        }
    }

    int salary;
    while (true) {
        salary = Utils.getIntValue("Enter Salary (> 0): ");
        if (salary <= 0) {
            System.out.println("Invalid salary! Salary must be greater than 0.");
        } else {
            break;
        }
    }

    String workLoc = Utils.getValue("Enter Work Location: ");

    Worker worker = new Worker(id, name, age, salary, workLoc);
    workers.add(worker);
    
    }
    public void displayWorker(){
    for(Worker w : workers){
        System.out.println(workers.toString());
    }
}
   
}
