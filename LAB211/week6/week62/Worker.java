/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week62;

/**
 *
 * @author ADMIN
 */
public class Worker {
    private String id;
    private String name;
    private int age;
    private int salary;
    private String workLoc;

    public Worker(String id, String name, int age, int salary, String workLoc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLoc = workLoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLoc() {
        return workLoc;
    }

    public void setWorkLoc(String workLoc) {
        this.workLoc = workLoc;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", workLoc=" + workLoc + '}';
    }
    
}
